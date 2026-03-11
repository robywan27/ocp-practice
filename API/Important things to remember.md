# Chapter 1
- local variables need to be initialized only if they are used; if they are unused code compiles


# Chapter 2
- it's possible to assign a literal value to smaller vars than int (byte, short, char), as long as the value can fit in that type
- compound assignment operators (e.g. +=) perform implicit casting to the type of the variable on the left-hand side, even when on the right side there is an expression of a larger type
    > long goat = 2;<br/>
      goat -= 1.0; // goat is promoted to double, but then goat is automatically cast to long
- overflow: when a number is larger than the type can hold, it wraps around to the opposite end of the range; no exception is thrown
    > int x = Integer.MAX_VALUE + 1; // x becomes Integer.MIN_VALUE


# Chapter 3
- in for-each loop the type of the variable must be the same type or a supertype of the elements in the collection
    > List<Number> numbers = Arrays.asList(1, 2, 3);<br/>
      for (Object c : numbers)<br/>
        &emsp; System.out.print(c + ", ");<br/>
      for (Integer c : numbers) // does not compile<br/>
        &emsp; System.out.print(c + ", ");
- if a method param is final, that doesn't mean it can't take on different values, so it cannot be used in a case branch of a switch
    > void method(final int x) {<br/>
          int y = 1;<br/>
          switch (y) {<br/>
              &emsp; case x: // does not compile <br/>
                  &emsp; &emsp; System.out.println("one");<br/>
                  &emsp; &emsp; break;<br/>
              &emsp; case 2:<br/>
                  &emsp; &emsp; System.out.println("two");<br/>
                  &emsp; &emsp; break;<br/>
          }<br/>
      }
- in a switch statement/expression it doesn't matter that the default branch is at the top or before any other case branches; there's no unreachable code error
    > switch (x) {<br/>
          &emsp; default: break;<br/>
          &emsp; case 1:<br/>
          &emsp; case 2: break;<br/>
      }
- a switch expression must use -> in case branches instead of : unless it is followed by a code block (with a yield). In the latter case all case branches must use :
    > String result = switch (x) {<br/>
          &emsp; case 1 -> "one";<br/>
          &emsp; case 2 -> "two";<br/>
          &emsp; default -> "other";<br/>
      };<br/><br/>
      String result = switch (x) {<br/>
          &emsp; case 1: { yield "one"; }<br/>
          &emsp; case 2: { yield "two"; }<br/>
          &emsp; default: { yield "other"; }<br/>
      };
- in a do/while loop continue statement causes the loop to skip to the condition before going back to the iteration
    > int x = 0;<br/>
      do {<br/>
          &emsp; if (x == 0) {<br/>
              &emsp; &emsp; x++;<br/>
              &emsp; &emsp; continue;<br/>
              &emsp; &emsp; // more complex stuff like other inner loop
          }<br/>
      } while (x < 5);
- a switch statement without break statement causes every branch after the one being evaluated to execute regardless of their case labels
    > String instrument = "violin";</br>
      final String CELLO = "cello";</br>
      int p = -1;</br>
      switch (instrument) {</br>
         &emsp; &emsp; case "bass" : break;</br>
         &emsp; &emsp; case CELLO : p++;</br>
         &emsp; &emsp; default: p++;</br>
         &emsp; &emsp; case "VIOLIN": p++;</br>
         &emsp; &emsp; case "viola" : ++p; break;</br>
      }</br>
      System.out.print(p); // 2

# Chapter 4
- Java automatically adjusts for daylight saving time
> var zone = ZoneId.of("US/Eastern");<br/>
var date = _______________________________;<br/>
var time = LocalTime.of(2, 15);<br/>
var z = ZonedDateTime.of(date, time, zone);<br/><br/>
> LocalDate.of(2028, 3, 12) and LocalDate.of(2028, 11, 5) are both valid dates;
- when dealing with timezones it's best to convert to GMT by subtracting the time zone; subtracting a negative time zone is the same as adding it
> 2025-08-28T05:00 GMT-04:00 is equivalent to 9:00 GMT<br/>
> 2025-08-28T09:00 GMT-06:00 is equivalent to 15:00 GMT<br/>
- when comparing two zoned datetimes on day of daylight saving time change, ChronoUnit.HOURS.between(dt1, dt2) returns 1 even though dt1 and dt2 are 2 hours apart (check exercise 20 of review questions)

# Chapter 5