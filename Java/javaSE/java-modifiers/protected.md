# Java Protected Modifier

In general, protected class members (attributes and methods) can be accessed within the declared class and outside the declared class from same package or through subclass from a different package.

Let's explore the possible scenario.

## Access Protected Class Members From Same and Declared Class

In this very early example, create a **Rectangle.java** class in **com.company** package and it contains main method.

**Rectangle.java**

```
package com.company.example;

public class Rectangle{

    //protected properties
    protected float length = 12.0f;
    protected float width = 10.0f;


    //protected method
    protected float printArea(float length, float width){
        return length*width;
    }

    //main method
    public static void main(String[] args) {

        //create an object of Rectangle
        Rectangle obj = new Rectangle();

        //access the protected class members
        System.out.println("Length: "+obj.length);
        System.out.println("Width: "+obj.width);
        System.out.println("Area :"+obj.printArea(obj.length, obj.width));
    }
}

/**
 * Output:
 * Length: 12.0
 * Width: 10.0
 * Area: 120.0
 */
```

Okay, the above output represents, protected members can be accessed within the declared class.

## Try to Access Protected Class Members Outside the Declared Class and Same Package

It is possible to access protected class members from outside the declared class but within the same package.

So, now create two java class, **Rectangle.java** (doesn't contain main method) and **TestRectangle.java** (contains main method) and both class are located in same package like **com.company** package.


**Rectangle.java**

```
package com.company;

public class Rectangle{

    //protected properties
    protected float length = 12.0f;
    protected float width = 10.0f;


    //protected method
    protected float printArea(float length, float width){
        return length*width;
    }
}
```

**TestRectangle.java**

```
package com.company.example;

public class TestRectangle {

    //main method
    public static void main(String[] args) {
        //create an object of Rectangle
        Rectangle obj = new Rectangle();

        //access the protected class members
        System.out.println("Length: "+obj.length);
        System.out.println("Width: "+obj.width);
        System.out.println("Area :"+obj.printArea(obj.length, obj.width));
    }
}
```

If you now run **TestRectangle.java** you will get the following output.

```
 Length: 12.0
 Width: 10.0
 Area :120.0
```

## Access Protected Class Members From A Different Package

We know that, protected class members can only be accessible thorough subclass if it is a different package. 

Such as, class A{} is in **com.company** package and we want to access it's protected members from **com.company.test** package, guess the class name is B{}. Now, we have to extends class A (Making B as a child class of A) to access the protected data members of class A{}. Let's demonstrate the scenario through the following example.


**Rectangle.java**
- Located in com.company package.

```
public class Rectangle{

    //protected properties
    protected float length = 12.0f;
    protected float width = 10.0f;


    //protected method
    protected float printArea(float length, float width){
        return length*width;
    }
}
```

**TestRectangle.java**
- Located in **com.company.test** package and it must be extended Rectangle class so that it can now access the protected class members.

```
package com.company.test;

import com.company.Rectangle;

public class TestRectangle extends Rectangle{

    public static void main(String[] args) {

        //creating object of TestRectangle
        TestRectangle obj = new TestRectangle();

        //accessing the protected class members of Rectangle class
        System.out.println("Length: "+obj.length);
        System.out.println("Width: "+obj.width);
        System.out.println("Area: "+obj.printArea(obj.length, obj.width));
    }
}
/**
 * Length: 12.0
 * Width: 10.0
 * Area: 120.0
 */
```

If you try to access the protected class members without follow the inheritance mechanism, I mean creating child class, you will get the following error:

***Error message***

```
length has protected access in com.company.Rectangle 
```

## Key Things to Note About Protected Modifier