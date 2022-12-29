package com.cao.bookmanagementsystem.controller;

import com.cao.bookmanagementsystem.domain.Book;
import com.cao.bookmanagementsystem.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.lang.String;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class BookManagementSystemController {
    private final BookService bookService;

    public BookManagementSystemController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/create")
    public String postCreate(@RequestParam String isbn,
                             @RequestParam String name,
                             @RequestParam String author,
                             @RequestParam String publishDate,
                             HttpServletRequest request) {
//        HttpSession session = request.getSession(true);
//        session.setAttribute("");
        bookService.createNewBook(isbn, name, author, publishDate);
        return "redirect:/books";
    }

    @GetMapping("/books")
    public String getBooks(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "books";
    }

    @PostMapping("/update")
    public String postUpdate(@RequestParam String isbn,
                             @RequestParam String name,
                             HttpServletRequest request) {
        bookService.updateBook(isbn, name);
        return "redirect:/books";
    }
}
