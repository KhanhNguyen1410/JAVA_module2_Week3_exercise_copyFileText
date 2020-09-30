import java.io.*;

public class TestInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("Hello3.txt");
            DataInputStream din = new DataInputStream(fin);

            while (true)
                System.out.println(din.readInt());


        } catch (EOFException e) {
            System.out.println("vao ròi ne");;
        } catch (IOException e) {
            System.out.println("sao ma loi");
        }
    }
}
