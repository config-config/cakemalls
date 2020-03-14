package cn.losemen.cakemall.mapper;

import cn.losemen.cakemall.vo.GoodsVO;
import cn.losemen.cakemall.vo.ImagesVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * 商品的mapper层
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/13 - 18:13
 */
public interface GoodsMapper {
    //获取首页轮播图的数据
    public ArrayList<ImagesVO> getImages();
    //获取首页推荐商品的信息
    public ArrayList<GoodsVO> getRecommInfo();
    //获取分类商品的数据
    public ArrayList<GoodsVO> getKindGoods(@Param("gk") String gk, @Param("start") int start);
    //根据商品id获取商品信息
    public GoodsVO getDetailById(int gid);
    //根据商品id获取轮播图信息
    public ArrayList<ImagesVO> getImagesById(int gid);
    //根据gid获取商品的销量
    public int getGsale(int gid);
    //根据gid修改gsale
    public int updGsale(@Param("gid") int gid,@Param("gsale") int gsale);

    //添加商品
    public int insgoods(GoodsVO goodsVO);
    //添加商品的轮播图
    public int insimage(ImagesVO imagesVO);
    //获取当前添加商品的id
    public int selMaxId();

    //修改商品
    public int updGoods(GoodsVO goodsVO);

    //删除根据iid的图片
    public int delGoodsImg(int iid);
    //修改goods中的图片路径
    public int updGimageByGid(@Param("gid") int gid,@Param("gimage") String gimage);
    //根据gid查找images中的第一个图片路径
    public String selFirderImage(int gid);
    //根据图片路径删除images
    public int delImagesBySrc(String iimagesrc);

    //删除商品
    public int delGoods(int gid);
    //根据gid删除图片
    public int delImages(int gid);
}
