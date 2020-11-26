package com.zking.myba.model;

import java.util.Date;

public class Myfile {
    private Long fileId;

    private String realName;

    private String contentType;

    private Date updateDatetime;

    public Myfile(Long fileId, String realName, String contentType, Date updateDatetime) {
        this.fileId = fileId;
        this.realName = realName;
        this.contentType = contentType;
        this.updateDatetime = updateDatetime;
    }

    public Myfile() {
        super();
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}