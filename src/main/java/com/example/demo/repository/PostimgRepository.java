package com.example.demo.repository;

import com.example.demo.domain.Postimg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostimgRepository extends JpaRepository<Postimg, Long>{
}