# InputStream

**Input (Reading)** → `java.io.InputStream` *(abstract class)*

---

## 1. FileInputStream

`FileInputStream` is a class in Java used to read raw bytes from a file.

### Constructors

- `FileInputStream(String name)` → Opens a file by name  
- `FileInputStream(File file)` → Opens a file using a File object  
- `FileInputStream(FileDescriptor fdObj)` → Uses an existing file descriptor

> Throws `FileNotFoundException` if the file doesn’t exist.  
> Throws `IOException` on I/O errors.

### Methods

- `int read()` — Reads one byte of data  
  *Note: `read()` returns an `int` in the range 0–255, or `-1` for end-of-file.*
- `int read(byte[] b)` — Reads multiple bytes into an array  
- `int read(byte[] b, int off, int len)` — Reads bytes into a portion of an array  
- `void close()` — Closes the stream  
- `int available()` — Returns number of bytes available to read

---

## 2. BufferedInputStream

When you use a basic `FileInputStream`, it reads data one byte at a time. It is slow.

A `BufferedInputStream` improves this by reading a block of data into memory at once (e.g., 8 KB or 16 KB) and then providing this chunk of data for your program to work with.

### Constructors

- `BufferedInputStream(InputStream in)`  
- `BufferedInputStream(InputStream in, int bufferSize)`

> - `in` – the input stream to wrap (like a `FileInputStream`)  
> - `bufferSize` – optional buffer size (default: 8192 bytes)

It stores input data in a buffer (byte array).

#### Performance

- Faster due to internal buffering

#### Efficiency

- Reduces disk access or I/O calls

#### Compatibility

- Works with any `InputStream`

---

## 3. ByteArrayInputStream

Reads bytes from a byte array in memory.

### Constructors

- `ByteArrayInputStream(byte[] buf)`  
- `ByteArrayInputStream(byte[] buf, int offset, int length)`

### Methods

- `int available()` — Returns number of bytes left to read  
- `void reset()` — Resets to the beginning

---

## 4. DataInputStream

`DataInputStream` allows you to read Java's primitive data types (`int`, `float`, `long`, `char`, `boolean`, etc.).

### Constructor

- `DataInputStream(InputStream in)`

### Common Methods

| Method              | Description                          |
|---------------------|--------------------------------------|
| `int readInt()`     | Reads a 4-byte integer               |
| `float readFloat()` | Reads a 4-byte float                 |
| `long readLong()`   | Reads an 8-byte long                 |
| `boolean readBoolean()` | Reads 1 byte as true/false     |
| `char readChar()`   | Reads 2 bytes as a character         |
| `double readDouble()` | Reads an 8-byte double            |
| `UTF readUTF()`     | Reads a UTF-8 encoded string         |
| `void close()`      | Closes the stream                    |
