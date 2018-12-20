package Koneksi;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Koneksi {
    public static Connection koneksi = null;
    public static void buka_koneksi(){
        if(koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3306/uas";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = (Connection) DriverManager.getConnection(url, user, password);
            }catch (SQLException t){
                System.out.println("Error membuat koneksi");
            }
        }
    }

    public static Connection getKoneksi() {
        return koneksi;
    }

    public PreparedStatement prepareStatement(String sqlkode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
