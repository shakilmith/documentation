## Loop Through ArrayList

ArrayList is a collection type that is indexed, ordered, support duplicate elements and there is no size limit like built in array in java. We can simply loop through or iterate ArrayList using for loop, while loop, enhanced for loop or built in listIterator interface. Let's get into the following iteration examples.

**Loop Through ArrayList Using Java For Loop**

```
import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        //adding elements using add method
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");
        planets.add("Neptune");

        //iterate using for loop
        for (int i = 0 ; i < planets.size(); i++){
            System.out.println(planets.get(i));
        }
    }
}
/**
 * Earth
 * Jupiter
 * Saturn
 * Mars
 * Neptune
 */
```

**Note:** We have to import the ArrayList class from **java.util** package.


**Loop Through ArrayList Using Java While Loop**

```
import java.util.ArrayList;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        //adding elements using add method
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");
        planets.add("Neptune");
        
        //iterate using while loop
        int i = 0;
        while (i < planets.size()){
            System.out.println(planets.get(i));
            i++; //increment by 1
        }
    }
}

/**
 * Earth
 * Jupiter
 * Saturn
 * Mars
 * Neptune
 */
```


**Loop Through ArrayList Using Java Enhanced For Loop**

```
import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        //adding elements using add method
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");
        planets.add("Neptune");

        //iterate using enhanced for loop
        for (String planet : planets) {
            System.out.println(planet);
        }
    }
}
/**
 * Earth
 * Jupiter
 * Saturn
 * Mars
 * Neptune
 */
```

**Loop Through ArrayList Using Java Built in ListIterator Interface**

```
import java.util.ArrayList;
import java.util.ListIterator;

public class Example4 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        //adding elements using add method
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");
        planets.add("Neptune");

        //iterate using listIterator
        ListIterator<String> it = planets.listIterator();
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
 * Neptune
 */
```