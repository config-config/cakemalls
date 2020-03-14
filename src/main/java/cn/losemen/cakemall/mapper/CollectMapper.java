package cn.losemen.cakemall.mapper;

import cn.losemen.cakemall.vo.CollectVO;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * 收藏商品的mapper层
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/14 - 19:57
 */
public interface CollectMapper {
    //收藏商品
    public int addColect(CollectVO collectVO);
    //取消收藏
    public int delColect(int cid);
    //获取cid
    public int getCollectCid(@Param("gid") int gid,@Param("uid") int uid);
    //根据用户id获取商品信息
    public ArrayList<CollectVO> getAllCollectById(int uid);
    //修改商品的收藏数量
    public int updGcollect(@Param("gid") int gid,@Param("gcollect") int gcollect);
    //修改收藏商品的收藏数量
    public int updCgcollect(@Param("cid") int cid,@Param("cgcollect") int cgcollect);
}
