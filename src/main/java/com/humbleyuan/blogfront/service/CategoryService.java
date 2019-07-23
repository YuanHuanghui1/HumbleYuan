package com.humbleyuan.blogfront.service;

import com.humbleyuan.blogfront.entity.Category;

import java.util.List;

/**
 * @Author: HumbleYuan
 * @description:博客类型service层
 * @Date: 2019/7/11
 * @Time: 19:49
 * @Version: 1.0
 */
public interface CategoryService {

    /**
     * 获取博客类型集合
     * @return 所有博客类型集合
     */
    List<Category> getCategoriesList();
}
