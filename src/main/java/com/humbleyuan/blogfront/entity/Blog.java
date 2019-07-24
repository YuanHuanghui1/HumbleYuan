package com.humbleyuan.blogfront.entity;

import lombok.Data;

import java.util.List;

/**
 * @Author: HumbleYuan
 * @description:博客实体
 * @Date: 2019/6/30
 * @Time: 14:40
 * @Version: 1.0
 */
@Data
public class Blog {

    private static final long serialVersionUID = 1L;

    /**
     * 博客id
     */
    private Integer blogId;

    /**
     * 归类id
     */
    private Integer categoryId;

    /**
     * 博文标题
     */
    private String title;

    /**
     * 博文摘要
     */
    private String summary;

    /**
     * 博文状态，1表示已经发表，2表示在草稿箱，3表示在垃圾箱
     */
    private String status;

    /**
     * 权重
     */
    private Integer weight;

    /**
     * 是否推荐，Y表示推荐，N表示不推荐
     */
    private String support;

    /**
     * 点击次数
     */
    private Integer click;

    /**
     * 标图展示地址
     */
    private String headerImg;

    /**
     * 博文类型，1表示markdown，2表示富文本
     */
    private String type;

    /**
     * 博文正文内容
     */
    private String content;

    /**
     * tag集合
     */
    private List<Tag> tagList;

    /**
     * 从页面获取或者传到页面的tags
     */
    private String[] tags;

    /**
     * 分类的名称
     */
    private String categoryTitle;

    /**
     * 分类对象
     */
    private Category category;

    /**
     *创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 最近更新时间
     */
    private String updateTime;

    /**
     * 最近更新人
     */
    private String updateBy;

    /**
     * 上一篇博客
     */
    private Blog previousBlog;

    /**
     * 下一篇博客
     */
    private Blog nextBlog;


}
