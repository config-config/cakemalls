package cn.losemen.cakemall.vo;

/**
 * 商品的实体类
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/9 - 15:45
 */
public class GoodsVO {
    private int gid;//商品id
    private String gtitle;//商品标题
    private String gkind;//商品种类
    private int gcollect;//商品的收藏数量
    private int gsale;//商品的销售数量
    private String gimage;//商品的图片
    private int gsize6;//6寸蛋糕的价格
    private int gsize8;//8寸蛋糕的价格
    private int gsize10;//10寸蛋糕的价格
    private int gsize12;//12寸蛋糕的价格
    private int gsize14;//14寸蛋糕的价格
    private int gsize16;//16寸蛋糕的价格
    private int gsize18;//18寸蛋糕的价格
    private int gsize20;//20寸蛋糕的价格
    private String gplace;//商品的产地
    private String glife;//商品的保质期

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGtitle() {
        return gtitle;
    }

    public void setGtitle(String gtitle) {
        this.gtitle = gtitle;
    }

    public String getGkind() {
        return gkind;
    }

    public void setGkind(String gkind) {
        this.gkind = gkind;
    }

    public int getGcollect() {
        return gcollect;
    }

    public void setGcollect(int gcollect) {
        this.gcollect = gcollect;
    }

    public int getGsale() {
        return gsale;
    }

    public void setGsale(int gsale) {
        this.gsale = gsale;
    }

    public String getGimage() {
        return gimage;
    }

    public void setGimage(String gimage) {
        this.gimage = gimage;
    }

    public int getGsize6() {
        return gsize6;
    }

    public void setGsize6(int gsize6) {
        this.gsize6 = gsize6;
    }

    public int getGsize8() {
        return gsize8;
    }

    public void setGsize8(int gsize8) {
        this.gsize8 = gsize8;
    }

    public int getGsize10() {
        return gsize10;
    }

    public void setGsize10(int gsize10) {
        this.gsize10 = gsize10;
    }

    public int getGsize12() {
        return gsize12;
    }

    public void setGsize12(int gsize12) {
        this.gsize12 = gsize12;
    }

    public int getGsize14() {
        return gsize14;
    }

    public void setGsize14(int gsize14) {
        this.gsize14 = gsize14;
    }

    public int getGsize16() {
        return gsize16;
    }

    public void setGsize16(int gsize16) {
        this.gsize16 = gsize16;
    }

    public int getGsize18() {
        return gsize18;
    }

    public void setGsize18(int gsize18) {
        this.gsize18 = gsize18;
    }

    public int getGsize20() {
        return gsize20;
    }

    public void setGsize20(int gsize20) {
        this.gsize20 = gsize20;
    }

    public String getGplace() {
        return gplace;
    }

    public void setGplace(String gplace) {
        this.gplace = gplace;
    }

    public String getGlife() {
        return glife;
    }

    public void setGlife(String glife) {
        this.glife = glife;
    }

    @Override
    public String toString() {
        return "GoodsVO{" +
                "gid=" + gid +
                ", gtitle='" + gtitle + '\'' +
                ", gkind='" + gkind + '\'' +
                ", gcollect=" + gcollect +
                ", gsale=" + gsale +
                ", gimage='" + gimage + '\'' +
                ", gsize6=" + gsize6 +
                ", gsize8=" + gsize8 +
                ", gsize10=" + gsize10 +
                ", gsize12=" + gsize12 +
                ", gsize14=" + gsize14 +
                ", gsize16=" + gsize16 +
                ", gsize18=" + gsize18 +
                ", gsize20=" + gsize20 +
                ", gplace='" + gplace + '\'' +
                ", glife='" + glife + '\'' +
                '}';
    }

    public GoodsVO() {
    }

    public GoodsVO(int gid, String gtitle, String gkind, int gcollect, int gsale, String gimage, int gsize6, int gsize8, int gsize10, int gsize12, int gsize14, int gsize16, int gsize18, int gsize20, String gplace, String glife) {
        this.gid = gid;
        this.gtitle = gtitle;
        this.gkind = gkind;
        this.gcollect = gcollect;
        this.gsale = gsale;
        this.gimage = gimage;
        this.gsize6 = gsize6;
        this.gsize8 = gsize8;
        this.gsize10 = gsize10;
        this.gsize12 = gsize12;
        this.gsize14 = gsize14;
        this.gsize16 = gsize16;
        this.gsize18 = gsize18;
        this.gsize20 = gsize20;
        this.gplace = gplace;
        this.glife = glife;
    }
}
