package com.bjpowernode.service;

import com.bjpowernode.pojo.Admin;

/**
 * @Author 瑾澜
 * @Date 2022/7/4 18:12
 */
public interface AdminService {
    /**
    * login（）完成登录判断
     * @Admin 用户类
     * @param name 用户名
     * @param pwd 用户密码
     * @return 返回一个用户对象
     */
    Admin login(String name, String pwd);
}
