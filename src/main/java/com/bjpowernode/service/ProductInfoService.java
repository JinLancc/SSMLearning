package com.bjpowernode.service;

import com.bjpowernode.pojo.ProductInfo;
import com.bjpowernode.pojo.vo.ProductInfoVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author 瑾澜
 * @Date 2022/7/7 19:09
 */
public interface ProductInfoService {
    /**
     * 显示全部商品（不分页）
     */
    List<ProductInfo> getAll();


    /**
     * 分页功能实现
     * @param pageNum 当前页
     * @param pageSize 每页记录的条数
     * @return  PageInfo 返回一个分页的类对象，该对象有分页需要用到的数据
     */
    PageInfo splitPage(int pageNum,int pageSize);

    /**
     * 添加商品功能
     * @param info 商品对象
     * @return返回添加结果
     */
    int save(ProductInfo info);

    /**
     * 按主键id查询商品
     * @param pid
     * @return
     */
    ProductInfo getByID(int pid);


    /**
     * 更新商品
     * @param info
     * @return
     */
    int update(ProductInfo info);

    /**
     * 单个商品的删除
     * @param pid
     * @return
     */
    int delete(int pid);

    /**
     * 批量删除商品
     * @param pids
     * @return
     */
    int deleteBatch(String[] pids);

    /**
     * 多条件查询商品
     * @param vo
     * @return
     */
    List<ProductInfo> selectCondition(ProductInfoVo vo);

    /**
     * 多条件查询分页
     * @param vo
     * @param pageSize
     * @return
     */
    PageInfo splitPageVo(ProductInfoVo vo,int pageSize);
}
