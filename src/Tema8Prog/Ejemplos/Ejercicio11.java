package Tema8Prog.Ejemplos;

import java.sql.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda";
        try {
            Connection con = DriverManager.getConnection(url, "diego", "diego");
            Statement st = con.createStatement();

            String querySelect = "SELECT * FROM tienda.producto WHERE pais = 'Espana'";
            System.out.println(st.executeQuery(querySelect));

            //Imprime las anteriores en un solo lote
            String queryDelete = "DELETE FROM producto";
            String queryInsert = "INSERT INTO producto VALUES (1, 'Manzana', 'Manzanas golden', 0.50, 'Francia'), " + "(2, 'Pera', 'Peras conferencia', 0.25, 'Espana'), " + "(2, 'Uva', 'Uvas gourmet', 0.30, 'Espana')";
            String queryUpdate = "UPDATE productos SET precio = 0.20 WHERE nombre = pera";

            st.addBatch(queryDelete);
            st.addBatch(queryInsert);
            st.addBatch(queryUpdate);
            st.addBatch(querySelect);

            int [] numRegistrosAfectados = st.executeBatch();

            //Ejecuta un nuevo batch con nuevas inserciones.
            String insercion1 = "INSERT INTO producto VALUES (NULL, 'Kiwi', 'Zaspri gold', 1.20, 'Nueva Zelanda'), ";
            String insercion2 = "INSERT INTO producto VALUES (NULL, 'Perito', 'Peritos de Tavizna', 0.18, 'Espana'), ";
            String insercion3 = "INSERT INTO producto VALUES (NULL, 'Plátano', 'Plátano Canario', 0.40, 'Espana')";

            st.clearBatch();
            st.addBatch(insercion1);
            st.addBatch(insercion2);
            st.addBatch(insercion3);


            int [] numRegistrosAfectados2 = st.executeBatch();





            con.commit();


        } catch (SQLException e){
            System.err.println("La conexión ha fallado");
        }
    }

    public static void listaProductosEspana (Statement st) throws SQLException {
        String querySelect = "SELECT * FROM tienda.producto WHERE pais = 'Espana'";
        ResultSet resultados = st.executeQuery(querySelect);

        while (resultados.next()){
            System.out.println(resultados.getString("nombre"));

        }
    }
}
