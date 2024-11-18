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
