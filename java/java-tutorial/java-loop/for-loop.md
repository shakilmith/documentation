# Java For Loop and While Loop

Iterate over arrays or collection of elements like List or Set even iterate simple String types (sequence of characters) java looping statement (for loop, while loop or foreach loop) is used. Similarly we can say, to iterate some statements multiple times we basically use the concept of loop. 


## Using Java For Loop

**Syntax**

```
for(initialization; condition; iteration){
  //code block to execute
}

//such as

for(int i = 0; i < 10; i++ ){
  System.out.println(i); //not only the inner variable, applicable for anything
}
```

Every for loop has three important parts to follow:

Initialization: In this step, we set the initial value for the loop control variable. You can declare the variable outside the parentheses as well.

Condition: It is a boolean expression that tests the loop control variable. If it is true, then the for loop continues to iterate the statement until it becomes false. If the condition is false then the execution of the statement will terminate.

Iteration: We can say it increment or decrement step. It is an iteration expression that determines how the loop control variable is changed or updated every time the loop iterates.

++ : it is called increment operator. It increases it's operand (in our case, the initial variable) by one. If you initial variable is i, then i = i + 1 and i++ are same.

-- : it is called decrement operator. It decrease it's operand (in our case, the initial variable) by one. If you initial variable is i, then i = i - 1 and i++ are same.


***Let's see how to iterate collection of values, like simple arrays using java for loop.***

**Iterate over arrays**

```
public class Main {
    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5};
        for(int i = 0; i < 5; i++){ //here i means index number that starts with 0
            System.out.print(numbers[i] +" "); //implicitly call toString() method
        }
    }
}
/**
 * Output:
 * 1 2 3 4 5
 */
```

**Iterate Collections like List**

```
public class Main {
    public static void main(String[] args) {

        List<String> planets = List.of(
                "Earth", "Jupiter", "Saturn",
                "Mars", "Neptune", "Venus",
                "Uranus", "Neptune"
        ); //list of elements

        //using for loop to iterate the planets list
        for (int i = 0; i < planets.size(); i++) { //planets.size returns 8
            System.out.print(planets.get(i) +" ");
        }
    }
}
/**
 * Output:
 * Earth Jupiter Saturn Mars Neptune Venus Uranus Neptune
 */
```

**Note:** If we use println than print only, then each element starts from new line.

When iterating Collection types like List, Set or Map better to use enhanced for loop. Such as, the above example can be replaced by the following shorthand for loop.

```
//using for loop to iterate the planets list
    for (String planet : planets) { //type alias : list
        System.out.print(planet + " ");
    }
```



