# Compare Three Integer Number

Let's see a simple java program to get or print the highest number amongst three integer numbers. And we also see the same example of user input. Let's look at the following java program.

**Print the Highest Number of Three Int**

```
public class CompareThreeInt {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 100;
        int num3 = 1000;

        //using if, else-if and else condition
        if(num1 > num2){
            System.out.printf("%d is the highest number of %d, %d and %d", num1, num1, num2, num3);
        } else if (num2 > num3) {
            System.out.printf("%d is the highest number of %d, %d and %d", num2, num1, num2, num3);
        }
        else {
            System.out.printf("%d is the highest number of %d, %d and %d", num3, num1, num2, num3);
        }
    }
}
```

If you run the above example you will get the following result.

```
1000 is the highest number of 10, 100 and 1000
```

**So, what will the program of find out the lowest number amongst three int?**

**Note:** We use printf() instead of println() to make things formatted. Also remember, %d is used for int and similarly %f for float and %s for String and so on.

## Find Out The Largest Number Using User Input

You will now provide three int number, then program will tell you which one the largest number.

```
import java.util.Scanner;

public class CompareThreeInt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Enter Three Int Numbers");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if(num1 > num2){
            System.out.println("num1 is the the highest number and it is "+ num1);
        } else if (num2 > num3) {
            System.out.println("num2 is the highest number and it is "+num2);
        } else {
            System.out.println("num3 is the highest number and it is "+num3);
        }
    }
}
```

Note: You must import the Scanner class from **java.util** package.

If you run the above example, you will prompted to enter three int numbers, one after another. If you do so (randomly too) you will get the following output that will tell you which one the largest number of these three int numbers.

```
Enter Three Int Numbers
10
100
1000
num3 is the highest number and it is 1000
```

