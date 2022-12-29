package com.cao.bookmanagementsystem.service;

import com.cao.bookmanagementsystem.dao.BookDao;
import com.cao.bookmanagementsystem.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookDao bookDao;

    @Autowired
    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void createNewBook(String isbn, String name, String author, String publishDate) {
        bookDao.createNewBook(isbn, name, author, publishDate);
    }

    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    public void updateBook(String isbn, String name) {
        bookDao.setById(isbn, name);
    }
}
