import java.io.*;
public class BufferedReaderExample1
{
    public static void main(String arg[]) throws Exception
    {
        FileReader fr = new FileReader("example.txt");
        BufferedReader br = new BufferedReader(fr);
        //   BufferedReader br = new BufferedReader(fr, 2048) custom size buffer

        String line;
        while((line = br.readLine())!= null)
        {
            System.out.println(line);
        }
        br.close();
    }
}