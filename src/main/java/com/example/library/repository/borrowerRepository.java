package com.example.library.repository;

import com.example.library.entity.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface borrowerRepository extends JpaRepository<Borrower,Long> {


}
