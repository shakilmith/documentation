# Even or Odd

In this simple java example program, we will see a predefined number is even or odd. We know that, a number will always will even if it is divisible by 2 either positive or negative.

Let's get into a simple java example.

```
public class CheckEvenOrOdd {
    public static void main(String[] args) {
        //number to check
        int num = 12;

        if (num % 2 == 0){
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is odd number");
        }
    }
}
/**
* 12 is an even number
*/
```

**Note:** 0 is also an even number.

## Method to Check Even Or Odd Number

In this example, we will create a static method to check a number is even or odd.

```
public class CheckEvenOddExample1 {
    public static void main(String[] args) {
        int num = 27;
        if (isEven(num)){
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is not an odd number");
        }
    }

    //define a static method to check even or odd
    public static boolean isEven(int num){

        if (num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
/**
* 27 is not an odd number
*/
```

## Get User Input

When number is not predefined but your are prompted to enter a random int number. For this, we will use java Scanner class. Such as,

```
import java.util.Scanner;

public class CheckEvenOddExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Random Number");
        //number you will provide
        int num = sc.nextInt();

        if (isEven(num)){
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }

    //define a static method to check even or odd
    public static boolean isEven(int num){

        if (num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
```

If you now run the above example, you will prompted to enter a random int number. Now, if you type 12 

```
Enter A Random Number
12
12 is an even number
```

But if you type 21 then,

```
Enter A Random Number
21
21 is an odd number
```

Yes, there are may be other approaches to check even or odd number but we went under few simple examples. 

