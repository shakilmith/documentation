## Array in Java


Arrays are used to store more than one value or multiple same type of values at a time in a single variable than creating variables for each value. In array we can store same type of primitive or non primitive values.


## Array Declaration

First of all we define the type like int or String and followed by the array name. Here we have to use [] brackets (squire braces) to indicate the variable that it stores multiple values.


```
//array declaration
int [] array1; 
//array declaration and initialization
int [] array2 = {1, 2, 3, 4};

//here int [] array and int array [] is the same thing
//or declare an array with predefined size
int [] array3 = new int[5]; // this array can store 5 data members
```

**Note:** Array index starts from 0. It means, for accessing first member of the array we have to invoke array[0];


## Array Example

In this very firs array example, we will create a planets array and that stores text values or String values as it's members. For accessing each member of this planets array, we will invoke planets[index_number] method. We have to remember that, array index starts with 0 and the last index is planets.length -1. Index number is always 1 less than the total length or size of the array.


```
public class Main {
    public static void main(String[] args) {

        //creating array with initial capacity
        String [] planets = new String[5]; //initial capacity set to 5

        //adding elements to the planets array using index number
        planets[0] = "Earth"; //first element
        planets[1] = "Jupiter";
        planets[2] = "Saturn";
        planets[3] = "Mars";
        planets[4] = "Neptune";

        //access the elements using index number
        System.out.println("First Element: "+ planets[0]); //index number starts from 0
        System.out.println("Second Element: "+planets[1]);
        System.out.println("Last Element :"+planets[4]);
        System.out.println("Last Element (using length): "+ planets[planets.length - 1]); //index number 1 less than total length or size of the array
    }
}

/**
 * Output:
 * First Element: Earth
 * Second Element: Jupiter
 * Last Element :Neptune
 * Last Element (using length): Neptune
 */
```

**Note:** Index number starts from 0 to 1 less than the size or length of the array. So index number 0 acquires the first elements, similarly index number 1, 2 acquires the second and third element respectively. In order to access the last element, the index number should be one less than the total length of the array.

## Creating And Initializing an Array

Instead of initializing an array after the creation, it is possible to initialize an array with appropriate values at the time of creating array. Look at the following example (Override the first example)

```
public class Main {
    public static void main(String[] args) {

        //creating an array and initialize it
        String [] planets = {"Earth", "Jupiter", "Saturn", "Mars", "Neptune", "Neptune"};

        //access the elements using index number
        System.out.println("First Element: "+ planets[0]); //index number starts from 0
        System.out.println("Second Element: "+planets[1]);
        System.out.println("Last Element :"+planets[4]);
        System.out.println("Last Element (using length): "+ planets[planets.length - 1]); //index number 1 less than total length or size of the array
    }
}

/**
 * Output:
 * First Element: Earth
 * Second Element: Jupiter
 * Last Element :Neptune
 * Last Element (using length): Neptune
 */
```

## Array Index Out of Bound

When you want to store an element to the array that cross the initial capacity of that array or want to access an element out of the array index (as we know array index number must be 1 less than the total length or size) then, we will get an error message while running our application.


```
public class Main {
    public static void main(String[] args) {

        //creating an array and initialize it
        String [] planets = new String[5]; //initial capacity is 5, so index number is 0 to 4

        //adding elements
        planets[0] = "Earth"; //first element
        planets[4] = "Neptune"; //fifth element as index starts from 0 to length -1
        planets [5] = "Venus"; //array out of bound exception as the index number is exceeded

        //System.out.println(planets[6]); also result to the same exception error
    }
}

/**
 * Output:
 * java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
 */
```



## Iterate or Loop Through Array Elements

We can use Java for loop, while loop, enhanced for loop or array factory methods to loop through array elements in java. Such as,

**Iterate Array Using For Loop**

```
public class Main {
    public static void main(String[] args) {

        //creating an array and initialize it
        String [] planets = {
                "Earth", "Jupiter", "Saturn", "Mars", "Neptune",
                "Venus", "Uranus", "Mercury"}; //array length is 8; So index number should be 0 to 7

        //iterate planets array using for loop
        for (int i = 0; i < planets.length; i++){
            System.out.print(planets[i] +", "); //i returns each element
        }

    }
}

/**
 * Output:
 * Earth, Jupiter, Saturn, Mars, Neptune, Venus, Uranus, Mercury,
 */
```

**Iterate Array Using Enhanced For Loop**

```
//iterate planets array using enhanced for loop
    for (String planet : planets) {
        System.out.print(planet + ", ");
    }
```

**Using While Loop**

```
//iterate planets array using while loop
    int i = 0;
    while (i < planets.length){
        System.out.print(planets[i] +", ");
        i++; //increment operator is required otherwise the loop will not end
    }
```

**Using Arrays.toString() Factory Method**

```
//iterate planets array using Arrays.toString() factory method
System.out.print(Arrays.toString(planets) + ", ");
```

## Array Length or Size

In order to get the length or size of the array, we can use arrays built in length method.

```
public class Main {
    public static void main(String[] args) {

        //creating an array and initialize it
        String [] planets = {
                "Earth", "Jupiter", "Saturn", "Mars", "Neptune",
                "Venus", "Uranus", "Mercury"}; //total 8 elements be 0 to 7
        //get the length of the planets array using length method
        System.out.println("Length of the Array: "+planets.length);
    }
}

/**
 * Output:
 * Length of the Array: 8
 */
```

**Note:** Static factory method like Arrays.stream(planets).toArray().length also result the same. Or, if we want to access the List size() method instead of built in length, then we can first convert the array to List and then call the size() method. But in order to accessing the Arrays built in methods, we have to import first java.util.Arrays class.

```
//import java.util.Arrays;
Arrays.stream(planets).toList().size()
```

## Java Multidimensional Array

When array is treated rows and columns or we want to store collection of data as a tabular form, then we use multidimensional array. Multidimensional array look like matrix of Mathematics.

**Syntax**

```
//two dimensional array
type [] [] array_name ={ {elements}, {elements} }; //[first] [second] = first indicate index number and second specify the element

Like: 
int [][] numbers = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10} };
```

**Note:** Here, if we want to access the first {} array data, then we have to use index [0], 2nd array {} data, we have to use index [1] and use specific index number to access the elements of that array. Here, the first squire [] bracket indicate the index number and the second squire [] bracket indicate the element of that index.

**Two Dimensional Array Example**

```
public class Main {
    public static void main(String[] args) {

        //creating two-dimensional array
        int [] [] ages = {{1, 2, 3, 4, 5}, {25, 30, 50, 35, 45}}; //creating 2-dimensional array

        //accessing the members of the ages array
        System.out.println("Third Element of the First Array: "+ages[0][2]); //[0] indicates the index number that is first {} and [2] indicates the elements of that index
        System.out.println("Last Element of the Second Array: "+ages[1][4]);

        //iterate array elements (i for index (0, 1) and j for elements of each index)
        for (int i = 0; i < ages.length; i++) { //i mentions index number
            for (int j = 0; j < ages[i].length ;j++) { //j mentions each element of the index
                System.out.println(ages[i][j]);
            }
        }
    }
}

/**
 * Output:
 * Third Element of the First Array: 3
 * Last Element of the Second Array: 45
 * 1
 * 2
 * 3
 * 4
 * 5
 * 25
 * 30
 * 50
 * 35
 * 45
 */
```

The above multidimensional can also be iterated using enhanced for loop. Such as,

```
 for (int[] age : ages) {
    for (int i : age) {
        System.out.println(i);
    }
}
```