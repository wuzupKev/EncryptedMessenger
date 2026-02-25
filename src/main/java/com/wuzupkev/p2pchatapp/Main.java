/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wuzupkev.p2pchatapp;
import com.wuzupkev.p2pchatapp.config.DbConnection;
import com.wuzupkev.p2pchatapp.model.entity.UserEntity;
import com.wuzupkev.p2pchatapp.model.service.UserService;

public class Main {
    
    public static void main(String[] args) {
        DbConnection dbConnection= new DbConnection();
        UserService userService= new UserService(dbConnection);

        UserEntity userEntity = new UserEntity("Kevin","12131","wwiewn");

        userService.create(userEntity);

    }
    
}
