# Java ArrayList

Today in this post we are going to explore Java ArrayList that is one kind of collection type in Java. 

ArrayList in java is a resizable array and it is the implementation of the ***List*** interface. There is no size limit of ArrayList class. The capacity of the ArrayList will grow by adding new elements. Thus, you don't have to specify the size of ArrayList like regular array type. Overall it is one of the big differences between java built in Array and ArrayList. We know that java Array size can not be modified but ArrayList size can be modified. Though it is always possible to set the initial capacity of the ArrayList type.


Additionally, there are lot of methods available to work with java ArrayList.

**Syntax**

```
ArrayList list = new ArrayList<>(); 

ArrayList fruits = new ArrayList();
    //add elements 
```

Here, {`<T>`} is the type of elements. You can't use primitive types. You have to use wrapper types like Integer, Float, String or objects. As primitive types aren't supported by ArrayList or any other built in Collection types.

**Note:** It is important to import the java ArrayList class first from **java.util** package before using it in your application. 


## Creating, Adding and Accessing Elements to the ArrayList

Let's look at the following example where we have created an ArrayList instance and adding new elements to using the built in add method.

```
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>(); //creating new ArrayList

        //adding new elements to planets array_list using the add method
        planets.add("Earth"); //reserve the first index that is 0
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");

        //access the elements of the planets ArrayList using the index number
        System.out.println("First Element: "+planets.get(0)); //built in get method used to set the index number
        System.out.println("Second Element: "+ planets.get(1));
        System.out.println("Last Element: "+planets.getLast()); //getFirst and getLast returns the first and last element respectively
    }
}

/**
 * Output:
 * First Element: Jupiter
 * Second Element: Saturn
 * Last Element: Mars
 */
```

## Iterating ArrayList Elements

In case we want to access all the members of the ArrayList sequentially at a time without  invoking the get(index) method frequently, we can use the technique of iterating or loop through list of elements in java. Here, we are going to check out few of them.


**Iterating ArrayList Using Java For Loop**

```
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>(); //creating new ArrayList

        //adding new elements to planets array_list using the add method
        planets.add("Earth"); //reserve the first index that is 0
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");
        planets.add("Neptune");
        planets.add("Venus");
        planets.add("Uranus");
        planets.add("Mercury");

        //iterate over ArrayList using for loop
        for (int i = 0; i < planets.size(); i++) { //here i=0 indicates the index number of the ArrayList element
            System.out.println(planets.get(i)); //get(i) returns each element of the planets list
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
 * Venus
 * Uranus
 * Mercury
 */
```

Instead of using for loop, we can also use enhanced for loop, like the below:

**Iterating ArrayList Using Java Enhanced for Loop**

```
//iterate over ArrayList using enhanced for loop
    for (String planet : planets) {
        System.out.println(planet);
    }

/**
* Output: 
* same as above
*/
```

**Iterating ArrayList Using Built in Iterator**

```
import java.util.ArrayList;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>(); //creating new ArrayList

        //adding new elements to planets array_list using the add method
        planets.add("Earth"); //reserve the first index that is 0
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");
        planets.add("Neptune");
        planets.add("Venus");
        planets.add("Uranus");
        planets.add("Mercury");

        //iterate using Iterator interface
        Iterator<String> list = planets.iterator(); //row used can also be okay
        while (list.hasNext()){
            System.out.println(list.next() +", ");
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
 * Venus
 * Uranus
 * Mercury
 */
```

**Note:** Which approach should I use to iterate ArrayList? Usually it depends on requirements and performances. Specially, IDE suggests to use enhanced for loop to iterate Collection type elements. But, you can choose whatever prefer most.


## Removing ArrayList Elements

We will use built in remove(index) method to remove elements from the ArrayList. Additionally removeFirst and removeLast remove first and last element respectively.


```
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>(); //creating new ArrayList

        //adding new elements to planets array_list using the add method
        planets.add("Earth"); //acquires index 0
        planets.add("Jupiter"); //acquires index 1
        planets.add("Saturn"); //acquires index 2
        planets.add("Mars"); //acquires index 3

        //before removing the first element
        System.out.println("First el before removing: " +planets.get(0)); //accessing the first element
        //removing the first element
        planets.remove(0); //using remove(index) method
        System.out.println("First el after removing: "+planets.get(0)); //now return Jupiter, that was second element though
        /*
        * removeFirst also remove the first element of the list
        */
    }
}
```


## Built in ArrayList Methods

There are plenty of built in methods available to work with java ArrayList. Below I describe few of them.

<p>
<b>Methods of ArrayList:</b>
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



## Key Things to Note About Java ArrayList

- ArrayList is one kind of Collection Type in Java
- It is resizable Array and the implementation of the List interface
- You can create ArrayList generic or non-generic order.
- There is no size limit of ArrayList in java
- The capacity or size of ArrayList can grow when you add new elements in it
- The members of ArrayList are ordered, index based and mutable (new elements can be added and removed as well)
- Allowed only wrapper types and only one type (Integer or String not both)
- ArrayList supports duplicate elements
- ArrayList size can be modified unlike Java Array type
- There is no need to specify the size of ArrayList