# Add Two Floating Point Number

In this simple java example, we will add two floating point numbers. For completing this example, we will create a simple java class.

**AdditionExample1.java**

```
public class AdditionExample1 {
    public static void main(String[] args) {
        float x = 17.3f;
        float y = 8.5f;
        System.out.println(x + y);
    }
}
```

Here, we have created to float variables x and y and initialized them as well. Then, use the built in println() method to print the output into the console.

```
25.8
```

The above program can be updated by the following.

```
public class AdditionExample1 {
    public static void main(String[] args) {
        float x = 17.3f;
        float y = 8.5f;
        //use another variable to store the summation
        int result = num1 + num2;

        System.out.println("Summation of num1 and num2 is "+ result);
    }
}
```

Output:
```
Summation of x and y is: 100
```

## Get User Input

In order to get user input, we have to import the **Scanner** class from **java.util** package. As we have to read the float (decimal value), thus we will use the built in nextFloat() method.

```
import java.util.Scanner;

public class AdditionExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declare three int
        float x, y, result = 0.0f;

        System.out.println("Enter first number");
        x = sc.nextFloat();
        System.out.println("Enter second number");
        y = sc.nextFloat();

        //summation will be added in result variable
        result = x + y;
        System.out.println("Summation of x and y: "+result);
    }
}
```

After running the above example, you will be prompted to enter two floating point numbers one after another. If you enter two float numbers (with decimals), they will be stored in result variable and produce the summation into the console. 

```
Enter first number
17.5
Enter second number
8.3
Summation of x and y: 25.8
```