### Reader

##### FileReader 
FileReader is a character-based input stream class used to read text files in Java.
###### Constructor	
`FileReader(String fileName)`	Reads from a file by name
`FileReader(File file)`	Reads from a File object


##### Key Methods (Inherited from Reader)

`int read()`	Reads a single character -> return the unicode value of char ex- read h but it return int 72, -1 at the end of file
`int read(char[] cbuf)`	Reads multiple characters into an array ->return how many char it has read, -1 at the end of file
`int read(char[] cbuf, int off, int len)`	Reads a portion of an array
`void close()`	Closes the stream -> The method returns the number of characters actually read (which could be less than len if the end of the stream is reached before the specified length).
 -1 at the end of file

<pre> Reader reader = new StringReader("Hello");
int character = reader.read();
System.out.println(character);  // Prints the Unicode value of 'H'
 </pre>


 #### BufferedReader
 BufferedReader is a character input stream that buffers input to improve efficiency
  it can read larger chunks at once, rather than one character at a time.


#### Constructor	
`BufferedReader(Reader in)`	Wraps another Reader (e.g. FileReader)
`BufferedReader(Reader in, int sz)`	Allows specifying buffer size

#### Methods

`String readLine()`	Reads a line of text (up to \n)  readLine()	Great for reading line-by-line
`int read()`	Reads a single character
`int read(char[] cbuf)`	Reads characters into a char array
`boolean ready()`	Checks if ready to be read
`void close()`	Closes the stream


#### CharArrayReader
CharArrayReader is a subclass of Reader that allows you to read characters from a char[] array 


#### Constructor	
`CharArrayReader(char[] buf)`	Creates a reader from a full character array
`CharArrayReader(char[] buf, int offset, int length)`	Creates a reader from a portion of a char array


Method	
`int read()`	Reads a single character
`int read(char[] cbuf, int off, int len)`	Reads a block of characters
`boolean ready()` Returns true if the stream is ready to be read
`void reset()`	Resets stream to the beginning
`void close()`	Closes the stream (no effect in CharArrayReader)


#### StringReader
StringReader is a subclass of Reader that allows you to treat a String as a character input stream.
