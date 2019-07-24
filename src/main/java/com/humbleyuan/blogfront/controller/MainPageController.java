package com.humbleyuan.blogfront.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.humbleyuan.blogfront.constant.BlogsConstant;
import com.humbleyuan.blogfront.entity.Blog;
import com.humbleyuan.blogfront.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HumbleYuan
 * @description:主页加载controller层
 * @Date: 2019/7/16
 * @Time: 10:00
 * @Version: 1.0
 */
@RequestMapping("/api/mainPage")
@Controller
public class MainPageController {

    @Autowired
    BlogService blogService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    NoticeService noticeService;

    @Autowired
    TagService tagService;

    @Autowired
    LinkService linkService;

    /**
     * 查询主页需要显示的内容
     * @param model
     */
    private void setCommonMessage(Map<String,Object> data) {

        //获取分类下拉项中的分类
        data.put("categories", categoryService.getCategoriesList());
        //查询所有的标签
        data.put("tags", tagService.getAllTags());
        //查询最近更新的文章
        data.put("recentBlogsList", blogService.getRecentBlogs(BlogsConstant.recentBlogsDisplayNum));
        //查询文章排行
        data.put("rankingBlogsList", blogService.getRankingBlogsList(BlogsConstant.rankingBlogsDisplayNum));
        //查询推荐博文
        data.put("supportBlogsList", blogService.getSupportBlogsList(BlogsConstant.supportBlogsDisplayNum));
        //查询通知
        data.put("noticesList", noticeService.getDisplayNoticesList());
        //获取友链信息
        data.put("links", linkService.getDisplayLinksList());

    }

    /**
     *测试
     */
//    @GetMapping("/api/blogs")
//    @ResponseBody
//    public PageInfo<Blog> getFrontBlogsOnMainPage(Integer pageNum) {
//        if(blogService.getFrontBlogsOnMainPage() == null) {
//            System.out.println("未取到数据");
//            return null;
//        }
//        //这里要用包装类，否则不能==null
//        PageHelper.startPage(pageNum == null ? 1 : pageNum, 7, "create_time desc");
//        //PageHelper.startPage(1,8,"create_time desc");
//
//        PageInfo<Blog> myPage = new PageInfo<>(blogService.getFrontBlogsOnMainPage());
//        //System.out.println(myPage.toString());
//        return myPage;
//    }

    /**
     * 测试返回model或map，前端axios能否接受
     */
//    @GetMapping("/mainPage")
//    @ResponseBody
//    public Map<String,Object> getFrontBlogsOnMainPage(Integer pageNum) {
//
//        Map<String,Object> mainPageData = new HashMap<>();
//        setCommonMessage(mainPageData);
//
//        //这里要用包装类，否则不能==null
//        PageHelper.startPage(pageNum == null ? 1 : pageNum, 7, "create_time desc");
//
//        PageInfo<Blog> myPage = new PageInfo<>(blogService.getFrontBlogsOnMainPage());
//
//        //放入PageInfo
//        mainPageData.put("blogPageInfo",myPage);
//
//        return mainPageData;
//    }

    /**
     * 首页主体（博客文章展示及分页数据）
     */
    @GetMapping("/body")
    @ResponseBody
    public PageInfo<Blog> getBodyInfo(Integer pageNum) {
        //这里要用包装类，否则不能==null
        PageHelper.startPage(pageNum == null ? 1 : pageNum, 7, "create_time desc");
        PageInfo<Blog> myPage = new PageInfo<>(blogService.getFrontBlogsOnMainPage());

        return myPage;
    }

    /**
     * header(通知及分类)
     */
    @GetMapping("/header")
    @ResponseBody
    public Map<String,Object> getHeaderInfo() {
        Map<String,Object> headerInfo = new HashMap<>();

        //获取分类下拉项中的分类
        headerInfo.put("categories", categoryService.getCategoriesList());

        //查询通知
        headerInfo.put("noticesList", noticeService.getDisplayNoticesList());
        return headerInfo;
    }

    /**
     * aside侧栏(博客排行，推荐，最近，标签，友链)
     */
    @GetMapping("/aside")
    @ResponseBody
    public Map<String,Object> getAsideInfo() {
        Map<String,Object> asideInfo = new HashMap<>();

        //查询所有的标签
        asideInfo.put("tags", tagService.getAllTags());
        //查询最近更新的文章
        asideInfo.put("recentBlogsList", blogService.getRecentBlogs(BlogsConstant.recentBlogsDisplayNum));
        //查询文章排行
        asideInfo.put("rankingBlogsList", blogService.getRankingBlogsList(BlogsConstant.rankingBlogsDisplayNum));
        //查询推荐博文
        asideInfo.put("supportBlogsList", blogService.getSupportBlogsList(BlogsConstant.supportBlogsDisplayNum));
        //获取友链信息
        asideInfo.put("links", linkService.getDisplayLinksList());

        return asideInfo;
    }

    /**
     * 博客详情获取获取
     */
    @GetMapping("/blog")
    @ResponseBody
    public Map<String,Object> getCurrentBlogInfo(int blogId) {
        Map<String,Object> currentBlogInfo = new HashMap<>();

        //获取当前博客的相关信息(包含上一篇及下一篇)
        currentBlogInfo.put("thisBlog",blogService.getBlogInfoAndTagsAndCloseBlogsById(blogId));

        //获取随机推荐的博客文章
        currentBlogInfo.put("ranBlogList",
                blogService.getRandomBlogsList(BlogsConstant.randomBlogsDisPlayNum));

        return currentBlogInfo;
    }
}



