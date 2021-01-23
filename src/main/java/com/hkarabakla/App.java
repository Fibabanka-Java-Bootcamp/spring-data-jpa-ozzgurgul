package com.hkarabakla;

import com.hkarabakla.services.AuthorService;
import com.hkarabakla.services.BookService;
import com.hkarabakla.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.hkarabakla");
        appContext.refresh();

        UserService userService = (UserService) appContext.getBean("userService");
        userService.userOperations();

      //  CategoryService categoryService = (CategoryService) appContext.getBean("categoryService");
       // categoryService.categoryOperations();

        AuthorService authorService = (AuthorService) appContext.getBean("authorService");
         authorService.authorOperations();

        BookService bookService = (BookService) appContext.getBean("bookService");
        bookService.bookOperations();



        appContext.close();
    }
}
