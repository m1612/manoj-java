package com.manoj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manoj.entity.MyHouse;

public interface Houserepo extends JpaRepository<MyHouse, Integer> {

}
