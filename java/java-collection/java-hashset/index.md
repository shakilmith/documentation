# Java HashSet

If you don't want to allow duplicate elements or items in your resizable array then you should use java **HashSet** collection type. Java **HashSet** class implements the Set interface that doesn't allow duplicate elements. Also note that, HashSet or Set interface are not index based anyway, thus there is no way to access their elements directly. For accessing the elements of HashSet, either we can iterate them or convert them to list interface and access their values using get(index) method.


**Syntax**

```
// Syntax: (T stands for Type)
HashSet<T> set = new HashSet<>();

//creating non-generic HashSet
HashSet<T> set = new HashSet(); //not recommended
```

## Creating, Adding and Accessing Elements of HashSet

In the following example, we will see how to create new empty HashSet, adding new elements and accessing elements from it. As we know HashSet doesn't maintain insertion order, thus we can't access member directly through index number.

```
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> planets = new HashSet<>();
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");

        //print HashSet elements
        System.out.println(planets);
    }
}

/**
 * Output:
 * [Earth, Mars, Jupiter, Saturn]
 */
```

## Accessing Elements of HashSet

As HashSet isn't maintain insertion order, thus we can't access individual elements directly or there is no built in method available for that like ArrayList or LinkedList. But, we can simply convert HashSet to List using stream.toList method access each elements based on index number. (Though our expectation will not be fulfilled)

```
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> planets = new HashSet<>();
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");

        //accessing HashSet Elements
        System.out.println("First element: "+planets.stream().toList().get(0));
        System.out.println("Second element: "+planets.stream().toList().get(1));
        System.out.println("Last element: "+planets.stream().toList().getLast());
    }
}

/**
 * Output:
 * First element: Earth //true
 * Second element: Mars //not true
 * Last element: Saturn //not true
 */
```

As, HashSet or Set interface are not index based, thus get(index_number), will not returns the exact element as mentioned.

## Removing HashSet Elements

There is a built in method called remove(object) and it is used to remove certain elements from HashSet. Such as,

```
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> planets = new HashSet<>();
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");

        //before removing
        System.out.println("Before Removing: "+planets);

        //remove an element from planets HashSet
        planets.remove("Jupiter");

        //after removing
        System.out.println("After Removing: "+planets);
    }
}

/**
 * Output:
 * Before Removing: [Earth, Mars, Jupiter, Saturn]
 * After Removing: [Earth, Mars, Saturn]
 */
```

## Duplicate Elements Are Not Allowed

```
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        //creating empty HashSet
        HashSet<Integer> randomNumbers = new HashSet<>();
        randomNumbers.add(10);
        randomNumbers.add(100);
        randomNumbers.add(100); //duplicate
        randomNumbers.add(30);
        randomNumbers.add(10); //duplicate
        randomNumbers.add(50);
        System.out.println(randomNumbers);
    }
}

/**
 * Output: (note, no duplicate elements allowed
 * [50, 100, 10, 30]
 */
```


## Iterating or Loop Through HashSet

As usual, we can use for loop, enhanced for loop (recommended one) or Iterator interface with while loop to iterate HashSet elements. So, check out the following examples.

**Iterating HashSet Using For Loop**

```
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        //creating empty HashSet
        HashSet<String> planets = new HashSet<>();

        //adding new elements
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");
        planets.add("Neptune");
        planets.add("Venus");
        planets.add("Uranus");
        planets.add("Mercury");

        //iterate planets HashSet using for loop
        for (int i = 0; i < planets.size(); i++) {
            System.out.println(planets.stream().toList().get(i)); //as HashSet doesn't contain it's own get method
        }

    }
}

/**
 * Output:
 * Earth
 * Mars
 * Neptune
 * Jupiter
 * Saturn
 * Venus
 * Uranus
 * Mercury
 */
```

**Iterating HashSet Using Enhanced For Loop**

```
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        //creating empty HashSet
        HashSet<String> planets = new HashSet<>();

        //adding new elements
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");
        planets.add("Neptune");
        planets.add("Venus");
        planets.add("Uranus");
        planets.add("Mercury");

        //iterate planets HashSet using enhanced for loop
        for(String planet: planets){ //no need to convert to List
            System.out.println(planet);
        }

    }
}

/**
 * Output: (note, HashSet doesn't maintain insertion order)
 * Earth
 * Mars
 * Neptune
 * Jupiter
 * Saturn
 * Venus
 * Uranus
 * Mercury
 */
```

**Iterating HashSet Using Iterator Interface**

```
import java.util.HashSet;
import java.util.Iterator;

//iterate planets HashSet using Iterator
    Iterator<String> list = planets.iterator();
    while (list.hasNext()){
        System.out.println(list.next());
    }
```

## Built in HashSet Methods

<p>
<b>The following are the important methods that can be used in HashSet or Set interface.</b>
</p>

<table style="width: 100%">
<tr>
    <th>Methods</th>
    <th>Return types</th>
    <th>Description</th>
</tr>
    
<tr>
    <td>add(E element)</td>
    <td>boolean</td>
    <td>Appends the specified element to the end of this list.</td>
</tr>
<tr>
    <td>add(int index, E element)</td>
    <td>void</td>
    <td>Inserts the specified element at the specified position in this list.</td>
</tr>
    
<tr>
    <td>addAll(Collection<? extends E> c)</td>
    <td>boolean</td>
    <td>Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.</td>
</tr>
      
<tr>
    <td>addAll(int index, Collection<? extends E> c)</td>
    <td>boolean</td>
    <td>Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.</td>
    </tr>
<tr>
    <td>get(int index)</td>
    <td>E (element type)</td>
    <td>Returns the element at the specified position in this list.</td>
</tr>
<tr>
    <td>isEmpty()</td>
    <td>boolean</td>
    <td>Returns true if this list contains no elements.</td>
</tr>
<tr>
    <td>iterator()</td>
    <td>Iterator(E)</td>
    <td>Returns an iterator over the elements in this list in proper sequence.</td>
</tr>
        
<tr>
    <td>remove(int index)</td>
    <td>E</td>
    <td>Removes the element at the specified position in this list.</td>
</tr>
<tr>
<td>removeAll(Collection<?> c)</td>
    <td>boolean</td>
    <td>Removes from this list all of its elements that are contained in the specified collection.</td>
</tr>
   
<tr>
    <td>removeIf(Predicate<? super E> filter)</td>
    <td>boolean</td>
    <td>Removes all of the elements of this collection that satisfy the given predicate.</td>
</tr>
      
<tr>
    <td>set(int index, E element)</td>
    <td>E</td>
    <td>Replaces the element at the specified position in this list with the specified element.</td>
</tr>
<tr>
    <td>size()</td>
    <td>int</td>
    <td>Returns the number of elements in this list.</td>
</tr>
          
<tr>
    <td>trimToSize()</td>
    <td>void</td>
    <td>Trims the capacity of this ArrayList instance to be the list's current size.</td>
</tr>
<tr>
    <td>toArray()</td>
    <td>Object</td>
    <td>Returns an array containing all of the elements in this list in proper sequence (from first to last element).</td>
</tr>
<tr>
    <td>contains()</td>
    <td>boolean</td>
    <td>Returns true if this list contains the specified element</td>
</tr>
<tr>
    <td>clone()</td>
    <td>Object</td>
    <td>Returns a shallow copy of this ArrayList instance. (The elements themselves are not copied.)</td>
</tr>
<tr>
    <td>equals()</td>
    <td>boolean</td>
    <td>Checks two lists are equal or not (returns true ir false)</td>
</tr>
     
<tr>
    <td>indexOf()</td>  
    <td>int</td>
    <td>Returns the index of the first occurrence of the specified element in this list.</td>
</tr>
     
<tr>
    <td>indexOf()</td>
    <td>int</td>
    <td>Returns the index of the last occurrence of the specified element in this list.</td>
</tr>
     
<tr>
    <td>sort()</td>
    <td>void</td>
    <td>Sorts the list alphabetically or numerically in a specified order (Ascending or Descending)</td>
</tr>
    
<tr>
    <td>stream()</td>
    <td>Stream</td>
    <td>Returns a sequential Stream with this collection as its source.</td>
</tr> 
</table>


## Key Things to Note About Java HashSet

- HashSet is a Collection type in Java
- HashSet doesn't maintain insertion order
- HashSet is unordered and not index based
- In order to accessing individual elements of HasSet we have to convert it o List type
- HashSet doesn't support duplicate Elements
- HashSet is mutable - adding or removing elements are allowed
- HashSet implementation is not Synchronized
