package cn.losemen.cakemall.controller;

import cn.losemen.cakemall.service.ShoppingService;
import cn.losemen.cakemall.vo.ShoppingVO;
import cn.losemen.cakemall.vo.UsersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * 购物车的Controller层
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/14 - 15:12
 */
@Controller
@CrossOrigin
public class ShoppingController {
    //注入
    @Autowired
    private ShoppingService shoppingService;
    /*
        在购物车中添加商品
     */
    @RequestMapping(value="/insShoppiing",method= RequestMethod.POST)
    @ResponseBody
    public int insShoppiing(@RequestBody ShoppingVO shoppingVO) {
        return shoppingService.insShoppiing(shoppingVO);
    }
    /*
        修改购物车中的数量
     */
    @RequestMapping(value="/updShoppingCount",method= RequestMethod.POST)
    @ResponseBody
    public int updShoppingCount(@RequestBody ShoppingVO shoppingVO) {
        return shoppingService.updShoppingCount(shoppingVO.getSid(),shoppingVO.getSgcount());
    }

    /*
        根据用户id获取购物车的数据
     */
    @RequestMapping(value="/getShoppingById",method= RequestMethod.POST)
    @ResponseBody
    public ArrayList<ShoppingVO> getShoppingById(@RequestBody ShoppingVO shoppingVO){
        return shoppingService.getShoppingById(shoppingVO.getUid());
    }
    /*
        根据商品gid和商品的大小 sgsize 获取购物车中的商品sid
     */
    @RequestMapping(value="/getShoppingSid",method= RequestMethod.POST)
    @ResponseBody
    public int getShoppingSid(@RequestBody ShoppingVO shoppingVO){
        return shoppingService.getShoppingSid(shoppingVO.getGid(),shoppingVO.getSgsize());
    }
    /*
        修改购物车商品中的状态
     */
    @RequestMapping(value="/updShoppinfStatus",method= RequestMethod.POST)
    @ResponseBody
    public int updShoppinfStatus(@RequestBody ShoppingVO shoppingVO) {
        return shoppingService.updShoppinfStatus(shoppingVO.getSid(),shoppingVO.getSgstatus());
    }
    /*
        根据sid删除购物车中的商品
     */
    @RequestMapping(value="/delShoppingById",method= RequestMethod.POST)
    @ResponseBody
    public int delShoppingById(@RequestBody ShoppingVO shoppingVO) {
        return shoppingService.delShoppingById(shoppingVO.getSid());
    }
}
