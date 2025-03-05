## Exception Handling in Java

- Using Try/Catch Block
- Using Try/Catch/Finally Block
- Using Try/Catch with Resources Block (Handling clean up operations gracefully)

In this post, we are going to learn how to handle exceptions in Java with try, catch block or try catch with resources block.

While writing code, it is possible there might be errors in your code or you write wrong code, thus your application will not run and crushed. In order to handle this type of exceptions or errors, developers usually follow several strategies, specially using try, catch blocks to handle exceptions.

**Syntax:**

```
try{
    //use code that might throw an exception
}
catch (Exception e){
    //handle the exception if any error occurred in try block
}
finally{
    //optional finally block, will always executed, for cleaning up resources
}
```

Here the explanations:

**try:** it is used to check a code that might throw an exception (in short buggy codes)

**catch:** it is used handle the exceptions raised in the try block

**finally (optional):** it is always executed, and the purpose of using it to clean up resources like closing file streams, database connections etc.

**Note:** You can use multiple catch blocks to the exceptions occurred in your try block.

Let's see an example of try, catch block.

First of we write a code that is wrong by default and see what output we will get.

```
public class Main{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result = 10 / 0; //you can not use 0 as divisor
        System.out.println(result);
    }
}
```

As we know, numbers (either positive or negative) can not be divided by zero, thus if you run the above program, you get the following error in the console.

```
Exception in thread "main" java.lang.ArithmeticException: / by zero
```

I believe, in production level application, you do not want this type error occurred, and crush your application, none of your next codes run.

Thus, you can use try, catch block to handle this type of exceptions so that, next of your codes will run smoothly.

So, let's use try, catch block to handle the above exceptions.

```
public class Main{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result;
        try { //use the code that might throw an exception
            result = num1 / num2;
        }
        catch (ArithmeticException e){ //handle the exception to the try block
            System.out.println("Arithmetic exception occurred: "+e.getMessage());
        }
    }
}
```

After running the above example, output will be:

```
Arithmetic exception occurred: / by zero
```

## Using Multiple Catch Blocks

You might have multiple catch blocks:

```
public class Main{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try { //use the code that might throw an exception
             int result = num1 / num2;
        }
        catch (ArithmeticException e){ //handle the exception to the try block
            System.out.println("Arithmetic exception occurred: "+e.getMessage());
        }
        catch (Exception e){ //handle non known exceptions
            System.out.println("Other Exceptions: "+e.getMessage());
        }
    }
}
```

## Using Finally Block

Here, finally block will always be executed regardless exceptions occurred or not. The purpose of using finally block is to cleaning up resources like closing files, database connections etc. In order to handle memory leaks in your code, it is necessary.

```
public class Main{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try { //use the code that might throw an exception
             int result = num1 / num2;
        }
        catch (ArithmeticException e){ //handle the exception to the try block
            System.out.println("Arithmetic exception occurred: "+e.getMessage());
        }
        catch (Exception e){ //handle non known exceptions
            System.out.println("Other Exceptions: "+e.getMessage());
        }
        finally { //optional: it is always executed
            System.out.println("Finally block is always executed");
        }
    }
}
```

If you now run the above example, you will see, finally block is executed by default as usual.

```
Arithmetic exception occurred: / by zero
Finally block is always executed
```

## Example 1: Using try, catch blocks

Let's see an example where ArrayIndexOutOfBoundsException occurred. Such as,

```
public class Main{
    public static void main(String[] args) {
        int[] numbers = {14, 20, 50, 35, 60}; //top index number is 4

        try {
            System.out.println(numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
//Output: Index 5 out of bounds for length 5
```

## Example 2: File handling

Let's see an example where you want to write to a file, and the file might not exist. Thus, error like FileNotFoundException, Filler error or FileAlreadyExistsException occurred, and we will use try-catch block to handle this exception.

```
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        FileWriter writer = null;

        try {
            File file = new File("demo.text");
            writer = new FileWriter(file);
            writer.write("Hello, World");
        }
        catch (IOException e){
            System.out.println("Filler error occurred: "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("An unknown exception occurred: "+e.getMessage());
        }
        finally { //optional: cleaning up purposes (closing file here)

            try {
                if(writer !=null){
                    writer.close();
                    System.out.println("File writer closed.");
                }
            }
            catch (IOException e){
                System.out.println("Error occurred during closing the file: "+e.getMessage());
            }
            System.out.println("Finally block");
        }
    }
}
```

After running the code:

```
File writer closed.
Finally block
```

It means, no exception thrown, and there demo.txt file has been created with the "Hello, World" message.

But what if, you want to read a file when it is not exists? 

So, here we are going to read a file that might not exist and see what is going on and how our program will crush.

```
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        //trying to read a file that is not exist
        File file = new File("hello.txt"); //this file is not exist
        FileReader reader = new FileReader(file);

        int character;
        while ((character = reader.read()) != -1){
            System.out.print((char) character);
        }

    }
}
```

After running the above example, the FileNotFoundException occurred because there is no file called hello.txt.

```
Exception in thread "main" java.io.FileNotFoundException: hello.txt (The system cannot find the file specified)
```

So, in order to handle exceptions like above, we basically use java try-catch blocks.
