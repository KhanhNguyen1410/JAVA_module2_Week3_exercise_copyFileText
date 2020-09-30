import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        try{
            File inFile = new File("Hello3.txt");
            if (!inFile.exists()){
                inFile.createNewFile();
            }
            FileReader fileReader = new FileReader(inFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null ;

            while ((line = reader.readLine()) != null){
                System.out.println(line);

            }
            reader.close();
        } catch (Exception e){
            System.out.println("error");
        }
    }
}
