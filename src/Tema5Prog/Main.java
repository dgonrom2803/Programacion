package Tema5Prog;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Probar método containsAll
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("HashSet1" + numbers);

        Set<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("HashSet2" + primeNumbers);

        boolean result = numbers.containsAll(primeNumbers);
        System.out.println("HashSet3" + numbers);





        Set<String> conjunto = new HashSet<>();
        System.out.println(conjunto.isEmpty());
        String s1 = "s1";
        conjunto.add(s1);
        System.out.println(conjunto.isEmpty());

        conjunto.add("s2");
        conjunto.add("s3");
        conjunto.add("s4");
        conjunto.add("s5");

        System.out.println(conjunto);

        conjunto.add(null);

        System.out.println(conjunto);
        String e;
        Iterator<String> it = conjunto.iterator();
        while (it.hasNext()){
            e = it.next();
            System.out.print(e + " ");
        }

        conjunto.remove(s1);
        System.out.println(conjunto);


        Set<String> conjunto2 = new HashSet<>();
        conjunto2.add("s2");
        conjunto2.add("s3");
        conjunto2.add("s4");
        conjunto.removeAll(conjunto2);
        System.out.println(conjunto2);
        System.out.println(conjunto);
    }
}
