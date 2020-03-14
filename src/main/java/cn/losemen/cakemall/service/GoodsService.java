package cn.losemen.cakemall.service;

import cn.losemen.cakemall.mapper.GoodsMapper;
import cn.losemen.cakemall.vo.GoodsVO;
import cn.losemen.cakemall.vo.ImagesVO;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/**
 * 商品的service层
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/13 - 18:09
 */
@Service
public class GoodsService {
    //注入
    @Autowired
    private GoodsMapper goodsMapper;

    //获取首页基本的信息展示
    public ArrayList<Object> getAllHomeGoods() {
        //获取轮播图的商品信息
        ArrayList<ImagesVO> images = goodsMapper.getImages();
        //获取推荐的商品信息  4个
        ArrayList<GoodsVO> recommInfo = goodsMapper.getRecommInfo();
        ArrayList<Object> allDate = new ArrayList<>();
        allDate.add(images);
        allDate.add(recommInfo);
        return allDate;
    }
    //获取分类商品的数据
    public ArrayList<GoodsVO> getKindGoods(String gk,int page){
        //将页数转换为开始的条数
        int start = (page-1)*20;
        ArrayList<GoodsVO> kindGoods = goodsMapper.getKindGoods(gk, start);
        return kindGoods;
    }
    //根据商品id获取商品信息   轮播图信息
    public ArrayList<Object> getDetailById(int gid) {
        GoodsVO detailById = goodsMapper.getDetailById(gid);
        ArrayList<ImagesVO> imagesById = goodsMapper.getImagesById(gid);
        //将商品中的图片放到图片集合的第一张
        String gimage = detailById.getGimage();
        ImagesVO imagesVO = new ImagesVO();
        imagesVO.setGid(gid);
        imagesVO.setIimagesrc(gimage);
        imagesById.add(0,imagesVO);
        //将两个集合放到一起
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(detailById);
        objects.add(imagesById);
        return objects;
    }
    //修改商品
    public int updGoods(GoodsVO goodsVO, List<MultipartFile> files, HttpServletRequest request){
        //先修改传递的商品
        int i = goodsMapper.updGoods(goodsVO);
        if(i == 0) {
            return 0;//修改失败
        }
        //将files中的图片下载到本地中
        //判断文件是否为空
        if(files.isEmpty() || files.size() <= 0) {
            System.out.println(111);
            return -1;
        }
        //定义路径  图片保存的路径
        String path1 = "E:\\ideaspaces\\cakemall\\src\\main\\webapp\\images\\cakeimgs";
        String path2 = request.getSession().getServletContext().getRealPath("/images/cakeimgs");
        //定义开关
        Boolean  flag = false;
        //遍历图片数组
        for (MultipartFile file : files) {
            //获取文件的名字
            String fname=file.getOriginalFilename();
            //拼接图片的名字
            //添加判断文件的名字是否有.
            if(fname == "") {

            }else {
                String[] splits = fname.split("\\.");
                //获取当前的时间戳和随机数作为文件名
                long l = System.currentTimeMillis();
                Random random = new Random();
                int i1 = random.nextInt(10000);
                String filename = String.valueOf(l) + i1;
                //拼接得到文件的名字
                String fn = filename + '.' +splits[1];
                //组合路径
                File ff=new File(path1,fn);
                File f2 = new File(path2, fn);

                try {
                    //上传文件 项目内
                    file.transferTo(ff);
                    //请求的文件只能上传一次
                    // 打开输入流
                    FileInputStream fis = new FileInputStream(ff);
                    // 打开输出流
                    FileOutputStream fos = new FileOutputStream(f2);

                    // 读取和写入信息
                    byte[] bytes = new byte[1024];
                    int len = 0;
                    while ((len = fis.read(bytes)) != -1) {
                        fos.write(bytes,0,len);
                    }

                    // 关闭流
                    fos.close(); // 后开先关
                    fis.close(); // 先开后关

                    //tomcat内
                    // file.transferTo(f2);
                    //在images添加对应的图片 gid  image
                    ImagesVO imagesVO = new ImagesVO();
                    imagesVO.setGid(goodsVO.getGid());
                    //获取存储的文件名
                    String na = "http://localhost:8088/cakemall/images/cakeimgs/" + fn;
                    imagesVO.setIimagesrc(na);
                    int insimage = goodsMapper.insimage(imagesVO);
                    //如果添加失败 修改开关
                    if(insimage == 0) {
                        flag = true;
                    }
                } catch (IllegalStateException | IOException e) {
                    flag = true;
                }
            }


        }
        if(flag) {
            return -2;
        }


        return 1;
    }
    //修改商品   删除images中的图片
    public int updGoodsImg(ImagesVO imagesVO) {
        //根据iid删除image
        return goodsMapper.delGoodsImg(imagesVO.getIid());
    }

    //修改goods中图片
    public int updGoodsImgByGid(ImagesVO imagesVO) {
        int re = 0;
        System.out.println(imagesVO);
        //判断传递的路径是否为空
        if(imagesVO.getIimagesrc() != "") {
            //就直接修路改goods中的图片径
              re = goodsMapper.updGimageByGid(imagesVO.getGid(),imagesVO.getIimagesrc());
              if(re == 0){
                  return 0;
              }
        } else {
            //查找images表中的第一个图片路径
            Boolean flat = true;

            while(flat) {
                //暂挺500毫秒
                try {
                    Thread.sleep(500);
                    //判断是否获取值
                    if(goodsMapper.selFirderImage(imagesVO.getGid()) != null) {
                        //赋值图片路径
                        imagesVO.setIimagesrc(goodsMapper.selFirderImage(imagesVO.getGid()));
                        //修改goods中的图片路径
                        re =goodsMapper.updGimageByGid(imagesVO.getGid(),imagesVO.getIimagesrc());
                        if(re == 0){
                            return 0;
                        }
                        flat = false;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
        //goods中图片修改成功后 将获取图片的那个images中的图片删除
        if(re != 0) {
            re = goodsMapper.delImagesBySrc(imagesVO.getIimagesrc());
        }
        return re;
    }
    //删除商品
    public String delGoods(int gid) {
        //需要删除 goods images
        int i = goodsMapper.delGoods(gid);
        if(i == 1) {
            //删除图片
            int i1 = goodsMapper.delImages(gid);
            System.out.println(i1);
            if(i1 != 0) {
                //删除成功
                return "删除成功";
            }
            return "图片删除失败";
        }
        return "删除失败";
    }

    //增加商品  添加图片
    public int addGood(GoodsVO goodsVO, List<MultipartFile> files, HttpServletRequest request) {
        //        String[] kind={"pop","news","sell","birth","older","katong","friut","child","zhizhi","ruzhi"};
//        String[] title={"悉尼之风","冰雪奇缘","巧克力物语","鲜果塔","甜蜜城堡","马卡龙","永恒的心","提拉米苏","红薯蛋糕","米奇","恋恋抹茶","爱的旋律"};
//        int[] s6={20,25,32,21,15,23};
//        int[] s8={35,38,40,36,39,37};
//        int[] s10={45,42,46,49,55,60};
//        int[] s12={65,62,63,69,75,70};
//        int[] s14={75,76,74,80,88,93};
//        int[] s16={100,102,105,110,112,115};
//        int[] s18={115,120,130,125,124,130};
//        int[] s20={150,160,175,164,180,200};
//        //添加
//            for(int i = 1;i<94;i++){
//                Random r = new Random();
//                GoodsVO goodsVO = new GoodsVO();
//                goodsVO.setGplace("中国大陆");
//                goodsVO.setGlife("3天");
//                goodsVO.setGcollect(0);
//                goodsVO.setGsale(0);
//                goodsVO.setGimage("http://localhost:8088/cakemall/images/cakeimgs/"+ i +".jpg");
//                //获取随机数
//                int k = r.nextInt(10);
//                int t= r.nextInt(12);
//                int ss6 = r.nextInt(6);
//                int ss8 = r.nextInt(6);
//                int ss10 = r.nextInt(6);
//                int ss12 = r.nextInt(6);
//                int ss14 = r.nextInt(6);
//                int ss16 = r.nextInt(6);
//                int ss18 = r.nextInt(6);
//                int ss20 = r.nextInt(6);
//
//                goodsVO.setGkind(kind[k]);
//                goodsVO.setGtitle(title[t]);
//                goodsVO.setGsize6(s6[ss6]);
//                goodsVO.setGsize8(s8[ss8]);
//                goodsVO.setGsize10(s10[ss10]);
//                goodsVO.setGsize12(s12[ss12]);
//                goodsVO.setGsize14(s14[ss14]);
//                goodsVO.setGsize16(s16[ss16]);
//                goodsVO.setGsize18(s18[ss18]);
//                goodsVO.setGsize20(s20[ss20]);
//                usersMapper.insgoods(goodsVO);
//            }
        //添加图片   1-279    744
//        for(int i=280;i<744;i++){
//            Random r = new Random();
//            int i1 = r.nextInt(4) + 3;
//            ImagesVO imagesVO = new ImagesVO();
//            imagesVO.setGid(i);
//            for(int j = 0;j<i1;j++){
//                //获取随机数
//                int s=r.nextInt(90)+1;
//                imagesVO.setIimagesrc("http://localhost:8088/cakemall/images/cakeimgs/"+ s +".jpg");
//                usersMapper.insimage(imagesVO);
//            }
//
//
//        }
        //处理good数据  添加gcollect gsale gimage
        goodsVO.setGcollect(0);
        goodsVO.setGsale(0);
        //处理上传的文件
        //将files中的图片下载到本地中
        //判断文件是否为空
        if(files.isEmpty() || files.size() <= 0) {
            System.out.println(111);
            return -1;
        }
        //定义路径  图片保存的路径
        String path1 = "E:\\ideaspaces\\cakemall\\src\\main\\webapp\\images\\cakeimgs";
        String path2 = request.getSession().getServletContext().getRealPath("/images/cakeimgs");
        //获取当前商品的id
        int maxId = goodsMapper.selMaxId() + 1;
        //定义开关
        Boolean  flag = false;
        //遍历图片数组
        for (int j = 0;j<files.size();j++) {
            //获取文件的名字
            String fname = files.get(j).getOriginalFilename();
            //拼接图片的名字
            //添加判断文件的名字是否有.
            if (fname == "") {

            } else {
                String[] splits = fname.split("\\.");
                //获取当前的时间戳和随机数作为文件名
                long l = System.currentTimeMillis();
                Random random = new Random();
                int i1 = random.nextInt(10000);
                String filename = String.valueOf(l) + i1;
                //拼接得到文件的名字
                String fn = filename + '.' + splits[1];
                //组合路径
                File ff = new File(path1, fn);
                File f2 = new File(path2, fn);

                try {
                    //上传文件 项目内
                    files.get(j).transferTo(ff);
                    //请求的文件只能上传一次
                    // 打开输入流
                    FileInputStream fis = new FileInputStream(ff);
                    // 打开输出流
                    FileOutputStream fos = new FileOutputStream(f2);

                    // 读取和写入信息
                    byte[] bytes = new byte[1024];
                    int len = 0;
                    while ((len = fis.read(bytes)) != -1) {
                        fos.write(bytes, 0, len);
                    }

                    // 关闭流
                    fos.close(); // 后开先关
                    fis.close(); // 先开后关
                    //获取存储的文件名
                    String na = "http://localhost:8088/cakemall/images/cakeimgs/" + fn;
                    //当为第一张时添加goods中的数据
                    if(j == 0) {
                        goodsVO.setGimage(na);
                        //发送请求
                        int insgoods = goodsMapper.insgoods(goodsVO);
                        if(insgoods != 0) {

                        }
                    }else{
                        //tomcat内
                        // file.transferTo(f2);
                        //在images添加对应的图片 gid  image
                        ImagesVO imagesVO = new ImagesVO();
                        imagesVO.setGid(maxId);
                        imagesVO.setIimagesrc(na);
                        int insimage = goodsMapper.insimage(imagesVO);
                        //如果添加失败 修改开关
                        if (insimage == 0) {
                            flag = true;
                        }
                    }


                } catch (IllegalStateException | IOException e) {
                    flag = true;
                }
            }
        }
        if(flag) {
            return -2;
        }


        return 1;


    }
    //获取当前商品最大的id
    public int selMaxId() {
        return goodsMapper.selMaxId();
    }

}
