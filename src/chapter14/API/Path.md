> note: Path instances are immutable (like String) -> most methods can be chained

| Path instance methods                               | description                                                                                                                                                                                                                                                                                     |
|-----------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| getFileName()                                       | final segment                                                                                                                                                                                                                                                                                   |
| getParent()                                         | immediate parent<br/>- <span style="color: yellow">null</span> if operated on root  path or top of relative path                                                                                                                                                                                |
| getRoot()                                           | top-level segment<br/>- <span style="color: yellow">null</span> if path is relative path                                                                                                                                                                                                        |
| getName(int index)                                  | segment at index<br/>- doesn't include root directory as part of path<br/>- throws <span style="color: red">IllegalArgumentException</span> for invalid index                                                                                                                                   |
| <span style="color: aqua">int</span> getNameCount() | number of segments<br/>- doesn't include root directory as part of path                                                                                                                                                                                                                         |
| subpath(int beginIndex, int endIndex)               | subpath from beginIndex (inclusive) to endIndex (exclusive)<br/>- doesn't include root directory as part of path<br/>- throws <span style="color: red">IllegalArgumentException</span> for invalid indexes<br/>&emsp;&emsp;- empty path path.subpath(sameIndex, sameIndex) throws an exception! |
| resolve(String p)                                   | concatenate paths<br/>- if an absolute path is provided as input, that is the value returned                                                                                                                                                                                                    |
| resolve(Path p)                                     | concatenate paths<br/>- if an absolute path is provided as input, that is the value returned                                                                                                                                                                                                    |
| relativize(Path p)                                  | construct relative path from this path to p<br/>- throws <span style="color: red">IllegalArgumentException</span> if relative paths and absolute paths are mixed                                                                                                                                |
| normalize()                                         | remove redundant path symbols (., ..); only the ones that can be reduced                                                                                                                                                                                                                        |
| toRealPath()                                        | follow symbolic links to find actual path<br/>- eliminates any redundant symbols<br/>- throws <span style="color: red">IOException</span> if the path doesn't exist                                                                                                                             |
| <span style="color: aqua">String</span> toString()  | file path as string                                                                                                                                                                                                                                                                             |

## Creating, moving, deleting files and directories - Files static methods
| Files static methods                                                                                                                                                          | description                                                                                                                                                                                                              |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| createDirectory(Path dir, <span style="color: green">FileAttribute... a</span>)  <span style="color: red">throws IOException</span>                                           | create a directory at the specified path<br/>- throws an exception if the directory already exists or if the parent directory doesn't exist                                                                              |
| createDirectories(Path dir, <span style="color: green">FileAttribute... a</span>) <span style="color: red">throws IOException</span>                                          | create a directory at the specified path, including any non-existing parent directories                                                                                                                                  |
| copy(Path source, Path target, <span style="color: green">CopyOption... o</span>) <span style="color: red">throws IOException</span>                                          | copy file/directory from source to target path<br/>- performs a <i>shallow copy</i> for directories<br/>- throws an exception if the target already exists; can change behavior with StandardCopyOption.REPLACE_EXISTING |
| <span style="color: aqua">long</span> copy(InputStream in, Path target, <span style="color: green">CopyOption... o</span>) <span style="color: red">throws IOException</span> | copy data from input stream to target path                                                                                                                                                                               |
| <span style="color: aqua">long</span> copy(Path source, OutputStream out) <span style="color: red">throws IOException</span>                                                  | copy data from source path to output stream                                                                                                                                                                              |
| move(Path source, Path target, <span style="color: green">CopyOption... o</span>) <span style="color: red">throws IOException</span>                                          | move or rename file/directory<br/>- can pass argument values such as StandardCopyOption.REPLACE_EXISTING to overwrite target or StandardCopyOption.ATOMIC_MOVE for an atomic move                                        |
| <span style="color: aqua">void</span> delete(Path path) <span style="color: red">throws IOException</span>                                                                    | delete file/directory at the specified path<br/>- throws an exception if the directory is not empty or the path doesn't exist                                                                                            |
| <span style="color: aqua">boolean</span> deleteIfExists(Path path) <span style="color: red">throws IOException</span>                                                         | delete file/directory at the specified path<br/>- returns false if the directory the path doesn't exist<br/>- throws an exception if the directory is not empty                                                          |
| <span style="color: aqua">boolean</span> isSameFile(Path p1, Path p2) <span style="color: red">throws IOException</span>                                                      | check if two paths refer to the same file/directory; resolves all path symbols and follows all symbolic links<br/>- can throw an exception if either path doesn't exist                                                  |
| <span style="color: aqua">long</span> mismatch(Path p1, Path p2) <span style="color: red">throws IOException</span>                                                           | compare the contents of the files<br/>- returns -1 if the files are the same, or the index of the first position in the file that differs<br/>- can throw an exception if either path doesn't exist                      |

## Manipulating input streams
To manipulate order in which data is read from an input stream

### Methods
| Method name              | Description                                                                                                                                                                                                                                |
|--------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| void mark(int readlimit) | Marks the current position in the input stream.<br/>The <span style="color: aqua">readlimit</span> parameter specifies the maximum limit of bytes that can be read before the mark position becomes invalid                                |
| void reset()             | Resets the input stream to the most recent mark. If the mark is not set or has been invalidated, an <span style="color: red">IOException</span> is thrown.                                                                                 |
| boolean markSupported()  | Returns true if the input stream supports mark()                                                                                                                                                                                           |
| long skip(long n)        | Skips over and discards <span style="color: aqua">n</span> bytes of data from the input stream. Returns the actual number of bytes skipped, which may be less than <span style="color: aqua">n</span> if the end of the stream is reached. |

## Discovering file attributes

### View
Group of related file attributes that can be accessed together in a single call; each view is represented by an interface that extends the `FileAttributeView` interface

| Attributes interface | View interface | Description                                                             |
|---------------------|----------------|-------------------------------------------------------------------------|
| BasicFileAttributes  | BasicFileAttributeView | Provides access to file attributes supported by all file systems        |
| DosFileAttributes    | DosFileAttributeView   | Provides access to file attributes specific to DOS/Windows file systems |
| PosixFileAttributes  | PosixFileAttributeView | Provides access to file attributes specific to POSIX systems            |

### Files static methods
| Method name                                                                                                                | Description                                                                                |
|----------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------|
| isSymbolicLink(Path path)                                                                                                  | Checks if the file is a symbolic link, regardless of whether it points to a file/directory |
| isHidden(Path path)                                                                                                        | Checks if the file is hidden                                                               |
| isReadable(Path path)                                                                                                      | Checks if the file is readable                                                             |
| isWritable(Path path)                                                                                                      | Checks if the file is writable                                                             |
| isExecutable(Path path)                                                                                                    | Checks if the file is executable                                                           |
| A readAttributes(Path path, Class&lt;A&gt; type, LinkOption... options) <span style="color: red">throws IOException</span> | Reads a set of file attributes as a Map                                                    |
| V getFileAttributeView(Path path, Class&lt;V&gt; type, LinkOption... options)                                              | Returns an updatable view                                                                  |

## Traversing a directory tree

### Search strategies
- Depth-first search: explores as far as possible along each branch before backtracking
    - search depth: distance from the root to the current node
- Breadth-first search: explores all neighbors at the present depth before moving on to the nodes at the next depth level

### Files.walk() method
>note: utilizes depth-first search strategy
- Stream&lt;Path&gt; walk(Path start, FileVisitOption... options) <span style="color: red">throws IOException</span>
    - default maxDepth is Integer.MAX_VALUE
- Stream&lt;Path&gt; walk(Path start, int maxDepth, FileVisitOption... options) <span style="color: red">throws IOException</span>

> walk() does not follow symbolic links by default; can change behavior with FileVisitOption.FOLLOW_LINKS. When following symbolic links, walk() may throw an exception if a cycle is detected in the file tree

### Searching a directory
Stream&lt;Path&gt; find(Path start, int maxDepth, BiPredicate&lt;Path, BasicFileAttributes&gt; matcher, FileVisitOption... options) <span style="color: red">throws IOException</span>

Works similarly to walk() but allows filtering of the returned paths based on a provided BiPredicate that tests both the path and its basic file attributes