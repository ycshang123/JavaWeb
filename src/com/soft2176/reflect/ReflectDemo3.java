package com.soft2176.reflect;

import com.soft2176.domain.Person;

import java.lang.reflect.Constructor;

/**
 * @program: 01-基础加强
 * @description: 反射练习3——构造方法创建对象
 * @author: ycshang
 * @create: 2022-02-20 16:12
 **/
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        //    1、获取Person的Class对象
        Class<Person> personClass = Person.class;
        //    2、获取参数带构造方法
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //    3、通过构造方法创建对象(注意参数对应)
        Object person = constructor.newInstance("张三", 23);
        System.out.println(person);
        System.out.println("======================");
        //    获取无参构造方法
        Constructor<Person> constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        //    创建对象
        Object person1 = constructor1.newInstance();
        System.out.println(person1);
        //    强制将构造方法设置为可以访问
        constructor1.setAccessible(true);
    }
}