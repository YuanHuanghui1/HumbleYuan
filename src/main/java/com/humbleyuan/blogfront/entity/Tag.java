package com.humbleyuan.blogfront.entity;

import lombok.Data;

/**
 * @Author: HumbleYuan
 * @description:标签实体
 * @Date: 2019/6/30
 * @Time: 15:01
 * @Version: 1.0
 */
@Data
public class Tag {

    private static final long serialVersionUID = 1L;

    /**
     * 标签id
     */
    private Integer tagId;

    /**
     * 标签内容
     */
    private String tagTitle;

    /**
     * 关联的博客个数
     */
    private int count;


}
