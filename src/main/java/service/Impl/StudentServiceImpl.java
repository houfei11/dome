package service.Impl;

import dao.StudentDao;
import org.springframework.stereotype.Service;
import service.StudentService;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao dao;
    @Override
    public boolean add(String name) {
        System.out.println("我是业务逻辑层：" + name);
        dao.add("小明");
        return false;
    }

    public void setDao(StudentDao dao){
        this.dao = dao;
    }
}
