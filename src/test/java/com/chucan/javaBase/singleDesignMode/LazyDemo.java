package com.chucan.javaBase.singleDesignMode;

/**
 * @Author: Yeman
 * @CreatedDate: 2022-07-15-0:15
 * @Description:
 */
public class LazyDemo {

    //为什么需要加volatile，因为线程间变量的不可见和指令重排，可能导致两个线程同时访问时小概率产生同一变量访问值不一致
    private static volatile LazyDemo l;

    private LazyDemo(){

    }

    public static LazyDemo getInstance(){
        //这一层 l == null 的判断是为了减少获取锁的次数，只会在第一次创建的时候才需要拿锁，第二次调用的时候就在也不用加锁了
        if(l==null) {
            //添加synchronized是为了线程安全
            synchronized (LazyDemo.class) {
                if (l == null) {
                    l = new LazyDemo();
                }
            }
        }

        return l;
    }
}