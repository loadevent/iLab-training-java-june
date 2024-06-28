package Chapter9;

import java.sql.*;

public class ConnectToDatabase {
    public static void main(String[] args) {

        selectData();

    }
    static void selectData(){

        try {
            Connection con = null;

            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/northwind","root","Kayphonik@53");

            String selectLine = "SELECT * FROM customer";

            Statement stm = con.createStatement();
            ResultSet results = stm.executeQuery(selectLine);

            while (results.next()){
                System.out.println(results.getInt(1) + " - " + results.getString("contactName"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
