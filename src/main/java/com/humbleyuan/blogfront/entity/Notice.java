package com.humbleyuan.blogfront.entity;

import lombok.Data;

/**
 * @Author: HumbleYuan
 * @description:公告实体
 * @Date: 2019/7/15
 * @Time: 10:17
 * @Version: 1.0
 */
@Data
public class Notice {
    /**
     * 公告ID
     */
    private Integer noticeId;
    /**
     * 公告标题
     */
    private String noticeTitle;
    /**
     * 显示（0不显示 1显示）
     */
    private Integer display;
}
