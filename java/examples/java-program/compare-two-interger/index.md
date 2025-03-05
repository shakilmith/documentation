# Compare to Integer Number

Let's say we have to int number and we want to compare these two numbers. Such as, tow find out the lowest or highest number between them. To find out the highest or lowest number we will use java if-else condition in this case. So, our appropriate java java program would be:

**find out the highest number**

```
public class CompareTwoInt {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 100;

        if(num1 > num2){
            System.out.println(num1 + " is the highest number.");
        }
        else {
            System.out.println(num2 + " is the highest number");
        }
    }
}
public class CompareTwoInt {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 100;

        if(num1 > num2){
            System.out.println(num1 + " is the highest number.");
        }
        else {
            System.out.println(num2 + " is the highest number");
        }
    }
}
/**
 * 100 is the highest number
 */
```

**find out the lowest number**

```
public class CompareTwoInt {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 100;

        if(num1 < num2){
            System.out.println(num1 + " is the lowest number.");
        }
        else {
            System.out.println(num2 + " is the highest number");
        }
    }
}
/**
 * 10 is the lowest number.
 */
```

**Note:** You can use nested if or another else if condition as well to make things more complicated. Also note that, we use if condition to print code block based on condition and else statement will always executed if the if condition  doesn't match.

## Print the Largest Number Based on User Input

Let's say, you will allow your user to provide two int numbers, and you tell them which one is the highest or lowest number. For getting user input, we will use Scanner class that is located in **java.util** package.

```
import java.util.Scanner;

public class CompareTwoInt {
    public static void main(String[] args) {
        //object of Scanner class
        Scanner sc = new Scanner(System.in);
        //declare two int variable
        int num1, num2;

        System.out.println("Enter Two Integer Number (one after another)");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        //if condition
        if(num1 > num2){
            System.out.println(num1 + " is the highest number");
        }
        else {
            System.out.println(num2 + " is the highest number");
        }

    }
}
```

After running the above example, you will be prompted to enter two integer number. Guess, you entered 10 and 100  (one after another) you will get the following result into the console.

```
Enter Two Integer Number (one after another)
10
100
100 is the highest number
```

