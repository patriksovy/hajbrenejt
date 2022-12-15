package sk.kasv;

import org.apache.ibatis.jdbc.ScriptRunner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RunScripts {

  public static void runSqlScripts() throws SQLException, FileNotFoundException {

    //Getting the connection
    String mysqlUrl = "jdbc:mysql://localhost:3306/hb_student?useSSL=false&serverTimezone=UTC";
    Connection con = DriverManager.getConnection(mysqlUrl, "root", "");
    System.out.println("Connection established......");

    //Initialize the script runner
    ScriptRunner sr = new ScriptRunner(con);

    //Creating a reader objects
    Reader r1 = new BufferedReader(new FileReader("sql_scripts/script1.sql"));
    Reader r2 = new BufferedReader(new FileReader("sql_scripts/script2.sql"));

    //Running the scripts
    sr.runScript(r1);
    sr.runScript(r2);
    System.out.println("Scripts Executed......");
  }
}
