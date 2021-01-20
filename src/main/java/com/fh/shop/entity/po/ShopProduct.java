package com.fh.shop.entity.po;

public class ShopProduct {
    private Integer id;
    private Integer proId;
    private String attrData;
    private  Integer stockss;
    private Double prices;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getAttrData() {
        return attrData;
    }

    public void setAttrData(String attrData) {
        this.attrData = attrData;
    }

    public Integer getStockss() {
        return stockss;
    }

    public void setStockss(Integer stockss) {
        this.stockss = stockss;
    }

    public Double getPrices() {
        return prices;
    }

    public void setPrices(Double prices) {
        this.prices = prices;
    }
}
