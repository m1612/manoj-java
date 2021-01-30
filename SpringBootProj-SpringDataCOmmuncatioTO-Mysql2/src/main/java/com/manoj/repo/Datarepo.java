package com.manoj.repo;

import org.springframework.data.repository.CrudRepository;

import com.manoj.entity.ShortStock;

public interface Datarepo extends CrudRepository<ShortStock, Integer> {

}
