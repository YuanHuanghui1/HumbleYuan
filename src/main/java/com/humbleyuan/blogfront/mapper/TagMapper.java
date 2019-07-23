package com.humbleyuan.blogfront.mapper;

import com.humbleyuan.blogfront.entity.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: HumbleYuan
 * @description:标签的dao层
 * @Date: 2019/7/11
 * @Time: 21:25
 * @Version: 1.0
 */
@Mapper
@Repository
public interface TagMapper {

    /**
     * 标签展示
     * @return 所需展示标签的集合
     */
    List<Tag> getAllTags();
}
