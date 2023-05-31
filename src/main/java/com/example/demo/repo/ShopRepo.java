package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Shopping;

public interface ShopRepo extends JpaRepository<Shopping, Integer> {

}
