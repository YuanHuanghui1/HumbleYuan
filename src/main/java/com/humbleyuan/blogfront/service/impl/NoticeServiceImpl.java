package com.humbleyuan.blogfront.service.impl;

import com.humbleyuan.blogfront.entity.Notice;
import com.humbleyuan.blogfront.mapper.NoticeMapper;
import com.humbleyuan.blogfront.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: HumbleYuan
 * @description:通知信息service实现层
 * @Date: 2019/7/15
 * @Time: 10:28
 * @Version: 1.0
 */
@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    NoticeMapper noticeMapper;

    /**
     * 获取通知
     * @return 通知信息
     */
    @Override
    public List<Notice> getDisplayNoticesList() {
        return noticeMapper.getDisplayNoticesList();
    }
}
