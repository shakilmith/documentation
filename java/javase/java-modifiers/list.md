# Java Modifiers

Below we are going to describe java modifiers and special keywords that are usually used along with the class and class members. It is very import to know their uses because they implies restrictions and their meanings and use cases are vary.


Let's get into the actual topic:


**Public:** It is used to declare class, class members like methods, constructors and properties. It provides vast visibility of the members means less restrictions implies when a class or class members are public. You can access the public members inside or outside the class within the same or different packages.

> [Java Public Modifier](/java-public-modifier)

**Private:** Private access modifier can be used for declaring class or class members like properties or methods. It provides restrictions to use the class members. Like, you can not access private members from a different package unless you use public getter and setter methods.

> [Java Private Modifier](/java-private-modifier)

Protected: When class members are protected then it means, they only be accessed from subclass within the same package. The concept of the subclass is discussed in the java inheritance tutorial.

> [Java Protected Modifier](/java-protected-modifier)

**Default:** When you don't use public, private or protected modifiers declaring your class or class members then, they are default members by default. In this case, the class members can only be accessed within the declared class from the same package.

> [Java Default Modifier](/java-default-modifier)

**Note:** In real life application we always use access modifiers like ***public*** (declaring the class), ***private*** or ***protected*** to declare our class and class members.


**Other Important keywords: (Can be used along with access modifiers)**

**Final:** Final keyword can be used in class or class members. When a class is final then it means, you can not create subclass of it or inheritance is not possible. If class members (properties and methods) are final, then they can not be reinitialized or overridden/modified.

> [Java Final Keyword](/java-final-keyword)

**Note:** Methods are overridden. Properties are modified or reinitialized.

Overridden is only possible in the concept of inheritance. (When you create a class based on the super class then the derived class is called sub or child class. This concept in java is called inheritance)

**Static:** Static keyword means in java is belonging to the class. Static keyword can be used for declaring class members. When class members are static then it means they belong to the class itself. It also refers, static members (properties and methods) can be accessed without creating object of the class.

> [Java Static Keyword](/java-static-keyword)

**Note:** Inside the main method of the class, all the properties are static by default. Thus you can't use static keyword inside the main method of java class.

**Abstract:** Class members like properties and methods can be abstract inside the abstract class only. Abstract keyword means hiding internal details and showing only the functionality in java. It's called abstraction in java overall. Here, the abstract methods (don't have body) body will be provided by the subclass only. (Look at our java inheritance tutorial). Also note that, abstract class can not be used to create objects.

> [Abstract Class in Java](/java-abstract-class)


**Interface:** Interface in java is 100% abstract class. You don't need to use abstract keyword for interface class members now. Because, the abstract keyword is added by default for the interface class members. And interface can not be used to create objects.

**Note:** In interface properties/attributes are public, static and final by default. Means, attributes or fields can't be modified.

Interface methods are public and abstract by default. Thus, don't need to use abstract keyword externally.

The interface methods (abstract method by default) must be empty. Means, methods don't have body and the body will be provided by the implemented class. Concept almost like inheritance but instead of using extends keyword we use implements here. And all the interface methods must overridden inside the implemented class.

> [Java Interface](/java-interface)