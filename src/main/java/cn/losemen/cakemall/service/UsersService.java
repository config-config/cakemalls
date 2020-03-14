package cn.losemen.cakemall.service;

import cn.losemen.cakemall.mapper.UsersMapper;
import cn.losemen.cakemall.vo.GoodsVO;
import cn.losemen.cakemall.vo.ImagesVO;
import cn.losemen.cakemall.vo.UsersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * 用户service层
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/9 - 20:03
 */
@Service
public class UsersService {
    //注入mapper代理对象
    @Autowired
    private UsersMapper usersMapper;

    public ArrayList<UsersVO> getAllUsers() {
            ArrayList<UsersVO> allUsers = usersMapper.getAllUsers();


            return allUsers;
    }

    //判断用户登录是否成功
    public int userLogin(String uname, String upassword) {
        System.out.println(uname);
        //判断用户是否存在
        int i = usersMapper.userNameIsTrue(uname);
        if(i == 0) {
            //用户不存在时 返回-1
            return -1;
        }else {
            //查看用户名与密码是否匹配
            UsersVO usersVO = usersMapper.userLogin(uname);
            if(upassword.equals(usersVO.getUpassword())) {
                //用户名密码匹配时返回 用户id
                return usersVO.getUid();
            } else {
                //用户名密码不匹配时返回 0
                return 0;
            }

        }

    }

    //根据用户id获取用户信息
    public UsersVO getUserInfoById(int uid) {
        UsersVO userInfoById = usersMapper.getUserInfoById(uid);
        userInfoById.setUpassword("");
        return userInfoById;
    }
    //用户注册
    public int userRegist(UsersVO usersVO) {
        //判断用户名是否存在
        int i = usersMapper.userNameIsTrue(usersVO.getUname());
        if(i == 0) {
            //设置默认头像
            usersVO.setUimg("http://localhost:8088/cakemall/images/me.svg");
            //设置管理员
            usersVO.setIdadmin("false");
            //注册成功
            int i1 = usersMapper.insUser(usersVO);
            return i1;
        }else {
            //用户名已存在
            return -1;
        }


    }
    //用户修改密码
    public String updUpassword(int uid,String upassword,String uemail) {
        //判断原密码是否一致
        if(uemail.equals(usersMapper.getUpasswordById(uid))) {
            int i = usersMapper.updUpassword(uid, upassword);
            if(i == 1) {
                return "修改成功";

            }else {
                return "修改失败";
            }
        }else {
            return "原密码错误";
        }

    }
    //用户上传头像
    public String updUserimg(int uid,MultipartFile file, HttpServletRequest request) {
        //图片保存的路径问题
        //测试时保存在本地 项目的绝对路径
        //运行时 放在tomcat部署的项目里  request.getSession().getServletContext().getRealPath("/img")
        //判断文件是否为空
        if (file.isEmpty()) {
            return "文件为空";
        }
        //定义路径  图片保存的路径
        String path1 = "E:\\ideaspaces\\cakemall\\src\\main\\webapp\\images\\usersimg";
        String path2 = request.getSession().getServletContext().getRealPath("/images/usersimg");
        //让图片的名字前缀为用户的id
        String fname=file.getOriginalFilename();
        String[] splits = fname.split("\\.");
        //判断后缀名
        //拼接作为名字

        String newFname = uid + "." +splits[1];
        //组合路径
        File ff=new File(path1,newFname);
        File f2 = new File(path2, newFname);
        //获取用户对应的图片 如果图片不是初始的 就在上传完后删除

        try {
            //上传文件 项目内
            file.transferTo(ff);
            //请求的文件只能上传一次
            // 打开输入流
            FileInputStream fis = new FileInputStream(ff);
            // 打开输出流
            FileOutputStream fos = new FileOutputStream(f2);

            // 读取和写入信息
//            int len = 0;
////            while ((len = fis.read()) != -1) {
////                fos.write(len);
////            }
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes,0,len);
            }

            // 关闭流
            fos.close(); // 后开先关
            fis.close(); // 先开后关

            //tomcat内
            // file.transferTo(f2);
            //修改数据库中的用户图片路径
            long l = System.currentTimeMillis() / 1000;
            String lastName = "http://localhost:8088/cakemall/images/usersimg/" + newFname + "?" + l;
            int i = usersMapper.updUimages(uid, lastName);
            if(i == 1) {
                //上传成功  返回图片路径
                return lastName;
            }
            return "上传失败";
        } catch (IllegalStateException | IOException e) {
            return "上传失败";
        }
    }


}
