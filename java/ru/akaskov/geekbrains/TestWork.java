package ru.akaskov.geekbrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestWork {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Registry registry = context.getBean("registry", Registry.class);
        registry.gethelp();
//prototype в JavaConfig у Registry
        Registry registry1 = context.getBean("registry", Registry.class);
        registry1.gethelp();
    }
}
