package com.wuzupkev.p2pchatapp.model.service;

import com.wuzupkev.p2pchatapp.config.DbConnection;
import com.wuzupkev.p2pchatapp.model.dao.ConversationDao;
import com.wuzupkev.p2pchatapp.model.entity.ConversationEntity;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class ConversationService implements ConversationDao {
    private PreparedStatement preparedStatement=null;
    private ResultSet r=null;
    final String CREATE_CONVERSATION="INSERT INTO conversations(user1id,user2id,createdat) VALUES(?,?,?)";
    private DbConnection dbConnection;
    public ConversationService(DbConnection dbConnection){
        this.dbConnection=dbConnection;
    }
    @Override
    public void create(ConversationEntity entity) {
        try{

            preparedStatement = dbConnection.getConnection()
                    .prepareStatement(CREATE_CONVERSATION, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setInt(1,entity.getUser1Id());
            preparedStatement.setInt(2, entity.getUser2Id());
            preparedStatement.setTimestamp(3, Timestamp.valueOf(entity.getCreatedAt()));
            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }

            r = preparedStatement.getGeneratedKeys();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
