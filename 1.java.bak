package com.offcn.cart.service;

import com.offcn.group.Cart;
import org.apache.zookeeper.txn.CreateTxn;

import java.util.List;
*************服务器端编辑了内容***************
public interface CartService {

    /**
     * //添加商品到购物车
     * @param cartList  购物车集合
     * @param itemId    添加到购物车的商品编号
     * @param num       添加到购物车的商品数量
     *                  返回值：新增商品后的购物车集合
     */
    public List<Cart> addGoodsToCartList(List<Cart> cartList, Long itemId, Integer num);

    /**
     * 从购物车读取指定的购物车集合数据
     * @param username  当前用户
     * @return           当前用户购物车集合
     */
    public List<Cart> findCartListFromRedis(String username);

    /**
     * 写入指定购物车集合数据到redis
     * @param username
     * @param cartList
     */
    public void saveCartListToRedis(String username,List<Cart> cartList);

    //合并购物车方法
    public List<Cart> mergeCartList(List<Cart> cookieCartList,List<Cart> redisCartList);

}
