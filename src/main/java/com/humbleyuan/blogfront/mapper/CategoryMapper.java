package com.humbleyuan.blogfront.mapper;


import com.humbleyuan.blogfront.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: HumbleYuan
 * @description:博客数据存取dao层
 * @Date: 2019/7/11
 * @Time: 19:55
 * @Version: 1.0
 */
@Mapper
@Repository
public interface CategoryMapper {

    /**
     * 获取博客类型集合
     * @return 博客类型集合
     */
    List<Category> getCategoriesList();
}
