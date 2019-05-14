package com.example.democomment.dao;
@TeacherDao(name = "I am interFace")
public class Person {
    @TeacherDao(name = "I am method")
    public String name(){
        return null;
    }
    public int age(){
        return 0;
    }
    @Deprecated
    public String sing(){
        return null;
    }
}
