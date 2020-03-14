package cn.losemen.cakemall.mapper;

import cn.losemen.cakemall.vo.OrdersVO;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * 订单的mapper层
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/17 - 11:02
 */
public interface OrdersMapper {

    //添加订单
    public int insOrder(OrdersVO ordersVO);
    //根据uid查找用户订单
    public ArrayList<OrdersVO> getUserOrders(int uid);
    //修改订单的状态
    public int updOrderstatus(@Param("oid") int oid,@Param("ogstatus") String ogstatus);
    //查找订单
    public ArrayList<OrdersVO> selByOrders(@Param("uid") int uid,
                                           @Param("gid") int gid,
                                           @Param("otime1") long otime1,
                                           @Param("otime2") long otime2,
                                           @Param("start") int start);
    //查找订单全部
    public ArrayList<OrdersVO> selOrdersByOtime(@Param("otime1") long otime1,@Param("otime2") long otime2);
}
