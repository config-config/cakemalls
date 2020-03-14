package cn.losemen.cakemall.controller;

import cn.losemen.cakemall.service.UsersService;
import cn.losemen.cakemall.utils.ActionRequest;
import cn.losemen.cakemall.vo.UsersVO;
import com.sun.net.httpserver.HttpServer;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * 用户控制层
 * 接口 ：  1.用户登录
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/9 - 20:03
 */

@Controller
@CrossOrigin
public class UsersController {
    //注入service层代理对象
    @Autowired
    private UsersService usersService;

    @RequestMapping(value="/getAllUsers",method= RequestMethod.POST)
    @ResponseBody
    public ArrayList<UsersVO> getAllUsers() {
        ArrayList<UsersVO> allUsers = usersService.getAllUsers();
        return allUsers;
    }

    /*
        判断用户登录是否成功
        用户名与密码正确 返回用户的对象
        登录失败  返回登录失败
     */
    @RequestMapping(value="/userLogin",method= RequestMethod.POST)
    @ResponseBody
    public int userLogin(@RequestBody UsersVO usersVO){
        System.out.println(usersVO);
        int i = usersService.userLogin(usersVO.getUname(), usersVO.getUpassword());
        return i;
    }

    /*
        根据用户id获取用户信息
     */
    @RequestMapping(value="/userInfo",method= RequestMethod.POST)
    @ResponseBody
    public UsersVO getUserInfoById(@RequestBody UsersVO usersVO) {
        UsersVO userInfo = usersService.getUserInfoById(usersVO.getUid());
        return userInfo;
    }
    /*
        用户注册
     */
    @RequestMapping(value="/userRegist",method= RequestMethod.POST)
    @ResponseBody
    public int userRegist(@RequestBody UsersVO usersVO) {
        int i = usersService.userRegist(usersVO);
        return i;
    }

    //用户修改密码
    @RequestMapping(value="/updUpassword",method= RequestMethod.POST)
    @ResponseBody
    public String updUpassword(@RequestBody UsersVO usersVO){
        return usersService.updUpassword(usersVO.getUid(),usersVO.getUpassword(),usersVO.getUemail());
    }
    //用户上传头像
    @RequestMapping(value="/updUserimg",method=RequestMethod.POST)
    @ResponseBody
    public String updUserimg(@Param("uid") int uid, @RequestParam("file") MultipartFile file, HttpServletRequest request) {

        return usersService.updUserimg(uid,file,request);
    }

}
