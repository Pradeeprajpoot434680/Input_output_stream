## Output Stream
OutputStream is an abstract class in Java that represents a stream of bytes for writing data to a destination, such as:
- a file
- a memory buffer
- a network socket

### important methods
void write(int b)	Writes a single byte
void write(byte[] b)	Writes an entire byte array
void write(byte[] b, int off, int len)	Writes a part of a byte array
void flush()	Flushes the stream (forces data to be written)
void close()	Closes the stream, releasing resources


To ensure data is written to the file:
Use bos.flush(); — writes buffered data to the file.

Or, use bos.close(); — which automatically flushes first, then closes.


### 1. FileOutputStream
FileOutputStream is a subclass of OutputStream used to write raw bytes 

### Constructors

FileOutputStream(String name)	Creates a stream to write to the specified file (overwrites if exists).
FileOutputStream(String name, boolean append)	If append is true, data is added to the end of the file.
FileOutputStream(File file)	Takes a File object as the target.
FileOutputStream(FileDescriptor fd)	Writes to a file descriptor (advanced use).


#### Exceptions
FileNotFoundException (if the path is invalid or write permission denied)

IOException (on general I/O failures)

### BufferOutputStream
instead of writing every byte immediately to the destination (like disk), it stores them in a memory buffer and writes them in chunks. This reduces the number of I/O operations, 

#### constructor
BufferedOutputStream(OutputStream out)	Wraps another output stream with buffering

BufferedOutputStream(OutputStream out, int size)	Uses custom buffer size (ex- 4096bytes) 4KB size