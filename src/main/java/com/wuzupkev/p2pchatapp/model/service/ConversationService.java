package com.wuzupkev.p2pchatapp.model.service;

import com.wuzupkev.p2pchatapp.model.dao.ConversationDao;
import com.wuzupkev.p2pchatapp.model.entity.ConversationEntity;

import java.util.List;
import java.util.Optional;

public class ConversationService implements ConversationDao {
    @Override
    public void create(ConversationEntity entity) {

    }

    @Override
    public Optional<ConversationEntity> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<ConversationEntity> findAll() {
        return List.of();
    }

    @Override
    public void update(ConversationEntity entity) {

    }

    @Override
    public void delete(ConversationEntity entity) {

    }
}
