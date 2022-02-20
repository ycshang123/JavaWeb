package com.soft2176.junit;

/**
 * @program: 01-基础加强
 * @description: 计算器测试类
 * @author: ycshang
 * @create: 2022-02-20 00:50
 **/
public class CalculatorTest {
    public static void main(String[] args) {
        //创建对象
        Calculator c = new Calculator();
        //    调用add()方法
        int result = c.add(1, 2);
        System.out.println(result);
        //    调用sub方法
        int result2 = c.sub(1, 1);
        System.out.println(result2);
    }
}