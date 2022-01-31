package com.example.JpaPro.Repository;

import com.example.JpaPro.Entity.AccessLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessRepository extends JpaRepository<AccessLog,Long> {
}
