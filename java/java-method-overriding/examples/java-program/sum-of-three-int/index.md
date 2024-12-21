# Add Two Integers Value

In this simple java example, we will add two integers, I mean two numeric (natural) numbers. For completing this example, we will create a simple java class.

**Addition.java**

```
public class Addition {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 90;
        System.out.println(num1 + num2);
    }
}
```

Here, we have created to int variable called num1 and num2 and initialized them by numeric values. Then, use the built in println() method to print the output into the console.

```
100
```





The above program can be updated by the following.

```
public class Addition {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 90;
        int result = num1 + num2;
        System.out.println("Summation of num1 and num2 is "+ result);
    }
}
```

Output:

```
Summation of num1 and num2 is 100
```

## Get User Input

In order to get user input, we have to import the **Scanner** class from **java.util** package. As we have read the int (numeric value), thus we will use the built in nextInt() method.

```
import java.util.Scanner;

public class AdditionExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declare three int
        int x, y, result = 0;
        System.out.println("Enter first number");
        x = sc.nextInt();
        System.out.println("Enter second number");
        y = sc.nextInt();

        //summation will be put in result
        result = x + y;
        System.out.println("Summation of x and y: "+result);
    }
}
```

After running the above example, you will be prompted to enter two integers one after another. If you enter two integers, they will be put in result variable and produce the summation.

```
Enter first number
10
Enter second number
20
Summation of x and y: 30
```