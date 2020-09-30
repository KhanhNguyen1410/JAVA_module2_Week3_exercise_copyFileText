import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutputStream {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        try{
            FileOutputStream fout = new FileOutputStream("Hello3.txt");
            DataOutputStream dout = new DataOutputStream(fout);
            for (int i = 0; i < arr.length; i++)
                dout.writeInt(arr[i]);
                dout.close();


        }catch (IOException e){
           e.printStackTrace();
        }
    }
}
