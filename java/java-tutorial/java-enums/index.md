# Java Enums 

Enum is a short form of "Enumeration" in java. Enum is one kind java class that may have attributes and methods like regular java class. But, enum attributes are constants, means unchangeable. Attributes are by default public, static, final. You can't modify the enum attributes.

**Note:** Enum is created using the enum keyword following the enum name and the attributes inside enum should be uppercase letters (recommended but not required, because they are unchangeable).

**Syntax**

```
public enum NameOfEnum {
    //enum elements
}

//such as,
public enum Brand{
    FORD, BMW, HONDA, TOYOTA
}
```

Let's see an example of Enum type and how to access it's constant members. 

## Creating And Accessing Enums

In the following example create an enum called Brand it contains few constant properties. Remember enum attributes are by default public, static and final. Thus, no need to use those modifiers.

```
//Brand.java
public enum Brand {
    FORD, BMW, HONDA, TOYOTA;
}

//Main.java (contains main method)
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Accessing enum constant members
        System.out.println(Brand.FORD); //first member
        //second member
        Brand b = Brand.BMW;
        System.out.println(b);
        //accessing all the members using values() method. It returns an array
        System.out.println(Arrays.toString(Brand.values()));
    }
}
```

Now, run Main.java class and it returns the following result in the console.

```
FORD
BMW
[FORD, BMW, HONDA, TOYOTA]
```

As, enum members are static by default thus don't need to create object of special enum type.

## Java Enum Method

Enum may contain methods as well as constant data members like a regular java class. The enum method can be public or private as well.

**Example: Enum Method**

```
import java.util.Arrays;

public enum Brand {
    FORD, BMW, HONDA, TOYOTA;

    //method to return all the constant values
    public static void getBrands(){
        System.out.println(Arrays.toString(Brand.values()));
    }
}

//Main.java (contains main method)
public class Main {
    public static void main(String[] args) {
        //access the enum method
        Brand.getBrands();
    }
}
```

Output would be:

```
[FORD, BMW, HONDA, TOYOTA]
```

**Note:** Both enum class and Main class can be in same file. Then the Main class only contains main method and the file name should be Main.java.

## Java Enum constructor

Enum special class also contains constructor like regular java class and the syntax also different. Such as, (Also note, enum fields must be public/private, static, final)

```
//Brand.java (enum type)
public enum Brand {
    FORD("It was founded by - Henry Ford"), //it is called argument
    BMW("It was founded by Bayerische Motoren Werke Inc."),
    HONDA("It was founded by Honda Motor Company"),
    TOYOTA("It was founded by Kiichiro Toyoda");

    //enum field should be final
    private final String brandInfo;

    //private enum constructor and can't be public though
    private Brand(String brandInfo){ //constructor should be private (by default it is also private)
        this.brandInfo = brandInfo;
    }

    public String getBrandInfo() { //getter method returns the arguments
        return brandInfo;
    }
}

//Main.java (contains main method)
public class Main {
    public static void main(String[] args) {
        //access Brand constants using constructor
        Brand brandInfo = Brand.FORD; //it returns
        System.out.println(brandInfo+": "+brandInfo.getBrandInfo());
    }
}
```

Output:

```
FORD: It was founded by - Henry Ford
```

## Loop Through Enum Constants

```
enum Brand{
    FORD, BMW, HONDA, TOYOTA
}

public class Main {
    public static void main(String[] args) {
        //using for loop
        System.out.println("Using For Loop");
        for (int i = 0; i < Brand.values().length; i++){
            System.out.println(Brand.values()[i]);
        }

        //using shorthand for loop
        System.out.println("Using shorthand For Loop");
        for (Brand b: Brand.values()){
            System.out.println(b);
        }
    }
}

/**
 * Output:
 * Using For Loop
 * FORD
 * BMW
 * HONDA
 * TOYOTA
 * Using shorthand For Loop
 * FORD
 * BMW
 * HONDA
 * TOYOTA
 */
```

## Use of Enum Type in Java

- In order to set fixed set of constants or variables use Enum type
- When you know, the variable will not change throughout the lifecycle of the application, you can use enum type; Such as, The planets in our solar system or the the product catalog/category of your e-commerce application.
