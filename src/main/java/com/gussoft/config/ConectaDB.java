
package com.gussoft.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectaDB {

    private static ConectaDB instancia;

    private ConectaDB() {
    }

    public static ConectaDB getInstance() {
        if (instancia == null) {
            instancia = new ConectaDB();
        }
        return instancia;
    }

    public Connection getConexion() {
        Connection cn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            cn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bd_frans", "root", "123456");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return cn;
    }

    public void closeConexion(Connection cn) {
        try {
            if (cn != null) {
                cn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}