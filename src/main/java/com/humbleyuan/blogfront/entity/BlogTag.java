package com.humbleyuan.blogfront.entity;

import lombok.Data;

/**
 * @Author: HumbleYuan
 * @description:标签与文章关联
 * @Date: 2019/7/18
 * @Time: 8:20
 * @Version: 1.0
 */
@Data
public class BlogTag {

    private Integer blogId;     //博客id
    private Integer tagId;      //标签id
}
