package Test;

import org.springframework.stereotype.Component;

@Component(value="person1")
public class Person {
    public void test(){
        System.out.println("用户信息");
    }
}
