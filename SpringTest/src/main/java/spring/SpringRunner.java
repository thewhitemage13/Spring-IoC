package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.service.UserService;

public class SpringRunner {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
        var userRepos = context.getBean("repo1");


        //var userService = context.getBean(UserService.class);
        System.out.println(userRepos);
        context.close();
    }
}
