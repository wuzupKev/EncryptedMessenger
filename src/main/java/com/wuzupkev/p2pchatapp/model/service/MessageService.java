package com.wuzupkev.p2pchatapp.model.service;
import com.wuzupkev.p2pchatapp.config.DbConnection;
import com.wuzupkev.p2pchatapp.model.dao.MessageDao;
import com.wuzupkev.p2pchatapp.model.entity.MessageEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;


public class MessageService implements MessageDao {
    private PreparedStatement preparedStatement=null;
    private ResultSet r=null;
    final String CREATE_MESSAGE="INSERT INTO messages(senderid,conversationid,encryptedmessage,initializationvector,sentat) VALUES(?,?,?,?,?)";
    private DbConnection dbConnection;

    public MessageService(DbConnection dbConnection){
        this.dbConnection=dbConnection;
    }
    @Override
    public void create(MessageEntity entity) {
        try {
            preparedStatement = dbConnection.getConnection().prepareStatement(CREATE_MESSAGE, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1,entity.getSenderId());
            preparedStatement.setInt(2,entity.getConversationId());
            preparedStatement.setString(3,entity.getEncryptedMesage());
            preparedStatement.setString(4,entity.getInitializationVector());
            preparedStatement.setTimestamp(5, Timestamp.valueOf(entity.getSentat()));
            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }

            r = preparedStatement.getGeneratedKeys();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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
