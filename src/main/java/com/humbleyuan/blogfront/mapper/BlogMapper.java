package com.humbleyuan.blogfront.mapper;

import com.humbleyuan.blogfront.entity.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: HumbleYuan
 * @description:博客数据存取dao层
 * @Date: 2019/6/30
 * @Time: 15:08
 * @Version: 1.0
 */
@Mapper
@Repository
public interface BlogMapper {

    /**
     * 获取前台主页显示博客信息
     * @return 所有可取出的博客文章集合
     */
    List<Blog> getFrontBlogsOnMainPage();

    /**
     * 获取最近更新的博客文章
     * @return 最近更新博客
     */
    List<Blog> getRecentBlogs(int num);

    /**
     * 获取点击量靠前的博客文章
     * @return 点击量靠前的博客文章
     */
    List<Blog> getRankingBlogsList(int num);

    /**
     * 获取推荐的博客文章
     * @return 推荐的博客文章
     */
    List<Blog> getSupportBlogsList(int num);
}
