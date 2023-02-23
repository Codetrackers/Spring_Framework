package org.example.bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {


        //How to create spring container?

        ApplicationContext container= new AnnotationConfigApplicationContext(AppConfig.class);
        FullTimeEmployee ft = container.getBean(FullTimeEmployee.class);
        ft.createAccount();


        PartTimeEmployee pt= container.getBean(PartTimeEmployee.class);
        pt.createAccount();

    }
}
