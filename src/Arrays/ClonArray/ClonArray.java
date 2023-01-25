package Arrays.ClonArray;

import java.util.Arrays;

public class ClonArray {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = a.clone();
        a[0] = 0;
        System.out.println(Arrays.toString(a));
        System.out.println(a);
        System.out.println(Arrays.toString(b));
        System.out.println(b);

        Persona p1 = new Persona("p1");
        Persona p2 = new Persona("p2");
        Persona p3 = new Persona("p3");
        Persona[] personasA = {p1,p2,p3};
        Persona[] personasB = personasA.clone();

        for (Persona p: personasA){
            System.out.println(p.nombre);
        }
        for(int i= 0; i< personasA.length; i++){
            System.out.println(personasA[i].nombre);
        }

        System.out.println(Arrays.toString(personasA));
        System.out.println(personasA);
        System.out.println(Arrays.toString(personasB));
        System.out.println(personasB);
    }
}
