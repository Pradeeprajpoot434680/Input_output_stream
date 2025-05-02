import java.io.*;
// class FileInputStreamExample1
// {
//     public static void main(String arg[])
//     {
//         try
//         {
//             FileInputStream  fis = new FileInputStream("example.txt");
//             int data;
//             while((data = fis.read()) != -1)//read is not reached on the end of the file put read result in data
//             {
//                 System.out.print((char)data);
//             }
//             fis.close();
//         }
//         catch(IOException e)
//         {
//             System.out.print(e);
//         }
       

//     }
// }

// read multiple bytes using the 
class FileInputStreamExample1
{
    public static void main(String arg[])
    {
        try
        {
            FileInputStream fis = new FileInputStream("example.txt");
            byte[] buffer = new byte[40];
            int readBytes;
            // if files has more the 40 bytes then to access all the content
            while((readBytes = fis.read(buffer)) != -1)
            {
                String content = new String(buffer,0,readBytes);
                System.out.println(content);
            }
        }
        catch(IOException e)
        {
            
        }
        
    }
}