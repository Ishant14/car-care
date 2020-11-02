package com.ishant.carcareservice.repository;

import com.ishant.carcareservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}