package cn.losemen.cakemall.controller;

import cn.losemen.cakemall.service.CollectService;
import cn.losemen.cakemall.vo.CollectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * 收藏商品的controller层
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/14 - 19:55
 */
@Controller
@CrossOrigin
public class CollectController {
    //注入
    @Autowired
    private CollectService collectService;
    /*
        收藏商品 增加  返回cid
     */
    @RequestMapping(value="/addColect",method= RequestMethod.POST)
    @ResponseBody
    public int addColect(@RequestBody CollectVO collectVO) {
        return collectService.addColect(collectVO);
    }
    /*
        取消收藏商品  删除
     */
    @RequestMapping(value="/delColect",method= RequestMethod.POST)
    @ResponseBody
    public int delColect(@RequestBody CollectVO collectVO) {
        return collectService.delColect(collectVO.getCid(),collectVO.getCgcollect(),collectVO.getGid());
    }
    /*
        请求商品信息时 根据商品gid和uid查找是否收藏 有就返回cid
     */
    @RequestMapping(value="/getCollectCid",method= RequestMethod.POST)
    @ResponseBody
    public int getCollectCid(@RequestBody CollectVO collectVO) {
        return collectService.getCollectCid(collectVO.getGid(),collectVO.getUid());
    }
    /*
        根据用户id获取收藏商品
     */
    @RequestMapping(value="/getAllCollectById",method= RequestMethod.POST)
    @ResponseBody
    public ArrayList<CollectVO> getAllCollectById(@RequestBody CollectVO collectVO){
        return collectService.getAllCollectById(collectVO.getUid());
    }
}
