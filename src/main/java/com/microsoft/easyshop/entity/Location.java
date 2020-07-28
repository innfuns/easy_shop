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
public class Location implements Serializable {

    private static final long serialVersionUID=1L;

    private String address;

      private Integer id;

    private Integer number;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Location{" +
        "address=" + address +
        ", id=" + id +
        ", number=" + number +
        "}";
    }
}
