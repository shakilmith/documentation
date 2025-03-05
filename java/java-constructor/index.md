# Java Constructor

In java, constructor is a special kind of method that is being used to initialize the data members of a class (only properties). Constructor is always called when an object of a class is created. Every java class has a default constructor. If you do not define any constructor than java will create a default constructor for you. But, the main role of a constructor in java to initialize the data members of a class.

**Syntax**

```
public class Rectangle {

    //no-argument constructor
    public Rectangle(){
    }
    //parameterized constructor
    public Rectangle(arg1, arg2, arg3){
    }
}
```

Here, we can simply guess that, the constructor name should be the class name itself but without using class keyword and it can be public, private or protected. But better to use public access specifier always.

## The Role of Constructor in Java

As we have described earlier, constructor is being used to initialize the data members of a class. Yes, only data members or properties not methods.

```
public class Rectangle {

    float length; //it is not initialized
    float width; //it is not initialized

    //constructor to initialize length and width
    public Rectangle(float length, float width){ //define two properties
        this.length = length;
        this.width = width;
    }

    public static void main(String[] args) {

        //creating object
        Rectangle obj = new Rectangle(12.0f, 10.0f); //here you must provide the value of length and width
        System.out.println("Length: "+obj.length);
        System.out.println("Width: "+obj.width);
        System.out.println("Area: "+obj.length*obj.width);
    }
}

/**
 * Output:
 * Length: 12.0
 * Width: 10.0
 * Area: 120.0
 */
```

Remember, you must provide the exact value with proper type when making an object or reference of a class. Here, we have used the ***this*** keyword. It means current object or current class properties. If you don't use ***this*** keyword, then you will get the following output after running the above example.

```
Length: 0.0
Width: 0.0
Area: 0.0
```

Okay, what if you do not want to use ***this*** keyword? Then, you have to make your parameters name different than the properties name. Such as, 

```
//constructor to initialize length and width
public Rectangle(float l, float w){ //define two properties
    length = l;
    width = w;
}
```

## Using this Keyword

We already discussed that, this keyword refers the current object of a class. What if we don't use this keyword to initialize the class data members? Then, the parameters of the constructor be must different than the data members of a class. Such as,

```
public class A {
    int x; 
    public A (int y){
      x = y ; 
    }
    //main method
  }
```

But if you want to use ***this*** keyword then, the parameters name of the constructor must be same with the properties name of that class. Such as,

```
public class A {
    int x; 
    public A (int x){
      this.x = y ; 
    }
    //main method 
}
```

### Key things to note about constructor in Java

- Constructor name must be the same like the class name
- Constructor is a special method that helps to initialize the data members of a class
- Every class have a default constructor
- keywords like final, static, abstract, native, strictfp or synchronized can not be used with constructors
- Constructors can be overloaded
- Constructors may have n number of arguments
- Constructors are automatically called when an object or reference of a class is being created
- Though constructor is a special method, they never returns any value
- You can not use any return type in constructor like int, void or String


