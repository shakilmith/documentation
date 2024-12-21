# Java Interface

In java, interface is 100% abstract class. All the data members of an interface are abstract by default.

**Interface attributes:** Attributes are public, static, final of an interface by default. You can't change or reinitialize the interface attributes. Even, it is not possible to create object of an interface.

**Interface methods:** Methods of an interface public, abstract by default. Thus the method can't have body. The method body will be provided by the subclass. Even, you don't need to use abstract keyword externally to make the method abstract.

**Creating objects:** Interface can't be used to create objects. For this reason, interface doesn't contain constructor.

**Method implementation:** All the method of an interface (1, 2, 3...) must be implemented or overridden in the implemented class. Instead of extends keyword, we have to use implements keyword when we create subclass of an interface.

**Syntax**

``` 
interface A { //name of interface
  //data members
  
  /**
   * By default
   * attributes are public, static, final
   * methods are public and abstract
   */
}
```

## Example of Interface in Java

Let's say, we have an interface called Device and it has an abstract method (abstract keyword isn't required) called showName(). The method body will be provided by the subclass or implemented class in general form.

```
public interface Device {
    public void showName(); //the method body will be provide by the subclass
}

//TestClass that contains main method
public class TestClass implements Device {
    @Override
    public void showName() {
        System.out.println("This is desktop");
    }

    public static void main(String[] args) {
        //creating object
        TestClass obj = new TestClass();
        obj.showName();
    }
}

/**
 * Output:
 * This is desktop
 */
```

**Note:** The default method which is abstract method in general, must be overridden in the implemented class and provide the method body.


## Another Example of Interface in Java

```
interface Shape{
    //method that return the area of any shape
    float printArea(float width, float height); //abstract method, so doesn't have body
}

//implemented class
class Rectangular implements Shape{
    //override printArea() method
    @Override
    public float printArea(float width, float height) {
        return width*height;
    }
}

//second implemented class
class Square implements Shape{
    //override printArea() method
    @Override
    public float printArea(float width, float height){
        return width*height;
    }
}

//third implemented class
class Circle implements Shape{
    //override printArea() method
    static float PI = 3.1416f;
    @Override
    public float printArea(float width, float height){
        return width*height*PI;
    }
}

//TestClass that contains main method
public class TestClass{

    public static void main(String[] args) {
        //create the objects of implemented class
        Rectangular rect = new Rectangular();
        Square sq = new Square();
        Circle c = new Circle();

        //print the area of the shapes now
        System.out.println("Area of Rectangular is: "+ rect.printArea(12.00f, 8.00f));
        System.out.println("Area of Square is: "+sq.printArea(15.00f, 15.00f));
        System.out.println("Area of Circle is: "+c.printArea(8.00f, 8.00f));
    }
}
/**
 * Output:
 * Area of Rectangular is: 96.0
 * Area of Square is: 225.0
 * Area of Circle is: 201.0624
 */
```

## Real World Example of Interface in Banking System



```
interface Bank{
  float rateOfInterest();//abstract and public by default
}


//first implemented class
class SBI implements Bank{
  //override the rateOfInterest method
  
  @Override //not necessary to annotate
  public float rateOfInterest(){
    return 5.56f;
  }
}

//second implemented class
class PNC implements Bank{
  //override the rateOfInterest method
  
  @Override //not necessary to annotate
  public float rateOfInterest(){
    return 8.00f;
  }
}

//third implemented class
class TDI implements Bank{
  //override the rateOfInterest method
  
  @Override //not necessary to annotate
  public float rateOfInterest(){
    return 9.50f;
  }
}


//TestClass that contains main method
public class TestClass{
  public static void main (String[] args) {
    //Create objects of the sub classes or implemented classes
    SBI sbi = new SBI();
    PNC pnc = new PNC();
    TDI tdi = new TDI();
    
    //invoke the rateOfInterest method
    System.out.println("SBI interest rate is: "+sbi.rateOfInterest() +"%");
    System.out.println("PNC interest rate is: "+pnc.rateOfInterest() +"%");
    System.out.println("TD interest rate is: "+tdi.rateOfInterest() +"%");
  }
}

/**
 * SBI interest rate is: 5.56%
 * PNC interest rate is: 8.0%
 * TD interest rate is: 9.5%
 */
```


**Note:** When you override the interface default method which is public and abstract by default, must be public otherwise following error will be thrown:

```
attempting to assign weaker access privileges was public
```

It means, as the default method is public and abstract in the interface, thus you should add the public keyword when you override the method. Otherwise the compiler thinks it as a default method. Remember, when you don't use any access modifier for your methods then they will be default method (default implies more restrictions than public method)


**Why we should use interface in java?**

- To achieve security. Interface makes our program more secure. It works almost like a simple pojo java class. But provides restrictions on such thinks automatically. Interface makes our code more secure by hiding internal details and showing only functionality. Such as, you send a message to your friend and he gets the message and responds you. Both of you really don't need to know how this happens (message transmission). Interface works almost like this.

- Like, in the above example, Bank is the interface and it contains a method called ***rateOfInterest()***. This is an empty method and there is no way to implement this method without using the implemented class. It means that, only the implemented class can see it.

We can understand more interesting way interface concept is that, like though you are a citizen of X country, but you can only vote if you are at least 18 or above.

Another example could be, you can only enter or participate in the weeding party if you have invitation card.

Sorry, I want to add another example. Like, you have an account in X online banking platform like including thousands. But you can't see the balance of other user's right. So, the program could be like this, by assigning account number (somehow username, ids, mobile number etc.) he/she/you can see the balance if yours/his/her.


**Key things to note about interface in Java**
- Interface is 100% abstract class thus all the methods in it are public and abstract by default. But it is possible to create non-abstract method as well.
- Abstract keyword is implicitly added to the default method of any interface.
- The subclass or implemented class should use implements keyword than extends keyword.
- The subclass or implemented class must override all the default abstract methods of any interface and the method should be public.
- Interface can't contain main method thus, no constructor allowed.
- Interface attributes by default public, static an final, so value can't be changed.
- Interface attributes must be initialized while declaration.
- Interface can't be used to create objects.
- To make our program more secure and maintainable, interface is used.
