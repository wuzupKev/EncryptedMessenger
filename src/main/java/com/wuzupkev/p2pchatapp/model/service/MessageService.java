package com.wuzupkev.p2pchatapp.model.service;
import com.wuzupkev.p2pchatapp.model.dao.MessageDao;
import com.wuzupkev.p2pchatapp.model.entity.MessageEntity;
import java.util.List;
import java.util.Optional;


public class MessageService implements MessageDao {
    @Override
    public void create(MessageEntity entity) {

    }

    @Override
    public Optional<MessageEntity> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<MessageEntity> findAll() {
        return List.of();
    }

    @Override
    public void update(MessageEntity entity) {

    }

    @Override
    public void delete(MessageEntity entity) {

    }
}
