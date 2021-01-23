package com.hkarabakla.repositories;

import com.hkarabakla.entities.Book;
import com.hkarabakla.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, String> {

        Book findByName(String name);

}
