# Java Static And Non Static Class Members

In java class members usually refer properties (attributes or fields) and methods (also called functions or behaviours). They can be static and non static. Static means belongs to the class itself. And non static means belongs to the instance (or object) of the class.

Static keyword: If your class members are static, you can directly access them referring the class itself without creating instance of the class. Because they belong to the declared class itself. Also note that, static members consume memory only once while class loading whether the creation of number of instances.

Non Static keyword: If you class members are non-static (just don't use static keyword), you have to create instance of the class to access them. Also note that, non-static members consume memory every time a new instance is created.

## Example of Java Static Members

In this example we will see how to declare and access static members within the declared class and same package.

**Within the declared class**

```
public class Rectangle{
    //static properties
    static float length = 12.0f;
    static float width = 8.0f;

    //static method
    static float getArea(float l, float w){
        return l * w;
    }
    public static void main(String[] args) {

        //accessing static members (without creating instance or object of the class)
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
        System.out.println("Area: "+getArea(length , width));
    }
}

/**
 * Output:
 * Length: 12.0
 * Width: 8.0
 * Area: 96.0
 */
```

Okay, now we will see how to access java static members outside the declared class.

**Access Static Members Outside the Declared Class**

```
//Rectangle.java (doesn't contain main method)
public class Rectangle{
    //static properties
    static float length = 12.0f;
    static float width = 8.0f;

    //static method
    static float getArea(float l, float w){
        return l * w;
    }
}
//TestRectangle.java
public class TestRectangle{
    public static void main(String[] args) {

        //access the Rectangle static members
        float length = Rectangle.length; //Store Rectangle.length in a variable
        float width = Rectangle.width;

        //print static members
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
        System.out.println("Area: "+Rectangle.getArea(length, width));
    }
}
```

If you now run **TestRectangle.java** you will get the same result.

```
Length: 12.0
Width: 8.0
Area: 96.0
```

Note: If you want to access static members from a different package, just import the class and access the static members without creating instance of the class.

## Java Non Static Class Members

If class members are non static either properties or methods, they must be accessed through the instance or object of the class. You must create object of the class to access it's non static data members. Such as,

**Access Non Static Data Members Within the Declared Class**

```
public class Rectangle{
    //non-static properties
    float length = 12.0f;
    float width = 8.0f;

    //non-static method
    float getArea(float l, float w){
        return l * w;
    }
    public static void main(String[] args) {

        //Creating an object or reference variable of Rectangle
        Rectangle obj = new Rectangle(); //instances are created using the new keyword

        //accessing non-static members using the object of the class
        System.out.println("Length: "+obj.length); //also okay directly: new Rectangle().length
        System.out.println("Width: "+obj.width);
        System.out.println("Area: "+obj.getArea(obj.length , obj.width));
    }
}

/**
 * Output:
 * Length: 12.0
 * Width: 8.0
 * Area: 96.0
 */
```

**Access Non-static Class Members Outside the Declared Class**

```
//Rectangle.java (doesn't contain main method)
public class Rectangle{
    //non-static properties
    float length = 12.0f;
    float width = 8.0f;

    //non-static method
    float getArea(float l, float w){
        return l * w;
    }
}

//TestRectangle.java (contain main method)
public class TestRectangle{
    public static void main(String[] args) {

        Rectangle obj = new Rectangle();

        //store non-static properties in the local variable
        float length = obj.length; //Store obj.length in a variable
        float width = obj.width;

        //print non-static members
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
        System.out.println("Area: "+obj.getArea(length, width));
    }
}
```

If you now run TestRectangle.java, the following same response will be returned.

```
Output:
Length: 12.0
Width: 8.0
Area: 96.0
```

**Note:** In order to access non-static data members from  different package, you must import the class and then, create instance or object of the class like the above.


## Key things to note about Static and Non-Static Keywords

- Static Members of a class belong to the class itself.
- Non-static members of a class belong to the instance of the class
- You need to create object in order to access non-static data members. But, accessing static members, don't need to create object.
- Any access specifier like - public, private, final can be used along with static members
- Static members are memory efficient as they only consume memory only one while loading the class. On the other hand, non-static members consume memory every time while creating instance of the class.
- Java class and constructor can't be static.
- Static or non-static members both can be accessed within or outside the declared class, same or from a different package.
- Static members are initialized when the class is loaded into memory and non-static members are initialized when reference or instance of the class is created. 
- Every local variables, reside inside the main method static by default. So, don't need to explicitly use the static keyword.
- Static members have global scope and non-static members have only local scope and can only be accessed through the instance of the class.
- Static members can only access other static members within the declared class but non-static members can access both static and non-static members.
- Static members are used for utility methods, constants or variables that are not specific to each instance of the class. 
- Non static members are used for unique data members that are specific for each instance of the class.






