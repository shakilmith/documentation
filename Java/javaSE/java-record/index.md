# Java Record Type


JDK 14 introduces java record type. It is a restricted form of a class unlike regular java class. The record members are called components (you can say, attributes though) and they are private and final by default. Even, the record class is implicitly a final class. Thus, inheritance is not possible for a record type. Also note that, as all the members of a record are final, they are immutable or non modifiable by default. As record is a special java class, provides few more features including predefined restrictions, but treat like a regular java class. You can create a new instance of a record by using the new keyword and initialize the data members (components) of a record type.

## Creation of a record

The syntax of creating a record is very simple.

Just use a record keyword followed by the name of a record. The record components should be declared at the time of creating a record, inside the parentheses (Like struct in C++). A record can also contains additional attributes, but they must be static, methods (can be public, private, static or non static).

**Syntax:**

```
public record NameOfRecord (p1, p2, p3){ //creating a record type with 3 components 
  //code-block
}
```


Here, the NameOfRecord (such as, Person, Rectangle etc.) is the name of a record and inside the parentheses p1, p2 and p3 are components (you can say attributes) of this record. The components are **private**, **final** by **default.**

Remember that, in java, record class provides few things implicitly. Thus you don't need to create them, but overriding is possible if you want to acquire more control over the record components.

The predefined features of a record are:

- A public constructor to initialize the record components.
- A public read accessor method (not write) like getter to access the record components.


**Syntax:** the name of the component followed by parentheses or only the name of the component. If your record contains length component then the read accessor method would be: length() or length; but getLength() also possible if you define external methods.
- You can override the default implicit constructor. Then it will be called canonical constructor. That is also used to initialize the record components. The signature of the constructor should be the record components signature. Even the number of parameters also have to be same.

Such as:

```
public Rectangle (){ //override the implicit default constructor 
    this.length = length;
    this.width = width; 
}
```

- You can also define compact constructor to do more things with your record components. But the compact constructor syntax is like a class.

Such as:

```
public Rectangle { //compact constructor

//Not possible to reinitialize the record
//components here 

 //if condition
    if((length <= 0) && (width <= 0){
      throw new IllegalArgumentException("Length and Width can't be 0 or less");
    }
}
```

- Unlike default full blown constructor and read accessor methods, a record also implicitly generates equals, hashCode and public toString() methods too. Thus you don't need to declare them externally in a record class, but if necessary you can override all the default behaviors of a record type.


## A simple java record example

First of all create a record class Rectangle.java and create Main.java that contains the main method. Both class or file will be in the same package.

The Rectangle.java record class:

```
package com.company;

public record Rectangle(int length, int width){
  
  //this Rectangle record class
  //contains implicit constructor with all the record components
  //get accessor methods
  //equals, hashcode and toString methods
  //You can also override them too
}
```

The Main.java class (contains main method)

```
package com.company;

public class Main{
  public static void main (String[] args){
    
    //creating an instance of Rectangle class 
    Rectangle rect = new Rectangle(10, 8);
    
    //access length and width using the get accessor method
    
    System.out.println("Length is: "+ rect.length());
    System.out.println("Width is: "+ rect.width());
    
    //multiply length and width
    int area = rect.length() * rect.width();

    //rect.length*rect.width; will also work
    
    //print the area of Rectangle
    System.out.println("Area is: "+area);
    
  }
}
```

You get the following output in the console when you run Main.java file.

```
Length is: 10
Width is: 8
Area is: 80
```
## Let's see how to override or declare the canonical constructor, compact constructor.

**Note:** Either you can declare compact or canonical constructor. But both, together is not allowed in the same record.

## Declare Canonical constructor


You know, a record has the implicit declaration of canonical constructor with predefined components. But, if you want to explicitly declare the canonical constructor (like a regular constructor), then you must provide all the arguments or components as a parameters of the constructor. I mean, the header file of the canonical constructor must be same of the record class.

Such as:

```
public record Rectangle(int length, int width){
  
  //explicit canonical constructor
  public Rectangle(int length, int width){
    this.length = length;
    this.width = width; 
    
    //if condition
    if((length <= 0) && (width <= 0){
      throw new IllegalArgumentException("Length and Width can't be 0 or less");
    }
  }
  
  //main method (or create a new file)
  public static void main (String[] args) {
    //instance if the Rectangle record class
    Rectangle r = new Rectangle(10, 8);
    System.out.println(r.length * r.width);
  }
}
/**
 * Output: 
 * 80
 */
```

**Note:** if you provide the components value 0 or less than 0 then, you will get the following error message:

```
Length and Width can't be 0 or less
```


But the following canonical constructor will not work:

```
public record Rectangle(int length, int width){
  
  public Rectangle(int length){
    this.length = length; //because it assumes, you must provide all record components here
    //even the below one will not work
    
    public Rectangle (int x, int y){
      this.length = x;
      this.width = y;
      //because, the canonical constructor parameters must match record component names including types
      //not work too
      public Rectangle(){
        //because it now seams, you didn't initialize the record components here, that is needed
        
        //you must initialize the record components here in the canonical constructor
        
        //Error message
        /**
         * Record components length and width might not be initialized in canonical constructor 
         */
      }
    }
  }
}
```


So, in short we can say, the explicit canonical constructor must contain the same header of the record class header, including types. Though you don't need to require to explicitly declare the canonical constructor overall, but it provides concise way to define record components and validate the implicit constructor arguments or normalize the components of the record etc.


## Declare compact constructor

Another type of constructor in a record you can declare is called compact constructor. The syntax is almost like a class without parentheses. And automatically it initializes the components of the record. Thus you don't need to externally initialize the attributes of the records here.

Such as:

```
public record Rectangle(int length, int width){
  
  //explicit canonical constructor
  public Rectangle(int length, int width){
    //if condition
    if((length <= 0) && (width <= 0){
      throw new IllegalArgumentException("Length and Width can't be 0 or less");
    }
    
    /**
     * Automatically added 
     * this.length = length;
     * this.width = width; 
     * 
     * thus, you don't have to 
     * initialize the record
     * components in here
     */
  }

  //main method (or create a new file)
  public static void main (String[] args) {
    //instance if the Rectangle record class
    Rectangle r = new Rectangle(10, 8);
    System.out.println(r.length * r.width);
  }
}
/**
 * Output: 
 * 80
 */
```


**Note:** if the length and width is 0 or less than 0 then, you get the following error message:

```
Length and Width can't be 0 or less
```

## Static data members

In a record class, it is possible to declare additional variables or attributes besides the record components. But, the attributes must be static. (It is not applied for method declaration)

```
public record Rectangle(int length, int width){
  
  //canonical constructor
  
  //static data members
  static int guessArea = 80;
  
  //main method
  public static void main (String[] args) {
    //You don't need to create 
    //instance of the record
    //to access the static data member
    
    guessArea; 
    
    //Note: it us not recommended 
    //to define static members in a 
    //record, though possible 
  }
}
/**
 * Output: 
 * 80
 */
```

## Record also may have methods

Unlike read accessor methods for all the components of a record, it is possible to define your own methods in a record. They can be static or non static, public or private.

```
public record Rectangle(int length, int width){
  
  //canonical or compact constructor
  //optional
  
  //define your method 
  void printArea(){
    System.out.println("The are of rectangle is: "+ length*width); //instead of length or width you can use length() and width() too
  }
  
  //main method
  public static void main (String[] args) {
    
    Rectangle rect = new Rectangle(10, 8);
    rect.printArea();
  }
 }
 /**
  * Output:
  * The area of rectangle is: 80
  */
```


**Note:** Anyway, for all the additional fields of a record class, you can declare getter and setter methods but it is not possible for record components. Because, components internally get only the getter methods not setter, even it is not possible as all components implicitly are private and final.


## How to make a regular class like a record

For achieving this, you have to write few more boilerplate lines of code.

- make your class final
- make all the attributes or fields are final and private
- generate public constructor to initialize the private attributes (you have to)
- generate getter methods (You can't generate setter methods)
- and implements equals, hashcode and toString methods (optional)

Such as:

```
public final class Person{
  
  //declare final, private attributes
  private final String name;
  private final int age;
  
  //public constructor, You must define
  // constructor for initializing final
  // attributes
  
  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  
  //generate getter methods,
  //you can't generate setter methods
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  
  //optional equals, hashCode and
  //toString() methods, you can declare
  //the default feature of a record type
  
  @Override
  public boolean equals(Object o){
    if(this == o) return true;
    if(!(o instanceof Person person)) return false;
    
    if(getAge() != person.getAge()) return false;
    return getName().equals(person.getName());
  }
  
  @Override
  public int hashCode(){
    int result = getName().hashCode();
    result = 31 * result + getAge();
    return result;
  }
  
  @Override
  public String toString(){
    return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
  }
  
  //main method or create a new file
}
```
