/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wuzupkev.p2pchatapp;
import com.wuzupkev.p2pchatapp.config.DbConnection;
public class Main {
    
    public static void main(String[] args) {
            DbConnection connection = new DbConnection();
            connection.getConnection();
    }
    
}
