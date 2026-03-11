> import java.time.*

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
> In spring, the clock moves forward and we lose an hour; in fall, the clock moves backward and we gain an hour

| Normal day            | March changeover      | November changeover           |
|-----------------------|-----------------------|-------------------------------|
| 1:00 a.m. - 1:59 a.m. | 1:00 a.m. - 1:59 a.m. | 1:00 a.m. - 1:59 a.m.         |
| 2:00 a.m. - 3:00 a.m. | 3:00 a.m. - 4:00 a.m. | 1:00 a.m. - 1:59 a.m. (again) |
| 3:00 a.m. - 4:00 a.m. |                       | 2:00 a.m. - 4:00 a.m.         |

