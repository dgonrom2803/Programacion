package Arrays.Act4_4;

public class MainPersona {
    public static void main(String[] args) {

        Persona p1 = new Persona("Diego",22);
        Persona p2 = new Persona("María",19);
        Persona p3 = new Persona("Carlos",33);

        Persona[] personasA = {p1,p2,p3};

        for (Persona p: personasA){
            System.out.println(p);
        }

    }
}
