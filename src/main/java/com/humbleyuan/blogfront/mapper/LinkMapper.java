package com.humbleyuan.blogfront.mapper;

import com.humbleyuan.blogfront.entity.Link;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: HumbleYuan
 * @description:友链dao层
 * @Date: 2019/7/15
 * @Time: 12:37
 * @Version: 1.0
 */
@Mapper
@Repository
public interface LinkMapper {

    /**
     * 获取显示的友链集合
     * @return 可显示的友链集合
     */
    List<Link> getDisplayLinksList();
}
