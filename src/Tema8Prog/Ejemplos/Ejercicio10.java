package Tema8Prog.Ejemplos;

import java.sql.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda";
        try {
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement st = con.createStatement();

            String delete = "DELETE FROM producto";
            st.execute(delete);
            String insert = "INSERT INTO producto VALUES (1, 'Manzana', 'Manzanas golden', 0.50, 'Francia'), " + "(2, 'Pera', 'Peras conferencia', 0.25, 'Espana'), " + "(3, 'Uva', 'Uvas gourmet', 0.30, 'Espana')";
            st.execute(insert);
            String update = "UPDATE producto SET precio = 0.20 WHERE nombre = pera";
            st.execute(update);

            con.commit();
            //Cerrar conexion
            st.close();
            con.close();
        }

        catch (SQLException e){
            System.err.println("La conexión ha fallado ");;
        }
    }
}
