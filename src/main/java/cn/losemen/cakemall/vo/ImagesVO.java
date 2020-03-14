package cn.losemen.cakemall.vo;

/**
 * 商品对应的图片的实体类
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/9 - 15:52
 */
public class ImagesVO {
    private int iid;
    private int gid;
    private String iimagesrc;

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getIimagesrc() {
        return iimagesrc;
    }

    public void setIimagesrc(String iimagesrc) {
        this.iimagesrc = iimagesrc;
    }

    @Override
    public String toString() {
        return "ImagesVO{" +
                "iid=" + iid +
                ", gid=" + gid +
                ", iimagesrc='" + iimagesrc + '\'' +
                '}';
    }

    public ImagesVO() {
    }

    public ImagesVO(int iid, int gid, String iimagesrc) {
        this.iid = iid;
        this.gid = gid;
        this.iimagesrc = iimagesrc;
    }
}
