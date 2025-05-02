import java.io.*;
// class FileOutputStreamExample1 
// {
//     public static void main(String arg[]) throws Exception
//     {
//         String message = "this is FIleOutputStream";
//         byte[] data = message.getBytes();

//         FileOutputStream fos = new FileOutputStream("outputfile.txt");
//         for(byte b:data)
//         {
//             fos.write(b);
//         }

//         System.out.println("Data written successfully to outputfile.txt");
//     }
// }


// write whole string
// If you write data and don’t flush or close, it might not appear in the file yet.

/*class FileOutputStreamExample1 
{
    public static void main(String arg[]) throws Exception
    {
        String message = "this is FIleOutputStream.this is new data";
        byte[] data = message.getBytes();

        FileOutputStream fos = new FileOutputStream("outputfile.txt");
        fos.write(data);
        bos.flush(); // Forces data to be written NOW, not later

        System.out.println("Data written successfully to outputfile.txt");
    }
}*/

//append message
class FileOutputStreamExample1 
{
    public static void main(String arg[]) throws Exception
    {
        String message = "append message";
        byte[] data = message.getBytes();

        FileOutputStream fos = new FileOutputStream("outputfile.txt",true);
       fos.write(data);

        System.out.println("Data written successfully to outputfile.txt");
        fos.close();
    }
}


// using file object constructor

import java.io.*;

public class FileOutputStreamWithFileObject {
    public static void main(String[] args) {
        try {
            File file = new File("output_file_object.txt");
            FileOutputStream fos = new FileOutputStream(file);

            String message = "Written using File object.";
            fos.write(message.getBytes());

            fos.close();
            System.out.println("Data written to file using File object.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
