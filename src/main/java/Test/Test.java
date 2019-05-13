package Test;

import controller.StudentController;
import dao.Impl.StudentDaoImpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Impl.StudentServiceImpl;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext bf=new ClassPathXmlApplicationContext("beans.xml");
        //Person类
        Person pe=(Person)bf.getBean("person1");
        pe.test();

        //持久化数据层（dao)
        StudentDaoImpl sd=(StudentDaoImpl)bf.getBean("studentDaoImpl");
        sd.add("张三");

        //业务逻辑层（service)
        StudentServiceImpl ss=(StudentServiceImpl)bf.getBean("studentServiceImpl");
        ss.add("李四");

        //控制层(controller)
        StudentController sc=(StudentController)bf.getBean("studentController");
        sc.add();
    }
}
