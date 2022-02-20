package com.soft2176.junit;

/**
 * @program: 01-基础加强
 * @description:计算器类
 * @author: ycshang
 * @create: 2022-02-19 23:05
 **/
public class Calculator {
    /**
     * 加法
     * @param a 整数
     * @param b 整数
     * @return 两数之和
     */
    public int add(int a,int b){
        //故意bug
        return a-b;
    }

    /**
     * 减法
     * @param a 整数
     * @param b zh
     * @return 两数之差
     */
    public int sub(int a,int b){
        return a-b;
    }
}