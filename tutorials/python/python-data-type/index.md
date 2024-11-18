## Python Data Types

Python is not strictly typed language, that makes python robust and easy to learn programming language than C++ and Java, but get to know the basics of data types, very helpful as a programmer.

Here is the brief overview of python data types including examples.

## Python Built in Data Types

Python contains the following built in data types (though usually, you don't have to provide the type definition while declaring a variable - they are used internally) 


**Text or character:** ***str*** (used for sequence of characters or texts)

**note:** In python " " and ' ' are same. Thus, there is no character data type in python. For storing text based information, you can either use " " or ' ' - single quotation or double quotation.

**Numeric:** int, float (decimal include), complex (with j)

**Boolean:** True/False (support these two possible values)

**Sequence (array or list):** list, tuple, range

**Set:** set and frozenset

**Binary:** bytes, bytearray, memoryview,

**None:** NoneType

## Python Data Type Examples

The type() function returns the type of the variable, as you don't explicitly declare or define the type of the variable. Such as,

```
greeting = "Hello, Python";
print(type(greeting)) # returns <class 'str'> as greeting is string type

age = 30
print(type(age)) # returns <class 'int'> as 30 is numeric type

price = 25.75
print(type(price)) # returns <class 'float'> as 30 is numeric (includes decimal)) type

is_python_fun = True
print(type(is_python_fun)) # returns <class 'bool'> as it contains boolean value

languages = ["C++", "Java", "Python", "Rust"]
print(type(languages)) # <class 'list'> as sequence type

actors = {"Hi", "Hello", "Ho"}
print(type(actors)) # returns <class 'set'> as set type

programming_books = (("Java 17 Pro"), ("Python for Beginners"), ("Super Django"))
print(type(programming_books)) # returns <class 'tuple'>

my_dict = {
  "first" : 1,
  "second": 2,
  "third" : 3,
  "fourth": 4
}
print(type(my_dict)) # returns <class 'dict'> as it is dictionary
```

You will now get the all the data types of the above variables. Hence the interesting thing is that, you did not have to explicitly define the type each variables (what you usually see in Java or C++).

```
<class 'int'>
<class 'float'>
<class 'bool'>
<class 'list'>
<class 'set'>
<class 'tuple'>
<class 'dict'>
```

**Note:** Whatever you write in python, they actually express a type - either int, float, str, list or set even NoneType. The only advantages you get not to type manually and do not care what is going on. But, as a programmer you must recognize yourself with the type system which gives you full control whatever you do or write.