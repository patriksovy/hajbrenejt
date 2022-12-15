package sk.kasv;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hb_student";
        String user = "root";
        String password = "";

        try {
            System.out.println("Connecting to database");
            Connection myConnection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection succesfull");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
