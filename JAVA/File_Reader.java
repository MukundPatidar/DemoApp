import java.io.*;

public class File_Reader {
    public static void main(String[] args) {
        try {
            FileReader r = new FileReader("C:\\Users\\PUNAM PATIDAR\\Desktop\\DKTOP.txt");
            try {
                int i;
                i = r.read();
                while (i != -1) {
                    System.out.print((char) i);
                    i = r.read();
                }
                System.out.println();
            } finally {
                r.close();
                System.out.println("File closed..");
            }
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("Exception Handled..!");
        }
    }
}