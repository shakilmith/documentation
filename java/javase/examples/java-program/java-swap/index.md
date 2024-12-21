## Swap Two Int Number in Java

Swapping is a Technique where two variables actively share their values each other. In java, there are many scenarios where we have to use the concept of swapping like sorting collections (like array, list, map etc.), to bring data from hard disk to RAM etc. 

In this vary first example, we will swap two int variables each other based on a new temporary variable. Let's look at the following example.


**SwapExample1.java**

```
public class SwapExample1 {
    public static void main(String[] args) {
        //declare two int variables
        int x = 5;
        int y = 10;
        //temporary variable
        int temp = 0;

        System.out.println("Before Swapping:");
        System.out.println("x is: "+x);
        System.out.println("y is: "+y);

        //swap x and y
        temp = x; //now temp = 5;
        x = y; //now x = 10
        y = temp; //now y = 5

        System.out.println("After Swapping:");
        System.out.println("x is: "+x);
        System.out.println("y is: "+y);
    }
}
```

If you run the above example, you will get the following result.

```
Before Swapping:
x is: 5
y is: 10
After Swapping:
x is: 10
y is: 5
```

Here we have used a temporary variable to exchange the values of x and y each other. Lets' look at the following sorting example, where we have used the swapping technique to sort the array (ascending order) in java.

**Using Swap Technique to Sort Java Array**

```
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

Now after running the above example, we will get the sorted result.

```
Before Sorting:
0, 1, 2, 3, 4, 5, 6, 7, 8, 
After Sorting
-3, -1, 0, 2, 5, 6, 7, 8, 10,
```