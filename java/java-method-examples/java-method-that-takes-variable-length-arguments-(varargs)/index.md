# Java Method that Takes Variable Length Arguments - varargs

In Java, variable-length arguments (often referred to as varargs) allow you to pass a variable (many) number of arguments to a method. Instead of specifying a fixed number of parameters, varargs allows you to pass any number of arguments of the same type to the method, including none at all.

Here, we declare a method that takes unknown number of arguments, but you should define the type. Such as,

```
public class MethodExample8 {
    // Method with regular parameters and varargs
    public static void displayInfo(String name, int age, String... skills) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Iterate through the varargs parameter
        System.out.print("Skills: ");
        for (String skill : skills) {
            System.out.print(skill + " ");
        }
    }

    public static void main(String[] args) {
        // Calling the method with varargs
        displayInfo("John", 25, "Java", "Python", "C++"); //the last 3 are vargs parameters
        displayInfo("Alice", 30, "HTML", "CSS");
        displayInfo("Bob", 22); // No skills
    }
}
/**
 * Name: John
 * Age: 25
 * Skills: Java Python C++ Name: Alice
 * Age: 30
 * Skills: HTML CSS Name: Bob
 * Age: 22
 * Skills:
 */
```

Before using Varargs, notice the scenario of Varargs, such as:

**Varargs as Arrays:** When you use varargs, Java internally converts the arguments into an array. So, in the above example, the numbers parameter in the method is treated as an int[] array.

**Varargs Limitations:** You can only have **one varargs parameter** in a method, and it must be the last parameter in the parameter list. If you have other parameters, varargs must come after them.

## Example with Multiple Parameters and Var-args

In the following example we will see how to combine varargs parameters with java regular parameters. As we know already, varargs (which then convert to an array) should be the last parameter if there are multiple parameters in your method definition.

```
public class MethodExample9 {
    
    // Method with regular parameters and varargs
    public static void displayInfo(String name, int age, String... skills) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        // Iterate through the varargs parameter
        System.out.println("Skills:");
        for (String skill : skills) {
            System.out.println(skill);
        }
    }

    public static void main(String[] args) {
        // Calling the method with varargs
        displayInfo("John", 25, "Java", "Python", "C++"); //the last 3 are vargs parameters
        displayInfo("Alice", 30, "HTML", "CSS");
        displayInfo("Bob", 22); // No skills
    }
}
/**
 * Name: John
 * Age: 25
 * Skills:
 * Java
 * Python
 * C++
 * Name: Alice
 * Age: 30
 * Skills:
 * HTML
 * CSS
 * Name: Bob
 * Age: 22
 * Skills:
 */
```