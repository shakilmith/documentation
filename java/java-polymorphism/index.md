# Java Polymorphism


Polymorphism means many forms. When there is a hierarchy or relation between classes then it is called polymorphism in java.

Polymorphism in java can be achieved through inheritance. I mean making parent child relationships. If you are aware about inheritance concept in java, then it will be very easy to understand polymorphism.

Look at the below example of class hierarchies:

```java
class Device {
  public void guessSize(){
    System.out.println("Device may have different sizes!");
  }
}

class Computer extends Device{
  public void guessSize(){
    System.out.println("The size of computer device usually big.");
  }
}

class Laptop extends Device{
  public void guessSize(){
    System.out.println("Laptop computer is smaller one.");
  }
}
class Mobile extends Device{
  public void guessSize(){
    System.out.println("You can carry a mobile phone in hand or pocket.");
  }
}

public class TestExample{ //must be file name
  public static void main (String[] args) {
    //create objects of device and subclasses 
    Device device = new Device();
    Device computer = new Computer();
    Device laptop = new Laptop();
    Device mobile = new Mobile();
    
    //execute the methods
    device.guessSize();
    computer.guessSize();
    laptop.guessSize();
    mobile.guessSize();
  }
}
```

If you now run the class that contains main method, I mean TestExample.java, you will get the following result.

```
Device may have different sizes!
The size of computer device usually
big
Laptop computer is smaller one.
You can carry a mobile phone in hand or pocket.
```

By using the concept of polymorphism or separate our class definition into parent and child, we enable to reuse the same method among three classes without defining method for each subclass. It's called method reusing or method overriding.

## Why Polymorphism Necessary

- For code reusability
- Define code once, and reuse it many times within related classes
- Enhance the ability reuse the attributes, methods among sub classes
- In order to build inheritance or making parent child relationship
- Improve readability and code maintenance 
- Construct secure and maintainable application
- Expand the behaviours of super class and reveal the super class facilities through its's subclasses etc.

