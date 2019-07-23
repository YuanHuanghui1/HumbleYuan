package com.humbleyuan.blogfront.mapper;

import com.humbleyuan.blogfront.entity.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: HumbleYuan
 * @description:通知信息存取dao层
 * @Date: 2019/7/15
 * @Time: 10:24
 * @Version: 1.0
 */
@Mapper
@Repository
public interface NoticeMapper {

    /**
     * 获取通知
     * @return 通知信息
     */
    List<Notice> getDisplayNoticesList();
}
