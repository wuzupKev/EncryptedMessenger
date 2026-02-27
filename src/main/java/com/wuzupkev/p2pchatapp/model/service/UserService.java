package com.wuzupkev.p2pchatapp.model.service;

import com.mysql.cj.log.Log;
import com.wuzupkev.p2pchatapp.config.DbConnection;
import com.wuzupkev.p2pchatapp.model.dao.UserDao;
import com.wuzupkev.p2pchatapp.model.entity.UserEntity;

import javax.xml.transform.Result;
import java.security.KeyPairGenerator;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserService implements UserDao {
    private PreparedStatement preparedStatement=null;
    private ResultSet r=null;
    private String CREATE_USER="INSERT INTO users (username,password,publickey) values (?,?,?)";
    private String LIST_USER="SELECT * FROM users";
    private String FIND_USER="SELECT * FROM users WHERE idusers=?";

    private DbConnection dbConnection;

    public UserService(DbConnection dbConnection){
        this.dbConnection=dbConnection;
    }

    @Override
    public void create(UserEntity entity) {

        try {

            preparedStatement = dbConnection.getConnection()
                    .prepareStatement(CREATE_USER, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, entity.getUsername());
            preparedStatement.setString(2, entity.getPassword());
            preparedStatement.setString(3, entity.getPublicKey());

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }

            r = preparedStatement.getGeneratedKeys();

            if (r.next()) {
                entity.setIdUser(r.getInt(1));
            }

        } catch (Exception e) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, e);
        }

        finally {

            if (r != null) {
                try {
                    r.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public Optional<UserEntity> findById(Integer id) {

        try {

            preparedStatement = dbConnection.getConnection()
                    .prepareStatement(FIND_USER);

            preparedStatement.setInt(1, id);

            r = preparedStatement.executeQuery();

            if (r.next()) {

                UserEntity user = new UserEntity(
                        r.getInt("idusers"),
                        r.getString("username"),
                        r.getString("publickey"),
                        r.getString("password")
                );

                return Optional.of(user);
            }

        } catch (SQLException e) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            if (r != null) {
                try {
                    r.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

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
