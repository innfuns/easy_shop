package com.microsoft.easyshop.entity;

import java.math.BigDecimal;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2020-07-28
 */
public class Product implements Serializable {

    private static final long serialVersionUID=1L;

    private String name;

    private BigDecimal price;

      private Integer id;

    private String picLocation;

    private Integer shopId;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicLocation() {
        return picLocation;
    }

    public void setPicLocation(String picLocation) {
        this.picLocation = picLocation;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Override
    public String toString() {
        return "Product{" +
        "name=" + name +
        ", price=" + price +
        ", id=" + id +
        ", picLocation=" + picLocation +
        ", shopId=" + shopId +
        "}";
    }
}
