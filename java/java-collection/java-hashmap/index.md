# Java HashMap

When it is required to store collection of elements of same type with (key, value) pairs we use Java HashMap, LinkedHashMap or TreeMap. It is the implementation of Map interface. There are built in methods available to work with Java HashMap.

**Syntax**

```
//generic
HashMap<keyType, valueType> map = new HashMap<>();
//like:
HashMap<Integer, String> map = new HashMap<>();

//non-generic
HashMap map = new HashMap(); //not recommended
```

## Creating, Adding and Accessing Elements of HashMap

Methods like put or get are used to add and accessing elements of the HashMap.

```
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //creating HashMap
        HashMap<Integer, String> planets= new HashMap<>();

        //adding new elements with key value pairs
        planets.put(1, "Earth");
        planets.put(2, "Jupiter");
        planets.put(3, "Saturn");
        planets.put(4, "Mars");

        //print all elements
        System.out.println(planets);

        //accessing elements by invoking key
        System.out.println("First el: "+planets.get(1));
        System.out.println("Second el: "+planets.get(2));
        System.out.println("Last el: "+planets.get(planets.size() - 1));

    }
}

/**
 * Output:
 * {1=Earth, 2=Jupiter, 3=Saturn, 4=Mars}
 * First el: Earth
 * Second el: Jupiter
 * Last el: Saturn
 */
```

## Removing Elements 

We can remove elements from HashMap using the remove(key) or remove(key, value) methods. Both return boolean value.

```

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //creating HashMap
        HashMap<Integer, String> planets= new HashMap<>();

        //adding new elements with key value pairs
        planets.put(1, "Earth");
        planets.put(2, "Jupiter");
        planets.put(3, "Saturn");
        planets.put(4, "Mars");
        planets.put(5, "Neptune");

        //before removing elements:
        System.out.println("Before removing: "+planets);

        planets.remove(1); //remove through key
        planets.remove(5, "Neptune"); //remove through (key, value) == must be matched

        //after removing elements
        System.out.println("After removing: "+planets);


    }
}

/**
 * Output:
 * Before removing: {1=Earth, 2=Jupiter, 3=Saturn, 4=Mars, 5=Neptune}
 * After removing: {2=Jupiter, 3=Saturn, 4=Mars}
 */
```

## Iterate or Loop Through HashMap

We can iterate HashMap or Map interface elements using for loop, while loop, enhanced for loop or Iterator interface. But the iteration process little bit different and 

**Using For Loop**

```
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //creating HashMap
        HashMap<Integer, String> planets= new HashMap<>();

        //adding new elements with key value pairs
        planets.put(1, "Earth");
        planets.put(2, "Jupiter");
        planets.put(3, "Saturn");
        planets.put(4, "Mars");
        planets.put(5, "Neptune");
        
        //iterate using for loop
        for (int i = 1; i <= planets.entrySet().size(); i++) { //i start from 1 here
            System.out.println(planets.get(i));
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

**Note:** The for loop is not recommended approach to loop through HashMap or Map interface elements.

**Using Enhanced For Loop**

```
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //creating HashMap
        HashMap<Integer, String> planets= new HashMap<>();

        //adding new elements with key value pairs
        planets.put(1, "Earth");
        planets.put(2, "Jupiter");
        planets.put(3, "Saturn");
        planets.put(4, "Mars");
        planets.put(5, "Neptune");

        //iterate using enhanced for loop
        for(Map.Entry<Integer, String> value: planets.entrySet()){ //Map.Entry returns keys and values together
            System.out.println(value.getKey()+ "-"+value.getValue()); //returns key,value together
        }
    }
}

/**
 * Output:
 * 1-Earth
 * 2-Jupiter
 * 3-Saturn
 * 4-Mars
 * 5-Neptune
 */
```

**Note:** Raw use of parameterized class is also supported like Map.Entry instead of Map.Entry{`<Integer, String>`} but not recommended.

**Using Iterator Interface**

```
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //creating HashMap
        HashMap<Integer, String> planets= new HashMap<>();

        //adding new elements with key value pairs
        planets.put(1, "Earth");
        planets.put(2, "Jupiter");
        planets.put(3, "Saturn");
        planets.put(4, "Mars");
        planets.put(5, "Neptune");

        //iterate using Iterator interface
        Iterator<Map.Entry<Integer, String>> map = planets.entrySet().iterator();
        while (map.hasNext()){
            System.out.println(map.next());
        }
    }
}

/**
 * Output:
 * 1=Earth
 * 2=Jupiter
 * 3=Saturn
 * 4=Mars
 * 5=Neptune
 */
```

**Note:** Want to return only values or only keys, then invoke either **values().iterator()** or **keySet().iterator()**. Though, ***map.next().getKey()*** and ***map.next().getValue()*** also returns keys and values respectively.




## HashMap is Modifiable

Modifiable means, it is possible to add, remove or change elements of HashMap in java.

```
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //creating HashMap
        HashMap<Integer, String> planets= new HashMap<>();

        //adding new elements with key value pairs
        planets.put(1, "Earth");
        planets.put(2, "Jupiter");
        planets.put(3, "Saturn");
        planets.put(4, "Mars");
        planets.put(5, "Neptune");

        System.out.println(planets);

        //adding new elements
        planets.put(6, "Venus");
        planets.put(7, "Uranus");

        System.out.println("After adding new elements: "+planets);

        //remove an element
        planets.remove(1); //either remove by key or key,value pairs, both are supported
        System.out.println("After removing: "+planets);
    }
}

/**
 * Output:
 * {1=Earth, 2=Jupiter, 3=Saturn, 4=Mars, 5=Neptune}
 * After adding new elements: {1=Earth, 2=Jupiter, 3=Saturn, 4=Mars, 5=Neptune, 6=Venus, 7=Uranus}
 * After removing: {2=Jupiter, 3=Saturn, 4=Mars, 5=Neptune, 6=Venus, 7=Uranus}
 */
```

## Java HashMap Built in Methods

There are built in useful methods available to work with java ***HashMap*** or ***Map*** interface. Below I describe few of them with details.


<table style="width: 100%">
  <tr>
    <th>Methods</th>
    <th>Description</th>
  </tr>
  
  <tr>
    <td><b>put(K key, V value)</b></td>
    <td>Insert new element with the specified value with the specified key in this map.</td>
  </tr>
  <tr>
    <td><b>putAll(Map<? extends K,? extends V> m)</b></td>
    <td>Copies all of the mappings from the specified map to this map.</td>
  </tr>
  <tr>
    <td><b>remove(Object key)</b></td>
    <td>Removes the mapping for the specified key from this map if present.</td>
  </tr>
  <tr>
    <td><b>size()</b> <br/> type int</td>
    <td>Returns the number of key-value mappings in this map.</td>
  </tr>
  <tr>
    <td><b>clear()</b> <br/> void</td>
    <td>Removes all of the mappings from this map.</td>
  </tr>
  <tr>
    <td><b>clone()</b></td>
    <td>Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned.</td>
  </tr>
  <tr>
    <td><b>containsKey(Object key)</b> <br/> type boolean</td>
    <td>Returns true if this map contains a mapping for the specified key.</td>
  </tr>
  <tr>
    <td><b>containsValue(Object value)</b> <br/> boolean</td>
    <td>Returns true if this map maps one or more keys to the specified value.</td>
  </tr>
  <tr>
    <td><b>isEmpty()</b> <br/> boolean</td>
    <td>Returns true if this map contains no key-value mappings.</td>
  </tr>
  <tr>
    <td><b>size()</b> <br/> int</td>
    <td>Returns the number of key-value mappings in this map.</td>
  </tr>
  <tr>
    <td><b>values()</b></td>
    <td>Returns a Collection view of the values contained in this map.</td>
  </tr>
  
  <tr>
    <td><b>compute()</b></td>
    <td>Attempts to compute a mapping for the specified key and its current mapped value</td>
  </tr>
  <tr>
    <td><b>keySet()</b></td>
    <td>Returns a Set view of the keys contained in this map</td>
  </tr>
</table>



## Note About Java HashMap

- HashMap is the implementation of Map interface and provides all of the optional map operations
- HashMap store elements with (key,value) pairs 
- HashMap is mutable and resizable dictionary or array that store data with key,value paris
- HashMap doesn't allow duplicate keys. Each key can only be registered with only one value. But, duplicate values are supported.
- getKey() method returns only keys and keyValue() method returns only values.
- HashMap
- Though HashMap is mutable (entries can be added, changed later) there are three static factory methods available to create unmodifiable HashMap in java. They are: ***Map.of***, ***Map.ofEntries***, and ***Map.copyOf***
- The keys can be any Wrapper or Object types - like String, Integer etc.
