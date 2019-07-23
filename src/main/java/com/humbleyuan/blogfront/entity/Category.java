package com.humbleyuan.blogfront.entity;

import lombok.Data;

/**
 * @Author: HumbleYuan
 * @description:博客分类实体
 * @Date: 2019/6/30
 * @Time: 14:58
 * @Version: 1.0
 */
@Data
public class Category {

    private static final long serialVersionUID = 1L;

    /**
     * 类型id
     */
    private Integer categoryId;

    /**
     * 分类的名称
     */
    private String categoryTitle;

    /**
     * 权重
     */
    private Integer weight;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否推荐，0表示不推荐，1表示推荐
     */
    private String support;
}
