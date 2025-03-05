## Java Program to Print a String into the Console

In this example we will explore how to print a string variable into the console in java.

For completing this example, we need to create a java class. Let's name the class PrintString.java with the following code.

**PrintString.java**

```
public class PrintString {
    public static void main(String[] args) {
        String text = "Java";
        System.out.println(text);
    }
}
```

Here, inside the main method we declare a String variable called text and we also initialized it with a simple text value. And use the System.out.println() method to print the text variable value to the console. Now, if you runt the **PrintString.java** you will get the text message.

```
Java
```

Running, java program in IntelliJ IDE is very straightforward task. Just click on the run button or use shortcut like: (Ctrl + Shift + F10) using keyboard.

## Get User Input

Let's say we want to get the String value from keyboard (or user) and then print it to the console. For accomplishing this, we will use built in Scanner class in java (located in **java.util** package) that helps to read user input in java either String, int, float or character etc.

**Note:** ***For reading String/text values we will use built in nextLine() method. Similarly, nextInt() for reading numeric values, nextFloat() for decimal values etc.***

```
import java.util.Scanner;

public class TestExample1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get String value from keyboard and add put it to name variable
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.print("My name is "+ name);
    }
}
```

If you run the above example, the console prompts you to enter a String value. If you type or provide the String or text value from keyword (only text value) then you will get the following output.

```
Enter Your Name: 
Shakil
My name is Shakil
```