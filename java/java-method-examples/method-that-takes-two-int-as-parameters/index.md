# Java Method that Takes Two int As Parameters

In this example post, we will create a java method that takes two int parameters then we also see the summation of that two int parameters.

```
public class MethodExample1 {
    //define a method that takes two int as parameters
    public static int addTwoInt(int x, int y){
        return x + y;
    }
    public static void main(String[] args) {
        //call the method
        int result = addTwoInt(10, 20);
        System.out.println("Summation of two given int: "+result);
    }
}
```

If you now compile the above example, you will the summation of two given int numbers.

```
Summation of two given int: 30
```

## Method that Takes User Input

Let's extend the above example, that takes user input from keyboard and print the summation. 

Here, we have to import first java.util.Scanner class and create object of Scanner class to read user input from keyboard.

```
package com.company.example.methods;

import java.util.Scanner;

public class MethodExample2 {
    //method that takes 2 int parameters
    public static int addTwoInt(int x, int y){
        return x + y;
    }
    public static void main(String[] args) {
        //create a Scanner class object to read user input
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter first int
        System.out.println("Enter First int");
        int first = sc.nextInt();

        //prompt the user to enter first int
        System.out.println("Enter Second int");
        int second = sc.nextInt();

        //Now call the addTwoInt method and store it in a variable
        int result = addTwoInt(first, second);

        // Print the result
        System.out.println("The sum of " + first + " and " + second + " is: " + result);
    }
}
```