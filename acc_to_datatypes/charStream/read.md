## CharStream
used to read and write 16-bit Unicode characters in Java
#### charstream has two superclasses(parent classes) both are abstract classes
`Reader`	Abstract class for reading character streams
`Writer`	Abstract class for writing character streams


#### Subclasses of Reader (for reading characters)

                                        Reader
                                        |
                    ---------------------------------------------------
                    |         |         |         |         |         |
            FileReader BufferedReader CharArrayReader StringReader PipedReader FilterReader
                                                                        |
                                                                -------------------------
                                                                |                       |
                                                        PushbackReader           InputStreamReader
                                                                                |
                                                                    LineNumberReader



`FileReader`	Reads characters from a file
`BufferedReader`	Reads text efficiently using a buffer
`CharArrayReader`	Reads characters from a char array
`StringReader`	Reads characters from a string
`PipedReader`	Reads from a pipe (used in thread communication)

`FilterReader`	Abstract class for filtering character input
`InputStreamReader`	Converts byte stream into character stream (bridge between byte and char streams)


#### Subclasses of Writer (for writing characters)
`FileWriter`	Writes characters to a file
`BufferedWriter`	Writes characters efficiently using a buffer
`CharArrayWriter`	Writes characters to a char array
`StringWriter`	Writes characters to a string buffer
`PipedWriter`	Writes to a pipe (used with PipedReader)
`FilterWriter`	Abstract class for filtering character output
`OutputStreamWriter`	Converts character stream to byte stream

