package com.example.democomment.dao;

import java.lang.annotation.*;


// 注解的作用域
@Target({ElementType.METHOD,ElementType.CONSTRUCTOR,ElementType.TYPE,ElementType.PARAMETER,ElementType.FIELD})
// 注解的生命周期(只在源码显示,编译时会丢弃；编译时会记录到class中，运行是存在可以通过反射读取)
@Retention(RetentionPolicy.RUNTIME)
// 允许子类继承
@Inherited
// 生成javadoc时会包含注解
@Documented
public @interface TeacherDao {
//    String desc(int index);

    /**
     * 使用@interface关键字定义注解，成员以无参数无异常方式声明，
     * @return
     */
    String name();
    String author();

    // default 为成员指定一个默认值
    int age() default 22;
}
