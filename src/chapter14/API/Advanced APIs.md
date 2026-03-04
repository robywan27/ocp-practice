## Manipulating input streams
To manipulate order in which data is read from an input stream

### Methods
| Method name              | Description                                                                                                                                                                                                 |
|--------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| void mark(int readlimit) | Marks the current position in the input stream.<br/>The <span style="color: aqua">readlimit</span> parameter specifies the maximum limit of bytes that can be read before the mark position becomes invalid |
| void reset()             | Resets the input stream to the most recent mark. If the mark is not set or has been invalidated, an <span style="color: red">IOException</span> is thrown.                                                  |
| boolean markSupported()  | Returns true if the input stream supports mark()                                                                                                                                                            |
| long skip(long n)        | Skips over and discards n bytes of data from the input stream. Returns the actual number of bytes skipped, which may be less than n if the end of the stream is reached.                                    |

## Discovering file attributes

### View
Group of related file attributes that can be accessed together; each view is represented by an interface that extends the `FileAttributeView` interface

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