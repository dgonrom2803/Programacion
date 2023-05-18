package Tema8Prog.Ejemplos;

import java.sql.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda";
        try{
            Connection con = DriverManager.getConnection(url, "root","");
            Statement st = con.createStatement();

            //TODO:Imprime los siguientes metadatos
            //Tablas de la base de datos tienda
            DatabaseMetaData metaData = con.getMetaData();
            ResultSet resultados = metaData.getTables("tienda",null,null,null);
            System.out.println("Tablas exisentes en tienda: ");
            while (resultados.next()){
                System.out.println("- " + resultados.getString("TABLE_NAME"));

            }

            //Columnas de la tabla producto
            System.out.println("Columnas de la tabla producto: ");
            resultados = metaData.getColumns("tienda",null,"producto",null);
            while (resultados.next()){
                System.out.println("- " + resultados.getString("COLUMN_NAME"));
            }
            //Nombre del usuario que ha realizado la conexion
            System.out.println("El usuario es: " + metaData.getUserName());
            //URL de conexion
            System.out.println("La URL es esta: " + metaData.getURL());
            //Nombre y version del driver utilizando, asi como el nombre del SGBD
            System.out.println("El nombre del driver: " + metaData.getDriverName() + ", la version: " + metaData.getDriverVersion());
            System.out.println("El SGBD: " + metaData.getDatabaseProductName());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
