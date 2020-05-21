/*
 * Copyright (c) - UOL Inc,
 * Todos os direitos reservados
 *
 * Este arquivo e uma propriedade confidencial do Universo Online Inc.
 * Nenhuma parte do mesmo pode ser copiada, reproduzida, impressa ou
 * transmitida por qualquer meio sem autorizacao expressa e por escrito
 * de um representante legal do Universo Online Inc.
 *
 * All rights reserved
 *
 * This file is a confidential property of Universo Online Inc.
 * No part of this file may be reproduced or copied in any form or by
 * any means without written permisson from an authorized person from
 * Universo Online Inc.
 *
 * Historico de revisoes
 * Autor                             Data       Motivo
 * --------------------------------- ---------- -----------------------
 * atomita                        	 5 de dez de 2019	Criacao inicial
 */

package com.jdojo.hsqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
/**
 *
 * @author Satya Choudhury
 */
public class Example {
 
    public static void getCustomers() {
        Connection conn = null;
        String db = "jdbc:hsqldb:hsql://localhost/sampledb;ifexists=true";
        String user = "SA";
        String password = "";
         
        try {
            // Create database connection
            conn = DriverManager.getConnection(db, user, password);
             
            // Create and execute statement
            Statement stmt = conn.createStatement();
            ResultSet rs =  stmt.executeQuery("select FIRSTNAME, LASTNAME from CUSTOMER");
             
            // Loop through the data and print all artist names
            while(rs.next()) {
                System.out.println("Customer Name: " + rs.getString("FIRSTNAME") + " " + rs.getString("LASTNAME"));
            }
             
            // Clean up
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        finally {
            try {
                // Close connection
                if (conn != null) 
                    conn.close();
            }
            catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Retrieve all customers
        getCustomers();
    }
     
}