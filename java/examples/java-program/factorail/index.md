# Find A Factorial of A Number

In this java example post, we will find out the factorial of a defined number. Factorial of a number means (positive number), multiplication of all numbers after n to 1 returns the total or whole. Here n refers the given number and it is written by n! (n factorial). 

n! = n x (n-1) x (n - 2) x (n-3) x ... x 3 x 2 x 1

For example,

5! = 5 x (5-1)x(5-2)x(5-3)x(5-4)x(5-5)! = 5 x 4 x 3 x 2 x 1 x 0! (Here, 0! factorial means 1)

So, create a simple java program to find out the factorial of a given number.


```
public class FactorialExample1 {
    public static void main(String[] args) {
        int number = 5; // initial number
        long factorial = 1; // Result is stored in a long to accommodate large results

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i; // Multiply current number 
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
```

After running the above example, we will find out the following output.

```
Factorial of 5 is: 120
```

So, the factorial of 5 is to 120. 

## Get User Input

Guess, let's get the the factorial of any number allowing the program to get user input. For this, we will use Java Scanner class.

```
import java.util.Scanner;

public class FactorialExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        long factorial = 1;

        System.out.println("Enter A Random Number");
        x = sc.nextInt();
        for (int i = 1; i <= x; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + x + " is: " + factorial);
    }
}
```

After running the above program, you will be prompted to enter an int (positive number) and after entering the int number, the factorial of that number will be produced.

```
Enter A Random Number
12
Factorial of 12 is: 479001600
```