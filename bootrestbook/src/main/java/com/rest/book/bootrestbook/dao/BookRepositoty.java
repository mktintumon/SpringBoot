package com.rest.book.bootrestbook.dao;

import org.springframework.data.repository.CrudRepository;

import com.rest.book.bootrestbook.models.Book;

public interface BookRepositoty extends CrudRepository<Book,Integer> {
    public Book findById(int id);
}
