# Python Switch (Match) Expression

Match expression in python is the same as switch statement in Java or C++.

When we want to print a certain value based on multiple conditions we can use python match statement. It is the alternative of using multiple python elif (else if) statement.

**Syntax:**

```
match expression: # also valid: match (expression):
  case 1: 
    case_block
  case 2:
    case_block
  case 3:
    case_block
  case  _:   # little space required
    wildcard_block # always executed if no case block matches
```

**Note:** The last case_: block is a wildcard statement and never fails to match. Means, if no case block matches with the expression then it will definitely be executed.
It surprised me too, there is no break statement or default statement like Java or C++. Thus, it is considered more like pattern matching like Rust or Haskell language.


# Combines More than One or Several Case Statements

We can combine several case literals or statements using single pattern like " | " symbol. Such as,

```
match (expression):
   case 6 | 7:
     case_block
```


# Print The Name Of the Weekday Using Match Expression

Here, we will set initial weekday number and go under several case blocks. If any case block matches, it stop the loop and print the result otherwise wildcard case block must be executed. See the example below:

```
day = 4

match (day): # or match day: 
    case 1: 
        print("Saturday")
    case 2:
        print("Sunday")
    case 3: 
        print("Monday")
    case 4:
        print("Tuesday")
    case 5:
        print("Wednesday")
    case 6: 
        print("Thursday")
    case 7: 
        print("Friday")
    case _: # it will be executed if no match found
        print("No match")
```   

When you run the above example, you will get the following output in the console:

```
Thursday
```

# Using Match Statement in Python Function

We can create a python function with match statement. And when we call the function it wll print the result based on the case block. This type of programs are very handy, because we can reuse the same logic multiple times. Such as,

```
def money_available(money):
  match money:
    case 700 | 900:
      return "You can buy a Dell Laptop "
    case 1000 | 1300:
      return "You can buy PHP Laptop"
    case 1500 | 600 | 1700: 
      return "You can buy a MacBook Laptop"
    case 100:
      return "Everything is expensive nowadays"
    case _:
      return "Probably you forgot to bring your wallet"
 
# Invoke/call the function with appropriate argument

print(money_available(700))
```

If you run the above example and call the money_available() function with the appropriate argument, you will get the following output. In my case, I passed 700

The output was:

```
You can buy a Dell Laptop
```

What if you passed arguments except mentioned one? Then, you the match statement definitely executed the wildcard block. Such as,

```
print(money_available(32000)) # Or
print(money_available(50)) # etc

# Output:
Probably you forgot to bring your wallet
```

Hence, nested conditions are also supported, if the scenario is more complex.
