# Java Abstract Class

In java abstract class is a regular java class but implies few restrictions over class members. Abstract class should contain ***abstract keyword*** when defining abstract class. 

**Syntax** 

```
abstract class A{...}
```

***Why should we need abstract class in java?***

>Sometimes we don't want to reveal the internal details to our users than only show the essential functionality, in this case we need to create abstract class.
Such as, we send a message to someone and he/she receives the message but both parties don't need to know the internal message transmission policy.

>Another example may be, we buy something from an online shop and pay the bill through credit or debit card. User's don't need to know what's going on behind the scene.(means, the internal functionality of credit or debit cards or transaction system)

The abstract class may contain ***fields (variables)***, ***abstract*** or ***non abstract methods*** as well. Even constructor or static methods too. But the method body will be provided by the implemented class.

**Points to note about Abstract class:**
- An abstract class must be declared with the abstract keyword. 
- It may contain abstract or non abstract methods, fields, constructors etc. (class members)
- Even, an abstract class may contain final data members like final methods.

## Declaring Abstract Class

```
abstract class A(){
//abstract or non abstract members
}
```

**Note:** Abstract methods don't have body. The body will be provided by the implemented class. Also note that, the inherited or implemented class can't be abstract then.


## Example of Abstract Class

In this example, we have an abstract class Car and it contains abstract method drive. The method should be empty and the method body will be provided by the implemented class.

```
abstract class Car{
    //abstract method: doesn't have body
    abstract void drive();
  }
  
  //now create a main class file
  public class Main extends Car{
    //override the abstract method here
    @Override 
    public void drive(){
      System.out.println("Drive slowly!")
    }
    
    public static void main(String [] arg){
      
      //create an object of the Main class now
      Main obj = new Main();
      obj.drive();
      
    }
  }

/**
* Output:
* Drive Slowly!
*/
```

**Note:** We must extend the abstract class in the implemented class (in our case, Main class) in order to access it's members. Also in order to provide the abstract method body, we have to override it. 


## Another Example of Abstract Class

```
abstract class Car{
  //create an abstract method
  //the method doesn't have body
  abstract int showPrice();
}


//now create three more public classes
//that extends Car class (surly in different files)

public class Volvo extends Car{
  //override the showPrice() method here
  @Override
  public int showPrice(){
    return 8500;
  }
}

//Create a class called Maruti
public class Maruti extends Car{
  //override the showPrice() method here
  @Override
  public int showPrice(){
    return 12300;
  }
}

//create a subclass called Mustang
public class Mustang extends Car{
  //override the showPrice() method here
  @Override
  public int showPrice(){
    return 15000;
  }
}

//now create the main class file.
//it should be public and contains
//main method
public class TestClass{
  public static void main(String[] args){
    
    //Create objects of the above three 
    //child classes to access the
    //showPrice() method
    
    Volvo volvo = new Volvo();
    Maruti maruti = new Maruti();
    Mustang mustang = new Mustang();
    
    System.out.println("The price of Volvo is "+ volvo.showPrice() +"$");
    System.out.println("The price of Maruti is "+ maruti.showPrice() +"$");
    System.out.println("The price of Mustang is "+ mustang.showPrice() +"$");
  }
}
/**
 * Output:
 * The price of Volvo is 8500$
 * The price of Maruti is 12300$
 * The price of Mustang is 15000$
 */
```

## Abstract Class May Contain Variables

Abstract class may also contain static and non static variables as well. Accessing static variables, don't need to create object but accessing non-static variables we have to define object of the implemented class first.

```
abstract class A{
    static int x = 10; //static variables
    int y = 100; //non static variables
}


public class Main extends A {
    public static void main(String[] args) {
        //creating object 
        Main obj = new Main();
        System.out.println(x); //accessing static variables
        System.out.println(obj.y); //accessing non-static variables
    }
}

/**
 * Output:
 * 10
 * 100
 */
```

**Note:** Abstract class may also contain final variables as well. If a variable is final of any abstract class, then the implemented class can't change or override it's value.


## Abstract and Non Abstract Methods

Abstract class may contain abstract and non-abstract methods as well. But the difference is that, the abstract methods don't have body (the method body will be provided by the implemented class, and must be..) and non-abstract methods have body.

```
abstract class Apple{
    abstract void showPrice(); //abstract method doesn't contain body
    void showQuality(){ //non-abstract method must contain method body
        System.out.println("The quality of Apple is good.");
    }
}


public class Main extends Apple { //extended the Apple abstract class

    @Override
    void showPrice() {
        System.out.println("The price of Apple is: "+ 150 +"$");
    }
    public static void main(String[] args) {
        //creating object
        Main obj = new Main();
        obj.showPrice(); //abstract method
        obj.showQuality(); //non-abstract method
    }
}
/**
 * The price of Apple is: 150$
 * The quality of Apple is good.
 */
```

**Note:** Abstract method must be overridden in the implemented class, and it is required term.



### Key things to note about Abstract class in Java
- Abstract class must be declared using the abstract keyword
- Abstract class is not 100% restricted class like interface
- Abstract class may contain abstract, non-abstract methods and final methods
- Abstract class may contain constructor too.
- The abstract methods don't have method body, the method body will be provided by the implemented/extended class
- It is required to override the abstract method in the implemented class unless the implemented class abstract itself.
- Abstract class may contain static, non-static and final variables as well.
  - static means, don't need to create object to access abstract variables.
  - non-static means, object or reference variable is required to access them.
  - final means, can't change their value.


