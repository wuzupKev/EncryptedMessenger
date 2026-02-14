package com.wuzupkev.p2pchatapp.model.dao;

import java.util.List;
import java.util.Optional;
public interface Dao<T, K> {
    void create(T entity);
    Optional<T> findById(K id);
    List<T> findAll();
    void update(T entity);
    void delete(T entity);
}
