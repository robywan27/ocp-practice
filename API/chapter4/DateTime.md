> import java.time.*

> Dates and times are immutable

## Initialization - static factory methods
| Method             | Type                                                                                                           | Notes                                       |
|--------------------|----------------------------------------------------------------------------------------------------------------|---------------------------------------------|
| now()              | LocalDate.now()                                                                                                |                                             | 
|                    | LocalTime.now()                                                                                                |                                             |
|                    | LocalDateTime.now()                                                                                            |                                             |
|                    | ZonedDateTime.now()                                                                                            |                                             |
| LocalDate.of()     | LocalDate.of(int year, int month, int dayOfMonth)                                                              |                                             |
|                    | LocalDate.of(int year, Month month, int dayOfMonth)                                                            |                                             |
| LocalTime.of()     | LocalTime.of(int hour, int minute)                                                                             |                                             |
|                    | LocalTime.of(int hour, int minute, int second)                                                                 |                                             |
|                    | LocalTime.of(int hour, int minute, int second, int nano)                                                       |                                             |
| LocalDateTime.of() | LocalDateTime.of(LocalDate date, LocalTime time)                                                               |                                             |
|                    | LocalDateTime.of(...)                                                                                          | all combinations of LocalDate and LocalTime |
| ZonedDateTime.of() | ZonedDateTime.of(LocalDateTime dateTime, ZoneId zone)                                                          |                                             |
|                    | ZonedDateTime.of(LocalDate date, LocalTime time, ZoneId zone)                                                  |                                             |
|                    | ZonedDateTime.of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nano, ZoneId zone) |                                             |
|                    | ...                                                                                                            | can't pass Month enum                       |

## Instance methods
| Return Type   | Operation          | Method                                                           |
|---------------|--------------------|------------------------------------------------------------------|
| LocalDate     | plus               | plusDays(long days)                                              |
|               |                    | plusWeeks(long weeks)                                            |
|               |                    | plusMonths(long months)                                          |
|               |                    | plusYears(long years)                                            |
|               | minus              | minusDays(long days)                                             |
|               |                    | minusWeeks(long weeks)                                           |
|               |                    | minusMonths(long months)                                         |
|               |                    | minusYears(long years)                                           |
|               | copy               | withYear(int year)                                               |
|               |                    | withMonth(int month)                                             |
|               |                    | withDayOfMonth(int day)                                          |
|               |                    | withDayOfYear(int day)                                           |
| LocalTime     | plus               | plusHours(long hours)                                            |
|               |                    | plusMinutes(long minutes)                                        |
|               |                    | plusSeconds(long seconds)                                        |
|               |                    | plusNanos(long nanos)                                            |
|               | minus              | minusHours(long hours)                                           |
|               |                    | minusMinutes(long minutes)                                       |
|               |                    | minusSeconds(long seconds)                                       |
|               |                    | minusNanos(long nanos)                                           |
|               | copy               | withHour(int hour)                                               |
|               |                    | withMinute(int minute)                                           |
|               |                    | withSecond(int second)                                           |
|               |                    | withNano(int nano)                                               |
| LocalDateTime | from LocalDate     | atStartOfDay()                                                   |
|               |                    | atTime(LocalTime time)                                           |
|               |                    | LocalDateTime atTime(int hour, int minute)                       |
|               |                    | LocalDateTime atTime(int hour, int minute, int second)           |
|               |                    | LocalDateTime atTime(int hour, int minute, int second, int nano) |
|               | from LocalTime     | atDate(LocalDate date)                                           |
| ZonedDateTime | from LocalDateTime | atZone(ZoneId zone)                                              |

## Periods and Durations

### Periods
> String representation: PnYnMnD (n is number of years, months, days)

#### Static factory methods
| Method                              |
|-------------------------------------|
| ofYears(int years)                  |
| ofMonths(int months)                |
| ofWeeks(int weeks)                  |
| ofDays(int days)                    |
| of(int years, int months, int days) |

#### Static methods
| Method                                  |
|-----------------------------------------|
| between(LocalDate start, LocalDate end) |

> Periods can be used in some LocalDate (LocalDateTime, ZonedDateTime) methods such as plus(Period p) and minus(Period p)

### Durations
> String representation: PTnHnMnS (n is number of hours, minutes, seconds)

#### Static factory methods
| Method                             | Notes                                                                                 |
|------------------------------------|---------------------------------------------------------------------------------------|
| of(long amount, TemporalUnit unit) | `ChronoUnit` implements `TemporalUnit` and has constants such as `ChronoUnit.SECONDS` |
| ofDays(long days)                  |                                                                                       |
| ofHours(long hours)                |                                                                                       |
| ofMinutes(long minutes)            |                                                                                       |
| ofSeconds(long seconds)            |                                                                                       |
| ofMillis(long millis)              |                                                                                       |
| ofNanos(long nanos)                |                                                                                       |

#### Static methods
| Method                                |
|---------------------------------------|
| between(Temporal start, Temporal end) |

> Durations can be used in some LocalTime (LocalDateTime, ZonedDateTime) methods such as plus(Duration d) and minus(Duration d)

## Instants

### Static factory methods
| Method | 
|--------|
| now()  |

### Instant from ZonedDateTime
> toInstant()

## Daylight Saving Time
> In spring, the clock moves forward ("spring forward") and we lose an hour; in fall, the clock moves backward ("fall back") and we gain an hour

| Normal day            | March changeover      | November changeover           |
|-----------------------|-----------------------|-------------------------------|
| 1:00 a.m. - 1:59 a.m. | 1:00 a.m. - 1:59 a.m. | 1:00 a.m. - 1:59 a.m.         |
| 2:00 a.m. - 3:00 a.m. | 3:00 a.m. - 4:00 a.m. | 1:00 a.m. - 1:59 a.m. (again) |
| 3:00 a.m. - 4:00 a.m. |                       | 2:00 a.m. - 4:00 a.m.         |

> Java can automatically adjust for daylight saving time

> var zone = ZoneId.of("US/Eastern");<br/>
var date = _______________________________;<br/>
var time = LocalTime.of(2, 15);<br/>
var z = ZonedDateTime.of(date, time, zone);<br/><br/>
> LocalDate.of(2028, 3, 12) and LocalDate.of(2028, 11, 5) are both valid dates; 
> - the first one will be adjusted to 3:15 a.m.
> - the second one will be adjusted to 1:15 a.m.

> creating a non-existing time such as 2:15 a.m. on the day of the spring changeover rolls forward to 3:15 a.m.
> var date = LocalDate.of(2028, Month.MARCH, 12);<br/>
var time = LocalTime.of(1, 30);<br/>
var zone = ZoneId.of("US/Eastern");<br/>
var dateTime1 = ZonedDateTime.of(date, time, zone);<br/>
var dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
int hour = dateTime2.getHour(); // 3
long diff = ChronoUnit.HOURS.between(dateTime1, dateTime2); // 1 even though dateTime1 and dateTime2 are 2 hours apart
