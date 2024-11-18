# How to Sort Java Array

We can simply sort java array either ascending or descending order using one of the following techniques:
- Using Arrays.sort() factory method
- Using Collections.sort() method
- Using for loop
- By user defined method

## Sort Array Using Arrays.sort() Factory Method


```
import java.util.Arrays;

public class ArraySortExample1 {
    public static void main(String[] args) {
        //sort numeric and string values
        int [] array1 = {30, 10, 50, 80, 40, 60, 10, 90, -10, -30};
        String [] array2 = {
                "Earth", "Jupiter", "Saturn", "Mars",
                "Neptune", "Venus", "Uranus", "Mercury"};

        //sort array1 and array2 Using Arrays.sort() method
        Arrays.sort(array1);
        Arrays.sort(array2);

        //display the sorted array elements using for loop or shorthand for loop
        System.out.println("Sort Int Data (Ascending Order)");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("Sort String Data (Ascending Order)");

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
```

Output you will get after running the above example:

```
Sort Int Data (Ascending Order)
-30
-10
10
10
30
40
50
60
80
90
Sort String Data (Ascending Order)
Earth
Jupiter
Mars
Mercury
Neptune
Saturn
Uranus
Venus
```

The Above array sorting program can also be written through using enhanced for loop. Such as,

```
 //display the sorted array elements using for loop or shorthand for loop
    System.out.println("Sort Int Data (Ascending Order)");
    for (int i : array1) {
        System.out.println(i);
    }
    System.out.println("Sort String Data (Ascending Order)");

    for (String j : array2) {
        System.out.println(j);
    }
```

## Using Collections.sort() Method