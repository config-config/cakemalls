package cn.losemen.cakemall.service;

import cn.losemen.cakemall.mapper.ShoppingMapper;
import cn.losemen.cakemall.vo.ShoppingVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * 购物车的service层
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/14 - 15:15
 */
@Service
public class ShoppingService {
    //注入
    @Autowired
    private ShoppingMapper shoppingMapper;
    //在购物车中添加商品
    public int insShoppiing(ShoppingVO shoppingVO){
        int i = shoppingMapper.insShoppiing(shoppingVO);
        return i;

    }

    //修改购物车中的数量
    public int updShoppingCount(int sid,int sgcount){
        int i = shoppingMapper.updShoppingCount(sid, sgcount);
        return i;
    }
    //根据用户id获取购物车的数据
    public ArrayList<ShoppingVO> getShoppingById(int uid) {
        ArrayList<ShoppingVO> shoppingById = shoppingMapper.getShoppingById(uid);
        return shoppingById;

    }
    //根据商品gid和商品的大小 sgsize 获取购物车中的商品sid
    public int getShoppingSid(int gid,String sgsize){
        int shoppingSid = shoppingMapper.getShoppingSid(gid, sgsize);
        return shoppingSid;

    }
    //修改购物车商品中的状态
    public int updShoppinfStatus(int sid,String sgstatus) {
        return shoppingMapper.updShoppinfStatus(sid,sgstatus);
    }
    //根据sid删除购物车中的商品
    public int delShoppingById(int sid) {
        return shoppingMapper.delShoppingById(sid);
    }
}
