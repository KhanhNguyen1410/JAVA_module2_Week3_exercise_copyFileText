import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class DemoIO {
    public static void main(String[] args)  {
//        File file = new File("Hello.txt");
//        if (!file.exists()){
//            file.createNewFile();
//        }

        try{
            FileWriter writer = new FileWriter("Hello.txt");
            writer.write("hello! dfssfsfdsfok khong");
            writer.write("hello!");
            writer.close();
//            BufferedWriter writer2 = new BufferedWriter(writer);
//            writer2.write("codegymvn");
//            writer2.write("zfdf");
//            writer2.close();

        } catch (IOException e) {
            System.out.println("sao khong hien");
        }
    }
}
