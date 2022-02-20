package com.soft2176.test;

import com.soft2176.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @program: 01-基础加强
 * @description: 计算器单元测试类
 * @author: ycshang
 * @create: 2022-02-20 00:53
 **/
public class CalculatorTest {
    /**
     * 初始化方法
     * 用于资源申请，所有测试方法在执行之前都会先执行该方法
     */
    @Before
    public void init() {
        System.out.println("init...");
    }

    /**
     * 释放资源方法
     * 在所有测试方法执行完毕后，都会自动执行该方法
     */
    @After
    public void close() {
        System.out.println("close...");
    }

    /**
     * 测试add方法
     */
    @Test
    public void testAdd() {
        System.out.println("我被执行了....");
        System.out.println("testAdd...");
        //1、创建计算器对象
        Calculator c = new Calculator();
        //2、调用add方法
        int result = c.add(1, 2);
        System.out.println(result);
        //3、断言，判断结果为3
        Assert.assertEquals(3, result);
    }
    /**
     * 测试sub方法
     */
    @Test
    public void testSub() {
        System.out.println("我被执行了....");
        System.out.println("testSub...");
        //1、创建计算器对象
        Calculator c = new Calculator();
        //2、调用add方法
        int result = c.sub(1, 2);
        System.out.println(result);
        //3、断言，判断结果为3
        Assert.assertEquals(-1, result);
    }
}