# Loop Throw Array 

In this simple java example, we will loop through or iterate array of items. In java array is one kind of data type, that is used to store more than one same type of values at a same time. But the array size is fixed and we can't enlarge the capacity of an array though. Hence we can iterate array using for loop, while loop or shorthand for loop. 

Let's look over the examples.

**Using For Loop**

```
public class IterateArrayExample1 {
    public static void main(String[] args) {
        //array of int values
        int [] numbers = {1, 2, 3, 4, 5};

        //iterate array of items using for loop
        for (int i = 0; i < 5; i++){
            System.out.println(numbers[i]);
        }
    }
}
/**
 * 1
 * 2
 * 3
 * 4
 * 5
 */
```

**Note:** inside for loop, i = 0 is called index number and array index starts from 0 to n-1; If you set the index number more than the actual capacity, then it will produce arrayOutOfBound exception error.

**Using While Loop**

```
public class IterateArrayExample2 {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};

        //iterate array using while loop
        int i = 0;
        while (i < numbers.length){
            System.out.println(numbers[i]);
            i++;
        }
    }
}
/**
 * 1
 * 2
 * 3
 * 4
 * 5
 */
```

**Using shorthand for loop**

```java
public class IterateArrayExample3 {
    public static void main(String[] args) {
        //declare array of String
        String [] planets = {
                "Earth", "Jupiter", "Saturn", "Mars",
                "Neptune", "Venus", "Uranus", "Mercury"
        };
        //iterate array using shorthand for loop
        for(String it: planets){
            System.out.println(it);
        }
    }
}
/**
 * Earth
 * Jupiter
 * Saturn
 * Mars
 * Neptune
 * Venus
 * Uranus
 * Mercury
 */
```

**Using Iterator Interface**

It is basically compatible for Collection type, but with Arrays.stream(..).iterator() we can iterate array. Such as,

```
import java.util.Arrays;
import java.util.Iterator;

public class IterateArrayExample4 {
    public static void main(String[] args) {
        String [] planets = {
                "Earth", "Jupiter", "Saturn", "Mars",
        };

        Iterator<String> it = Arrays.stream(planets).iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
/**
 * Earth
 * Jupiter
 * Saturn
 * Mars
 */
```
