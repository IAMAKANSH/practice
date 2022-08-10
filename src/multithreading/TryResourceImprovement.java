package multithreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class TryResourceImprovement {

    public static void main(String[] args) throws IOException {
        //java 8
        Reader reader=new StringReader("Hi,Please select me");
        BufferedReader br=new BufferedReader(reader);
try (BufferedReader bufferedReader=br){
    System.out.println(bufferedReader.readLine());
} catch (IOException e) {
    e.printStackTrace();
}



        //java 9
        Reader reader1=new StringReader("Hey Im from ALlahabad");
        BufferedReader br1=new BufferedReader(reader1);
        try(br1){
            System.out.println(br1.readLine());
        }
    }


}
