package com.zking.myba.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Category {
    private Integer categoryId;

    private String categoryName;

    private List<News> newsList=new ArrayList<>();

    public Category(Integer categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Category() {
        super();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}