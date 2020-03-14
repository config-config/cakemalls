package cn.losemen.cakemall.mapper;

import cn.losemen.cakemall.vo.GoodsVO;
import cn.losemen.cakemall.vo.ImagesVO;
import cn.losemen.cakemall.vo.UsersVO;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * 用户的mapper层
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/9 - 20:04
 */
public interface UsersMapper {
    //查询用户信息
    public ArrayList<UsersVO> getAllUsers();

    //判断用户是否存在
    public int userNameIsTrue(String uname);
    //判断用户名是否匹配 根据用户名查找密码
    public UsersVO userLogin(String uname);
    //根据用户名id获取用户信息
    public UsersVO getUserInfoById(int uid);
    //注册用户
    public int insUser(UsersVO usersVO);
    //用户修改密码
    public int updUpassword(@Param("uid") int uid, @Param("upassword") String upassword);
    //根据uid查找密码
    public String getUpasswordById(int uid);
    //根据uid修改图片地址
    public int updUimages(@Param("uid") int uid,@Param("uimg") String uimg);

}
