# Java Private Modifier

Private is an access modifier in java but implies more restrictions than public modifier. 

Usually, private members of a class (either attributes or methods) can only be accessed within the declared class. But, outside the declared class it is not possible directly without public getter and setter methods.

Like, if you have a class A and it contains private data members (properties or methods), then they can only be accessed or executed within the declared class A. But if you try execute them from outside the declared class, like from class B, then you will get error. Like - "{attribute} has private access in package.NameOfYourClass. 

## Execute Private Members Withing the Declared Class

Earlier we describe that, private members of a class can be executed within the declared class but outside the declared class is not possible (Yes, but with public getter and setter methods)


**Rectangle.java**

```
package com.company;

public class Rectangle{
    
    //private properties
    private float length = 12.0f;
    private float width = 10.0f;

    //private method
    private float printArea(float length, float width){ //class member
        return length*width;
    }

    //main method
    public static void main (String[] args) {
        //create an object of Rectangle
        Rectangle obj = new Rectangle();

        //accessing private properties and method
        System.out.println("Length: "+obj.length); //return length of the Rectangle
        System.out.println("Width: "+obj.width); //return width of the Rectangle
        System.out.println("Area: "+obj.printArea(obj.length, obj.width)); //return area of the Rectangle

    }
}
/**
 * Output:
 * Length: 12.0
 * Width: 10.0
 * Area: 120.0
 */
```

## Try to Execute Private Class Members Outside the Declared Class

As already we have mentioned about it that, outside the declared class, the private members of a class can't not be accessed directly without public getter/setter methods. Let's try to access private members without getter/setter outside the declared class.

So, create two classes that, **Rectangle.java** (no main method) and **TestRectangle.java** (contains main method) and both are in same package like **com.company** package.

**Rectangle.java**

Contains only private data members, but no main method.

```
package com.company;

public class Rectangle{

    //private properties
    private float length = 12.0f;
    private float width = 10.0f;

    //private method (manually have to define getter and setter)
    private float printArea(float length, float width){
        return length*width;
    }
}
```

**TestRectangle.java**

Contains main method and we have to execute this class in order to get the desired output.

```
package com.company;

public class TestRectangle {

    //main method
    public static void main(String[] args) {

        //create an object of Rectangle
        Rectangle obj = new Rectangle();

        //accessing private properties and method
        System.out.println("Length: "+obj.length); //return length of the Rectangle
        System.out.println("Width: "+obj.width); //return width of the Rectangle
        System.out.println("Area: "+obj.printArea(obj.length, obj.width)); //return area of the Rectangle

    }
}
```

Possible to get one of the following error messages in the console after running **TestRectangle.java**

```
java: length has private access in com.company.Rectangle //this error message will print only though
java: width has private access in com.company.Rectangle
java: printArea has private access in com.company.Rectangle
```


## Execute Private Class Members Outside the Declared Class Through Public Getter and Setter Methods


So, we can now assume and it is clear to us that private data members of a class either properties or methods (ide doesn't support getter/setter for private methods usually) can not directly be accessed outside the declared class. So, ***how to access private data members from a different class or outside the declared class?***

> The answer is, through public **getter/setter** methods. Getter and Setter are special accessor methods that helps us to set the value of the private data members only properties and get or read the value of the private data members.

**Note:** There is no way to define public getter and setter for private method in java from IntelliJ Ide. Thus, create them manually, and better to know, methods should be public always, but for this demo post, it is okay.


Let's Update **Rectangle.java** with public getter and setter accessor methods. Creating getter and setter methods for your private data members (only for properties) in IntelliJ IDE is very easy process. Open **Rectangle.java** and right click -> Generate -> Getter and Setter -> Select All -> Click Ok or (type: Alt+Insert altogether)


**Rectangle.java**

```
package com.company;

public class Rectangle{

    //private properties
    private float length = 12.0f;
    private float width = 10.0f;

    //private method
    private float printArea(float length, float width){ //method should be public
        return length*width;
    }

    //public getter and setter methods
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    //manually create public getter/setter for printArea() method
    public float getPrintArea(){
        return length*width;
    }
    public void setPrintArea(float length, float width){
        this.length = length;
        this.width = width;
    }
}
```


**TestRectangle.java**

Contains main method and use the getter/setter accessor methods to access the private properties value.

```
package com.company;

public class TestRectangle {

    //main method
    public static void main(String[] args) {

        //create an object of Rectangle
        Rectangle obj = new Rectangle();

        //access getter and setter
        float length = obj.getLength();
        float width = obj.getWidth();

        obj.setPrintArea(length, width); //set width and height
        float printArea = obj.getPrintArea(); //access through getter method

        //accessing private properties and method
        System.out.println("Length: "+length); //return length of the Rectangle
        System.out.println("Width: "+width); //return width of the Rectangle
        System.out.println("Area: "+printArea); //return area of the Rectangle

    }
}
```

If you now run the above **TestRectangle.java** class, you will get the following output:

```
Length: 12.0
Width: 10.0
Area: 120.0
```

It means, we have successfully access private data members outside the declared class through public getter and setter methods. 


## Set the Value of Private Data Members

The public setter method is used to set the value of private data members (like class properties) of a class. The below example will describe this.


**Rectangle.java**

```
package com.company;

public class Rectangle{

    //private properties and they are not initialized
    private float length; //value should be provided through setter method
    private float width; //value should be provided through setter method

    //public method
    public float printArea(float length, float width){ //method should be public
        return length*width;
    }

    //public getter and setter methods
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    
    //manually create public getter/setter for printArea() method
    public float getPrintArea(){
        return length*width;
    }
    public void setPrintArea(float length, float width){
        this.length = length;
        this.width = width;
    }
}
```


**TestRectangle.java**

```
package com.company;

public class TestRectangle {

    //main method
    public static void main(String[] args) {

        //create an object of Rectangle
        Rectangle obj = new Rectangle();

        //using setter for set the value of length and width
        obj.setLength(12.0f);
        obj.setWidth(10.0f);

        //using getter for read the value of length and width
        float length = obj.getLength();
        float width = obj.getWidth();

        obj.setPrintArea(length, width); //set width and height
        float printArea = obj.getPrintArea(); //access through getter method

        //accessing private properties and method
        System.out.println("Length: "+length); //return length of the Rectangle
        System.out.println("Width: "+width); //return width of the Rectangle
        System.out.println("Area: "+obj.printArea(length, width)); //return area of the Rectangle

    }
}
/**
 * Length: 12.0
 * Width: 10.0
 * Area: 120.0
 */
```


Hope this post is very helpful to understand how to access private data members within or outside the declared class.

If any error found, please inform me: [twitter.com/shakilmith](https://twitter.com/shakilmith)

## Key Things to Note About Private Modifier
- Private is a Restricted Access Modifier in Java
- Class and class members can be private
- Private members can be accessed within the declared class
- Outside the declared class, private members can not be accessed without public getter and setter accessor methods
- If class is private, then it can not be used for inheritance
- If class members like properties or methods are private, they can not be accessed outside the declared class without public getter and setter accessor methods
- If constructor is private, then we can not instantiate or create instance variable of that class
