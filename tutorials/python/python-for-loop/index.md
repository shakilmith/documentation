# Python For Loop

To iterate or loop through a statement multiple times, usually we use for loop or while loop in python. Though **range()** function also use for the same purpose. 

In this post, we will talk about python for loop.

## Syntax of Python For Loop

```
for alias in <property>:
    //code block to iterate

# Such as:
for x in fruits:
    print(x);
```

**Note:** Here indentation is a required term in python for loop, it also true for functions or class definitions.

**What is alias here?**
Here alias can be anything like letter or word that will be used to store each value of the property (list, set or strings) in index based. 

**property:** it is something that we would like to iterate, such as list, tuple, set or even string (strings are usually sequence of characters - like London consists of 6 letter)


## Print 1 to 10 Using range() Function

```
for x in range(1, 11): # 11 is excluded
    print(x)
```

If you run the above program, you will get 1 to 10 (one after another, But I write here side by side)

```
1 2 3 4 5 6 7 8 9 10
```

Here x is increased by 1 until it reaches to index 10. Remember that index starts from 0 to 1 less than total elements. 

It is possible that, instead of increasing or initial value by 1, let's increase it by 2, 3 and so on? Yes, look at the following example:

```
for x in range(1, 11, 2):
    print(x); //indentation is required and optional ; has been used

# Output:
1
3
5
7
9
```

It's now clear that how we can increase our initial value or alias by 2, 3 or custom number. Here, the last argument of the **range()** function defines the logic to increase the alias in for loop.

## How to Print a Number or Statements Multiple Times in Python

In this case, instead of using two at least arguments (start, end), we can use one argument that defines how many times the loop will run. Such as,

```
for x in range(5): # the loop will run 5 times
    print(10);

# Output:
10 10 10 10 10
```

## Loop Through Strings

As we already know that Strings are objects and they are usually indicates sequence of characters. Therefore, we can also loop through strings in python using for loop like list, set or dictionary. Such as,

```
name = "Alfred"; # '' and "" both works same in python
print("Name: "+ name) # print name

# loop through name variable
for x in name: # name will treat as list of characters, even spaces will be applied
    print(x)
```
If we runt the above sample python file we will get the following output:

```
Name: Alfred
A
l
f
r
e
d
```

**Note:** In python, we say str to refer strings (text based) variables. And we can use either double ("") or single ('') quotation surrounding strings.

## Loop Through List or Array

There is no built in array in python but list can be used as equitant. And the use of for loop make sense when it is required to iterate over collection types like array, list, set or dictionary. 

Example 1: (Using numeric value as list members)

```
numbers = [1, 2, 3, 4, 5]

# Using For loop to iterate numbers list
for x in numbers:
    print(x); # indentation is required and semicolon is optional
```

Output:

```
1 2 3 4 5
```

Example 2:

```
languages = ["C++", "Java", "Python", "Rust", "Go"]

# Using For loop to iterate languages
for lang in languages:
    print(lang); # indentation is required and semicolon is optional
```

Output:
```
C++
Java
Python
Rust
Go
```

Example 3: (Using range() function)

```
languages = ["C++", "Java", "Python", "Rust", "Go"]

# Using For loop to iterate languages
for lang in range(len(languages)): # len() function here returns the length of the list
    print(languages[lang]); # indentation is required and semicolon is optional
```

Same output like the above, but now we use built in range() function.

```
C++ Java Python Rust Go
```

## Print the Index Number as well

What if we want to print index number with the value? Look at the below modified example:

```
languages = ["C++", "Java", "Python", "Rust", "Go"]

# Using For loop to iterate languages
for lang in range(len(languages)): # len() function here returns the length of the list
    print("Index number ", lang, "is: ", languages[lang]); # indentation is required and semicolon is optional
```

Then, the interpreted output contains the index number:

```
Index number  0 is:  C++
Index number  1 is:  Java
Index number  2 is:  Python
Index number  3 is:  Rust
Index number  4 is:  Go
```

**Note:** Here lang (alias) indicates the index number of the languages list. And as we know index number starts from 0, thus the first element gets index number 0 and the fifth element gets index number 4. We should also remember that index number always one less than the total length of the list or array. 

## Know More About Python For Loop

1. We can use for loop to iterate collection of values like list, set tuple or dictionary.
2. It is good to use when we know how many times the iteration will run, otherwise while should be used.
3. We can also use for loop inside function, combine with conditional statements.
4. It is always good to use for loop while it is necessary processing large set of data (like filter or sort thousands of orders or products info) or in order to produce repeated result.
5. There might be performance issues while filtering large set of data using for loop. It is bit slower than java or c++ for loop.

