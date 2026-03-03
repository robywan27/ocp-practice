# Terminology
- file system
    - file
        - symbolic link
    - directory
        - root directory
    - path
        - absolute path
        - relative path
- path separator
- path symbol: . and ..
    
#### get path separator character for current operating system
    System.getProperty("file.separator")

## File API

| Operation                                                          | IO                    |                                       | NIO.2                        |                                                                                                                                              |
|--------------------------------------------------------------------|-----------------------|---------------------------------------|------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|
|                                                                    | java.io.File class    |                                       | java.nio.file.Path interface |                                                                                                                                              |
|                                                                    | constructor           |                                       | static factory method        |                                                                                                                                              |
| Create a File                                                      |                       | new File(String path)                 |                              | Path.of(String first, String... more)                                                                                                        |
|                                                                    |                       | new File(String parent, String child) |                              | Path.of(URI uri)                                                                                                                             |
|                                                                    |                       | new File(File parent, String child)   |                              | FileSystems.getDefault().getPath(String path)                                                                                                |
|                                                                    |                       |                                       |                              | Paths.get(String first, String... more) - might be deprecated                                                                                |
|                                                                    | File instance methods |                                       | Path instance methods        |                                                                                                                                              |
| Switch between File and Path                                       |                       | file.toPath()                         |                              | path.toFile()                                                                                                                                |
| Get name of file/directory                                         |                       | file.getName()                        |                              | path.getFileName()                                                                                                                           |
| Get parent directory                                               |                       | file.getParent()                      |                              | path.getParent()                                                                                                                             |
| Check if file/directory is absolute                                |                       | file.isAbsolute()                     |                              | path.isAbsolute()                                                                                                                            |
| Get absolute path                                                  |                       | file.getAbsolutePath()                |                              | path.toAbsolutePath()                                                                                                                        |
|                                                                    |                       |                                       | Files static methods         |                                                                                                                                              |
| Delete file/directory                                              |                       | file.delete()                         |                              | Files.delete(Path path) <span style="color: red">throws IOException</span>                                                                   |
| Check if file/directory exists                                     |                       | file.exists()                         |                              | Files.exists(Path path, <span style="color: green">LinkOption... o</span>)                                                                   |
| Check if resource is directory                                     |                       | file.isDirectory()                    |                              | Files.isDirectory(Path path, <span style="color: green">LinkOption... o</span>)                                                              |
| Check if resource is file                                          |                       | file.isFile()                         |                              | Files.isRegularFile(Path path, <span style="color: green">LinkOption... o</span>)                                                            |
| Returns the time of last modification                              |                       | file.lastModified()                   |                              | Files.getLastModifiedTime(Path path, <span style="color: green">LinkOption... o</span>) <span style="color: red">throws IOException</span>   |
| Get size of file (number of bytes)                                 |                       | file.length()                         |                              | Files.size(Path path) <span style="color: red">throws IOException</span>                                                                     |
| List contents of directory                                         |                       | file.listFiles()                      |                              | <span style="color: aqua">Stream&lt;Path&gt;</span> Files.list(Path dir) <span style="color: red">throws IOException</span>                  |
| Create directory                                                   |                       | file.mkdir()                          |                              | Files.createDirectory(Path dir,     <span style="color: green">FileAttribute... o</span>) <span style="color: red">throws IOException</span> |
| Create directories (including any non-existing parent directories) |                       | file.mkdirs()                         |                              | Files.createDirectories(Path dir, <span style="color: green">FileAttribute... o</span>) <span style="color: red">throws IOException</span>   |
| Rename file/directory                                              |                       | file.renameTo(File dest)              |                              | Files.move(Path source, Path target, <span style="color: green">CopyOption... o</span>) <span style="color: red">throws IOException</span>   |

> note on Stream objects returned by the NIO.2 API: they must be closed after use (recommended using try-with-resources)

### NIO.2 Optional Parameters
| Enum type          | Enum value                                                 |
|--------------------|------------------------------------------------------------|
| LinkOption         | NOFOLLOW_LINKS                                             |
| StandardCopyOption | REPLACE_EXISTING, COPY_ATTRIBUTES, ATOMIC_MOVE             |
| StandardOpenOption | READ, WRITE, APPEND, TRUNCATE_EXISTING, CREATE, CREATE_NEW |
| FileVisitOption    | FOLLOW_LINKS                                               |

