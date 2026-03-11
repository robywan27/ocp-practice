## Static methods
| Method | Type                                       | Notes                                                                                |
|--------|--------------------------------------------|--------------------------------------------------------------------------------------|
| min    | double min(double a, double b)             |                                                                                      |
|        | float min(float a, float b)                |                                                                                      |
|        | long min(long a, long b)                   |                                                                                      |
|        | int min(int a, int b)                      |                                                                                      |
| max    | double max(double a, double b)             |                                                                                      |
|        | float max(float a, float b)                |                                                                                      |
|        | long max(long a, long b)                   |                                                                                      |
|        | int max(int a, int b)                      |                                                                                      |
| round  | long round(double num)                     |                                                                                      |
|        | int round(float num)                       | round up for .5 and higher<br/>double param returns long and float param returns int |
| ceil   | double ceil(double num)                    |                                                                                      |
| floor  | double floor(double num)                   |                                                                                      |
| pow    | double pow(double number, double exponent) |                                                                                      |
| random | double random()                            |                                                                                      |

## BigInteger and BigDecimal
> Handle values that are too large for primitive types; they are immutable.

### Static factory methods
| Method                       |
|------------------------------|
| BigInteger.valueOf(long n)   |
| BigDecimal.valueOf(long n)   |
| BigDecimal.valueOf(double n) |

### Instance methods
| Method   | Type                              |
|----------|-----------------------------------|
| add      | BigInteger add(BigInteger n)      |
|          | BigDecimal add(BigDecimal n)      |
| subtract | BigInteger subtract(BigInteger n) |
|          | BigDecimal subtract(BigDecimal n) |
| multiply | BigInteger multiply(BigInteger n) |
|          | BigDecimal multiply(BigDecimal n) |
| divide   | BigInteger divide(BigInteger n)   |
|          | BigDecimal divide(BigDecimal n)   |
| max      | BigInteger max(BigInteger n)      |
|          | BigDecimal max(BigDecimal n)      |
| ...      | ...                               |