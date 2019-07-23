package com.humbleyuan.blogfront.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author: HumbleYuan
 * @description:标签与文章关联dao层
 * @Date: 2019/7/18
 * @Time: 8:15
 * @Version: 1.0
 */
@Mapper
@Repository
public interface BlogTagMapper {

    /**
     * 获取标签与博客关联数
     * @return 标签与博客关联数
     */
    int getTagContactWithBlogCount(int tagId);
}
