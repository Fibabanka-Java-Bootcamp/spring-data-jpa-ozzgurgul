package com.hkarabakla.services;

import com.hkarabakla.entities.Author;
import com.hkarabakla.entities.Book;
import com.hkarabakla.entities.Category;
import com.hkarabakla.repositories.BookRepo;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.UUID;

@Component
public class BookService {

    private final BookRepo bookRepo;

    public BookService(BookRepo categoryRepo) {
        this.bookRepo = categoryRepo;
    }

    public void bookOperations() {

            Category c = new Category();
            c.setName("Gerilim");

            Book b = new Book();
            b.setName("İkiz Bedenler");
            b.setIsbn(UUID.randomUUID().toString());
            b.setPrice(10);
            b.setCurrency("in stock");
            b.setCategory(c);

            Author a = new Author();
            a.setName("Tess Gerritsen");
            a.setBook(Collections.singletonList(b));

            bookRepo.save(b);

        System.out.println(bookRepo.findByName("İkiz Bedenler"));
    }
}
