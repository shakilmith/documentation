# Python if Statement

If is a conditional statement and in order to render something or execute something based on condition we usually use python if statement. Such as, allow a member to write article in online journal if they are logged in, or you can only vote if you are above 18 etc.

**Syntax**

```
if (x < 15): 
    # code block to execute
```

**Note:** Indentation is required (at least 1 space, better to use 1 tab)

Here, ***if (condition)*** you will provide the condition to check, if it is fulfilled, code block will be executed (it is called if block) otherwise skipped. Also note that, here parenthesis is optional (not mandatory like java or c++) but I always find them useful like other developers.

## Example of Python if Loop

Let's check out few if statement examples that could be helpful to know more of this statement.

**Example 1:** ***Check a numeric value***

```
x = 10;
if (x < 15): 
    print (x, "is less than 15");
if (x > 5):
    print (x, "is greater than 5");
```

**Note:** semicolon is optional like parenthesis. As I am java developer, that's why i am accustomed.

**Output:**

```
10  is less than 15
10  is greater than 5
```

Instead of declaring a variable first, we can also check row numbers, like

```
if (29 < 39):
    print ("29 is less than 39"); # printed as true
if (29 > 39):
    print ("29 is greater than 39"); # will not be printed (as false)
```

Means, the above syntax of if statement returns true, false based on the condition. If the the condition is true the code block of that if statement will be executed but if false, code block will be not be executed.

**Output:**

```
29 is less than 39
```

**Note:** Second if statement is false, thus the code block of that if statement is not executed.

## Use Python If Statement in Function

Let's create a function to check it is positive, negative or zero (multiple if statement required)

```
def check_num(num):
    if (num < 0):
        return "It is negative number";
    if (num > 0):
        return "It is positive number";
    if (num == 0):
        return "The number is 0";

# Invoke the check_num function
print (check_num(-3)); # argument required
print (check_num(3));
print (check_num(0)); 
```

If you now run the example, you will se the following output:

```
It is negative number
It is positive number
The number is 0
```

**Note:** Instead of doing the above like using multiple if statement, we can use elif and else statements as well. Then, the code will be concise and maintainable. Such as,

```
def check_num(num):
    if (num < 0):
        return "It is negative number";
    elif (num > 0): # impose another condition
        return "It is positive number";
    else:
        return "The number is 0";

# Invoke the check_num function
print (check_num(-3)); # argument required
print (check_num(3));
print (check_num(0)); 
```

Output, will be same as above, but it look good when we look at third condition. Like, instead of implementing another if condition, the else block exactly does the same.