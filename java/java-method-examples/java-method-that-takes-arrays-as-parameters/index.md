# Java Method Example that Takes Arrays of int and Loop Through It

In this example post, we see how to define a method that takes arrays of int as parameters and logic to loop through it, and then when we call the method with anonymous array as arguments, it will loop through it.

```
public class MethodExample3 {
    public static void main(String[] args) {
        //call the printArray method
        int[] array1 = {10, 30, 50};
        int[] array2 = {10, 20, 60, 70, 100};

        System.out.println("First Array Iteration");
        printArrays(array1);

        System.out.println("Second Array Iteration");
        printArrays(array2);
    }

    //method that takes arrays of int as parameters
    //logic to loop through it
    public static void printArrays(int[] numbers){
        for (int num: numbers){
            System.out.println(num); //using forEach loop for simplicity
        }
    }
}
```

The output will be:

```
First Array Iteration
10
30
50
Second Array Iteration
10
20
60
70
100
```

Here, this method can be called multiple times, or in case we need to iterate arrays of int numbers, we can also reuse it.

