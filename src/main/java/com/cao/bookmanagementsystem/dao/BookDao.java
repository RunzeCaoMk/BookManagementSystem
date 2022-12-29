package com.cao.bookmanagementsystem.dao;

import com.cao.bookmanagementsystem.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookDao {

    JdbcTemplate jdbcTemplate;
    BookRowMapper rowMapper;
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public BookDao(JdbcTemplate jdbcTemplate, BookRowMapper rowMapper, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = rowMapper;
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public void createNewBook(String isbn, String name, String author, String publishDate) {
        String query = "INSERT INTO book (isbn, name, author, publish_date) values (?, ?, ?, ?)";
        jdbcTemplate.update(query, isbn, name, author, publishDate);
    }

    public List<Book> getAllBooks() {
        String query = "SELECT * FROM book";
        List<Book> books = jdbcTemplate.query(query, rowMapper);
        return books;
    }

    public void setById(String isbn, String name) {
        String query = "UPDATE book SET name = ? WHERE isbn = ?";
        jdbcTemplate.update(query, name, isbn);
    }
}
