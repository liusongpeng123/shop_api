package com.fh.shop.entity.po;

public class PeopertyValue {
    private Integer id;
    private  String name;
    private  String nameCh;
    private Integer peoId;
    private  Integer isDel;

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }

    public Integer getPeoId() {
        return peoId;
    }

    public void setPeoId(Integer peoId) {
        this.peoId = peoId;
    }
}
