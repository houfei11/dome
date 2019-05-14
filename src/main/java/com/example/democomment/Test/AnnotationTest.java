package com.example.democomment.Test;

import com.example.democomment.dao.TeacherDao;
import com.example.democomment.entity.TeacherUser;
import sun.security.krb5.internal.crypto.Des;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class AnnotationTest {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        System.out.println(show());
        // 反射获取 class
        Class<?> aClass = Class.forName("com.example.democomment.entity.TeacherUser");
        // 取出自定义注解的Value值
        TeacherDao teacherDao = aClass.getDeclaredAnnotation(TeacherDao.class);
        if (teacherDao != null){
            System.out.println("类TeacherUser的注解@TeacherDao的Value值是：" + teacherDao);
        }
        // 获取所有该类的方法
        Field[] fields = aClass.getDeclaredFields();
        for (Field declaredField : fields) {
            TeacherDao fieldAnnotation = declaredField.getDeclaredAnnotation(TeacherDao.class);
            if(fieldAnnotation != null){
                System.out.println("字段"+ declaredField.getName()
                        +"有注解，注解的value值是："+fieldAnnotation.name()
                        +" 注解的author的值是："+fieldAnnotation.author());
            } else {
                System.out.println("字段"+declaredField.getName()+"没有注解");
            }

        }
        // 获取方法上的注解
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            boolean boo = method.isAnnotationPresent(TeacherDao.class);
            if (boo){
                TeacherDao dao = method.getAnnotation(TeacherDao.class);
                System.out.println(dao.name() + dao.author() + dao.age());
            }
        }
        for (Method method : methods){
            Annotation[] annotations = method.getAnnotations();
            for (Annotation a : annotations){
                if (a instanceof TeacherDao) {
                    TeacherDao d = (TeacherDao)a;
                    System.out.println(d.age());
                }
            }

        }
    }

    @TeacherDao(name = "小花老师", author = "小花", age = 22)
    public static String show(){
        TeacherUser user = new TeacherUser();
        System.out.println(user.getName());
        return "red";
    }
}
