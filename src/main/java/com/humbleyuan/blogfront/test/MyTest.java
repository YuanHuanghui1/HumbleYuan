package com.humbleyuan.blogfront.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.humbleyuan.blogfront.entity.Blog;
import com.humbleyuan.blogfront.service.BlogService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: HumbleYuan
 * @description:测试类
 * @Date: 2019/7/1
 * @Time: 9:51
 * @Version: 1.0
 */
public class MyTest {
    @Autowired
    BlogService blogService;

    @Test
    public void ServiceTest1() {

        if(blogService.getFrontBlogsOnMainPage() == null) {
            System.out.println("未取到数据");
            return;
        }


        List<Blog> blogList = blogService.getFrontBlogsOnMainPage();

        PageHelper.startPage(1,12,"create_time desc");
        PageInfo<Blog> myPage = new PageInfo<>(blogList);

        myPage.toString();

    }
}
