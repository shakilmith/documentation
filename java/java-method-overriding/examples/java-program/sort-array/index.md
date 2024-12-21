# Java Sort Array

We can sort array elements either ascending or descending order using the swapping technique. But, there are other approaches available too and in collection framework, there is a method called Collection.sort() to sort collection type. But this feature isn't present in built in array type. Let's guess the following example, where we will sort (ASC order) array of int elements.

```
package com.javaondemand.example.array;


public class SortArrayExample1 {
    public static void main(String[] args) {
        //java array declaration and initialization
        int [] array = {-3, -1, 10, 5, 2, 8,6,7, 0};

        System.out.println("Before Sorting:");
        int x = 0;
        while (x < array.length){
            System.out.print(x + ", ");
            x++;
        }

        //using for loop to sort array
        System.out.println("\nAfter Sorting");
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1 ; j < array.length; ++j){
                //declare a temporary variable
                int temp = 0;
                if (array[i] > array[j]){
                    //using swapping technique
                    temp = array [i]; //temp get the indexes of i
                    array[i] = array[j]; //i get the indexes of j
                    array[j] = temp; //j get the indexes of temp
                }
            }

            System.out.print(array[i] +", ");
        }
    }
}
```

After running the following example, you will get the following output where our array elements are sorted by ascending order.

```
Before Sorting:
0, 1, 2, 3, 4, 5, 6, 7, 8, 
After Sorting
-3, -1, 0, 2, 5, 6, 7, 8, 10, 
```

But if we want to sort the array elements descending order, then we have less than operator ( {`<`} ) in if condition inside for loop only. Such as,

```
if (array[i] < array[j])
```
Now, the array elements will be sorted descending order (up to bottom).

```
Before Sorting:
0, 1, 2, 3, 4, 5, 6, 7, 8, 
After Sorting
10, 8, 7, 6, 5, 2, 0, -1, -3,
```