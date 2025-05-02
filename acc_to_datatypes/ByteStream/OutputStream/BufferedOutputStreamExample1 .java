import java.io.*;

public class BufferedOutputStreamExample1 
{
    public static void main(String[] args) 
    {
        try 
        {
            FileOutputStream fos = new FileOutputStream("buffered_output.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            String data = "This is written using BufferedOutputStream.";
            bos.write(data.getBytes());

            bos.flush(); // Important to flush remaining bytes
            bos.close();

            System.out.println("Data written successfully with buffering.");
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}



import java.io.*;

public class BufferedOutputStreamExample2 {
    public static void main(String[] args) {
        try {
            File file = new File("custom_buffer_output.txt");
            FileOutputStream fos = new FileOutputStream(file);

            // 8-byte buffer
            BufferedOutputStream bos = new BufferedOutputStream(fos, 8);

            String text = "ABCDEFGH12345678";
            bos.write(text.getBytes());

            bos.flush(); // Ensure all data is written
            bos.close();

            System.out.println("Data written with custom buffer size.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
