package Tema7Prog.ClasesdeFlujo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutStream {
    public static void main(String[] args) {
        byte CR = 13;
        byte LF = 10;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("BufferedOutStream.bin");
            BufferedOutputStream bufferedOutStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutStream.write((byte) 'H');
            bufferedOutStream.write((byte) 'o');
            bufferedOutStream.write((byte) 'l');
            bufferedOutStream.write((byte) 'a');
            bufferedOutStream.write(CR);
            bufferedOutStream.write(LF);
            bufferedOutStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
