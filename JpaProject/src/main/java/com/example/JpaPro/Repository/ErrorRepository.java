package com.example.JpaPro.Repository;

import com.example.JpaPro.Entity.ErrorLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ErrorRepository extends JpaRepository<ErrorLog,Long> {
}
