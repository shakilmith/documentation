# Multiply Two Integers

In this simple java example, we will try to multiply two integer numbers. Let's look at the example java class.


```
public class MultiplyExample1 {
    public static void main(String[] args) {
        //declare and initialize two int variables
        int x = 10;
        int y = 8;
        //multiply and then keep it to result
        int result = x * y;
        //print the result
        System.out.println(result);
    }
}
```

Here, inside the main method, we have declared two int variables with value initialized. Then we use the result variable to store the multiplication. Then, use the println() method to output the multiplication into the console.

```
//output:
80
```

To make the above code formatted, we can use printf() method. Let's see the updated example of the above java class.

```
public class MultiplyExample2 {
    public static void main(String[] args) {
        //declare and initialize two int variables
        int x = 10;
        int y = 8;
        //multiply and then keep it to result
        int result = x * y;
        //print the result
        System.out.printf("%d * %d = %d", x, y, result); //%d is used for int
    }
}
```

If you run the above example, you will get the output in a formatted manner.

```
10 * 8 = 80
```

**Note:** %d is used for int, similarly %f is used for floating point numbers, %s for string etc.

## Get User Input

Let's say we want to multiply two numbers based on user interaction. I mean, get user data from keyboard and then multiply them, then print the result. For this, we will use java built in Scanner class located in java.util package. We first of all, have to import it. Let's look at the following example.


```
import java.util.Scanner;

public class MultiplyExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, result = 0;
        System.out.println("Enter First Integer Number");
        x = sc.nextInt();
        System.out.println("Enter Second Integer Number");
        y = sc.nextInt();
        result = x * y;
        System.out.printf("%d * %d = %d", x, y, result);
    }
}
```

First of all, we import the Scanner class from java.util package. Then, create an object of Scanner class. You can see, we have declared three variables. First two x and y for int value and result for save the multiplication in it. Also notice that, we use nextInt() method and it is used for getting int value from the keyboard. Similarly, nextFloat() for floating point value, nextByte() for byte etc. 

If you run the above example, you will be prompted to add two integers value. If you prove two integers, you will get the multiplication result that will be stored in the result variable overall.

```
Enter First Integer Number
10
Enter Second Integer Number
8
10 * 8 = 80
```

Enter, something different and let's see what output you receive.

