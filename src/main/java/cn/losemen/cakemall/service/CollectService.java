package cn.losemen.cakemall.service;

import cn.losemen.cakemall.mapper.CollectMapper;
import cn.losemen.cakemall.vo.CollectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * 收藏商品的Service层
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/14 - 20:31
 */
@Service
public class CollectService {
    //注入
    @Autowired
    private CollectMapper collectMapper;
    //收藏商品
    public int addColect(CollectVO collectVO) {
        int i = collectMapper.addColect(collectVO);
        if(i == 1){
            //添加成功  返回一个cid
            int collectCid = collectMapper.getCollectCid(collectVO.getGid(), collectVO.getUid());
            //去修改商品中的收藏数量 两张表  cgcollect
            collectMapper.updGcollect(collectVO.getGid(),collectVO.getCgcollect());
            collectMapper.updCgcollect(collectVO.getCid(),collectVO.getCgcollect());
            return collectCid;
        }else {
            return i;
        }

    }
    //取消收藏
    public int delColect(int cid,int cgcollect,int gid){
        //去修改商品中的收藏数量 两张表  cgcollect
        collectMapper.updGcollect(gid,cgcollect);
        collectMapper.updCgcollect(cid,cgcollect);
        return collectMapper.delColect(cid);
    }
    //获取cid
    public int getCollectCid(int gid,int uid){
        return collectMapper.getCollectCid(gid,uid);
    }

    //根据用户id获取商品的信息
    public ArrayList<CollectVO> getAllCollectById(int uid) {
        return collectMapper.getAllCollectById(uid);
    }
}
