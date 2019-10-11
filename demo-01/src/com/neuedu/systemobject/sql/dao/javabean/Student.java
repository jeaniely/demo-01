package com.neuedu.systemobject.sql.dao.javabean;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * 类与表对应
 * 属性与字段对应
 *
 * */
public class Student {
    private Integer sid;
    private String sname;
    private Integer ssex;
    private Date sbirth;
    private Timestamp createtime;
    private Timestamp updatetime;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSsex() {
        return ssex;
    }

    public void setSsex(Integer ssex) {
        this.ssex = ssex;
    }

    public Date getSbirth() {
        return sbirth;
    }

    public void setSbirth(Date sbirth) {
        this.sbirth = sbirth;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Timestamp getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", ssex=" + ssex +
                ", sbirth=" + sbirth +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                '}';
    }
}
