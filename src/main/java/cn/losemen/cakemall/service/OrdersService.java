package cn.losemen.cakemall.service;

import cn.losemen.cakemall.mapper.GoodsMapper;
import cn.losemen.cakemall.mapper.OrdersMapper;
import cn.losemen.cakemall.vo.OrdersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * 订单的service层
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/17 - 11:01
 */
@Service
public class OrdersService {
    //注入
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private GoodsMapper goodsMapper;

    //添加订单
    public String insOrder(OrdersVO ordersVO) {
        //添加订单的状态和下单时间
        //用当前的秒作为下单时间
        long l = System.currentTimeMillis() / 1000;
        ordersVO.setOtime(l);
        ordersVO.setOgstatus("未收货");
        int i = ordersMapper.insOrder(ordersVO);
        if(i == 1){
            //同时修改商品的销售数量
            //根据gid获取商品的销量   +count修改销量
            int gsale = goodsMapper.getGsale(ordersVO.getGid());
            int gc = gsale + ordersVO.getOgcount();
            goodsMapper.updGsale(ordersVO.getGid(),gc);
            return "购买成功";
        } else {
            return "购买失败";
        }

    }
    //查找用户订单
    public ArrayList<Object> getUserOrders(int uid) {
        ArrayList<OrdersVO> userOrders = ordersMapper.getUserOrders(uid);
        ArrayList<OrdersVO> o1 = new ArrayList<>();//未收货
        ArrayList<OrdersVO> o2 = new ArrayList<>();//已收货
        for (OrdersVO userOrder : userOrders) {
            if("未收货".equals(userOrder.getOgstatus())) {
                o1.add(userOrder);
            }else {
                o2.add(userOrder);
            }
        }
        ArrayList<Object> uOrders = new ArrayList<>();
        uOrders.add(o1);
        uOrders.add(o2);
        return uOrders;

    }
    //修改订单的状态
    public int updOrderstatus(int oid) {
        String sta = "已收货";
        return ordersMapper.updOrderstatus(oid,sta);
    }
    /*
    查找订单
     */
    public ArrayList<OrdersVO> selByOrders(OrdersVO ordersVO) {
        //判断传递过来的时间 获取下一天的时间
        long otime1 = ordersVO.getOtime();
        //24小时=86400秒
        long otime2 = otime1 + 86400;
        //获取订单的下标   页码放在price中
        int start = (ordersVO.getOgprice()-1)*20;
        ArrayList<OrdersVO> ordersVOS = ordersMapper.selByOrders(ordersVO.getUid(), ordersVO.getGid(), otime1, otime2,start);
        return ordersVOS;
    }
    /*
    查找订单  otime
     */
    public ArrayList<OrdersVO> selOrdersByOtime(long otime) {
        //24小时=86400秒
        long otime1 = otime + 86400;
        return ordersMapper.selOrdersByOtime(otime,otime1);
    }

}
