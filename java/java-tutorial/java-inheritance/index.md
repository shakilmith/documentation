# Java Inheritance

Inheritance means acquiring the features of another class. It's the concept of creating parent, child relationship among classes. Guess, you have a class A and a derived class called B. Now the the derived class has the ability to access the class members of A. Another way we can say, the child or derived class is now acquired the data members of the parent class. In this case A is super or parent class and B is child or derived class. To make a class as a child class, we use ***extends*** keyword. We use extends keyword to make a child or derived class.

**Parent Class:** Parent or super class is the class that is used to create child class and expand it's features amongst child classes.

**Child Class** Child or derived class is the class that get's authority to access the parent class members, unless implies restrictions.


**Syntax**

```
class A{ // parent class
  //data members
}

class B extends A{ // child class
  //acquired the data members of A
  //own data members
}
```

**Note:** When you create the subclass using extends keyword, then the child class gets the ability to access or execute the parent class members. It means, child class is now owns the parent class data members as well as it's own data members.


## Example of Inheritance Strategy

```
//parent class (the class that is used to create child class)
public class Shape {
    public int getArea(int length, int width){
        return length*width;
    }
}

//child class (the class that is derived from parent class and acquires it's data members)
public class Rectangle extends Shape{

    public static void main(String[] args) {
        //it now acquires the method of Shape class
        int length = 18; //data members of Rectangle class
        int width = 12; //data members of Rectangle class

        Rectangle obj = new Rectangle(); //creating object of Rectangle class to access the non-static data members

        int areaOfRectangle = obj.getArea(length, width); //access the data member of Shape class

        //print the area of Rectangle
        System.out.println("Area of Rectangle: "+areaOfRectangle);
    }
}

/**
 * Output:
 * Area of Rectangle: 216
 */
```

## Another Example of Inheritance

```
class Bank{
   public float rateOfInterest(float x){
     return x;
   }
}
 
//child class 
class PNC extends Bank{
   String bankName = "PNC Bank";
}
 
//child class
class TD extends Bank{
   String bankName = "TD International";
}
  
class SBM extends Bank{
    String bankName = "SBM Bank";
}
   
class BMO extends Bank{
    String bankName = "BMO Bank";
}
    
//main class file (create a new file)
public class TestExample{
    public static void main (String[] args) {
        
    //create of objects of
    //all the banks
    PNC pnc = new PNC();
    TD td = new TD();
    SBM sbm = new SBM();
    BMO bmo = new BMO();
        
//print the data members
System.out.println("Bank Name: "+pnc.bankName + "Interest Rate: "+ pnc.rateOfInterest(15.00f)+"%");
        
System.out.println("Bank Name: "+td.bankName + "Interest Rate: "+ td.rateOfInterest(10.45f)+"%");
       
System.out.println("Bank Name: "+sbm.bankName + "Interest Rate: "+ pnc.rateOfInterest(12.00f)+"%");
       
System.out.println("Bank Name: "+bmo.bankName + "Interest Rate: "+ pnc.rateOfInterest(8.75f)+"%");
       
    }
}

/**
 * Output:
 * Bank Name: PNC BankInterest Rate: 15.0% 
 * Bank Name: TD InternationalInterest Rate: 10.45% 
 * Bank Name: SBM BankInterest Rate: 12.0% 
 * Bank Name: BMO BankInterest Rate: 8.75 %
 */
```

The above example shows you the feature of inheritance in java, and how a child can acquires the data members of parent class using the inheritance strategy.

One more thing to notice that, the same parent class can also be used to multiple child classes, thus all of the child class that is retrieved from this parent class, can also acquires the behaviors or data members of this parent class. Overall, in java, inheritance strategy (parent/child relationship) gives the programmers opportunity to reuse the features of parent class amongst child classes.

**Key things to note about Inheritance in Java**

- Inheritance is used to reuse code blocks parent to child classes.
- To make child class, you have to use extends keyword.
- When a child class derived from any parent class, then it acquires the data members of the parent class, but the child class may contain it's own data members.
- In java multiple inheritance is not possible (as it creates ambiguity) but multiple implementation is possible (discuss in interface chapter)
- To make the program more maintainable and reuse code blocks amongst multiple classes, inheritance is used.


