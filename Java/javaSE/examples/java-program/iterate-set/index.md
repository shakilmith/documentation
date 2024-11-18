# Loop Through Set

Java Set interface is a Collection type that is used to store unique elements of it's members. By nature Set interface doesn't allow duplicate elements, even it doesn't maintain the insertion order means, Set interface isn't index based. 

In order to loop through Set in java, we have to convert it to list as it doesn't maintain insertion order and there is no get method available in it. Similarly List interface, we can use java for loop, while loop or enhanced for to iterate elements of Set.

**Loop Through Set Using For Loop**

```
import java.util.Set;

public class Example1 {
    public static void main(String[] args) {
        Set<String> planets = Set.of(
                "Earth", "Jupiter", "Saturn",
                "Mars", "Neptune"
        );

        //iterate set using for loop
        for (int i = 0; i < planets.size(); i++){
            System.out.print(planets.stream().toList().get(i) + ", ");
        }
    }
}
/**
* Saturn, Earth, Neptune, Mars, Jupiter,
*/
```

Note: Set doesn't support duplicate elements (duplicate elements will be ignored) and doesn't maintain insertion order. It means, it is possible that you will get different result when you run the above example. Such as, when I ran the same above example I got the following output:

```
Neptune, Mars, Jupiter, Saturn, Earth,
```

**Loop Thorough Set Using Enhanced For Loop**

```
import java.util.Set;

public class Example2 {
    public static void main(String[] args) {
        Set<String> planets = Set.of(
                "Earth", "Jupiter", "Saturn",
                "Mars", "Neptune"
        );

        //iterate set using for loop
        for (String it: planets){
            System.out.print(it +", ");
        }
    }
}
/**
 * Jupiter, Mars, Neptune, Earth, Saturn,
 */
```

**Iterate Set Using While Loop**

```
import java.util.Set;

public class Example3 {
    public static void main(String[] args) {
        Set<String> planets = Set.of(
                "Earth", "Jupiter", "Saturn",
                "Mars", "Neptune"
        );
        //iterate using while loop
        int i = 0;
        while (i < planets.size()){
            System.out.print(planets.stream().toList().get(i) +", ");
            i++; //increment by 1
        }
    }
}
/**
 * Earth, Saturn, Jupiter, Mars, Neptune,
*/
```

