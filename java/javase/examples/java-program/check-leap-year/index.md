# Check Leap Year

In this following java example we will check a given year is leap year or not. First of all we have to know that how to determine a year is leap year or not. Few things we have to consider here. Such as,

A given year will be leap year if -
- it is divisible by 4 and (using && operator in java)
- it is not divisible by 100 or divisible by 400 (it will be applied for century years like 1500, 1700 or 1900 etc.)
- it will be leap year if it contains 366 days.

We will use if conditional block with AND (&&) and OR (||) operator to check a year is leap year or not. So, our java formula would be:

```
((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))
```

And the equivalent java program would be:

```
public class CheckLeapYear {
    public static void main(String[] args) {
        //declare a random year
        int year = 1916;

        //check year is leap or not using the following formula
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("It is leap year.");
        }
        else {
            System.out.println("It is not leap year.");
        }
    }
}
```

If you run the above example, you will get the following output.

```
It is leap year.
```

Change the year 1916 to 1700, what output you will expect? Yes, it will not be then a leap year.

```
It is not leap year.
```

Because, 1700 is not divisible by 4 at the same time for century year, it must not divisible by 100 and divisible by 400.

Note: In java, the LocalDate Package contains methods called isLeap year to check a year is leap year or not. If you use java DateTime module, then you can simply use the LocalDate isLeapYear() method to check your given year is leap year or not by avoiding the above formula. 

## Using isLeapYear() method.

The LocalDate or LocalDateTime class contains methods called isLeap year to check a year is leap year or not. 

```
import java.time.LocalDate;

public class CheckLeapYear {
    public static void main(String[] args) {
        //declare a random year
        LocalDate date = LocalDate.now().withYear(1600);

        //now use isLeapYear method
        boolean leapYear = date.isLeapYear();
        if (leapYear == true){
            System.out.println("It is leap year");
        }
        else {
            System.out.println("It is not leap year");
        }
    }
}
```

If you now run the above example, output would be:

```
It is leap year
```

**Note:** The format of LocalDate is: int year, int month and int dayOfMonth like:

```
LocalDate.of(1800, 6, 22);
```

As I need only year, thus I called the withYear(int) method. 

```
LocalDate.now().withYear(1600);
```

