# Java Reverse An Integer Number

In this java example post, we will see how to reverse an int number. Such as, if our predefined number is 123 then the compile produce a result that will be reversed of this number like 321. Let's  see the following example program.

```
public class Main {
    public static void main(String[] args) {
    int number = 123;
    int reverse = 0;

        System.out.println("Initial number: "+number);
    //reverse number using while loop
    while (number !=0){
        int reminder = number % 10;
        reverse = reverse * 10 + reminder;
        number = number / 10;
    }
        System.out.println("Reversed Number:"+reverse);
    }
}
```

Run the above example, and it will reverse the number variable.

```
Initial number: 123
Reversed Number:321
```

## Get User Input

Let's get a reversed oder of an input number. Such as, you enter 456 and the compiler convert it to 654.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number; //initial number to be reversed
        int reverse = 0; //reversed number

        System.out.println("Enter A Random Number ");
        number = sc.nextInt();

        while (number !=0){
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }
        System.out.println("Reversed Number: "+ reverse);
    }
}
```

After running the above example, you will be prompted to enter a random int number. When you enter the int number, the compiler will print the reverse of that input number.

```
Enter A Random Number 
456
Reversed Number: 654
```

