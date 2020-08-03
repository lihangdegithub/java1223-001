package com.offcn.cart.service;

import com.offcn.group.Cart;
import org.apache.zookeeper.txn.CreateTxn;

import java.util.List;

public interface CartService {

    /**
     * //�����Ʒ�����ﳵ
     * @param cartList  ���ﳵ����
     * @param itemId    ��ӵ����ﳵ����Ʒ���
     * @param num       ��ӵ����ﳵ����Ʒ����
     *                  ����ֵ��������Ʒ��Ĺ��ﳵ����
     */
    public List<Cart> addGoodsToCartList(List<Cart> cartList, Long itemId, Integer num);

    /**
     * �ӹ��ﳵ��ȡָ���Ĺ��ﳵ��������
     * @param username  ��ǰ�û�
     * @return           ��ǰ�û����ﳵ����
     */
    public List<Cart> findCartListFromRedis(String username);

    /**
     * д��ָ�����ﳵ�������ݵ�redis
     * @param username
     * @param cartList
     */
    public void saveCartListToRedis(String username,List<Cart> cartList);

    //�ϲ����ﳵ����
    public List<Cart> mergeCartList(List<Cart> cookieCartList,List<Cart> redisCartList);

}
