package com.fh.shop.entity.vo;

public class PeopertyParams extends PageParam{
    private Integer peopertyId;
    private String peopertyName;

    public Integer getPeopertyId() {
        return peopertyId;
    }

    public void setPeopertyId(Integer peopertyId) {
        this.peopertyId = peopertyId;
    }

    public String getPeopertyName() {
        return peopertyName;
    }

    public void setPeopertyName(String peopertyName) {
        this.peopertyName = peopertyName;
    }
}
