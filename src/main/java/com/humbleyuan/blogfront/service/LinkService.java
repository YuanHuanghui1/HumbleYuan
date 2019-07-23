package com.humbleyuan.blogfront.service;

import com.humbleyuan.blogfront.entity.Link;

import java.util.List;

/**
 * @Author: HumbleYuan
 * @description:友链service层
 * @Date: 2019/7/15
 * @Time: 12:30
 * @Version: 1.0
 */
public interface LinkService {

    /**
     * 获取可显示友链集合
     * @return 可显示友链集合
     */
    List<Link> getDisplayLinksList();
}
