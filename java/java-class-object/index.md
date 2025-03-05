# Java Class and Object

In this post, we are going to learn what is java class and what is java object. If you are a beginner or start to learn OOP language like Java, then it is very essential to know what are Java objects and class and the combination between them.

**Java Class:** Actually, every java file start with a class, either it is public or private. Class means here a structure on which you are going to work on. Class may have properties and behaviors. Here properties mean, fields or attributes and behaviors mean methods or functions that actually do some actions upon calling.

Such as, if you have class called Product and it may have some properties like product name and price and a method like calculatePrice, displayProductInfo then the program would be

```
public class Product {
    static String name = "Laptop Computer";
    static int price = 1100;

    //method display product info
    public static void displayProductInfo(){
        System.out.println("Name "+ name);
        System.out.println("Price "+price);
    }

    public static void main(String[] args) {
        System.out.println("Name: "+name);
        System.out.println("Price "+price);

        //call the method
        displayProductInfo();
    }
}
```

Here, static means the properties (name and price) and method (displayProductInfo()) are belong to the class itself, not to the instance of the class. We have to know that instance means reference or object of a class.

So, here, class **Product** refers that, we are going to talk about any product that can be sold or bought or share! or anything that has logical reference. And the members of the Product class refers that what it contains and how we get benefitted by this.

So, you can consider anything around you as a class those have logical entities like properties or behaviors/methods.

Like, your computer, book or even mobile phone can be a class because all of them has properties or methods. Such as, the Book class may have properties like name, price, author, genre, publisher, ISBN and methods like showColor(), calculatePrice(), isAvailable() etc.

In real life, the role of the class is to define something that you are going to work on. It definitely is not your Main.java or HelloWorld.java class file and absolutely define specific purposes.

**Object of a Class:** As we know already, class is the blueprint of creating objects. Thus, object of a class is like display the functionality of a class. We say basically object is the instance (or result) of a class and helps to represent actual data of the class.

For simplicity, I can say, if your class members are not static then you have to create an object of that class to access the data members of your class. Like,

```
public class Product {
     String name = "Laptop Computer";
     int price = 1100;

     public static void main(String[] args) {
        System.out.println("name: "+name);
        System.out.println("Price +"+price);
     }
}
```

If you run the above Java file, you get the following compile time error.

```
Cannot make a static reference to the non-static field name
Cannot make a static reference to the non-static field price
```

Because, name and price are non static data members and can not be accessed from a static context like from main method without creating instance of that class. So, here name and price attributes are instance variables. In other words, we can say, name and price are the instance of the class as they are not static. Thus, we have to create object of the Product class to access them. Such as,

```
public class Product {
     String name = "Laptop Computer";
     int price = 1100;

     public static void main(String[] args) {
        //crating object of the Product class
        Product obj = new Product();

        System.out.println("name: "+obj.name);
        System.out.println("Price: "+obj.price);
     }
}
```

If you now run again the **Product.java** class, it now produce the following result without any error.

```
name: Laptop Computer
Price: 1100
```

So, it is now clear that, when we need to access static members of a class, we do not need to create an instance (object) of that class. But in order to access non static members, we have to create object of that class. You can also note that (for simplicity), all non static members are called instance variable, then it will be very easy to remember what you have to do to access them.

So, in short, I am going to write the purpose of a class and object in Java like programming Languages.

**Purpose of a Class:** It is called the blueprint of objects that helps to design objects. A class may contain properties or attributes, methods, constructs. Note that, class itself is not an object but it helps to create many objects.

Such as, Shape is a class and it may have properties like length, width and may have methods like printArea(), drawShape() etc.

And yes, you can create many objects of it like rectangle, circle, ellipse etc.

**Purpose of an Object:** Object is called the instance a class which is physical by default. It basically shows the functionality of a class and contains actual data of the class. When you create an object of a class, you basically allow it to access the data members of that class or access the blueprint of that class. So, in the meantime we can say, objects are the main thing of a java class. If you do not have object, you can not show or access the blueprint (attributes, methods) of the class. Such as, it's like building a house using a blueprint — you can create many houses (objects) from the same blueprint (class), each with its own characteristics (state).
