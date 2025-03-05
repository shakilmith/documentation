# Method that Takes List of Objects as Parameters

In this example post, we will method declaration that takes list of Object as parameters. When you use Object type as parameters, it means any type of arguments can be passed when calling the method. Such, when you call the method and the parameter type is Object, it means, method can take int, String, float or Custom type etc. as arguments. Let's see the example below:

```
import java.util.List;

public class MethodExample9 {
    public static void main(String[] args) {
        //create List of object
        List<Object> myObjects = List.of(
                "Mark Smith", 30, 8.9, true
        );
        //call the processObjectList() method
        processObjectList(myObjects); //String, int, float or object, etc. parameters supported
    }

    //method that accepts list of Object type (primitive + non-primitive)
    public static void processObjectList(List<Object> objects){
        for (Object obj: objects){
            System.out.println(obj);
        }
    }
}
/**
 * Mark Smith
 * 30
 * 8.9
 * true
 */
```

So, when should you use Object as method parameters? Basically, it is suggested that when you define a variable it should have a type. But sometimes, when you do not know exact type of the end users or your method needs to process any type of input better to use Object type.

## When You Should Use Object type by Caution

- When the Method Needs to Handle Any Type of Input

- When Implementing General-Purpose Utilities

- When Interfacing with Legacy Code

- When Working with Reflection

- When Creating Highly Generic or Polymorphic Code

But in handling every task, Object is not a valuable choice. Methods with Object parameters can make the code less readable and harder to maintain. 

**Alternative of Object type**: Generics (<T>) are often a better alternative to achieve type safety while maintaining flexibility.