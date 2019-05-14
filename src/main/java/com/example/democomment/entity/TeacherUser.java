package com.example.democomment.entity;

import com.example.democomment.dao.TeacherDao;

public class TeacherUser {
    @TeacherDao(name = "小花老师", author = "xiaofei")
    public String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
