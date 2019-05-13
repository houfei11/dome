package dao.Impl;

import dao.StudentDao;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Override
    public boolean add(String name) {
        System.out.println("我是数据：" + name);
        return false;
    }
}
