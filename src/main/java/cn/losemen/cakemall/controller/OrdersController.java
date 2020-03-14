package cn.losemen.cakemall.controller;

import cn.losemen.cakemall.service.OrdersService;
import cn.losemen.cakemall.vo.OrdersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * 订单的controller层
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/17 - 11:01
 */
@Controller
@CrossOrigin
public class OrdersController {
    //注入
    @Autowired
    private OrdersService ordersService;
    /*
        添加订单
     */
    @RequestMapping(value="/insOrder",method= RequestMethod.POST)
    @ResponseBody
    public String insOrder(@RequestBody OrdersVO ordersVO) {
        return ordersService.insOrder(ordersVO);
    }

    /*
        根据uid查找用户订单信息
     */
    @RequestMapping(value="/getUserOrders",method= RequestMethod.POST)
    @ResponseBody
    public ArrayList<Object> getUserOrders(@RequestBody OrdersVO ordersVO) {
        return ordersService.getUserOrders(ordersVO.getUid());
    }

    /*
        修改订单的状态
     */
    @RequestMapping(value="/updOrderstatus",method= RequestMethod.POST)
    @ResponseBody
    public int updOrderstatus(@RequestBody OrdersVO ordersVO) {
        return ordersService.updOrderstatus(ordersVO.getOid());
    }
    /*
    查找订单   动态查询   uid  gid  otime   ogstatus
     */
    @RequestMapping(value="/selByOrders",method= RequestMethod.POST)
    @ResponseBody
    public ArrayList<OrdersVO> selByOrders(@RequestBody OrdersVO ordersVO) {
        System.out.println(ordersVO);
        return ordersService.selByOrders(ordersVO);
    }
    /*
        根据otime查找全部订单
     */
    @RequestMapping(value="/selOrdersByOtime",method= RequestMethod.POST)
    @ResponseBody
     public ArrayList<OrdersVO> selOrdersByOtime(@RequestBody OrdersVO ordersVO) {
        return ordersService.selOrdersByOtime(ordersVO.getOtime());
     }
}
