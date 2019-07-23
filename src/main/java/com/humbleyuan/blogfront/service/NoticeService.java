package com.humbleyuan.blogfront.service;

import com.humbleyuan.blogfront.entity.Notice;

import java.util.List;

/**
 * @Author: HumbleYuan
 * @description:通知信息service层
 * @Date: 2019/7/15
 * @Time: 10:26
 * @Version: 1.0
 */
public interface NoticeService {

    /**
     * 获取通知
     * @return 通知信息
     */
    List<Notice> getDisplayNoticesList();
}
