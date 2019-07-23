package com.humbleyuan.blogfront.service.impl;

import com.humbleyuan.blogfront.entity.Link;
import com.humbleyuan.blogfront.mapper.LinkMapper;
import com.humbleyuan.blogfront.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: HumbleYuan
 * @description:友链service实现层
 * @Date: 2019/7/15
 * @Time: 12:35
 * @Version: 1.0
 */
@Service
public class LinkServiceImpl implements LinkService {
    @Autowired
    LinkMapper linkMapper;

    /**
     * 获取可显示友链集合
     * @return 可显示友链集合
     */
    @Override
    public List<Link> getDisplayLinksList() {
        return linkMapper.getDisplayLinksList();
    }
}
