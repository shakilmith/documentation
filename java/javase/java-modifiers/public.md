# Java Public Modifier

Java public modifier has a vast accessibility and usually less restricted than private or protected modifier.

**When a class is public:** Then the class itself can be used to create subclasses or inheritance is possible. The class or class members can be accessed within the same package or within the different package.

**Note:** Usually, root class or the class that contains main method should be public.

**When the class members are public:** When a class members are public they can be accessible within the declared class from the same package, outside the declared class within the same package, outside the declared class from a different package or through inheritance (means subclasses)


Let's check out all the possibility to execute public members of a class.

### Execute Java Public Members Within the Same Package

**Class Members:** Usually, properties and methods are considered class members. (The definition can be extended)

```
package com.company;

public class Rectangle{ //public class
    public float printArea(float width, float height){ //class member
        return width*height;
    }

    //main method
    public static void main (String[] args) {
        //create an object of Rectangle
        Rectangle rect = new Rectangle();
        System.out.println("Area of Rectangle: "+rect.printArea(12.0f, 8.0f));
    }
}
/**
 * Output:
 * Area of Rectangle: 96.0
 */
```

### Execute Public Members Within the Same Package But Outside the Declared Class

Create **Rectangle.java** and **TestRectangle.java** in ***com.company*** package. **TestRectangle.java** contains main method to execute the output in the console.


**Rectangle.java**

```
package  com.company;

public class Rectangle{
  public float printArea(float width, float height){
    return width*height;
  }
}
```

**TestRectangle.java**

Contains main method and please run this class or press (Ctrl + Shift + F10) if you are in IntelliJ Ide.

```
package com.company;

public class TestExample{
  
  public static void main (String[] args)
  {
   //create an object of Rectangle
   Rectangle rect = new Rectangle();
   System.out.println("The Area of Rectangle: "+rect.printArea(12.0f, 8.0f));
   
  }
}
/**
 * Output
 * The Area of Rectangle: 96.0
 */
```

### Execute Public Class And Class Members Outside the Declared Class And From a Different Package

First of all create two classes in two different packages. Rectangle.java in ***com.company.shape*** package and TestRectangle.java in ***com.company.test*** package.


**Rectangle.java**

```
package com.company;
 
 public class Rectangle{
   public float printArea(float width, float height){
     return width*height;
   }
} 
```

**TestRectangle.java** 

Contains main method and it is located in **com.company.test** package.

```
package com.company.test;

public class TestExample{
  
  public static void main (String[] args)
  {
   //create an object of Rectangle
   Rectangle rect = new Rectangle();
   System.out.println("The Area of Rectangle: "+rect.printArea(12.0f, 8.0f));
   
  }
}
/**
 * Output
 * The Area of Rectangle: 96.0
 */
```

We have successfully execute all the above scenarios. Hope this post helps you to understand about the the use of public members of a class.

**Note:** Usually, the root class name that contains main method is public and the members of the class usually private with default constructor, getter and setter methods.

## Key Things to Note About Java Public Modifier
- In java, public access modifier is used for vast accessibility
- Public keyword can be used for declaring class, class members like properties and methods.
- Public members can be accessed within the declared class, outside the declared class, same package or from a different package.
- Inheritance is possible
- Usually, it is recommended to declare the root class as public
