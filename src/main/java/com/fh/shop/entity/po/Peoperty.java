package com.fh.shop.entity.po;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class Peoperty {
    private Integer id;
    private String peopertyId;
    private String peopertyName;
    private Integer typeId;
    private Integer peopertyType;
    private Integer isSku;
    private Integer isDel;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateDate;
    private String author;
    private List<PeopertyValue> values;

    public List<PeopertyValue> getValues() {
        return values;
    }

    public void setValues(List<PeopertyValue> values) {
        this.values = values;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeopertyId() {
        return peopertyId;
    }

    public void setPeopertyId(String peopertyId) {
        this.peopertyId = peopertyId;
    }

    public String getPeopertyName() {
        return peopertyName;
    }

    public void setPeopertyName(String peopertyName) {
        this.peopertyName = peopertyName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getPeopertyType() {
        return peopertyType;
    }

    public void setPeopertyType(Integer peopertyType) {
        this.peopertyType = peopertyType;
    }

    public Integer getIsSku() {
        return isSku;
    }

    public void setIsSku(Integer isSku) {
        this.isSku = isSku;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
