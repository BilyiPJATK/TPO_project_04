package com.example.tpo_project_04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TpoProject04Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(TpoProject04Application.class, args);

        AuthorRepository authorRepository = context.getBean(AuthorRepository.class);
        BookRepository bookRepository = context.getBean(BookRepository.class);
        PublisherRepository publisherRepository = context.getBean(PublisherRepository.class);

        authorRepository.findAll().forEach(author -> System.out.println(author));
        bookRepository.findAll().forEach(book -> System.out.println(book));
        publisherRepository.findAll().forEach(publisher -> System.out.println(publisher));
    }

}
