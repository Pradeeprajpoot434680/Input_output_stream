import java.io.*;
/*class BufferedInputStreamExample1 
{
    public static void main(String arg[])
    {
        try
        {
            FileInputStream fis = new FileInputStream("example2.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int data;//because read returns int 0-255 and end of the file -1
            while((data = bis.read()) != -1)
            {
                System.out.print((char)data);
            }
            bis.close();
            fis.close();
        }
        catch(IOException e)
        {

        }
    }
}*/


class BufferedInputStreamExample2
{
    public static void main(String arg[]) throws Exception
    {
        FileInputStream fis = new FileInputStream("example2.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] buffer = new byte[1024];//1 kb buffer
        int readBytes;
        while((readBytes = bis.read(buffer)) != -1)
        {
            String output = new String(buffer,0,readBytes);
            System.out.print(output);
        }
    }
}