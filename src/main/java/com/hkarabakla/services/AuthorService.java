package com.hkarabakla.services;

import com.hkarabakla.entities.Author;
import com.hkarabakla.entities.Book;
import com.hkarabakla.entities.Category;
import com.hkarabakla.repositories.AuthorRepo;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.UUID;

@Component
public class AuthorService {

    private final AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    public void authorOperations() {

        Author a = new Author();
        a.setName("J.K.Rowling");

        Category c = new Category();
        c.setName("Bilim Kurgu");

        Book b = new Book();
        b.setIsbn(UUID.randomUUID().toString());
        b.setName("Harry Potter");
        b.setPrice(21.90);
        b.setCurrency("in stock");
        b.setCategory(c);

        a.setBook(Collections.singletonList(b));
        authorRepo.save(a);

        System.out.println(authorRepo.findByName("J.K.Rowling"));



 }


}
