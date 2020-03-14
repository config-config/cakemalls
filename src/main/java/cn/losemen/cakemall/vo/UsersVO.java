package cn.losemen.cakemall.vo;

/**
 * 用户的实体类
 * @author hz
 * @version 1.0
 * @Function
 * @date 2020/2/9 - 16:07
 */
public class UsersVO {
    private int uid;//用户id
    private String uname;//用户名字
    private String upassword;//用户密码
    private String idadmin;//用户是否为管理员
    private String uemail;//用户的邮箱
    private String uimg;//用户头像

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(String idadmin) {
        this.idadmin = idadmin;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUimg() {
        return uimg;
    }

    public void setUimg(String uimg) {
        this.uimg = uimg;
    }

    @Override
    public String toString() {
        return "UsersVO{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                ", idadmin='" + idadmin + '\'' +
                ", uemail='" + uemail + '\'' +
                ", uimg='" + uimg + '\'' +
                '}';
    }

    public UsersVO() {
    }

    public UsersVO(int uid, String uname, String upassword, String idadmin, String uemail, String uimg) {
        this.uid = uid;
        this.uname = uname;
        this.upassword = upassword;
        this.idadmin = idadmin;
        this.uemail = uemail;
        this.uimg = uimg;
    }
}
