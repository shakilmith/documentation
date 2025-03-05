# Java Inheritance

In this post, we will describe what is java inheritance and how we can implement it in our application.

Inheritance means, acquiring assets (properties, methods etc.) or behaviours of parent class. We can use easier concept like, you get properties or assets from your father, and he got from his father or when you get assets from you ancestors then it is called inheritance and the properties are called inherited.

Such as, java class B and C are allowed to access data members (either properties or methods) of class A, then B and C are called derived class and class A is called Parent class. And how they are combined, is called inheritance. In short, parent, child relationships.

I think you can now easily understand what inheritance, inherited, parent or child (children in the plural form) classes are so called.

The popular use of inheritance is code reusability. Yes, you find many features of inheritance easily. Hence, I mean, define code once and reuse it in multiple other classes. Such as, You have three classes, all have same common data members (either properties or methods).

Such as, a Rectangular class may have properties like, length and width and similarly Squire class may have properties like length and Circle class may have properties like radius. But undoubtedly, all three classes have properties like color, borderStyle and method like getArea() etc. 

Let's see an example without using the inheritance concept.

```
//Rectangle.java
public class Rectangle {
    public double length;
    public double width;
    public String color;

    //method
    public double getArea(){
        return length*width;
    }

    //constructors
    //getter & setter methods
}

//Square.java
public class Square {
    public double length;
    public String color;
    //method
    public double getArea(){
        return length*length;
    }

    //constructors
    //getter & setter methods
}

//Circle.java
public class Circle {
    public static double PI = 3.1416;
    public double radius;
    public String color;

    //method to get area
    public double getArea(){
        return PI*radius*radius;
    }

    //constructors
    //getter & setter methods
}
```

Okay, by looking all of the above classes, do you see any common properties and methods, and you think, you should reuse them, upon declaring once? 

Yes, the color, and getArea() data members should not be there three times, and yes we can write better code for this.


Such as, we create a supper class with the common attributes, methods that may be appeared in sub classes. 

**Note:** Usually, the the super class is abstract or interface.

```
//parent class (super class that will be extended)
public class Shape {
    String color;

    double getArea(double x, double y) {
        return x * y;
    }
}

//Rectangle.java (child class)
public class Rectangle extends Shape{
    public double length;
    public double width;

    //constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

//Square.java (child class)
public class Square extends Shape {
    public double length;
    
    //constructor
    public Square(double length){
        this.length = length;
    }
}

//Circle.java (child class)
public class Circle extends Shape{
    public static double PI = 3.1416;
    public double radius;
    
    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }
}
```

Here, you can see all the three classes like Rectangle.java, Circle.java and Square.java extends Shape.java class. It means, all the three classes now access the data members of Shape class (parent class) and you do not need to rewrite the same line of code like color, and getArea() method again.

So, let's create another TestExample.java class that contains main method and see how those child access the parent class members.

**TestExample.java**

```
public class TestExample {
    public static void main(String[] args) {
        //create an object of Rectangle class
        Rectangle rect = new Rectangle(10.5, 8.5);
        rect.color = "Green";
        System.out.println("Rectangle color: "+rect.color);
        System.out.println("Area of Rectangle: "+rect.getArea(rect.length, rect.width));

        //create an object of Circle class
        Circle  circle = new Circle(5.8);
        circle.color = "Red";
        System.out.println("Circle color: "+circle.color);
        System.out.println("Area of Rectangle: "+Circle.PI * (circle.getArea(circle.radius, circle.radius)));

        //create an object of Square
        Square square = new Square(10);
        square.color = "Orange";
        System.out.println("Square color: "+square.color);
        System.out.println("Area of Rectangle: "+square.getArea(square.length, square.length));
    }
}
```

If you now run **TestExample.java** class, if everything is okay, you will get the following result in the console.

```
Rectangle color: Green
Area of Rectangle: 89.25
Circle color: Red
Area of Rectangle: 105.683424
Square color: Orange
Area of Rectangle: 100.0
```

So, you can see here, we did not write or getArea() method in our child classes but we extend parent class Shape.java to access the common properties in the child classes.

Hope, you can simply guess for code reusability, better code maintenance we use inheritance mechanism in java.

## Key things to note about Java Inheritance

- We use extends keyword to pass the functionality from super (parent) class to child classes (derived or sub classes)

- Java supports single inheritance. It means a class (sub class) can only inherit from only one super class. But a class can implement multiple interfaces.

- By default, child class can access all the non private members of the parent class. But in order to access the private members of the parent class, private or protected methods required of the parent class.

- In order to access super class constructor in the sub class constructor, we have to use super() keyword. The super() keyword can access super class constructor, methods, fields as well.

- A subclass can override a method of the superclass using the @Override annotation. But method signature should be same.

- A final class can not be inherited.

- 