package Tema8Prog.Ejemplos;

import java.sql.*;
import java.util.ResourceBundle;

public class Ejercicio9 {
    public static void main(String[] args) {
       try {
           Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/tienda");
           Statement st = con.createStatement();
          ResultSet rSet = st.executeQuery("SELECT * FROM producto ORDER BY precio DESC");
          //while (rSet)
           System.out.println("Nombre: " + rSet.getString("nombre"));
           System.out.println("Precio: " + rSet.getString("precio"));
       }
       catch (SQLException e){
           e.printStackTrace();
       }

    }
}
