package com.lab;

import com.lab.config.AppConfig;
import com.lab.model.Comment;
import com.lab.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Khoi tao Spring Context ===");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        CommentService service =
                context.getBean(CommentService.class);

        service.publishComment(
                new Comment("Alice", "Spring DI hoat dong!")
        );

        CommentService service2 =
                context.getBean(CommentService.class);

        System.out.println("Cung instance? " + (service == service2));

        context.close();
    }
}