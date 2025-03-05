# Java Iterator

In java, Iterator is an interface and can be used to iterate collection types like List, Set or Map. But it can not be used directly to iterate or loop through Array type. But, using **Arrays.stream(type).iterator()** can be used to iterate arrays though. However, It provides two important methods to iterate collection elements. One is **hasNext()** method and another one is **next()** method. Here, **hasNext()** method checks if there are any elements in the defined collection. It returns true if it finds any elements in the defined collection (either list, set or map) and then the **next()** method prints the value. If **hasNext()** returns false then the **next()** method is halted.

Here, I provide an example, where we try to iterate List collection using Iterator interface.

**TestIterator.java**

```
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //creating a List
        List<String> planets = new ArrayList<>(); //planets list it takes String values only
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");
        planets.add("Neptune");
    
        //using iterator to loop through the numbers array
        Iterator<String> list = planets.iterator();
        while (list.hasNext()){
            System.out.println(list.next());
        }
    }
}

/**
 * Output:
 * Earth
 * Jupiter
 * Saturn
 * Mars
 * Neptune
 */
```


