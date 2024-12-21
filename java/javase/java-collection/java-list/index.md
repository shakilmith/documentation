## Java List

List interface in java is a collection type and is being used to store same type of multiple elements. In java, List is ordered, index based and allowed duplicate elements. Additionally List is mutable by it's nature but there are ways to create unmodifiable Lists. List interface provides lot of built in methods to filter List elements, like adding, retrieving, removing, sorting or iterating List elements.

**Syntax**

```
//generic
List<T> planets = new ArrayList<>(); //here T stands for Type: Integer, String or Object

//non generic
List planets = new ArrayList(); //not recommended
```

## Creating List and Adding, Accessing Elements

In this very first example we will try to explore how to create List interface, adding and accessing elements of it.

```
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //creating an empty List with String type
        List<String> planets = new ArrayList<>();

        //adding new elements to the planets List
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");

        //accessing elements of the planets List
        System.out.println("First Elements: "+planets.get(0)); //index starts from 0 and get(0) returns the first member
        System.out.println("Second Element: "+planets.get(1));
        System.out.println("Last Element: "+planets.get(planets.size() - 1)); //planets.size() method returns total number of the elements
        System.out.println("Last Element (using getLast): "+planets.getLast()); //getFirst and getLast returns fist and last el respectively
    }
}

/**
 * Output:
 * First Elements: Earth
 * Second Element: Jupiter
 * Last Element: Mars
 * Last Element (using getLast): Mars
 */
```

Note: Unlike ***get(index_number)***, we can also use built in **getFirst** and **getLast** methods ro retrieve first and last elements of the List.

## Removing Elements from List

There is a method called remove() can be used to remove elements from List. The remove() method takes index number as well as object (value) to remove elements.

```
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //creating an empty List with String type
        List<String> planets = new ArrayList<>();

        //adding new elements to the planets List
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");

        //before removing
        System.out.println(planets);

        //remove first and last element (using remove(index) + remove(object)
        planets.remove(0); //removeFirst also does the same thing
        planets.remove("Mars"); //removeLast also does the same thing

        //after removing
        System.out.println(planets);
    }
}

/**
 * Output:
 * [Earth, Jupiter, Saturn, Mars]
 * [Jupiter, Saturn]
 */
```

## Iterating List

We can use for loop, forEach loop, enhanced for loop or Iterator interface to iterate or loop through List elements.

**Iterate List Using For Loop**

```
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //creating an empty List with String type
        List<String> planets = new ArrayList<>();

        //adding new elements to the planets List
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");
        planets.add("Neptune");
        planets.add("Venus");
        planets.add("Uranus");
        planets.add("Mercury");

        //iterate planets List using for loop
        for (int i = 0; i < planets.size(); i++) { //planets.size() returns 8
            System.out.print(planets.get(i) + ", "); //i stands for index number
        }
    }
}

/**
 * Output:
 * Earth, Jupiter, Saturn, Mars, Neptune, Venus, Uranus, Mercury,
 */
```

**Iterate List Using Enhanced For Loop**

```
//iterate planets List using enhanced for loop
for (String planet : planets) {
    System.out.print(planet + ", "); //i stands for index number
}
```


**Iterate List Using Iterator Interface**

```
//iterate planets List using for loop
Iterator<String> list = planets.iterator(); //can be use listIterator as well
    while (list.hasNext()){
        System.out.print(list.next() +", ");
}
```


**Iterate List Using Built in ListIterator**

```
ListIterator<String> list = planets.listIterator(); //listIterator takes one optional int argument to start from
    while (list.hasNext()){
        System.out.println(list.next());
    }
```

**Note:** When you use **ListIterator** to iterate List, then there is a way to use additional methods called **previous()**, **hasPrevious()**, **previousIndex()** or **nextIndex()** methods to filter your list more concisely that, doesn't contain in built in Iterator interface.

## Sort List Using Collections.Sort method

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //creating an empty List with String type
        List<String> planets = new ArrayList<>();

        //adding new elements to the planets List
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");
        planets.add("Neptune");
        planets.add("Venus");
        planets.add("Uranus");
        planets.add("Mercury");

        //before sorting
        System.out.println(planets);

        //sort the list
        Collections.sort(planets); //this method also takes an optional comparator - used to compare two objects
        System.out.println(planets);
    }
}

/**
 * Output:
 * [Earth, Jupiter, Saturn, Mars, Neptune, Venus, Uranus, Mercury]
 * [Earth, Jupiter, Mars, Mercury, Neptune, Saturn, Uranus, Venus]
 */
```

## Built in List Methods

There are plenty of built in methods available to work with List in java. Below I describe few of them.

<p>
<b>Methods of Java List Interface:</b>
</p>
</br>

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



## Creating Unmodifiable List in Java

Though List collection type is modifiable or mutable by its' nature. But there are two static factory methods available to create unmodifiable List collection type in java. This is also true for Set or Map collection type interface in java.


Here, we will use factory method **List.of()** to define unmodifiable List and we have to provide the elements at the time of creation of List.

```
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //creating Unmodifiable Set (Elements cannot be added or removed)
        List<String> planets = List.of(
                "Earth",
                "Jupiter",
                "Saturn",
                "Mars",
                "Neptune"
        );
        System.out.println(planets);

        //try to add new elements
        planets.add("Venus"); //raise UnsupportedOperationException error
        //try to remove an element
        planets.remove("Earth"); //raise UnsupportedOperationException error
    }
}

/**
 * Output: (probably you don't get the same result)
 * [Earth, Jupiter, Saturn, Mars, Neptune]
 * Exception in thread "main" java.lang.UnsupportedOperationException (throw this error message)
 */
```

**Note About Unmodifiable List**

- Use List.of() or List.copyOf() static factory methods to create unmodifiable Set in Java
- Allow duplicate elements and maintain the insertion order
- Elements should be added or provided at the time of unmodifiable List
- Calling any mutator method on the unmodifiable List will always cause UnsupportedOperationException to be thrown
- Null elements aren't supported, attempts to create them with null elements result in NullPointerException.
- Elements cannot be added, removed or replaced after the creation of unmodifiable Set
- Throw UnsupportedOperationException error if we try to add or remove elements from the unmodifiable List.
- They are serializable if all elements are serializable.
