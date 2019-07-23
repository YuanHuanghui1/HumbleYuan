package com.humbleyuan.blogfront.service.impl;

import com.humbleyuan.blogfront.entity.Tag;
import com.humbleyuan.blogfront.mapper.BlogTagMapper;
import com.humbleyuan.blogfront.mapper.TagMapper;
import com.humbleyuan.blogfront.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: HumbleYuan
 * @description:标签的service实现层
 * @Date: 2019/7/11
 * @Time: 21:23
 * @Version: 1.0
 */
@Service
public class TagServiceImp implements TagService {
    @Autowired
    TagMapper tagMapper;

    @Autowired
    BlogTagMapper blogTagMapper;

    /**
     * 获取所有标签信息
     * @return 所有标签信息
     */
    @Override
    public List<Tag> getAllTags() {

        List<Tag> tags =  tagMapper.getAllTags();
        //获取每个标签关联的博客数
        for (Tag tag:tags
             ) {
            tag.setCount(blogTagMapper.getTagContactWithBlogCount(tag.getTagId()));
        }

        return tags;
    }
}
