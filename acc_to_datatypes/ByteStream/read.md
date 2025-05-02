## Byte stream    
it reads 1 byte from the streams
Input (Reading) → java.io.InputStream (abstract class)
Output (Writing) → java.io.OutputStream (abstract class)

                     
                            InputStream
                                │
                                ├── FileInputStream
                                ├── BufferedInputStream
                                ├── ByteArrayInputStream
                                ├── PipedInputStream
                                └── DataInputStream (subclass of(extends) FilterInputStream)
                               
                            OutputStream
                                │
                                ├── FileOutputStream
                                ├── ByteArrayOutputStream
                                ├── BufferedOutputStream
                                ├── PipedOutputStream
                                └── DataOutputStream (subclass of(extends) FilterOutputStream)








                                InputStream
                                │
                                ├── FileInputStream
                                │    └── Methods: read(), close()
                                │
                                ├── ByteArrayInputStream
                                │    └── Methods: read(), reset(), close()
                                │
                                ├── BufferedInputStream
                                │    ├── Methods: read(), mark(), reset(), close()
                                │    └── (inherits from FilterInputStream)
                                │
                                ├── PipedInputStream
                                │    └── Methods: read(), close(), connect(PipedOutputStream)
                                │
                                └── DataInputStream (extends FilterInputStream)
                                     └── Methods: readInt(), readFloat(), readUTF(), close()

                            OutputStream
                                │
                                ├── FileOutputStream
                                │    └── Methods: write(), close()
                                │
                                ├── ByteArrayOutputStream
                                │    ├── Methods: write(), toByteArray(), close()
                                │    └── (inherits from OutputStream)
                                │
                                ├── BufferedOutputStream
                                │    └── Methods: write(), flush(), close()
                                │    └── (inherits from FilterOutputStream)
                                │
                                ├── PipedOutputStream
                                │    └── Methods: write(), close(), connect(PipedInputStream)
                                │
                                └── DataOutputStream (extends FilterOutputStream)
                                     └── Methods: writeInt(), writeFloat(), writeUTF(), close()

