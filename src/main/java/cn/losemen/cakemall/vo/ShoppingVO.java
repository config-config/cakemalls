package cn.losemen.cakemall.vo;

/**
 * 购物车的实体类
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/9 - 16:02
 */
public class ShoppingVO {
    private int sid;//购物者商品的id
    private int gid;//商品的id
    private int uid;//用户的id
    private String sgtitle;//购物车中商品的标题
    private String sgimg;//购物车中商品的图片
    private String sgsize;//购物车中商品的大小
    private int sgprice;//购物车中商品的单价
    private int sgcount;//购物车中商品的数量
    private String sgstatus;//购物车的是否选中状态

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getSgtitle() {
        return sgtitle;
    }

    public void setSgtitle(String sgtitle) {
        this.sgtitle = sgtitle;
    }

    public String getSgimg() {
        return sgimg;
    }

    public void setSgimg(String sgimg) {
        this.sgimg = sgimg;
    }

    public String getSgsize() {
        return sgsize;
    }

    public void setSgsize(String sgsize) {
        this.sgsize = sgsize;
    }

    public int getSgprice() {
        return sgprice;
    }

    public void setSgprice(int sgprice) {
        this.sgprice = sgprice;
    }

    public int getSgcount() {
        return sgcount;
    }

    public void setSgcount(int sgcount) {
        this.sgcount = sgcount;
    }

    public String getSgstatus() {
        return sgstatus;
    }

    public void setSgstatus(String sgstatus) {
        this.sgstatus = sgstatus;
    }

    @Override
    public String toString() {
        return "ShoppingVO{" +
                "sid=" + sid +
                ", gid=" + gid +
                ", uid=" + uid +
                ", sgtitle='" + sgtitle + '\'' +
                ", sgimg='" + sgimg + '\'' +
                ", sgsize='" + sgsize + '\'' +
                ", sgprice=" + sgprice +
                ", sgcount=" + sgcount +
                ", sgstatus='" + sgstatus + '\'' +
                '}';
    }

    public ShoppingVO() {
    }

    public ShoppingVO(int sid, int gid, int uid, String sgtitle, String sgimg, String sgsize, int sgprice, int sgcount, String sgstatus) {
        this.sid = sid;
        this.gid = gid;
        this.uid = uid;
        this.sgtitle = sgtitle;
        this.sgimg = sgimg;
        this.sgsize = sgsize;
        this.sgprice = sgprice;
        this.sgcount = sgcount;
        this.sgstatus = sgstatus;
    }
}
