# Byte streams VS Character streams
## Byte streams
- read and write data in bytes
- mostly used to work with binary data
- class names end in InputStream or OutputStream
## Character streams
- read and write text data
- mostly used to work with text files
- class names end in Reader or Writer

## Low-level streams
Connects directly with the source of data (e.g. file, network socket, etc.)
- e.g. FileInputStream, FileOutputStream
## High-level streams
Built on top of low-level streams using wrapping; provides additional functionality such as buffering, data conversion, etc. Can wrap other high-level streams

## Abstract stream base classes
| Class name   | Description                                      |
|--------------|--------------------------------------------------|
| InputStream  | abstract base class for byte input streams       |
| OutputStream | abstract base class for byte output streams      |
| Reader       | abstract base class for character input streams  |
| Writer       | abstract base class for character output streams |

## Concrete stream classes
| Class name           | Low/High level | Description                                                                                                  |
|----------------------|----------------|--------------------------------------------------------------------------------------------------------------|
| FileInputStream      | Low-level      | Reads bytes from a file                                                                                      |
| FileOutputStream     | Low-level      | Writes bytes to a file                                                                                       |
| FileReader           | Low-level      | Reads characters from a file                                                                                 |
| FileWriter           | Low-level      | Writes characters to a file                                                                                  |
| BufferedInputStream  | High-level     | Buffers bytes from an underlying input stream to improve performance                                         |
| BufferedOutputStream | High-level     | Buffers bytes to an underlying output stream to improve performance                                          |
| BufferedReader       | High-level     | Buffers characters from an underlying reader to improve performance                                          |
| BufferedWriter       | High-level     | Buffers characters to an underlying writer to improve performance                                            |
| PrintStream          | High-level     | Provides convenient methods for printing formatted representations of objects to an underlying output stream |
| PrintWriter          | High-level     | Provides convenient methods for printing formatted representations of objects to an underlying writer        |
| ObjectInputStream    | High-level     | Reads Java objects from an underlying input stream (deserialization)                                         |
| ObjectOutputStream   | High-level     | Writes Java objects to an underlying output stream (serialization)                                           |

### Reading and writing files

#### I/O read/write instance methods
| Class              | Method name                            | Notes                                                                             |
|--------------------|----------------------------------------|-----------------------------------------------------------------------------------|
| All input streams  | int read()                             | -1 indicates the end of the stream                                                |
| InputStream        | int read(byte[] b)                     |                                                                                   |
| Reader             | int read(char[] c)                     |                                                                                   |
| InputStream        | int read(byte[] b, int off, int len)   |                                                                                   |
| Reader             | int read(char[] c, int off, int len)   |                                                                                   |
| All output streams | void write(int b)                      |                                                                                   |
| OutputStream       | void write(byte[] b)                   |                                                                                   |
| Writer             | void write(char[] c)                   |                                                                                   |
| OutputStream       | void write(byte[] b, int off, int len) |                                                                                   |
| Writer             | void write(char[] c, int off, int len) |                                                                                   |
| InputStream        | byte[] readAllBytes()                  |                                                                                   |
| BufferedReader     | String readLine()                      |                                                                                   |
| Writer             | void write(String line)                |                                                                                   |
| BufferedWriter     | void newLine()                         |                                                                                   |
| All output streams | void flush()                           | requests that all accumulated data be written immediately to disk (not efficient) |
| All streams        | void close()                           |                                                                                   |

#### Files NIO.2 read/write static methods
| Method name                               | Notes                                                           |
|-------------------------------------------|-----------------------------------------------------------------|
| byte[] readAllBytes(Path path)            | reads the entire file at once                                   |
| String readString(Path path)              | reads the entire file at once                                   |
| List<String> readAllLines(Path path)      | reads the entire file at once                                   |
| Stream<String> lines(Path path)           | lazily read file; must be closed after use (try-with-resources) |
| void write(Path path, byte[] bytes)       |                                                                 |
| void write(Path path, String content)     |                                                                 |
| void write(Path path, List<String> lines) |                                                                 |