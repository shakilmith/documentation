# Python Dictionary (Mapping Type)

Dictionary is a mapping data type of python. When we want to store large set of data with key value pairs (key will be used to retrieve the related values) then we can use python Dictionary mapping data type.

**Syntax:**

```
# using curly { } brackets
my_dict = {
  "first" : 1,
  "second": 2,
  "third" : 3,
  "fourth": 4
}

# using dict() type constructor
my_dict = dict(
  {
    "key1": value1,
    "key2": value2,
    "key3": value3
  }
  )

# extra square bracket can also be used
my_dict = dict([(
  "first" : 1,
  "second": 2,
  "third" : 3,
  "fourth": 4
  )])
  
# using zip iterable 
my_dict = dict(zip[
  # all the kyes in ()
  ("key1", "key2", "key3"),
  # all the values in ()
  (value1, value2, value 3)
  ])
```


The above are possible syntaxes to create dictionary mapping type in python. For simplicity, always use curly brackets. No need to use dict() type constructor to generate dictionary.

**Note about dictionary in python:**

1. Dictionary is mutable in python : you can add, update or remove dictionary entries
2. Dictionary maintains insertion order
3. Values can be accessed specifying the key name
4. From python 3.7 dictionaries are ordered

## Get the dictionary value

The **print()** function returns the dictionary as a list with key value pairs.

```
my_dict = {
  "first" : 1,
  "second": 2,
  "third" : 3
}
print(my_dict)

# Output in the console
{'first': 1, 'second': 2, 'three': 3}
# Get all the keys of a dictionary
```


Using the **keys()** method, we can retrieve all the keys from a certain dictionary.

```
my_dict = {
  "first" : 1,
  "second": 2,
  "third" : 3
}
print(my_dict.keys())

# output in the console
dict_keys(['first', 'second', 'third'])
```

## Retrieve All The Values of A Dict Type

Likewise **keys()** method, we can use **values()** method to return all the values of a dictionary in python. Such as,

```
my_dict = {
  "first" : 1,
  "second": 2,
  "third" : 3
}
print(my_dict.values())

# output in the console
dict_keys([1, 2, 3])
# Using list() method
```


The **list()** method converts dictionary to a list type and returns all the keys of a dictionary by default. Such as

```
my_dict = {
  "first" : 1,
  "second": 2,
  "third" : 3
}
print(list(my_dict))

# output in the console
['first', 'second', 'third']
```

## Get All The Values of A Dictionary Type Using List Constructor

In this case, we have to call the dict values() method

```
my_dict = {
  "first" : 1,
  "second": 2,
  "third" : 3
}
print(list(my_dict))

# output in the console
[1, 2, 3]
```

`
## Get The Values of A Dictionary Using Their Respective Keys

**Syntax:**

```
my_dict[key_name]

# such as 

my_dict = {
  "first" : 1,
  "second": 2,
  "third" : 3
}
```

```
# get the values using key name
print(my_dict['first']) # returns 1

print(my_dict['second']) # returns 2

print(my_dict['third']) # returns 3

# output in the console

1
2
3 
```


# Using get() Method

We can also get the relevant dict values using the **get(key)** method.

**Note:** the get() method returns None, if no key present in the dictionary type. It also accepts an optional default value. Such as,

```
my_dict = {
  "first" : 1,
  "second": 2,
  "third" : 3
}

# print the 'first' key value using the get() method.

print(get('first')) # returns 1

print(my_dict.get('fourth')) # returns None

print(my_dict.get('fourth', 'No value found')) # returns No value found
```


## Returns The Dictionary With (key, value) Pairs Using items() Method

```
my_dict = {
  "first" : 1,
  "second": 2,
  "third" : 3
}

print(my_dict.items())

# output in the console 
dict_items([('first', 1), ('second', 2), ('third', 3)])
# Add a new entry (key, value) to a dictionary
```


Imagine we have a following dictionary mapping type, and we want to add a new entry in it, such as,

```
my_dict = {
  "first" : 1,
  "second": 2,
  "third" : 3
}

print("Before updating")
print(my_dict)

# add a new entry (key, value)
my_dict["fourth"] = 4

print("After updating")
print(my_dict)
```

After running the above python file, you will get the following output in the console

```
# Before updating
{'first': 1, 'second': 2, 'third': 3}

After updating
{'first': 1, 'second': 2, 'third': 3, 'fourth': 4}
```

**Note:** this is not the only way, you can insert a new entry to a dictionary type.


# Remove An Entry (specify the key) From A Dictionary

In this case, we can use **pop(key_name)** method. Such as,

```
my_dict = {
  "first" : 1,
  "second": 2,
  "third" : 3,
  "fourth" 4,
}

print("Before removing the last entry")
print(my_dict)

# remove the last entry (key must be specified)
my_dict.pop('fourth')

print("After removing the last entry")
print(my_dict)
Output in the console after running the above python file.


# Before removing the last entry
{'first': 1, 'second': 2, 'third': 3, 'fourth': 4}

# After removing the last entry
{'first': 1, 'second': 2, 'third': 3}
```


# The clear() Method Removes All The Entries From A Dictionary

```
my_dict = {
  "first" : 1,
  "second": 2,
  "third" : 3,
}

print("Before using clear() method")
print(my_dict)

# remove all entries using clear method
my_dict.clear()

print("All the entries are cleared")
print(my_dict) # note, the dictionary will empty in this case
Output in the console after running the above python file


'first': 1, 'second': 2, 'third': 3}
All the entries are cleared
{}
```


But, if you want to delete the dictionary completely, you can use "del dict_name" method del tuple_name. Such as,

```
my_dict = {
  "first" : 1,
  "second": 2,
  "third" : 3,
}
print("Before deleting the dictionary")
print(my_dict)

# delete he dictionary using del method

del my_dict

print(my_dict) # raises an error that my_dict isn't defined because, we have deleted the whole my_dict
# Output in the console (You get an error message)

Before deleting the dictionary
{'first': 1, 'second': 2, 'third': 3}
Traceback (most recent call last):
  File "", line 16, in 
ERROR!
NameError: name 'my_dict' is not defined
```

But, we can also delete a particular dictionary entry or item using the del dict_name[key] statement. Look at the following example

```
my_dict = {
  "first" : 1,
  "second": 2,
  "third" : 3,
  "fourth": 4
}

del my_dict['fourth'] # entry 4 has been deleted

print(my_dict)

# Output in the console

{'first': 1, 'second': 2, 'third': 3}
```

Means, the fourth entry has been removed.

# Using in and not Boolean Expression

Check a certain entry is in the dictionary or not (specifying the key name)

```
my_dict = {
  "first" : 1,
  "second": 2,
  "third" : 3,
  "fourth": 4
}

x = 'fourth' in my_dict
print(x) # it returns true

y = 'fifth' in my_dict 
print(y) # it returns false

z = 'first' not in my_dict
print(z) # it returns false as the 'first' key is present in the my_dict dictionary

# Output in the console

True 
False
True
```


# Iterate A Dictionary Using for Loop

```
my_dict = {
  "first" : 1,
  "second": 2,
  "third" : 3,
  "fourth": 4
}

# using items() method
for key, value in my_dict.items():
    print(key, value)

# Output in the console

first 1
second 2
third 3
fourth 4
```

