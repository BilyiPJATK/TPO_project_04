    package com.example.tpo_project_04;

    import org.springframework.data.repository.CrudRepository;

    import java.util.List;

    public interface BookRepository extends CrudRepository<Book, Long> {
    }
