package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService stuService;

    public String add(){
        System.out.println("我是控制层");
        stuService.add("哆啦A梦");
        return "add";
    }

    public void setStuService(StudentService stuService) {
        this.stuService = stuService;
    }

}
