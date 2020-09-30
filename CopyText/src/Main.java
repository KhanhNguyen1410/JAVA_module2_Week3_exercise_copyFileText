import java.util.List;

public class Main {


    public static void main(String[] args) {
        ReadFileText.copyToTarget();
        List<String> list = ReadFileText.readFileSource("source.txt") ;
        System.out.println(ReadFileText.countChar(list));

    }
}