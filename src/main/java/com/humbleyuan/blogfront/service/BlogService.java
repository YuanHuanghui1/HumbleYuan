package com.humbleyuan.blogfront.service;


import com.humbleyuan.blogfront.entity.Blog;
import java.util.List;

/**
 * @Author: HumbleYuan
 * @description:博客service层
 * @Date: 2019/7/1
 * @Time: 9:43
 * @Version: 1.0
 */

public interface BlogService {

    /**
     * 获取前台主页显示博客信息
     * @return 所有博客集合
     */
    List<Blog> getFrontBlogsOnMainPage();

    /**
     * 获取最近更新的博客文章
     * @return 最近更新文章
     */
    List<Blog> getRecentBlogs(int num);

    /**
     * 获取点击量靠前的博客文章
     * @return 点击量靠前的博客文章
     */
    List<Blog> getRankingBlogsList(int num);

    /**
     * 获取推荐的博客文章(按weight权重)
     * @return 推荐的博客文章
     */
    List<Blog> getSupportBlogsList(int num);

}
