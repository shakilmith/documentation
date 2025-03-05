## Iterate Java List Interface

In java List is a collection type that is ordered, index based and allowed duplicate elements. Additionally List is mutable by it's nature but there are ways to create unmodifiable Lists. List interface provides lot of built in methods to filter List elements, like adding, retrieving, removing, sorting or iterating List elements.

In this post, we will check out how to loop through list using for loop, while loop, enhanced for loop or listIterator interface.

**Loop Through List Elements Using For Loop**

```
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> planets = List.of(
                "Earth", "Jupiter", "Saturn", "Mars",
                "Neptune", "Venus", "Mercury"
        );

        //iterate list using for loop
        for (int i = 0; i < planets.size(); i++){
            System.out.print(planets.get(i) + ", ");
        }
    }
}
/**
 * Earth, Jupiter, Saturn, Mars, Neptune, Venus, Mercury,
*/
```

**Using While Loop**

```
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> planets = List.of(
                "Earth", "Jupiter", "Saturn", "Mars",
                "Neptune", "Venus", "Mercury"
        );

        //iterate list using While Loop
        int i = 0;
        while (i < planets.size()){
            System.out.print(planets.get(i) + ", ");
            i++; //increment by 1
        }
    }
}
/**
 * Earth, Jupiter, Saturn, Mars, Neptune, Venus, Mercury,
*/
```


**Using Shorthand For Loop**

```
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> planets = List.of(
                "Earth", "Jupiter", "Saturn", "Mars",
                "Neptune", "Venus", "Mercury"
        );

        //iterate list using for loop
        for (String planet : planets) {
            System.out.print(planet + ", ");
        }
    }
}
/**
 * Earth, Jupiter, Saturn, Mars, Neptune, Venus, Mercury,
*/
```

**Using ListIterator Interface**

```
import java.util.List;
import java.util.ListIterator;

public class Example1 {
    public static void main(String[] args) {
        List<String> planets = List.of(
                "Earth", "Jupiter", "Saturn", "Mars",
                "Neptune", "Venus", "Mercury"
        );

        //iterate list using ListIterator
        ListIterator<String> it = planets.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
/**
 * Earth, Jupiter, Saturn, Mars, Neptune, Venus, Mercury,
*/
```

**Using ForEach Method**

```
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> planets = List.of(
                "Earth", "Jupiter", "Saturn", "Mars",
                "Neptune", "Venus", "Mercury"
        );

        //iterate list using forEach method
        planets.forEach(it -> {
            System.out.print(it + ", ");
        });
    }
}
/**
 * Earth, Jupiter, Saturn, Mars, Neptune, Venus, Mercury,
 */
```