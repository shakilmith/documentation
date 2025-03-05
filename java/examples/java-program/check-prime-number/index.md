# Check Prime Number

In this simple example post, we will create a simple java program to check a number is prime or not. In order to be a prime number, the following conditions must be met. Such as,

- A number will be a prime number if it is divisible by 1 and itself only.
- It must be positive (prime number can't be negative).
- The lowest prime number is 2
- A prime number must have 2 factors only (1 and the number itself)
- Fractions like 2/3, 5/9 or decimal numbers like 2.3 or 5.9 can't be prime.
- Examples of prime number are 2, 3, 5, 7, 11 etc. and they have and only have two factors 1 and themselves.

So, let's get into the actual program to check out, a given number is prime or not.


```
public class PrimeExample1 {
    public static void main(String[] args) {
        //int number to check
        int num = 29;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else if (num <= 3) {
            isPrime = true;
        } else if (num % 2 == 0 || num % 3 == 0) {
            isPrime = false;
        } else {
            // Check from 5 to sqrt(number)
            for (int i = 5; i * i <= num; i += 6) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        // Output result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
```

If we run the above example, we will get the following output.

```
29 is a prime number.
```

***Explanation***
Number Initialization:

int number = 29; - This is the number you want to check. You can change this value to test different numbers.
Prime Checking Logic:

boolean isPrime = true; - Start by assuming the number is prime.
Edge Cases:
if (number <= 1) { isPrime = false; } - Numbers less than or equal to 1 are not prime.
else if (number <= 3) { isPrime = true; } - Numbers 2 and 3 are prime.
else if (number % 2 == 0 || number % 3 == 0) { isPrime = false; } - Exclude even numbers and multiples of 3.
Prime Checking:
Use a loop to check divisibility from 5 up to the square root of the number.
The loop increments by 6 and checks numbers of the form 6k ± 1 to see if they divide the number without a remainder.
Output Result:

if (isPrime) { System.out.println(number + " is a prime number."); } - Prints that the number is prime.
else { System.out.println(number + " is not a prime number."); } - Prints that the number is not prime.

But, if we set the initial num variable 27 then the result would be, num is not the prime number.

```
//when num is 27
num = 27;

//output
27 is not a prime number.
```

## Another Approach to Check Prime Number

```
public class PrimeExample2 {
    public static void main(String[] args) {
        int num = 17; //initial num to check
        boolean isPrime = true; //assume num is prime

        //edge cases
        // Handle edge cases
        if (num <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else if (num == 2 || num == 3) {
            isPrime = true; // 2 and 3 are prime numbers
        } else if (num % 2 == 0 || num % 3 == 0) {
            isPrime = false; // Exclude even numbers and multiples of 3
        } else {
            // Use a for loop to check factors from 5 to sqrt(number)
            for (int i = 5; i * i <= num; i += 6) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
```

## Using While Loop

```
 else {
        // Check for factors from 5 to sqrt(number)
        int i = 5;
        boolean foundFactor = false;
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) {
                isPrime = false;
                foundFactor = true;
                break;
            }
            i += 6;
        }
        // If no factor was found, the number is prime
        if (!foundFactor) {
            isPrime = true;
        }
    }
//rest of the code block should be same
```

## Method to Check A Prime Number

Now, we will create boolean method to check a number is prime or not using same above logic. Such as,

```
public class PrimeExample3 {
    public static void main(String[] args) {
        //number to check
        int num = 17;
        //now call the isPrime method
        if (isPrime(17)){
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    //method to check primeNum (method is static for simplicity)
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        } else if (num == 2 || num == 3){
            return true;
        } else if (num % 2 == 0 || num % 3 == 0){
            return false; // Exclude even numbers and multiples of 3
        } else {
            // Check from 5 to sqrt(number)
            for (int i = 5; i * i <= num; i += 6) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
```

**Output** after running the above example.

```
17 is a prime number
```

## Get User Input

We can also create a method where number is not predefined, users are prompt to provide a number then, our method will check that is prime or not. Such as,

```
import java.util.Scanner;

public class PrimeExample5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Random Number");
        //num, the user will provide
        int num = sc.nextInt();
        if (isPrime(num)){
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    //method to check primeNum (method is static for simplicity)
    public static boolean isPrime(int num){

        if (num <= 1){
            return false;
        } else if (num == 2 || num == 3){
            return true;
        } else if (num % 2 == 0 || num % 3 == 0){
            return false; // Exclude even numbers and multiples of 3
        } else {
            // Check from 5 to sqrt(number)
            for (int i = 5; i * i <= num; i += 6) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
```

When you run the above example, you will be prompted to enter a random int number. Let's say, you enter 19 and the output would be:

```
Enter A Random Number
19
19 is a prime number
```

What answer you would expect if you type 16 or 27? 

```
Enter A Random Number
27
27 is not a prime number
```

Because 27 has more than 2 factors and it is divisible 3 overall.

