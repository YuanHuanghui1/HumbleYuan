package com.humbleyuan.blogfront.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.humbleyuan.blogfront.constant.BlogsConstant;
import com.humbleyuan.blogfront.entity.Blog;
import com.humbleyuan.blogfront.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HumbleYuan
 * @description:博客controller层
 * @Date: 2019/6/30
 * @Time: 14:40
 * @Version: 1.0
 */
@RequestMapping("/api/blog")
@Controller
public class BlogController {

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
//    private void setCommonMessage(Model model) {
//        //获取分类下拉项中的分类
//        model.addAttribute("categories", categoryService.getCategoriesList());
//        //查询所有的标签
//        model.addAttribute("tags", tagService.getAllTags());
//        //查询最近更新的文章
//        model.addAttribute("recentBlogsList", blogService.getRecentBlogs(BlogsConstant.recentBlogsDisplayNum));
//        //查询文章排行
//        model.addAttribute("rankingBlogsList", blogService.getRankingBlogsList(BlogsConstant.rankingBlogsDisplayNum));
//        //查询推荐博文
//        model.addAttribute("supportBlogsList", blogService.getSupportBlogsList(BlogsConstant.supportBlogsDisplayNum));
//        //查询通知
//        model.addAttribute("noticesList", noticeService.getDisplayNoticesList());
//        //获取友链信息
//        model.addAttribute("links", linkService.getDisplayLinksList());
//
//    }
//    /**
//     * 获取前台主页显示博客信息(测试)
//     */
//    @GetMapping("/api/b/blogs_")
//    @ResponseBody
//    public Map getFrontBlogsOnMainPage() {
//        Map<String,Object> initMap = new HashMap<>();
//        initMap.put("blogs",blogService.getFrontBlogsOnMainPage());
//        //System.out.println("到这了");
//        return initMap;
//    }

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
//    @GetMapping("/api/b/blogs")
//    @ResponseBody
//    public Model getFrontBlogsOnMainPage(Integer pageNum,Model model) {
//        setCommonMessage(model);
//
//        //这里要用包装类，否则不能==null
//        PageHelper.startPage(pageNum == null ? 1 : pageNum, 7, "create_time desc");
//
//        PageInfo<Blog> myPage = new PageInfo<>(blogService.getFrontBlogsOnMainPage());
//
//        //放入PageInfo
//        model.addAttribute("blogPageInfo",myPage);
//
//        return model;
//    }

}
