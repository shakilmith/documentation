# Python Exception Handling

In python usually ***try, catch and finally*** block are used to handle exceptions gracefully instead of letting the program crash. Exceptions are bugs occurred during development lifecycle of the application. Two types of exceptions may occur, one is compile time exception (occurs usually before executing the program - like file_not_found exception or class_not_found exception) and runtime exception (though program runs successfully but raise exception like arithmetic_exception)

## Handling Exceptions

Exceptions may occur while developing application due to writing wrong codes, invalid operations, illegal Operations, syntax errors or providing invalid input etc. And usually, programmers while writing code face this issues. Therefore, understanding and having a great knowledge how to handle this type of input mismatch exceptions is a great investment. 

## A Simple Example Where Exception Will Occur

Here, we go through a wrong code, and see why this exception occurs and will we get any output or not and what should we do?

Here, we are going to divide a number (like 10) by zero, and this is not possible. Thus the program will raise exception (this one is very famous example usually mention when exploring exception handling in any programming language).

```
num_ten = 10
num_zero = 0

# divide 10 by 0
print (num_ten / num_zero) # as it's not correct, it will raise error or exception
```

After running this application, in the console you will get the following error message. Such as,

```
....
ZeroDivisionError: division by zero
```

**How to Handle this**

Such as, we know some exceptions may occur during development or in our production grade application but instead of crash the application, we want to show some messages and execute our code gracefully. So in order to handle **ZeroDivisionError** we can use try-cath block.

**try:** try block is used to catch the exception.
**except (in java we use catch)** Use to handle exception if try block raise any exception.
**finally** Optional, always executes regardless the exception occurs or not. Note, optional **else** block may also be used if no exception occurs and it will be executed.

```
num_ten = 10
num_zero = 0

try:
    print (num_ten / num_zero)
except:
    print ("It is not possible to divide ten by zero")
```

If you now run the above example with **try-except** block, instead of terminating the application, it executes the **except** block.

```
It is not possible to divide ten by zero
```

## Catching Specific Exceptions (Name the Exception)

It is always good practice to type the name of the exception. Such as, FileNotFoundError (when working with file I/O), ValueError, ZeroDivisionError, FloatingPointError, ModuleNotFoundError etc.

```
try:
    file = open("demo_file.txt", "r")
except FileNotFoundError:
    print("The file you are trying to open does not exist.") # Output: The file you are trying to open does not exist.
```

What if you did't use try-except block? Error may occur like the following

```
FileNotFoundError: [Errno 2] No such file or directory: 'demo_file.txt'
```

**Note** Catching multiple exceptions also possible, then the syntax will be: except (ValueError, ZeroDivisionError) as e

## Using Generic Exception

Though it is not good practice as it might hide unexpected errors. Just use the Exception keyword, such as,

```
try:
    result = 10 / 0
except Exception as e:
    print(f"An unexpected error occurred: {e}") # Output: An unexpected error occurred: division by zero
```


