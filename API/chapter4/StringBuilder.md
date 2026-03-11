> - StringBuilder is mutable
> - it is more efficient than String: it allows to change the value of the object without creating a new one every time

## Initialization
| Method                      | Description                                           |
|-----------------------------|-------------------------------------------------------|
| StringBuilder()             |                                                       |
| StringBuilder(string value) |                                                       |
| StringBuilder(int capacity) | initial capacity; can increase the size unlike arrays |

## Equality
> sb1.equals(sb2); // reference equality, same as sb1 == sb2

## Instance methods
| Return type   | Method                                                 | throws Exception                                                                                                                                                                  | Notes                                                                |
|---------------|--------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------|
| String        | toString()                                             |                                                                                                                                                                                   | non-state mutating (because they don't return a reference to itself) |
|               | substring(int fromIndex, int toIndex)                  | <span style="color: red">StringIndexOutOfBoundsException</span> if beginIndex > endIndex                                                                                          | non-state mutating                                                   |
| int           | length()                                               |                                                                                                                                                                                   | non-state mutating                                                   |
| char          | charAt(int index)                                      | <span style="color: red">StringIndexOutOfBoundsException</span>                                                                                                                   | non-state mutating                                                   |
| StringBuilder | append(String str)                                     |                                                                                                                                                                                   | state mutating (returns a reference to itself)                       |
|               | appendCodePoint(int codePoint)                         |                                                                                                                                                                                   | state mutating                                                       |
|               | insert(int offset, String str)                         | <span style="color: red">StringIndexOutOfBoundsException</span>                                                                                                                   | state mutating                                                       |
|               | delete(int fromIndex, int endIndex)                    | <span style="color: red">StringIndexOutOfBoundsException</span><br/>- no exception when endIndex > sb.length()<br/>- exception if endIndex < fromIndex OR fromIndex > sb.length() | state mutating                                                       |
|               | deleteCharAt(int index)                                | <span style="color: red">StringIndexOutOfBoundsException</span>                                                                                                                   | state mutating                                                       |
|               | replace(int fromIndex, int endIndex, String newString) | <span style="color: red">StringIndexOutOfBoundsException</span><br/>like delete(), no exception when endIndex > sb.length()                                                       | state mutating                                                       |
|               | reverse()                                              |                                                                                                                                                                                   | state mutating                                                       |