# Method that Takes int and String as Parameter

In this example post, we will see how to define a method that takes String and int as parameters. Here, you must remember, when calling the method, the arguments should be passed as sequence. 

Let's see the example of method declaration that takes int and String as parameters.

```
public class MethodExample4 {
    //define a method that takes int and String as parameters
    public static void printStringAndInt(String name, int age){
        System.out.println("I am "+name +" "+"and I am "+age +" years old");
    }
    public static void main(String[] args) {
        //call the method with two arguments - String and int
        printStringAndInt("Mark Smith", 30);
    }
}
/**
 * I am Mark Smith and I am 30 years old
 */
```

Here, our method is static, that means it belongs to the class itself. Thus, we do need to create object of class is to access the method.

Yes, we can call the method multiple times with different values. Such as,

```
public class MethodExample4 {
    //define a method that takes int and String as parameters
    public static void printStringAndInt(String name, int age){
        System.out.println("I am "+name +" "+"and I am "+age +" years old");
    }
    public static void main(String[] args) {
        //call the method with two arguments - String and int
        printStringAndInt("Mark Smith", 30);
        printStringAndInt("Rebeka Gomez", 40);
        printStringAndInt("Jekov Jenkov", 50);
    }
}
/**
 * I am Mark Smith and I am 30 years old
 * I am Rebeka Gomez and I am 40 years old
 * I am Jekov Jenkov and I am 50 years old
 */
```

When provide parameters value, make sure the type should be in order. Like, if the first parameter is int, you can not pass String or float type. Then you get the following error. 

In case, (String param1, int pram 2), then when we call the method we pass (int param1, String param2), yes now will get the following compile time error.

```
java: incompatible types: int cannot be converted to java.lang.String
```