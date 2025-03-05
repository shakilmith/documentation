# Java Method that Takes User Defined Object as Parameters

In this simple example, we will see how a method can take user defined object as parameters and then display the info. In real life application, it is a common scenario methods take user defined objects simplify the application development process and reuse the logic multiple times. 

So, let's see the following example where a method takes Employee user defined object and display the info of the employee. Such as,

```
//Employee.java
public class Employee {
    public String name;
    public int age;
    public String role;

    //constructor

    public Employee(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }
    //define getter and setter methods if required
}
//MethodExample5.java
public class MethodExample5 {
    //java method that takes user defined object
    public static void displayEmployeeInfo(Employee em){
        System.out.println("Name: "+em.name +" Age: "+em.age +" Role: "+em.age);
    }
    public static void main(String[] args) {
        //call the displayEmployeeInfo() method
        displayEmployeeInfo(new Employee("Mark Smith", 30, "Java Developer"));
    }
}
/**
 * Name: Mark Smith Age: 30 Role: 30
 */
```

What if you have many employees, then you probably define employees first then call the method. Such as,

```
//Create Few Employees object
Employee e1 = new Employee("Mark Smith", 30, "Java Developer");
Employee e2 = new Employee("Rebeka Gomez", 40, "Rust Developer");
Employee e3 = new Employee("Jekov Jenkov", 50, "AWS Specialist");
Employee e4 = new Employee("Shakil Ahmed", 30, "Web Developer");

//call the displayEmployeeInfo() method (multiple times)
displayEmployeeInfo(e1);
displayEmployeeInfo(e2);
displayEmployeeInfo(e3);
displayEmployeeInfo(e4);

/** //Out
 * Name: Mark Smith Age: 30 Role: 30
 * Name: Rebeka Gomez Age: 40 Role: 40
 * Name: Jekov Jenkov Age: 50 Role: 50
 * Name: Shakil Ahmed Age: 30 Role: 30
 */
```

But, I think instead of calling displayEmployeeInfo() method multiple times, that actually do the same thing, we can define a logic that can simplify the method calling.

Here, we basically redefine out method that takes list employee objects. Check out the following example.

```
import java.util.ArrayList;
import java.util.List;

public class MethodExample6 {
    //java method that takes list of User define objects
    public static void displayEmployeeInfo(List<Employee> employees){
        for (Employee em: employees){
            System.out.println("Name: "+em.name +" Age: "+em.age +" Role: "+em.age);
        }
    }
    public static void main(String[] args) {

        //Create few Employee objects and add them into a List
        //Create Few Employees object
        Employee e1 = new Employee("Mark Smith", 30, "Java Developer");
        Employee e2 = new Employee("Rebeka Gomez", 40, "Rust Developer");
        Employee e3 = new Employee("Jekov Jenkov", 50, "AWS Specialist");
        Employee e4 = new Employee("Shakil Ahmed", 30, "Web Developer");

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        //now call the displayEmployeeInfo() method
        displayEmployeeInfo(list);
    }
}
/**
 * Name: Mark Smith Age: 30 Role: 30
 * Name: Rebeka Gomez Age: 40 Role: 40
 * Name: Jekov Jenkov Age: 50 Role: 50
 * Name: Shakil Ahmed Age: 30 Role: 30
 */
```

Hope this example helps you to know how to add List type as method parameters as well. Hence, like this way, we can simplify the method calling, when a method do almost same tasks.

