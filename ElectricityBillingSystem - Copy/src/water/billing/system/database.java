package water.billing.system;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
public class database {
    Connection connection;
    Statement statement;
    database(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/water","root","vilas2354");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}