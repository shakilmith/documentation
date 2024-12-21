# Java Static Keyword

Static keyword in java can be used with class members like properties and methods only. And static keyword means, belongs to the class itself, not to the instance (object in other words) of that class. Variables define inside the main method are static by default. So, if any class members static, then we don't have to create object of that class to access them.

## When Class Members Are Static

When class members are static, they are associated to the class itself, not to the object or instance of that class. Thus, there is no need to create object or instance variable of that class to access static members.

**Rectangle.java**

```
package com.company;

public class Rectangle {
    //static properties
    static float length = 12.0f;
    static float width = 10.0f;

    //static method
    static float printArea(float length, float width){
        return length*width;
    }

    public static void main(String[] args) {

        //no need to create object of Rectangle

        //accessing final data members
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
        System.out.println("Area: "+printArea(length, width));
    }
}

/**
 * Output:
 * Length: 12.0
 * Width: 10.0
 * Area: 120.0
 */
```

But, if you try to access static data members via instance variable, though you get the output successfully, yet you should not.

```
static float length = 12.0f;

//Try to access static members via instance reference
Rectangle obj = new Rectangle();
System.out.println(obj.length); //prints output, but not necessary
```

## ## Key Things to Note About Static Keyword
- Static keyword means associated to the class, not to the instance reference of that class
- Accessing static data members, you don't need to create object of that class, just access them like local variables.
- In java, root class or super class can not not be static
- In java static keyword is used for memory management only
- Though root class (usually the java file name) can not be static, but nested class can be static
- You can use static keyword with nested class, class data members like with properties and methods or inner blocks
- In java static block is used to initialize the static data member
- If any block is static, they execute before the main method
- final method should not be static
- By default, java main method is static
- It is possible reinitialize the static data members
