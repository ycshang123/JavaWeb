package com.soft2176.annotation;

import java.lang.reflect.Method;

/**
 * @program: 01-基础加强
 * @description:
 * @author: ycshang
 * @create: 2022-02-20 17:10
 **/
@Pro(className = "com.soft2176.annotation.Demo1", methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //    1、获取该类的字节码文件对象
        Class<?> reflectTestClass = ReflectTest.class;
        //    2、获取该类上方的注解对象
        //    其实就是在内存中生成了一个该注解接口的子类实现对象
        //    public class ProImpl implements Pro{
        //    public String className(){
        //    return "com.soft2176.annotation.Demo1"
        //    }
        //public String methodName () {
        //    return "show";
        //}
        //    }
        Pro an = reflectTestClass.getAnnotation(Pro.class);
        //    3、调用注解对象中定义的抽象方法,获取返回值
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className + "," + methodName);
        //    4、加载该类进内存
        Class<?> cls = Class.forName(className);
        //    5、通过构造方法创建对象
        Object obj = cls.getConstructor().newInstance();
        //    6、获取方法对象
        Method method = cls.getMethod(methodName);
        //    7、执行方法
        method.invoke(obj);

    }
}