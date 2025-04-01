package com.example.tpo_project_04;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate publicationDate;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    @ManyToMany(mappedBy = "books")
    private List<Author> authors;

    @Override
    public String toString() {
        return "Book{id=" + id + ", title='" + title + "', publicationDate='" + publicationDate + "}";
    }

}