import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderExample1 {
    public static void main(String[] args) 
    {
        char[] data = "Hello Java!".toCharArray();
        // System.out.print((char) reader.read()); // R
        // System.out.print((char) reader.read()); // e
        // reader.reset(); // Go back to start



        try {
            CharArrayReader reader = new CharArrayReader(data);
            //  CharArrayReader reader = new CharArrayReader(data, 9, 7);

            int ch;
            while ((ch = reader.read()) != -1) 
            {
                System.out.print((char) ch);
            }

            reader.close();
        } catch (IOException e) 
        {
            
        }
    }
}


