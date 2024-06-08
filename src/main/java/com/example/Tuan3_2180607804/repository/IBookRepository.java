package com.example.Tuan3_2180607804.repository;

import com.example.Tuan3_2180607804.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}
