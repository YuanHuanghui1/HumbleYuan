package com.humbleyuan.blogfront.service.impl;

import com.humbleyuan.blogfront.entity.Category;
import com.humbleyuan.blogfront.mapper.CategoryMapper;
import com.humbleyuan.blogfront.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: HumbleYuan
 * @description:博客service层实现类
 * @Date: 2019/7/11
 * @Time: 19:53
 * @Version: 1.0
 */
@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    /**
     * 获取博客类型集合
     * @return 所有博客类型集合
     */
    @Override
    public List<Category> getCategoriesList() {
        return categoryMapper.getCategoriesList();
    }
}
