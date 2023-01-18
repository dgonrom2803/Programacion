package Arrays.Act4_1;


public class Main {
    public static void main(String[] args) {

        int x = 1;
        Double[] a = {1d, 2.5d, 34.56d, null, 0d};
        String s = "Hola";

        System.out.println(x);
        m(x);
        System.out.println(x);

        System.out.println(s);
        m(x, "Hola");
        System.out.println(s);

        System.out.println(a);
        m(x, "Hola", a);
        System.out.println(a);

    }

    public static void m(int x) {
        x = x + 1;
    }

    public static void m(int x, String s) {
        s = (s.toUpperCase());
        m(x);
    }

    public static void m(int x, String s, Double[] a) {
        a[0]++;
        a[(a.length - 1) / 2]++;
        a[a.length - 1]++;

        m(x, s);

    }

    public static int[][] m2 (int x, String s, Double[] input) {
        int n = input.length;
        int m = 2;
        int [][] output = new int[n][m];

        m(x, s, input);
        output[0][0] = (int)Math.floor(input[0]);
        output[0][1] = (int)Math.floor(input[0]);

        output[1][0] = (int)Math.floor(input[1]);
        output[1][1] = (int)Math.floor(input[1]);

        output[2][0] = (int)Math.floor(input[2]);
        output[2][1] = (int)Math.floor(input[2]);

        output[3][0] = (int)Math.floor(input[3]);
        output[3][1] = (int)Math.floor(input[3]);

        output[4][0] = (int)Math.floor(input[4]);
        output[4][1] = (int)Math.floor(input[4]);


        return output;
    }

}
