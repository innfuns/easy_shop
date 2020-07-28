package com.microsoft.easyshop.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2020-07-28
 */
public class Shop implements Serializable {

    private static final long serialVersionUID=1L;

      private Integer id;

    private Integer typeId;

    private String name;

    private Integer locationId;

    private Integer sellerId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    @Override
    public String toString() {
        return "Shop{" +
        "id=" + id +
        ", typeId=" + typeId +
        ", name=" + name +
        ", locationId=" + locationId +
        ", sellerId=" + sellerId +
        "}";
    }
}
