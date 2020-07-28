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
public class ShopType implements Serializable {

    private static final long serialVersionUID=1L;

    private String name;

      private Integer id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ShopType{" +
        "name=" + name +
        ", id=" + id +
        "}";
    }
}
