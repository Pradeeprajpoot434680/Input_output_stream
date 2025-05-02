import java.io.*;
/*class FileReaderExample1
{
    public static void main(String arg[]) throws Exception//IOException;
    {
        FileReader fr = new FileReader("example.txt");
        int data;
        while((data = fr.read()) != -1)
        {
            System.out.print((char)data);
        }
         fr.close();
    }
}*/


//Reading Using Character Array

class FileReaderExample1
{
    public static void main(String arg[]) throws Exception
    {
        FileReader fr = new FileReader("example.txt");
        char[] buffer = new char[100];
        int length = fr.read(buffer);//it will read the char upto buffer size / end of file
        System.out.println("Read " + length + " characters.");
        System.out.println(new String(buffer, 0, length));
         fr.close();
    }
}


import java.io.*;

public class FileReaderWithFileObject 
{
    public static void main(String[] args) 
    {
        try {
            File file = new File("sample.txt");
            FileReader fr = new FileReader(file);

            int ch;
            while ((ch = fr.read()) != -1) 
            {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (IOException e) 
        {
           
        }
    }
}
