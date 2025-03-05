# Method that Takes int Parameter and Print Factorial of It

By the concept of recursion (the method that calls itself), we can simply find the factorial of any given int number. First of all we will the factorial of given number using for loop, then using recursive concept.

Such as: ***5! = 5 * 4 * 3 * 2 * 1***

So, let's see the following example that prints the factorial of given number, guess it is 5.

```
public class FactorialExample {
    //method that takes int parameters
    public static void findFactorial(int number){
        int num = 1;
        for (int i = 1; i <= number; i++){
            num *= i;
        }
        System.out.println("Factorial of " + number + " is " + num);
    }
    public static void main(String[] args) {
        findFactorial(5);
    }
}
/**
 * Factorial of 5 is 120
 */
```

Here, the for loop runs from 1 to number (inclusive) and then the variable num is multiplied by each value of i in the loop.

## Find Factorial of num 5 Using Recursion

```
public class FactorialExample1 {
    public static int findFactorial(int number){
        if(number == 0 || number == 1){ //without it, throw StackOverFlowError
            return 1;
        }
        return number * findFactorial(number - 1); //here findFactorial method calls itself
    }
    public static void main(String[] args) {
        int num = 5;
        int factorial = findFactorial(num);
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
/**
 * Factorial of 5 is 120
 */
```