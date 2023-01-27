package Arrays.EliminacionElementosArray;

import java.util.Arrays;

public class EjemploEliminacion {
    public static void main(String[] args) {
        int [] a ={5,46,3,9};
        int pos = 1;
        int [] print = eliminaArray(a,pos);
        System.out.println(Arrays.toString(print));
    }

    static int[] eliminaArray (int[] in, int pos){
        int[] out = new int[in.length - 1];
        System.arraycopy(in, 0, out, 0, pos);
        System.arraycopy(in, pos + 1, out, pos, in.length - pos);
        return out;
    }
}
