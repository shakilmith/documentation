# Java Class Members

In this post, we describe little bit about java class members. Knowing about java class members and why they need in our application and how to access them, are very important. There are two types of class members in java. Such as,

- Properties - Also called fields, attributes etc.
- Methods - also called functions, behaviours etc.

Here, properties and methods must be placed or declared outside the main method. They are either be initialized and not initialized. Any valid access specifiers (like public, private, final, static etc.) or data types (int, String, float etc.) can be used altogether with them while declaring attributes or methods.

**Note:** Constructor is another type of built in method in java. The role of java constructor is to initialize the data members (only properties) of the class. 

**Static and Non Static Data Members**

We also have to remember that, data members can be static and non static as well. Static means belong to the class and non-static means belong to the instance of the class. We will describe this topic in different post; [Java Static and Non Static Class Members](/java-static-and-non-staic-class-members)

Let's go through a simple example. Let's guess you have a class called Rectangle and it contains two properties like length and with and they are initialized. And now you want to access their values, I mean print their values to the console. 


**Rectangle.java**

```
public class Rectangle{
    //declaring and initializing class properties
    static float length = 12.0f; //static means, don't need to create object to access it.
    static float width = 8.0f;

    public static void main(String[] args) {
        //accessing length and width
        System.out.println("Length: "+ length); //We can directly access length property as it is static
        System.out.println("Width: "+width);
    }
}
```

If you now run the Rectangle.java class, you will get the following output in the console.

```
Length: 12.0
Width: 8.0
```

Here, length and width class properties (you can say them class fields or attributes) are initialized at the tie of declaration and they are static as well. As they are static, thus we do not need to create instance of the class (in other words, objects) to access their values. 

Now, let's update the **Rectangle.java** class by adding a class method. Method in java is nothing but function of other programming languages and they are used to execute certain tasks when they are called. Like, updating the product info, do calculation based on providing data etc.


**Rectangle.java**      

```
public class Rectangle{
    //declaring and initializing class properties
    static float length = 12.0f; //static means, don't need to create object to access it.
    static float width = 8.0f;

    //declare a static method that print the area of Rectangle
    static float printArea(float l, float w){
        return l * w;
    } //here l and w are parameters of printArea method and will be provided when it is called

    public static void main(String[] args) {

        //accessing length and width
        System.out.println("Length: "+ length); //We can directly access length property as it is static
        System.out.println("Width: "+width);

        //call the printArea() method
        System.out.println("Area of Rectangle: "+printArea(length, width));
    }
}

/**
 * Output:
 * Length: 12.0
 * Width: 8.0
 * Area of Rectangle: 96.0
 */
```

Hence, it is now clear to us about java class members. Things to note here, class members either properties or methods can be static and non-static. If they are static, don't need to create object of the class to access them but if they are not static, then you must create object to access them. 

Now, I am interesting to describe little bit more about java class methods.

## Declaring and Accessing Java Class Methods.

First of all (though we have already told it) we have to know about methods and their uses. Methods are functions and they execute some statements when they are called like calculations of given numbers.

**method declaration**

```
modifier return_type method_name (number of parameters){
    //method body
}
public void myMethod(int x, int y){
    //method body
}
```

**Note:** modifier, return_type, method_name(parameters){...} are called method signature and return_type and method name must be required with optional unlimited number of parameters. You can also skip the access specifier. Return type can be int, float, double or any object type like String, void etc. Void is used to mention that, this method doesn't return any value.

**Rectangle.java**

```
public class Rectangle{

   static void getGreeting(){
        System.out.println("Hello Rectangle!");
    }

    public static void main(String[] args) {
       //call the method
        getGreeting();
    }
}

/**
 * Output:
 * Hello Rectangle!
 */
```

A method can be called multiple times. Such as,

```
public class Rectangle{

   static void getGreeting(){
        System.out.println("Hello Rectangle!");
    }

    public static void main(String[] args) {
       //call the method
        getGreeting();
        getGreeting();
        getGreeting();
    }
}

/**
 * Output:
 * Hello Rectangle!
 * Hello Rectangle!
 * Hello Rectangle!
 */
```

**Note:** Here, static means this method belong to the class itself, thus we do not need to create object of the Rectangle class to access it. And void means, the getGreeting() method doesn't return any value. 

Another example of method that returns int value.

**Rectangle.java**

```
public class Rectangle{

    static int getArea(int length, int width){ //length and width are parameters of getArea() method
        return length * width;
    }

    public static void main(String[] args) {
       //call the method
        getArea(12, 8); // you must provide the parameters value and they are called arguments
    }
}

/**
 * Output:
 * Hello Rectangle!
 * Hello Rectangle!
 * Hello Rectangle!
 */
```

I describe more about java methods in this post: [Java Method](/java-method). You can simply check out this tutorial as well if you are interested to know more about java methods.










