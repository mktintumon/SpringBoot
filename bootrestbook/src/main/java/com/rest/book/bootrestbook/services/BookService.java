package com.rest.book.bootrestbook.services;
import com.rest.book.bootrestbook.dao.BookRepositoty;
import com.rest.book.bootrestbook.models.Book;
import java.util.*;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookService {

    @Autowired
    private BookRepositoty bookRepository;
    // FAKE database
    /* 
    private static List<Book> booksList = new ArrayList<>();

    static{
        booksList.add(new Book(123 , "Spring-Boot" , "Mohit"));
        booksList.add(new Book(124 , "Spring" , "Sumeet"));
        booksList.add(new Book(125 , "Java" , "Jatin"));
        booksList.add(new Book(126 , "Networking" , "Sanket"));
        booksList.add(new Book(127 , "Clouds" , "Ayush"));
    }
    */

    // Get All books 
    public List<Book> getAllBooks(){
        // findAll returns iterable ---> so type-cast to list
        List<Book> lists = (List<Book>)this.bookRepository.findAll();
        return lists;
    }


    // Get single book by id
    public Book getBookById(int id){
        Book book = null;

        try {
            book = this.bookRepository.findById(id);

            // stream is replacement for for-each loop
            /* 
                book = booksList.stream().filter(e->
                    e.getId() == id
                ).findFirst().get();
             */
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return book;
    }


    // Add book
    public Book addBook(Book book){
        // booksList.add(book);
        Book result = this.bookRepository.save(book);
        return result;
    }

    
    // delete book
    public void deleteBook(int id){
        this.bookRepository.deleteById(id);

        /* 
        booksList = booksList.stream().filter(e->
            // keep only books that are not matched with given id
            e.getId() != id
        ).collect(Collectors.toList());
        System.out.println("Book deleted with id : " + id);
        */

    }


    // update books
    public void updateBook(Book book , int id){
        book.setId(id);
        this.bookRepository.save(book);

        // nothing to filter out like delete
        // get object --> do changes --> return obj --> collect 
        /* 
        booksList = booksList.stream().map(e->{
            if(e.getId() == id){
                e.setName(book.getName());
                e.setAuthor(book.getAuthor());
            }

            return e;
        }).collect(Collectors.toList());
        */
    }
}