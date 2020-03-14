package cn.losemen.cakemall.mapper;

import cn.losemen.cakemall.vo.ShoppingVO;
import org.apache.ibatis.annotations.Param;

import java.security.PrivateKey;
import java.util.ArrayList;

/**
 * 购物车的mapper层
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/14 - 15:19
 */
public interface ShoppingMapper {
    //在购物车中添加商品
    public int insShoppiing(ShoppingVO shoppingVO);
    //修改购物车中的数量
    public int updShoppingCount(@Param("sid") int sid,@Param("sgcount") int sgcount);
    //根据用户id获取购物车的数据
    public ArrayList<ShoppingVO> getShoppingById(int uid);
    //根据商品gid和商品的大小 sgsize 获取购物车中的商品sid
    public int getShoppingSid(@Param("gid") int gid,@Param("sgsize") String sgsize);
    //修改购物车商品中的状态
    public int updShoppinfStatus(@Param("sid") int sid,@Param("sgstatus") String sgstatus);
    //根据sid删除购物车中的商品
    public int delShoppingById(int sid);
}
