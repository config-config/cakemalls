package cn.losemen.cakemall.vo;

/**
 * 订单的实体类
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/9 - 15:55
 */
public class OrdersVO {
    private int oid;//订单id
    private int uid;//用户id
    private int gid;//商品id
    private String ogtitle;//商品的标题
    private String ogimg;//商品的图片
    private String ogsize;//商品的大小
    private int ogprice;//商品的总价格
    private int ogcount;//商品的数量
    private String ogstatus;//商品的状态
    private long otime;//商品的购买时间

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
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

    public String getOgtitle() {
        return ogtitle;
    }

    public void setOgtitle(String ogtitle) {
        this.ogtitle = ogtitle;
    }

    public String getOgimg() {
        return ogimg;
    }

    public void setOgimg(String ogimg) {
        this.ogimg = ogimg;
    }

    public String getOgsize() {
        return ogsize;
    }

    public void setOgsize(String ogsize) {
        this.ogsize = ogsize;
    }

    public int getOgprice() {
        return ogprice;
    }

    public void setOgprice(int ogprice) {
        this.ogprice = ogprice;
    }

    public int getOgcount() {
        return ogcount;
    }

    public void setOgcount(int ogcount) {
        this.ogcount = ogcount;
    }

    public String getOgstatus() {
        return ogstatus;
    }

    public void setOgstatus(String ogstatus) {
        this.ogstatus = ogstatus;
    }

    public long getOtime() {
        return otime;
    }

    public void setOtime(long otime) {
        this.otime = otime;
    }

    @Override
    public String toString() {
        return "OrdersVO{" +
                "oid=" + oid +
                ", uid=" + uid +
                ", gid=" + gid +
                ", ogtitle='" + ogtitle + '\'' +
                ", ogimg='" + ogimg + '\'' +
                ", ogsize='" + ogsize + '\'' +
                ", ogprice=" + ogprice +
                ", ogcount=" + ogcount +
                ", ogstatus='" + ogstatus + '\'' +
                ", otime=" + otime +
                '}';
    }

    public OrdersVO() {
    }

    public OrdersVO(int oid, int uid, int gid, String ogtitle, String ogimg, String ogsize, int ogprice, int ogcount, String ogstatus, long otime) {
        this.oid = oid;
        this.uid = uid;
        this.gid = gid;
        this.ogtitle = ogtitle;
        this.ogimg = ogimg;
        this.ogsize = ogsize;
        this.ogprice = ogprice;
        this.ogcount = ogcount;
        this.ogstatus = ogstatus;
        this.otime = otime;
    }
}
