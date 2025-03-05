## Java Conditional Statements

In java if, else-if and optional else statements are used to create conditional code blocks in general way. The role of if, else if or else statements are to execute certain code blocks based on condition. Such as,

- You can only vote if you are 18 or above
- Send birthday wish if it is the birthday of your friend
- Access your social media account if only the password matched.
- Show only the product details if it is available and the price is less than $100.
- Send special bonus or coupon codes or offers to your clients if in case any occasions held like Black Friday offers etc.

In general way, if the statement is true execute the code blocks otherwise skip it or execute the else block.


**Syntax**

```
//if statement only
if(condition){
    //code block to execute when the if condition is true
}

//if, else-if statement

if(condition){
    //code block to execute if the condition is true
}
else if (condition) {
    //code block will be executed only the if condition is false
}
//multiple else if statement... follow the same concern

//with optional else block

if(condition){
    //code block to execute if the condition is true
}
else {
    //code block will always be executed when if condition is false
}
```

## Example of If Statement in Java

```
public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 100;
        
        //if condition
        if(x > y){
            System.out.println("x is greater than y");
        }
        else {
            System.out.println("x is less than y");
        }
    }
}

/**
 * Output:
 * x is less than y
 */
```

Here, the first if conditional block checks, "is x greater than y", if it is, then the code block will be executed otherwise, the else block will be executed. As, the if conditional block is false, thus the else block will be executed.

**Extend the above example with else if statement**

The else if statement is used to implies extra conditions over elements. When, if statement is not true, then the compiler will check the else if statement. There can be multiple else if statements to provide more conditions to execute certain statements. Such as,

```
public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 100;
        
        //if condition
        if(x > y){
            System.out.println("x is greater than y");
        }
        else if (x < y){
            System.out.println("x is greater than y");
        }
        else if (x == y){
            System.out.println("x is equal to y");
        }
        else {
            System.out.println("Either x or y is not a number");
        }
    }
}
/**
 * Output:
 * x is greater than y
 */
```
As you can see, we have used multiple else if statements to execute the conditional block. As, the first else if statement becomes true, thus, compiler prints it's value and escape the rest of the conditional statements, even there is no need to print the optional else block. 

## Use Logical AND, OR and NOT Operator

Combining AND (&&), OR (||) and NOT (!) logical operators, make our conditional statements more restrictive and helps to filter our data concisely or helps to implies more than one condition in a single statement.



> **Logical AND (&&):** Statement will only be executed when both conditions becomes true.
> **Logical OR (||):** Statements will be executed when one of the conditions becomes true.
> **Logical NOT (!):** Statement will only be executed when condition become false.


***Using logical AND - &&**

```
public class Main {
    public static void main(String[] args) {
        int price = 500;
        String name = "Laptop";

        if(price < 700 && name == "Laptop"){ //two conditions have been used together
            System.out.println("Get 20% discount");
        }
        else {
            System.out.println("Something went wrong");
        }
    }
}
/**
 * Output:
 * Get 20% discount
 */
```

If you don't use the logical && operator, then you have to use one more if condition (we say, nested if condition)


```
public class Main {
    public static void main(String[] args) {
        int price = 500;
        String name = "Laptop";

        if(price < 700){ //two conditions have been used together
            if(name == "Laptop"){
                System.out.println("Get 20% discount");
            }
        }
        else {
            System.out.println("Something went wrong");
        }
    }
}
/**
 * Output:
 * Get 20% discount
 */
```

Note: name == "Laptop" can also be written using the built in String method called "equals". Such as, name.equals("Laptop")

**Using Logical OR - ||**

```
public class Main {
    public static void main(String[] args) {
        int price = 350;
        String name = "Laptop";
        if(price < 300 || name.equals("Laptop")){
            System.out.println("Get 20% discount");
        }
    }
}
/**
 * Output:
 * Get 20% discount
 */
```

Though the first condition doesn't true, yet it executes the code block, as the second condition is true. The || (Logical OR) operator, always prints value if one of the conditions becomes true. But, if none are true, nothing will be executed.

**Using Logical NOT - !)

It always prints it's value, when condition becomes false.

```
public class Main {
    public static void main(String[] args) {
        int age = 30;

        if (age !=18){ //not equal to 18
            System.out.println("You can enter the pub");
        }
    }
}
/**
 * Output:
 * You can enter the pub
 */
```

