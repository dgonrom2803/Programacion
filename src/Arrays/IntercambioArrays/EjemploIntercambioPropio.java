package Arrays.IntercambioArrays;

import java.util.Arrays;

public class EjemploIntercambioPropio {
    public static void main(String[] args) {
        int [] a ={7, 2, 3, 4, 9};
        int pos = 1;
        int [] b = intercambiaArray(a,pos);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }

    static int [] intercambiaArray (int[] in, int pos){
        int[] out = new int[in.length];
        System.arraycopy(in, 0, out, 1, pos);
        System.arraycopy(in, 1, out, 0, pos);
        System.arraycopy(in, 2, out, 2, pos);
        System.arraycopy(in, 3, out, 3, pos);
        System.arraycopy(in, 4, out, 4, pos);
        return out;
    }
}
