# Multiply Two Floats

In this simple java example, we will try to multiply two floating point numbers (decimal numbers). Let's look at the example java class.


```
public class MultiplyExample1 {
    public static void main(String[] args) {
        //declare and initialize two float variables
        float x = 12.5f;
        float y = 8.5f;
        //multiply and then keep it to result
        float result = x * y;
        //print the result
        System.out.println(result);
    }
}
```

Here, inside the main method, we have declared two float variables with value initialized. Then we use the result variable to store the multiplication. Then, use the println() method to output the multiplication into the console.

```
//output:
106.25
```

To make the above code formatted, we can use printf() method. Let's see the updated example of the above java class.

```
public class MultiplyExample2 {
    public static void main(String[] args) {
        //declare and initialize two float variables
        float x = 12.5f;
        float y = 8.5f;
        //multiply and then keep it to result
        float result = x * y;
        //print the result
        System.out.printf("%.2f * %.2f = %.2f", x, y, result);
    }
}
```

If you run the above example, you will get the output in a formatted manner.

```
12.50 * 8.50 = 106.25
```

**Note:** %f is used for floating point numbers, similarly %d is used for integer numbers, %s for string etc. But, we have used %.2f so that, after point there will be to decimal position, if we don't use .2f then after point there will fixed 6 precision numbers. Like instead of 12.50, it would be 12.500000 okay.

## Get User Input

Let's say we want to multiply two floating point numbers based on user interaction. I mean, get user data from keyboard and then multiply them, then print the result. For this, we will use java built in Scanner class located in **java.util** package. We first of all, have to import it. Let's look at the following example.


```
public class MultiplyExample3 {
    public static void main(String[] args) {
        //creating an object of Scanner class
        Scanner sc = new Scanner(System.in);

        //declare three float variables
        float x, y, result = 0;

        System.out.println("Enter First Float Number");
        x = sc.nextFloat();

        System.out.println("Enter Second Float Number");
        y = sc.nextFloat();

        //multiply and then keep it to result
        result = x * y;
        //print the result
        System.out.printf("%.2f * %.2f = %.2f", x, y, result);
    }
}
```

First of all, we import the Scanner class from java.util package. Then, create an object of Scanner class. You can see, we have declared three variables. First two x and y for float value and the result for save the multiplication in it. Also notice that, we use nextFloat() method and it is used for getting float value from the keyboard or user. Similarly, nextInt() for int number, nextByte() for byte, nextLine() for string etc. 

If you run the above example, you will be prompted to add two floating point numbers (one after another). If you provide two floats sequentially, you will get the multiplication result that will be stored in the result variable overall.

```
Enter First Float Number
12.5
Enter Second Float Number
8.5
12.50 * 8.50 = 106.25
```

Enter, something different and let's see what output you receive.

