package book_exe;
import java.io.*;

/**
 * чтение байтов с клавиатуры в массив
 */

public class ReadBytes {
    public static void main(String[] args) throws IOException {

        byte data[] = new byte[10];

        System.out.println("Enter some characters.");
        System.in.read(data);
        System.out.print("you entered: ");
        for(int i=0; i < data.length; i++)
            System.out.print((char) data[i]);

    }
}