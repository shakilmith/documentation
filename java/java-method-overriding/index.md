# Method Overriding in Java

Method overriding means using the same method name in the subclass with different implementations. In this case, there creates a possibility to reuse the same code blocks in the hierarchy of inheritance (in child class). Besides, the overriding methods usually have it's own functionality but share the same method name.

**Syntax**

```
public class A {
    //superclass method
    void printDemoMessage(){
        System.out.println("Hush Hush, Hush!");
    }
}

//subclass
public class B extends A{

    @Override
    void printDemoMessage(){
        System.out.println("Bla, Bla, Bla!");
    }
}
```

Here, class **A** contains a method called **printDemoMessage()** and we override it in the subclass **B**. But, both method names are same but with different implementation. 


## Example of Method Overriding

In the following example we will show you a simple example of method overriding. Such as,


```
//super class
public class Device {
    void showPrice(int price){
        System.out.println("Device price "+price);
    }
}
//two inherited class
public class Computer extends Device{
    @Override
    void showPrice(int price) {
        System.out.println("The price of Computer is: "+price);
    }
}
public class Laptop extends Device{
    @Override
    void showPrice(int price) {
        System.out.println("The price of Laptop is: "+price);
    }
}
//class that contains main method
public class TestExample {
    public static void main(String[] args) {
        Computer obj1 = new Computer();
        Laptop obj2 = new Laptop();

        //invoke each overridden methods
        obj1.showPrice(1000);
        obj2.showPrice(1200);
    }
}
```

If you now run the **TestExample.java** class, you will get the following output.

```
The price of Computer is: 1000
The price of Laptop: 1200
```

Here you can see, how we have reused the same method name in different subclasses but with different implementation.


## Another Example of Method Overriding

Let's see another method overriding example where we print the area of shapes like rectangle, circle or squire etc. without defining method for each, means using reuse the same method name.

**Shape.java** Parent class
```
//super class (usually it is abstract class or interface)
public class Shape {
    void getArea(){
        System.out.println("We are going to get the area of different shape.");
    }
}
```

Three subclass that overrides the method of Shape superclass are following.

**Rectangle.java** (sub class)

```
public class Rectangle extends Shape {

    float length; //it is not initialized
    float width; //it is not initialized

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void getArea(){
            System.out.println("Area of Rectangle is: "+length*width);
    }
}
```

**Circle.java** (sub class)

```
public class Circle extends Shape{
    static final float PI = 3.1416f;
    float radius;

    public Circle(float r) {
        this.radius = radius;
    }

    @Override
    void getArea() {
        System.out.println("Area of Circle is: "+PI*radius*radius);
    }
}
```

**Squire.java** (sub class)

```
public class Squire extends Shape{

    int length;
    
    public Squire(int length) {
        this.length = length;
    }

    @Override
    void getArea() {
        System.out.println("Area of Square is: "+length*length);
    }
}
```

Here, three sub classes override parent class method - getArea(), means use the parent class functionality without defining another method, do the same type of tasks.

Now, we need a class that contains main method to execute the overridden methods and print the result to the console.

**TestExample.java** (this class contains main method to execute our program)

```
public class TestExample {
    public static void main(String[] args) {
        //define objects of Rectangle, Circle, Squire
        Rectangle obj1 = new Rectangle(15.0f, 12.0f);
        Circle obj2 = new Circle(8.0f);
        Squire obj3 = new Squire(10);

        //print the area of each shape
        obj1.getArea();
        obj2.getArea();
        obj3.getArea();
    }
}
```

If you now run the **TestExample.java** class you will get the area of each shape.

```
Area of Rectangle is: 180.0
Area of Circle is: 0.0
Area of Square is: 100
```

**Note:** Usually, the parent class is being abstract class or interface to secure reusing the methods of the super class. And the overridden methods must have the same signature like return type, name or parameters should be same like parent class method.

## The Necessity of Using the Concept of Method Overriding

- It helps the subclass to reuse the parent class method
- It allows subclass to provides it's own method implementation
- Enhance performance by reusing the same method name multiple times
- It helps developers to write more maintainable and cleaner code
- Achieves runtime polymorphism