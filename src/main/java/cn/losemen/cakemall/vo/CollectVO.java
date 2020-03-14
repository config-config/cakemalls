package cn.losemen.cakemall.vo;

/**
 * 收藏商品的实体类
 * @author hz
 * @Function
 * @version 1.0
 * @date 2020/2/9 - 15:38
 */
public class CollectVO {
    private int cid;//收藏商品的id
    private int uid;//对应的收藏商品的用户id
    private int gid;//对应的收藏商品的id
    private String cgtitle;//收藏商品的标题
    private int cgprice;//收藏商品的价格
    private String cgimg;//收藏商品的图片
    private int cgcollect;//收藏商品的收藏数

    public int getCgcollect() {
        return cgcollect;
    }

    public void setCgcollect(int cgcollect) {
        this.cgcollect = cgcollect;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getCgtitle() {
        return cgtitle;
    }

    public void setCgtitle(String cgtitle) {
        this.cgtitle = cgtitle;
    }

    public int getCgprice() {
        return cgprice;
    }

    public void setCgprice(int cgprice) {
        this.cgprice = cgprice;
    }

    public String getCgimg() {
        return cgimg;
    }

    public void setCgimg(String cgimg) {
        this.cgimg = cgimg;
    }
    //重写toString方法

    @Override
    public String toString() {
        return "CollectVO{" +
                "cid=" + cid +
                ", uid=" + uid +
                ", gid=" + gid +
                ", cgtitle='" + cgtitle + '\'' +
                ", cgprice=" + cgprice +
                ", cgimg='" + cgimg + '\'' +
                ", cgcollect=" + cgcollect +
                '}';
    }

    //无参构造
    public CollectVO() {
    }
    //带参构造

    public CollectVO(int cid, int uid, int gid, String cgtitle, int cgprice, String cgimg, int cgcollect) {
        this.cid = cid;
        this.uid = uid;
        this.gid = gid;
        this.cgtitle = cgtitle;
        this.cgprice = cgprice;
        this.cgimg = cgimg;
        this.cgcollect = cgcollect;
    }
}
