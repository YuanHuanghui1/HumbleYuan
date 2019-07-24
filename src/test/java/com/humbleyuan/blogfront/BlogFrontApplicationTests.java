package com.humbleyuan.blogfront;
import com.humbleyuan.blogfront.constant.BlogsConstant;
import com.humbleyuan.blogfront.entity.Blog;
import com.humbleyuan.blogfront.service.BlogService;
import com.humbleyuan.blogfront.service.CategoryService;
import com.humbleyuan.blogfront.service.NoticeService;
import com.humbleyuan.blogfront.service.TagService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogFrontApplicationTests {

	@Autowired
	BlogService blogService;

	@Autowired
	CategoryService categoryService;

	@Autowired
	NoticeService noticeService;

	@Autowired
	TagService tagService;

	@Test
	public void ServiceTest1() {

//		if(blogService.getFrontBlogsOnMainPage() == null) {
//			System.out.println("未取到数据");
//			return;
//		}
//
//		List<Blog> blogList = blogService.getFrontBlogsOnMainPage();
//
//		PageHelper.startPage(2,5,"create_time desc");
//		PageInfo<Blog> myPage = new PageInfo<>(blogList);
//		System.out.println(myPage.toString());

		//分类service
		//System.out.println(categoryService.getCategoriesList().toString());

		//tag信息
		//System.out.println(tagService.getAllTags());

		//查询num条最近更新的文章
		//System.out.println(blogService.getRecentBlogs(BlogsConstant.recentBlogsDisplayNum).toString());

		//查询文章排行
		//System.out.println(blogService.getRankingBlogsList(BlogsConstant.rankingBlogsDisplayNum).toString());

		//查询推荐文章
		//System.out.println(blogService.getSupportBlogsList(BlogsConstant.supportBlogsDisplayNum));

		//获取可显示的通知
		System.out.println(noticeService.getDisplayNoticesList());

	}

	//博客数据查询
	@Test
	public void getBlogListTest() {
		List<Blog> blogList = blogService.getFrontBlogsOnMainPage();

		System.out.println(blogList.get(0).getCategory().getCategoryTitle());
	}

	//博客具体内容显示
	@Test
	public void getCurrentBlogInfo() {
		//Blog blog = blogService.getBlogInfoAndTagsAndCloseBlogsById(1);

		List<Blog> blogs = blogService.getRandomBlogsList(BlogsConstant.randomBlogsDisPlayNum);

		for (Blog blog:blogs
			 ) {
			System.out.println(blog.toString());
		}

	}
}
