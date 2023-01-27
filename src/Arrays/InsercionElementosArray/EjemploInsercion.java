package Arrays.InsercionElementosArray;

public class EjemploInsercion {
    public static void main(String[] args) {
        int[] a = {1,4,9,6};

    }
    int [] inserta (int[] in, int e, int pos){
        int[] out = new int[in.length+1];

        for (int i=0; i<=pos;i++){
            out[i] = in[i];
        }
        out[pos] = e;


        return out;
    }

}
