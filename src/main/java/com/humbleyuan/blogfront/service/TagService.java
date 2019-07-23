package com.humbleyuan.blogfront.service;

import com.humbleyuan.blogfront.entity.Tag;

import java.util.List;

/**
 * @Author: HumbleYuan
 * @description:标签的service层
 * @Date: 2019/7/11
 * @Time: 21:20
 * @Version: 1.0
 */
public interface TagService {

    /**
     * 标签展示
     * @return 所需展示标签的集合
     */
    List<Tag> getAllTags();
}
