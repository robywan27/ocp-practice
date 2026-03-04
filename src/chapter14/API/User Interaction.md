## System streams

### PrintStream, PrintWriter classes
>note: these classes don't have corresponding input stream classes; PrintStream doesn't have Output in its name

#### Instances
- System.out - a PrintStream instance that writes to the console
- System.err - a PrintStream instance that writes to the console; typically used for error messages

#### Methods
- print()
- println()
- printf()
- format()
>note: these methods do not throw any checked exceptions

### InputStream
- System.in - an InputStream instance that reads from the console
> note: commonly wrapped with a BufferedReader to use the readLine() method

### Closing streams
- System streams should not be closed!
- as static objects they are opened by the JVM when the program starts and closed when the program ends
- only I/O streams not used inside the try-with-resources block
- exceptions can be thrown if you try to read from a closed stream
- PrintStream methods fail silently and stack trace is not printed if output streams are closed

## Console class
Singleton class accessible only from a factory method:
<br/>
`System.console()`
>Console class may not be available in some environments -> check for null value before using it

### Underlying streams
- public Reader reader() - returns a Reader for reading from the console
- public PrintWriter writer() - returns a PrintWriter for writing to the console
> note: analogous to System.in and System.out, but they are character streams instead of byte streams

#### Console methods
<b>Printing output</b>
<br/>print(), println(), printf()
- public PrintStream format(String fmt, Object... args)
- public PrintStream format(Locale l, String fmt, Object... args)
- public PrintWriter format(String fmt, Object... args)
- public PrintWriter format(Locale l, String fmt, Object... args)

<b>Reading input</b>
- public String readLine()
- public String readLine(String fmt, Object... args)
- public char[] readPassword()
- public char[] readPassword(String fmt, Object... args)