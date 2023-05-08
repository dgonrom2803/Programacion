package Tema8Prog.bdr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda";
        try {

            //Enlazar con el driver
            Class.forName("org.mariadb.jdbc.Driver");


            Connection con = DriverManager.getConnection(url, "diego", "diego");
            Statement stm = con.createStatement();
            System.out.println("Conexión exitosa");
            //TODO consultas


            stm.close();
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Ha fallado la conexión: " + e.getMessage());
        }
    }
}
