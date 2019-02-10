package com.iioannou.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController()
@RequestMapping("/booksapi")
public class BookController {

    @GetMapping("/allbooks")
    public List<Book> getAllBooks() {

        return Collections.singletonList(new Book(1, "Learning Spring Boot 5.2", "Ioannou"));
    }
}
