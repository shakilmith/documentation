# Python Tuple

Tuple is a collection data type in python that items are ordered, immutable, and index based by default.

When we need to store many items that are not going to be changed, we can use tuple data type in python instead of list.

## Syntax

```
# tuple items that are comma separated
tuple_name = a, b, c
# using parentheses ()
tuple_name = (a, b, c)
# if your tuple contains only one element then, extra comma is required
tuple_name = (a,)
# using tuple() constructor
tuple_name = tuple((a, b, c))
```

**Note:** It is actually the comma that makes the tuple, not parentheses. Using parentheses () is optional, except of the empty tuple or when it is required to avoid syntactic ambiguity. For example, f(a, b, c) is a function call with three arguments, while f((a, b, c)) is a function call with three tuples as the solo arguments.

## Creating Tuple

Let's define few tuples and look at the output:

```
languages = ("C++", "Java", "Python", "Rust")
print(languages)
```

If you execute the above code, output will be:

```
('C++', 'Java', 'Python', 'Rust')
```

## Creating type() Function

The built in type() function returns the type of the variable, we create in python. As tuples are type of objects with the data type tuple, so the type() function returns {`<class 'tuple'>`}

```
languages = ("C++", "Java", "Python", "Rust")
print(type(languages)) # returns <class 'tuple'>
```

## Accessing Tuple Items 

Tuples are index based, thus it is possible to access the tuple items using index number. Like tuple[0] returns the first element, tuple[1] returns the second element and so on.

```
languages = ("C++", "Java", "Python", "Rust")
print(languages) # print raw tuple members
print(languages[0]) # returns first member: C++
print(languages[1]) # returns the the second member: Java
print(languages[len(languages) - 1]) # output the last member: Rust
```

As usual, if you run the above example, the following output you will get.

```
('C++', 'Java', 'Python', 'Rust')
C++
Java
Rust
```

## Using len (length) Function

The built in len() function is useful sometimes and it is used to returns the total length of the tuple. Such as,

```
languages = ("C++", "Java", "Python", "Rust")
print(len(languages)) # output: 4 (as there are total 4 elements)
```

## Change Tuple Items

Tuple items or members of a tuple by default unchangeable or immutable, therefore we can not change any tuple item once created. Even, no way to add new item into the tuple once created. Usually, it provides more restrictions than python list or set data type). For example,

```
languages = ("C++", "Java", "Python", "Rust")
print(languages[0]) # print the first member: C++

# Try to change the first member
languages[0] = "Rust" # try to change
print(languages) # compile time error
```

As tuple is immutable or unchangeable, thus the following compile time error will occur.

```
TypeError: 'tuple' object does not support item assignment
```

**Note:** When you know, the data will not be changed during the lifecycle of the application, better to use tuple than list or set as it provides solid restrictions over your data organizations.

## Duplicate Elements

Unlike set data type, tuple can accept duplicate members. Such as,

```
languages = ("C++", "Java", "Python", "Java")
print(languages); # Output: ('C++', 'Java', 'Python', 'Java')
```

## Using For Loop To Iterate Tuple

Like list, set or dictionary tuple collection data type can also be iterated using for loop, while loop or using range() function. Let's see how to iterate tuple items using for loop.

```
languages = ("C++", "Java", "Python", "Rust")
for x in languages:
    print(x)
```

Output will be:

```
C++
Java
Python
Rust
```

## Deleting Tuple 

Using del tuple_name will actually delete the tuple type entirely. Such as,

```
languages = ("C++", "Java", "Python", "Rust")
del languages # has been deleted
print(languages) # raised NameError: name 'languages' is not defined
```

**Note:** You basically can not delete the tuple items, and tuple type does not support the deletion of items but entire item. Such as,

```
languages = ("C++", "Java", "Python", "Rust")
del languages[0] # raised TypeError: 'tuple' object doesn't support item deletion
```

## Built in Tuple Methods

Python provides two built in methods to work with tuple as well as other optional methods. 

**Index():** returns the position or index number of the element in a certain tuple.

**Count()**: calculate and return the number of an item in a tuple, (means how many times an element or item is occurred, basically duplicate elements)

```
languages = ("C++", "Java", "Python", "Rust", "Java")
# Using index() method
print(languages.index("Rust")) # returns 3
# Using count() method
print(languages.count("Java")) # returns 2 (as Java is appeared two times)
```
