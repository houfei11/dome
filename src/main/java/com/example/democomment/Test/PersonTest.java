package com.example.democomment.Test;

import com.example.democomment.dao.TeacherDao;

public class PersonTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // 反射获取 class
        Class<?> aClass = Class.forName("com.example.democomment.dao.Impl.Child");
        // 取出自定义注解的Value值
        TeacherDao teacherDao = aClass.getDeclaredAnnotation(TeacherDao.class);
        if (teacherDao != null){
            System.out.println("类TeacherUser的注解@TeacherDao的Value值是：" + teacherDao);
        }
    }
}
