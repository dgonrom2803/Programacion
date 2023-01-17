package Arrays.Act4_1;

//1. Crea un método main.
public class Main {
    public static void main(String[] args) {
        //2. Declara una variable x de tipo int con valor 1
        int x = 1;
        String s = "Hola";
        System.out.println(x);
        System.out.println(s);
        //4. Invoca el método m desde main enviando x como argumento. Comprueba si la variable x cambia
        // de valor después de ejecutar el método. Para eso puedes imprimir la variable antes de invocar al método y después.
        m(x);
        m(x,s);
        System.out.println(x);
        System.out.println(s);

    }
    //3. Crea un método m que no devuelva nada y reciba un
    // parámetro de nombre x y tipo int. El método incremantará en una unidad el valor del parámetro.
    public static void m (int x) {
        x = x + 1;
    }
    //5. Haz lo mismo para una variable s de tipo String. Tendrás cambiar la declaración del método para
    // que acepte un parámetro int y otro String.
    public static void m(int x, String s){
        s = (s.toUpperCase());
    }
}
