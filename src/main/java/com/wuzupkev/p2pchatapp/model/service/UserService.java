package com.wuzupkev.p2pchatapp.model.service;

import com.wuzupkev.p2pchatapp.model.dao.UserDao;
import com.wuzupkev.p2pchatapp.model.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public class UserService implements UserDao {
    @Override
    public void create(UserEntity entity) {

    }

    @Override
    public Optional<UserEntity> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<UserEntity> findAll() {
        return List.of();
    }

    @Override
    public void update(UserEntity entity) {

    }

    @Override
    public void delete(UserEntity entity) {

    }
}
