## Java Program to print an Integer Value

In this simple java example program, we will see how to print ai int value to the console. So, create a simple java class in your ide and name it, PrintInteger or something else.


```
public class PrintInteger {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(num);
        //formatter way
        System.out.printf("The num is %d", num);
    }
}
```

Here, we have created a variable called num in the above example and we initialize it by 100. Here, for numeric value, we use int as a data type. Java has built in data types we must use them in order to declare a variable as java is a typed language. Such as,

The built in primitive data types are:

int: for numeric value (positive or negative without decimal point)

float: for decimal point value

char: for characters

String: for sequence of characters (texts, thought it is not primitive type)

double: for decimal points up to 16 points etc.

So, if you now run the above program, you will get int value into the console.

```
100
The num is 100
```

## Get User Input

Let's say we want to get the int or numeric value from keyboard (or user) and then print it to the console. For accomplishing this, we will use built in Scanner class in java (located in **java.util** package) that helps to read user input in java either String, int, float or character etc.

**Note:** ***For reading String/text values we will use built in nextLine() method. Similarly, nextInt() for reading numeric values, nextFloat() for decimal values etc.***

```
import java.util.Scanner;

public class TestExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //get an int number from keyboard and print it to the console
        System.out.println("Enter a Random Number");
        int num = sc.nextInt();
        System.out.println("You entered: "+ num);
    }
}
```

If you run the above example, the console prompts you to enter an int number. If you type or provide an int value from keyword (only numeric value) then you will get the following output.

```
Enter a Random Number
10
You entered: 10
```

