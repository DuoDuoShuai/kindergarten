package com.duo.kindergarten.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 哆哆
 * @description
 * @date 2022-08-17 17:49:39
 * 用户
 */
@Data//自动生成get和set的方法
@AllArgsConstructor//全参构造参数
@NoArgsConstructor//无参构造参数
public class User {
    private String user_id;//小程序用户id
    private String user_name;//用户名
    private String user_portrait;//用户头像
    private String user_phone;//用户手机号
    private int  is_delete;//是否删除
    private Long create_time;//创建时间
    private Long update_time;//更新时间
    private int guardian_id;//监护人id

}
