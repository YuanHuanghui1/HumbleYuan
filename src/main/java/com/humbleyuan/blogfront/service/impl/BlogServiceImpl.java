package com.humbleyuan.blogfront.service.impl;

import com.humbleyuan.blogfront.entity.Blog;
import com.humbleyuan.blogfront.mapper.BlogMapper;
import com.humbleyuan.blogfront.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: HumbleYuan
 * @description:博客service层实现类
 * @Date: 2019/7/1
 * @Time: 9:47
 * @Version: 1.0
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogMapper blogMapper;


    /**
     * 获取前台主页显示博客信息
     * @return 所有博客集合
     */
    @Override
    public List<Blog> getFrontBlogsOnMainPage() {
        return blogMapper.getFrontBlogsOnMainPage();
    }


    /**
     * 获取最近更新的博客文章
     * @return 最近更新博客
     */
    @Override
    public List<Blog> getRecentBlogs(int num) {
        return blogMapper.getRecentBlogs(num);
    }

    /**
     * 获取点击量靠前的博客文章
     * @return 点击量靠前的博客文章
     */
    @Override
    public List<Blog> getRankingBlogsList(int num) {
        return blogMapper.getRankingBlogsList(num);
    }

    /**
     * 获取推荐的博客文章
     * @param num
     * @return 推荐的博客文章
     */
    @Override
    public List<Blog> getSupportBlogsList(int num) {
        return blogMapper.getSupportBlogsList(num);
    }
}

