package com.huizhi.oa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Leaveinfo {
    private String lId;

    private Integer userid;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lStarttime;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lOvertime;

    private String lReason;

    private Integer lUserid;

    private Integer lState;

    private String lCheckad;

    private Integer lType;

    private String tureName;

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    //人员的部门编号
    private String depName;

    public void setTureName(String tureName) {
        this.tureName = tureName;
    }

    public String getTureName() {
        return tureName;
    }

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId == null ? null : lId.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getlStarttime() {
        return lStarttime;
    }

    public void setlStarttime(Date lStarttime) {
        this.lStarttime = lStarttime;
    }

    public Date getlOvertime() {
        return lOvertime;
    }

    public void setlOvertime(Date lOvertime) {
        this.lOvertime = lOvertime;
    }

    public String getlReason() {
        return lReason;
    }

    public void setlReason(String lReason) {
        this.lReason = lReason == null ? null : lReason.trim();
    }

    public Integer getlUserid() {
        return lUserid;
    }

    public void setlUserid(Integer lUserid) {
        this.lUserid = lUserid;
    }

    public Integer getlState() {
        return lState;
    }

    public void setlState(Integer lState) {
        this.lState = lState;
    }

    public String getlCheckad() {
        return lCheckad;
    }

    public void setlCheckad(String lCheckad) {
        this.lCheckad = lCheckad == null ? null : lCheckad.trim();
    }

    public Integer getlType() {
        return lType;
    }

    public void setlType(Integer lType) {
        this.lType = lType;
    }
}