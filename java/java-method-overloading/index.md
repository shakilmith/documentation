# Method Overloading in Java

When more than one method have same name but with different types of parameters, return types are different or the number of parameters are different within the class (not subclass) then it is called method overloading.

> “One big difference between method overriding and method overloading is that, method overloading can be achieved within the class and method overriding can be achieved within the subclass. Means, inheritance only.”

In both ways we can reuse the same method but the use cases are totally different.

## Examples of Method Overloading

In the following examples, we will explore the concept of method overloading where we can reuse the same code block multiple times without defining or writing individual method for handling multiple same type of tasks.

**When Parameters Data Types Are Different**

**Note:** Parameters are arguments of a method, when we create a method we can pass parameters as arguments, and provide the parameters value when we call them or use them.

Guess that, we want to create a method that returns the addition of different types of numbers. But the problem is that, for handling this task we have to create methods for each tasks if we don't follow the mechanism of method overloading.

```
//first method
int getAdditionX(int x, int y){
    return x + y;
}

//second method
float getAdditionY(int x, float y){
    return x * y;
}
```

Instead of defining two different methods that almost do the same type of task, we can use the method overloading concept and handling the above additions. Such as,

```
public class Main {

    int getAddition(int x, int y){
        return x + y;
    }

    float getAddition(int x, float y){
        return x + y;
    }

    public static void main(String[] args) {
        Main obj = new Main();

        System.out.println(obj.getAddition(10, 100));
        System.out.println(obj.getAddition(30, 100.5f));
    }
}

/**
 * Output:
 * 110
 * 130.5
 */
```

**When Number of Parameters are different**

Like, if you have methods to add two numbers, three numbers and beyond to n numbers of parameters. So, instead of creating method for each addition task, we can use the concept of method overloading.

```
public class Main {

    int getAddition(int x, int y){
        return x + y;
    }

    int getAddition(int x, int y, int z){
        return x + y + z;
    }

    float getAddition(float x, float y, float z){
        return x + y + z;
    }

    public static void main(String[] args) {
        Main obj = new Main();

        System.out.println(obj.getAddition(10, 20));
        System.out.println(obj.getAddition(10, 20, 30));
        System.out.println(obj.getAddition(10.5f, 10.5f, 10.5f));
    }
}

/**
 * Output:
 * 30
 * 60
 * 31.5
 */
```

So, what about the combination of different types of parameters, number of parameters and returns types of methods? Yes, combining all are valid.

## Necessity of Method Overloading in Java

- Reuse same method name multiple times within the declared class. It helps not to create another same type of method.
- Helps to write more maintainable and cleaner code
- Increase the readability of the program and reduce the complexity as well 
- Program different same type of tasks without defining new method
- Define a method that do the same type of multiple tasks, without creating new method.