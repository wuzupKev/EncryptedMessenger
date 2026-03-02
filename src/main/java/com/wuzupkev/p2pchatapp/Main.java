package com.wuzupkev.p2pchatapp;
import com.wuzupkev.p2pchatapp.config.DbConnection;
import com.wuzupkev.p2pchatapp.model.entity.MessageEntity;
import com.wuzupkev.p2pchatapp.model.service.MessageService;
import java.security.*;
public class Main {

    public static void main(String[] args) throws GeneralSecurityException {
        DbConnection dbConnection= new DbConnection();
        MessageService messageService= new MessageService(dbConnection);
        MessageEntity message = new MessageEntity(4, "Holasdksnfsnfsnfd", 1, "sdmskmfmfs", java.time.LocalDateTime.now());
        messageService.create(message);
    }

}
