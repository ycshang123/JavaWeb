package com.soft2176.reflect;

import com.soft2176.domain.Person;

import java.lang.reflect.Field;

/**
 * @program: 01-基础加强
 * @description:反射练习2——Class对象功能
 * @author: ycshang
 * @create: 2022-02-20 15:59
 **/
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        //    0、获取Person的Class对象
        Class<Person> personClass = Person.class;
        //    1、Field[] getFields()获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("====================");
        //    2、Field getField(String name)
        Field a = personClass.getField("a");
        //    获取成员变量a的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        //    设置a的p属性的值
        a.set(p, "张三");
        System.out.println(p);
        System.out.println("====================");
        //    Field[] getDeclaredFields():获取所有的成员变量、不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        //    Field getDeclaredField(String name)
        Field field = personClass.getDeclaredField("d");
        //    忽略访问权限修饰符的安全检查——暴力反射
        field.setAccessible(true);
        Object value2 = field.get(p);
        System.out.println(value2);

    }
}