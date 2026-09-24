package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApllicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
