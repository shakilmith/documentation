# Java Set

Java Set interface is a Collection type that is used to store unique elements of it's members. By nature Set interface doesn't allow duplicate elements, even it doesn't maintain the insertion order means, Set interface isn't index based. Also note that, Set interface is a resizable array, means it is possible to increase the capacity of Set by adding new elements. Though it is possible to create unmodifiable Set in Java too.

**Syntax**

```
//generic
Set<String> planets = new HashSet<>();

//non-generic
Set list = new HashSet(); //not recommended
```

**Note:** Only allowed same type as well as Wrapper types or Objects (like Integer, String, Person) no primitives as it's members.


## Creating, Adding and Accessing Elements of Set in Java

Creating Set interface is a very straightforward task like creating HashSet. Then, we will use built in add methods to add new elements in it.

```
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //creating an empty Set with String Type
        Set<String> planets= new HashSet<>();
        Set<Integer> numbers = new HashSet<>();

        //adding new elements to the planets Set
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");

        //adding new elements to the numbers Set
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(100);

        //accessing elements
        System.out.println(planets); //doesn't maintain insertion order
        System.out.println(numbers);
    }
}

/**
 * Output: (probably you don't get the same result)
 * [Earth, Mars, Jupiter, Saturn]
 * [20, 100, 7, 8, 9, 10, 30] 
 */
```

**Note:** Set doesn't maintain insertion order and no index based. Thus there is no way to access it's elements by using get(index) or get(object) method. So, for accessing it's individual members or iterate over set, we should convert it to List or equivalent type.


## Set Doesn't Allow Duplicate Elements

Duplicate elements will be ignored implicitly.


```
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //creating Set
        Set<Integer> numbers = new HashSet<>();


        //adding new elements to the numbers Set
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); //duplicate elements
        numbers.add(7);
        numbers.add(8);
        numbers.add(20); //duplicate elements
        numbers.add(100);

        //accessing elements
        System.out.println(numbers);
    }
}

/**
 * Output: (probably you don't get the same result)
 * [20, 100, 7, 8, 10, 30]
 */
```

## Iterate or Loop Through Set in Java

We can use for loop, forEach loop, enhanced for loop or Iterator interface to iterate or loop through Set elements. But, as Set elements aren't index based, so we first convert it to List or array and then iterate.

**Using For Loop**

```
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //creating Set of String Type
        Set<String> planets = new HashSet<>();
        //creating Set of Integer Type
        Set<Integer> numbers = new HashSet<>();

        //add elements to planets Set
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");
        planets.add("Neptune");
        planets.add("Venus");
        planets.add("Uranus");
        planets.add("Mercury");

        //add elements to numbers Set
        numbers.add(10);
        numbers.add(40);
        numbers.add(100);
        numbers.add(80);
        numbers.add(50);


        //iterate planets and numbers Set using for loop
        for (int i = 0; i < planets.size(); i++) { //i returns index number
            System.out.print(planets.stream().toList().get(i) +", "); //convert to List as Set doesn't maintain insertion order

        }
        System.out.println();
        for (int i = 0; i < numbers.size(); i++) { //i returns index number
            System.out.print(numbers.stream().toList().get(i) +", "); //convert to List as Set doesn't maintain insertion order
        }
    }
}

/**
 * Output: (probably you don't get the same result)
 * Earth, Mars, Neptune, Jupiter, Saturn, Venus, Uranus, Mercury,
 * 80, 50, 100, 40, 10, 
 */
```

**Using Enhanced For Loop**

```
//iterate planets and numbers Set using enhanced for loop
    for (String planet: planets){
        System.out.print(planet +", ");
    }
    System.out.println();
    for (Integer number: numbers){
        System.out.print(number +", ");
    }
```

**Using While Loop**

```
//iterate planets using while loop
{
    int i = 0;
    while (i < planets.size()){
    System.out.println(planets.stream().toList().get(i));
    i++;
}
```

**Using Iterator**

```
//iterate planets using Iterator interface
Iterator<String> list = planets.iterator();
    while (list.hasNext()){
         System.out.println(list.next());
    }
```

## Remove Elements From Set

Method like remove(object) can be used to remove particular elements from Set collection interface in java.

```
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //creating Set of String Type
        Set<String> planets = new HashSet<>();

        //add elements to planets Set
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");
        planets.add("Neptune");

        //before removing
        System.out.println("Before Removing: "+planets);

        //remove an element
        planets.remove("Saturn");

        //after removing
        System.out.println("After Removing: "+planets);
    }
}

/**
 * Output: (probably you don't get the same result)
 * Before Removing: [Earth, Mars, Neptune, Jupiter, Saturn]
 * After Removing: [Earth, Mars, Neptune, Jupiter]
 */
```

## Built in Set Interface Methods in Java

<p>
<b>The following are the important methods that can be used in Set interface to manipulate unique data</b>
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


## Key Things to Note About Java Set Interface

- Set interface is a Collection type in Java
- Set doesn't maintain insertion order
- Set is unordered and not index based
- In order to accessing individual elements of Set we have to convert it to List type
- hSet doesn't support duplicate Elements
- hSet is mutable - adding or removing elements are allowed
- Set implementation is not Synchronized

## Creating Unmodifiable Set in Java

Though Set collection type is modifiable or mutable by its' nature. But there are few two static factory methods available to create unmodifiable Set collection type in java. This is also true for List or Map collection type interface in java.


Here, we will use factory method Set.of() to define unmodifiable Set and we have to provide the elements at the time of creation of Set.


```
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //creating Unmodifiable Set (Elements cannot be added or removed)
        Set<String> planets = Set.of(
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
 * [Mars, Neptune, Earth, Saturn, Jupiter]
 * Exception in thread "main" java.lang.UnsupportedOperationException
 */
```

**Note About Unmodifiable Set**

- Use Set.of() or Set.copyOf() static factory methods to create unmodifiable Set in Java
- Disallow duplicate elements. In case, provide duplicate elements at the time of creating unmodifiable Set, throw IllegalArgumentException error.
- Null elements aren't supported, attempts to create them with null elements result in NullPointerException.
- Elements cannot be added or removed after the creation of unmodifiable Set, throw UnsupportedOperationException error if you try to add or remove elements from the unmodifiable Set.
- They are serializable if all elements are serializable.


