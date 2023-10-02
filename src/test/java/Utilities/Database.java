package Utilities;

import java.sql.*;

public class Database {

    public static String getString(String columnname) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/loginbits", "root", "Adwil@123");
        Statement stm=con.createStatement();
        ResultSet rs= stm.executeQuery("Select * from users");
        while(rs.next()){
            return rs.getString(columnname);
        }
        return null;
    }
}
