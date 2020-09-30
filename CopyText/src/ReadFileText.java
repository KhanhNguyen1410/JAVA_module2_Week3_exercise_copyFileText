import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileText {
    public static List<String> readFileSource(String pathname)  {
        List<String>  target = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathname);
//            FileWriter target = new FileWriter("target.txt",true);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                        target.add(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return target;
    }
    public static void copyToTarget(){
        try {
            FileWriter target = new FileWriter("target2.txt",true);
            List<String> targetFile = ReadFileText.readFileSource("source.txt");
            for (int i = 0; i <targetFile.size() ; i++) {
                target.write(targetFile.get(i)+ "\n");

            }
            target.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int countChar(List<String> list){
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            String[] result = list.get(i).split("");
            for (int j = 0; j < result.length; j++) {
                count += result[j].length();
            }
        }
        return count;
    }


}
