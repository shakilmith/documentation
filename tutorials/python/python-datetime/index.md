# Python Datetime Module

In order to work with data and time in python, we have to import a python module (package in other words) called datetime module. Then, there are built in methods in datetime module to work with date and time in python.

**Syntax**

```
# first of all you have to import the datetime module (top of the file)
import datetime
# or
import datetime as date

# now we can access the built-in methods that datetime module provides

# Note: we have to use the datetime constructor to construct date and time to use in our application
```

## A Simple Example that Demonstrate the Use of Datetime Module

Using **datetime.now()** method

```
import datetime

# display the current date and time (using datetime.now() method)

ct = datetime.datetime.now()
print(ct)
```

After running the application, it prints the current date an time including milliseconds.

```
2024-05-10 12:25:30.471523
```

What if you only want to print the date or time only?

```
import datetime

# display the current date and time (using datetime.now() method)

ct = datetime.datetime.now()

print("Current Date is: ", ct.date())
print("Current Time is: ", ct.time())

# display only year, month, day separately

current_year = ct.date().year
current_month = ct.date().month
current_date = ct.date().day

print("Current year: ", current_year)
print("Current month: ", current_month)
print("Current date: ", current_date)

# display only hour and minute

current_hour = ct.time().hour
current_minute = ct.time().minute

print("Hour: ", current_hour)
print("Minutes: ", current_minute)
```

After running the python file, following output will be displayed

```
Current Date is:  2024-05-10
Current Time is:  12:44:58.833225
Current year:  2024
Current month:  5
Current date:  10
Hour:  12
Minutes:  44
```

## Specify Our Own Datetime Definition Instead of Using **_datetime.now()_**

```
import datetime

# Creating objects of datetime

current_date = datetime.datetime(2024, 3, 24) # 3 arguments required (year, month, day)
print(current_date)

# output:
2024-03-24 00:00:00
```

Note: The date object can also take additional three parameters including year, month, day. Such as, hour, minutes, seconds, tzone. But those are optional, if you don't specify them, 00:00:00 will be added.

## Format Datetime

Using **strftime()** function, we can format our datetime object. Below you can see the possible format patter to use.

<ul>
<li>Year full version: <b>"%Y"</b></li>
<li>Year short version: <b>"%y"</b></li>
<li>Month name, full form: <b>"%B"</b></li>
<li>Year short version: <b>"%y"</b></li>
<li>Month name, full form: <b>"%B"</b></li>
<li>Month name, short form: <b>"%b"</b></li>
<li>Month number (01 to 12): <b>"%m"</b></li>
<li>Day of the month (01 to 31): <b>"%d"</b></li>
<li>Weekday (01 to 7): <b>"%w"</b></li>
<li>Weekday, full form: <b>"%A"</b></li>
<li>Weekday, short from: <b>"%a"</b></li>
<li>For hours (00 to 23): <b>"%H</b></li>
<li>For hours (oo to 12): <b>"%l"</b></li> 
<li>AM/PM: <b>"%P"</b></li>
<li>For minutes: <b>"%M"</b></li>
<li>For seconds: <b>"%S"</b></li>
<li>For milliseconds: <b>"%f"</b></li>
<li>For timezones: <b>"%Z"</b></li>
<li>Date and time of the local format: <b>"%c"</b></li>
</ul>

{/*Link to know more*/}

## Example of Formatting Date

```
import datetime

current_date_and_time = datetime.datetime.now()
print(current_date_and_time)
```

If you run the above python file, you will get the following output: (date and time - including milliseconds), like

```
2024-11-15 23:42:26.342788
```

But, in order to get only the date or time we can use one of the mentioned format specifier (strftime()). Such as,


```
import datetime

x = datetime.datetime.now() # it stores date time (including milliseconds)

print("Year in full form: ", x.strftime("%Y")) # output full form year: 2024
print("Year in short form: ", x.strftime("%y")) # output year in short form: 24
print("Month in full form: ", x.strftime("%B")) # output month name: November
print("Weekday in full form: ", x.strftime("%A")) # output weekday name: Friday
print("Weekday number, in the year: ", x.strftime("%W")) # output running weekday number: 46
print("Print timezone: ", x.strftime("%c")) # print full date and time of the local format
```

As usual, if you run the above example, you will get the following output in the console. You can also check out all the possible format specifiers, if you want in order to show the actual date and time format.

```
Year in full form:  2024
Year in short form:  24
Month in full form:  November
Weekday in full form:  Friday
Weekday number, in the year:  46
Print date and time in local format:  Fri Nov 15 23:57:55 2024
```

## Get Only Date or Only Time

As we already know, the **datetime.now()** method retrieves the date and time both together, but there is a method called date() and time() that shows only the date or time. Such as,

```
import datetime

date = datetime.datetime.now().date()
print(date) # 2024-11-16
```

In order to get time, you can just the call the time method from datetime object. Such as,

```
import datetime

time = datetime.datetime.now().time()
print(time) # output: 12:13:56.981219
```

**Note:** Please do't forget to import the datetime module, responsible for working date time in python. It contains possible methods and rules to work with date time.

