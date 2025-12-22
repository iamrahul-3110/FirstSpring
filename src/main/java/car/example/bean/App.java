package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // loaded the application context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        // we retrieve the bean from context.
        MyBean myBean = (MyBean) context.getBean("myBean");
        System.out.println(myBean);
    }
}
