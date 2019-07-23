package com.humbleyuan.blogfront.entity;

import lombok.Data;

/**
 * @Author: HumbleYuan
 * @description:友链实体
 * @Date: 2019/7/15
 * @Time: 12:31
 * @Version: 1.0
 */
@Data
public class Link {

    private Integer linkId;     //id
    private String title;       //标题
    private String description;     //描述
    private String headerImg;       //图片地址
    private Integer click;      //点击量
    private Integer weight;     //权重
    private Integer available;      //是否可获取
    private Integer processed;      //审核是否通过
    private Integer display;        //是否显示
    private String email;       //邮箱
    private String url;     //地址
}
