
package com.mycompany.prog11_tarea01_ej1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lun
 */
public class PROG11_Tarea01_Ej1 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
            String jdbcUrl = "jdbc:postgresql://localhost:5432/RRHH";
            String username = "postgres";
            String password = "1234";


            // Register the PostgreSQL driver

            Class.forName("org.postgresql.Driver");

            // Connect to the database

            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Perform desired database operations

            // Close the connection
            connection.close();
    }
}