# Final Keyword in Java

In java final keyword is used as a restricted keyword and it can be used declaring class, class data members like properties and methods.

**When class is final:** Can not be used to create subclass. Means inheritance is not possible for final class.

**When class members are final** If any data members are final, they must be initialized at the time of declaration and can not be reinitialized. On the other hand, final methods can not be overridden.

**Note:** As we discussed, class properties which are final must be initialized at the time of declaration. But, they can be empty if there is any parameterized constructor with that property. Only possible not to initialize final data members if there is parameterized constructor available. Such as,

```
final float length; //final property that is not initialized

//need to define parameterized constructor
public Rectangle(float length) {
        this.length = length;
    }
```

## Class that is Final

When a class is final, they can not be used to create subclass. Such as,

Such as,

```
```

## Class Data Members are Final

If class properties are final, they must be initialized at the time of declaration and their value can not be changed or must contain parameterized constructor with that final property if they are not initialized. On the other hand, if methods are final, they can't be overridden.


**Rectangle.java**

```
package com.company;

public class Rectangle {
    //final properties
    final float length = 12.0f;
    final float width = 10.0f;

    //final method
    final float printArea(float length, float width){
        return length*width;
    }
    
    //main method
    public static void main(String[] args) {
        //creating object of Rectangle
        Rectangle obj = new Rectangle();
        
        //accessing final data members
        System.out.println("Length: "+obj.length);
        System.out.println("Width: "+obj.width);
        System.out.println("Area: "+obj.printArea(obj.length, obj.width));
    }
}

/**
 * Output:
 * Length: 12.0
 * Width: 10.0
 * Area: 120.0
 */
```

In case, you forget to initialize the final data members or try to reinitialize them or change their values or try to override the final method, following exception should be thrown. (I checked all them separately)

```
java: variable length not initialized in the default constructor
java: cannot assign a value to final variable length
java: printArea(float,float) in com.company.TestRectangle cannot override printArea(float,float) in com.company.Rectangle overridden method is final
```

## Final Class in Java

If any class is final in java, then that class can not be inherited, means can not not be used to create child class or inheritance is not possible.

Rectangle.java
- final class (doesn't contain main method)

```
package com.company;

final public class Rectangle {
    //final properties
    final float length = 12.0f;
    final float width = 10.0f;

    //final method
    final float printArea(float length, float width){
        return length*width;
    }
}
```

**TestRectangle.java**
- contain method and extends **Rectangle.java** (though it is not possible as Rectangle is final)

```
package com.company;

public class TestRectangle extends Rectangle{

    public static void main(String[] args) {

        //creating object of Rectangle
        TestRectangle obj = new TestRectangle();

        //accessing final data members
        System.out.println("Length: "+obj.length);
        System.out.println("Width: "+obj.width);
        System.out.println("Area: "+obj.printArea(obj.length, obj.width));
    }
}
```

If you now run TestRectangle.java you will definitely get the following error message.

```
java: cannot inherit from final com.company.Rectangle
```

