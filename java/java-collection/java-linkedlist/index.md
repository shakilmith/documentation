# Java LinkedList

**LinkedList** in java is a resizable array like **ArrayList**. There is no size limit in LinkedList. When you add new elements or items in the LinkedList, the size or capacity of LinkedList will grow like Java ArrayList. You can do many things like add new elements, remove elements, change elements, sort the elements etc. like ArrayList. Both ArrayList and LinkedList implements List interface. Thus, possibly all the methods you can use in the ArrayList can also be used in LinkedList.

**Syntax**

```
//non-generic or row types
LinkedList list = new LinkedList();

//Generic approach: (with wrapper types)
LinkedList<T> list = new LinkedList(); ////T stands for type but wrapper. Primitive is not supported.

//such as 
LinkedList<String> list = new LinkedList();
```

## Example of Creating, Adding and Accessing Elements of LinkedList

In this very first example, we will see how to create generic LinkedList, adding new elements to the LinkedList and accessing elements using index number.


```
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> planets = new LinkedList<>();
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");

        //accessing first element using get(index) method
        System.out.println("First Element: "+planets.get(0)); //returns the first element
        //access the fits el using getFirst method
        System.out.println("First Element (using getFirst): "+planets.getFirst());
        System.out.println("Second Element: "+planets.get(1));
        System.out.println("Last Element: "+planets.get(planets.size() - 1));
        //returns last el using getLast method
        System.out.println("Last Element (using  getLast): "+planets.getLast());
    }
}

/**
 * Output:
 * First Element: Earth
 * First Element (using getFirst): Earth
 * Second Element: Jupiter
 * Last Element: Mars
 * Last Element (using  getLast): Mars
 */
```

## Iterating LinkedList

we can simply iterate or loop through LinkedList elements using for loop, enhanced for loop or built in Iterator interface.

**Using For Loop**

```
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> planets = new LinkedList<>();
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");

        //iterating LinkedList elements using for loop
        for (int i = 0; i < planets.size(); i++) {
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
 */
```

**Using Enhanced For Loop**

```
//iterating LinkedList elements using enhanced for loop
    for (String planet : planets) {
        System.out.println(planet);
    }

/**
 * Output:
 * Earth
 * Jupiter
 * Saturn
 * Mars
 */
```

**Using Iterator Interface**

```
import java.util.Iterator;

//iterate planets elements using Iterator interface
    Iterator<String> list = planets.iterator();
    while (list.hasNext()){
        System.out.println(list.next());
    }
```

**Note:** Which approach should I use to iterate LinkedList? Usually it depends on requirements and performances. Specially, IDE suggests to use enhanced for loop to iterate Collection type elements. But, you can choose whatever prefer most.


## LinkedList Built in Methods


<p>
<b>Methods for LinkedList:</b>
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

<tr>
    <td>addFirst()</td>
    <td>void</td>
    <td>Insert new element at the beginning of the LinkedList.</td>
</tr>
    
<tr>
    <td>addLast()</td>
    <td>void</td>
    <td>Insert new element at the end of the list.</td>
</tr>
<tr>
    <td>getFirst()</td>
    <td>type of list</td>
    <td>Get the item of first position of the list.</td>
</tr>
<tr>
    <td>getLast()</td>
    <td>type of list</td>
    <td>Retrieve the last element of the list.</td>
</tr>
<tr>
    <td>removeFirst()</td>
    <td>type of list</td>
    <td>Remove the first element from the list.</td>
</tr>
<tr>
    <td>removeLast()</td>
    <td>type of list</td>
    <td>Remove the last element from the list.</td>
</tr>
    
<tr>
    <td>clear()</td>
    <td>void</td>
    <td>Remove all the elements from the list.</td>
</tr>
    
<tr>
    <td>clone()</td>
    <td>Object</td>
    <td>Returns a shallow copy of the list.</td>
</tr>
<tr>
    <td>poll()</td>
    <td>E</td>
    <td>Retrieves and then remove the first element of the list.</td>
</tr>
<tr>
    <td>peek()</td>
    <td>E</td>
    <td>Retrieves but doesn't remove the first element.</td>
</tr>
</table>


## Key Things to Note About Java LinkedList

- LinkedList is one kind of Collection Type in Java
- It is resizable Array and the implementation of the List interface
- You can create LinkedList generic or non-generic order.
- There is no size limit of LinkedList in java
- The capacity or size of LinkedList can grow when you add new elements in it
- The members of LinkedList are ordered, index based, mutable (new elements can be added or removed as well)
- LinkedList supports duplicate elements
- Allowed only wrapper types and only one type (Integer or String not both)
- LinkedList size can be modified unlike Java Array type
- There is no need to specify the size of LinkedList