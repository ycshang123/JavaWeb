package com.soft2176.annotation;

/**
 * @program: 01-基础加强
 * @description:自定义计算器类，每个方法都用自定义的Check注解来检查是否有运行异常
 * @author: ycshang
 * @create: 2022-02-20 16:50
 **/
public class Calculator {
    @Check
    public void add() {
        String str = null;
        int length = str.length();
        System.out.println("1+0=" + (1 + 0));
    }

    @Check
    public void sub() {
        System.out.println("1-0=" + (1 - 0));
    }

    @Check
    public void mul() {
        System.out.println("1*0=" + (1 * 0));
    }

    @Check
    public void div() {
        System.out.println("1/0=" + (1 / 0));
    }

    public void show() {
        System.out.println("永无bug...");
    }


}