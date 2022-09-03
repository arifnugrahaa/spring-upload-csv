package com.csv.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csv.Entity.Book;

public interface BookRepo extends JpaRepository<Book, Long> {
    
}
