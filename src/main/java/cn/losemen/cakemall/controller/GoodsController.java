package cn.losemen.cakemall.controller;

import cn.losemen.cakemall.service.GoodsService;
import cn.losemen.cakemall.vo.GoodsVO;
import cn.losemen.cakemall.vo.ImagesVO;
import org.apache.ibatis.annotations.Param;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品controller层
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/13 - 18:11
 */
@Controller
@CrossOrigin
public class GoodsController {
    //注入
    @Autowired
    private GoodsService goodsService;
    /*
       获取首页轮播图的信息 和推荐商品的信息
    */
    @RequestMapping(value="/getAllHomeGoods",method= RequestMethod.POST)
    @ResponseBody
    public ArrayList<Object> getAllHomeGoods() {

        return goodsService.getAllHomeGoods();
    }
    /*
        获取分类商品
     */
    @RequestMapping(value="/getKindGoods",method= RequestMethod.POST)
    @ResponseBody
    public ArrayList<GoodsVO> getKindGoods(@RequestBody GoodsVO goodsVO) {
        String gkind = goodsVO.getGkind();
        String[] s = gkind.split("_");
        ArrayList<GoodsVO> kindGoods = goodsService.getKindGoods(s[0], Integer.parseInt(s[1]));
        return kindGoods;
    }
    /*
        根据商品id获取商品信息和商品图片信息
     */
    @RequestMapping(value="/getDetailById",method= RequestMethod.POST)
    @ResponseBody
    public ArrayList<Object> getDetailById(@RequestBody GoodsVO goodsVO){
        ArrayList<Object> detailById = goodsService.getDetailById(goodsVO.getGid());
        return detailById;
    }

    /*
        修改商品
     */
    @RequestMapping(value="/updGoods",method= RequestMethod.POST)
    @ResponseBody
    public int updGoods(@RequestParam("files") List<MultipartFile> files,@Param("gid")int gid, @Param("gtitle") String gtitle,
                        @Param("gkind") String gkind,@Param("gsize6") int gsize6,
                        @Param("gsize8") int gsize8,@Param("gsize10") int gsize10,
                        @Param("gsize12") int gsize12,@Param("gsize14") int gsize14,
                        @Param("gsize16") int gsize16, @Param("gsize18") int gsize18,
                        @Param("gsize20") int gsize20,@Param("gplace") String gplace,@Param("glife") String glife, HttpServletRequest request) {
        //组装对象   一个GoodsVO  一个图片数组
        GoodsVO goodsVO = new GoodsVO();
        goodsVO.setGid(gid);
        goodsVO.setGtitle(gtitle);
        goodsVO.setGkind(gkind);
        goodsVO.setGsize6(gsize6);
        goodsVO.setGsize8(gsize8);
        goodsVO.setGsize10(gsize10);
        goodsVO.setGsize12(gsize12);
        goodsVO.setGsize14(gsize14);
        goodsVO.setGsize16(gsize16);
        goodsVO.setGsize18(gsize18);
        goodsVO.setGsize20(gsize20);
        goodsVO.setGplace(gplace);
        goodsVO.setGlife(glife);
        return goodsService.updGoods(goodsVO,files,request);
    }
    /*
        修改商品是删除images中的图片
     */
    @RequestMapping(value="/updGoodsImg",method= RequestMethod.POST)
    @ResponseBody
    public int updGoodsImg(@RequestBody ImagesVO imagesVO) {
        return goodsService.updGoodsImg(imagesVO);
    }
    /*
        修改goods中的图片 根据gid
     */
    @RequestMapping(value="/updGoodsImgByGid",method= RequestMethod.POST)
    @ResponseBody
    public int updGoodsImgByGid(@RequestBody ImagesVO imagesVO) {
        return goodsService.updGoodsImgByGid(imagesVO);
    }
    /*
        删除商品
     */
    @RequestMapping(value="/delGoods",method= RequestMethod.POST)
    @ResponseBody
    public String delGoods(@RequestBody GoodsVO goodsVO) {

        return goodsService.delGoods(goodsVO.getGid());
    }






      /*
         添加商品
     */
      @RequestMapping(value="/addGood",method= RequestMethod.POST)
      @ResponseBody
      public int addGood(@RequestParam("files") List<MultipartFile> files, @Param("gtitle") String gtitle,
                         @Param("gkind") String gkind,@Param("gsize6") int gsize6,
                         @Param("gsize8") int gsize8,@Param("gsize10") int gsize10,
                         @Param("gsize12") int gsize12,@Param("gsize14") int gsize14,
                         @Param("gsize16") int gsize16, @Param("gsize18") int gsize18,
                         @Param("gsize20") int gsize20,@Param("gplace") String gplace,@Param("glife") String glife, HttpServletRequest request) {
          //组装对象   一个GoodsVO  一个图片数组
          GoodsVO goodsVO = new GoodsVO();
          goodsVO.setGtitle(gtitle);
          goodsVO.setGkind(gkind);
          goodsVO.setGsize6(gsize6);
          goodsVO.setGsize8(gsize8);
          goodsVO.setGsize10(gsize10);
          goodsVO.setGsize12(gsize12);
          goodsVO.setGsize14(gsize14);
          goodsVO.setGsize16(gsize16);
          goodsVO.setGsize18(gsize18);
          goodsVO.setGsize20(gsize20);
          goodsVO.setGplace(gplace);
          goodsVO.setGlife(glife);
          return goodsService.addGood(goodsVO,files,request);

      }
      /*
        获取当前商品最大的id
       */
      @RequestMapping(value="/selMaxId",method= RequestMethod.POST)
      @ResponseBody
      public int selMaxId() {
          return goodsService.selMaxId();
      }
}
