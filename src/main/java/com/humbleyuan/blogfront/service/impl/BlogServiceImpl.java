package com.humbleyuan.blogfront.service.impl;

import com.humbleyuan.blogfront.entity.Blog;
import com.humbleyuan.blogfront.entity.Tag;
import com.humbleyuan.blogfront.mapper.BlogMapper;
import com.humbleyuan.blogfront.mapper.BlogTagMapper;
import com.humbleyuan.blogfront.mapper.TagMapper;
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

    @Autowired
    BlogTagMapper blogTagMapper;

    @Autowired
    TagMapper tagMapper;


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

    /**
     * 获取选中博客信息用于显示
     * @param blogId
     * @return 选中博客
     */
    @Override
    public Blog getBlogInfoAndTagsAndCloseBlogsById(int blogId) {
        //先获取博客相关信息包括所属类型
        Blog b = blogMapper.getContentAndCategoryById(blogId);

        //获取与博客相关的标签id集合
        List<Integer> tagIdList = blogTagMapper.getTagsByBlogId(blogId);

        String[] contactTags = new String[tagIdList.size()];
        int index = 0;
        //遍历id，根据id查标签名称
        for (int tagId:
             tagIdList) {
            contactTags[index++] = tagMapper.getTagTitleByTagId(tagId).getTagTitle();
        }

        //将b的tag[]属性赋值
        b.setTags(contactTags);

        //获取邻近的博客文章
        b.setNextBlog(blogMapper.getNextBlogByBlogId(blogId));
        b.setPreviousBlog(blogMapper.getPreviousBlogByBlogId(blogId));

        //增加访问量(访问量先加后加区别)
        blogMapper.increaseBlogClick(blogId);

        return b;
    }

    /**
     * 获取随机推荐的博客集合
     * @param num
     * @return 随机推荐的博客集合
     */
    @Override
    public List<Blog> getRandomBlogsList(int num) {
        return blogMapper.getRandomBlogsList(num);
    }
}

