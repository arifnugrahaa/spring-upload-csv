package com.csv.Services;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.csv.Entity.Book;
import com.csv.Repo.BookRepo;
import com.csv.Utility.CSVHelper;

@Service("bookService")
@Transactional
public class BookService {
    
    @Autowired
    private BookRepo bookRepo;

    public List<Book> save(MultipartFile file){
        try {
            List<Book> books = CSVHelper.csvToBooks(file.getInputStream());
            return bookRepo.saveAll(books);
            
        } catch (IOException e) {
            throw new RuntimeException("Fail to store csv data: "+ e.getMessage());
        }
    }

    public List<Book> findAll(){
        return bookRepo.findAll();
    }
}
