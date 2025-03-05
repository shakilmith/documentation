## Java While Loop


To iterate some statements multiple times we basically use the concept of loop. There are few kinds of loop in java like for loop, while, do while loop, foreach loop etc.

Today we are going to talk about Java **while** loop.

Java while loop is used when we don't know exactly how many times the iteration takes place or how many times loop through a code block.

**Syntax**

```
while(condition){
    //statement to execute
    iteration (increment/decrement operator);
}
```

**Condition:** The condition can be any boolean expression. The statement inside the loop will be executed till the condition is true. When it is false the loop will be terminated and go to the next line immediately. You can omit the curly brackets if only a single statement is being repeated.

**Loop control variable:** It should be declared first that will be checked by conditional expression.

**Iteration:** It is an increment or decrement portion that is also dependent on the condition. There should be an iteration expression otherwise, the loop will not be terminated, so it is an required part.


# Simple program to demonstrate while loop in java

```
public class Main {
    public static void main(String[] args) {
        int i = 1; //initial value is 1

        while(i < 5){
            System.out.println(i); //print i till i is less than 5
            i++; //increment by 1, it is required part
        }
    }
}

/**
 * Output:
 * 1
 * 2
 * 3
 * 4
 */
```

What if, we use the increment operator before printing the value of i reference?

```
public class Main {
    public static void main(String[] args) {
        int i = 1; //initial value is 1

        while(i < 5){
            i++; //increment by 1, it is required part
            System.out.println(i); //print i till i is less than 5
        }
    }
}

/**
 * Output:
 * 2
 * 3
 * 4
 * 5
 */
```

**Differences:** In the first example, it prints the initial value then increment it's value by 1 and then checks the condition and continuing the iteration till the condition becomes true. But, in the second approach, increment the initial value by 1 and print it then checks the condition is matched or not, thus it also prints 5 though it doesn't fulfill the requirements.


**Another Example of Java While Loop**

```
public class Main {
    public static void main(String[] args) {

        int x = 1;
        int y = 10;

        while( x < 10){
            //statement to be executed
            System.out.print(x +" ");

            //iteration
            x++; //increment by one
        }
        System.out.println(" ");
        while(y > 0){
            //statement to be executed
            System.out.print(y +" ");

            //iteration
            y--; //decrement by ine
        }

    }
}

/**
 * Output:
 * 1 2 3 4 5 6 7 8 9  
 * 10 9 8 7 6 5 4 3 2 1
 */
```

## Loop Through Java Array Using While Loop

```
public class Main {
    public static void main(String[] args) {
        int i = 0; //behaves like index number

        String [] planets = {
                "Earth", "Jupiter", "Saturn",
                "Mars", "Neptune", "Venus",
                "Uranus", "Neptune"};

        //using while loop to iterate planets array
        while (i < planets.length){
            System.out.println(planets[i]); //print each element of the planets list
            i++; //increment by 1
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
 * Neptune
 */
```

## Print Collection Type Using While Loop

Let's guess, we have collection of elements and we want to loop through them using while loop. Such as,

```
import java.util.List; //import the List class first

List<String> planets = List.of(
                "Earth", "Jupiter", "Saturn",
                "Mars", "Neptune", "Venus",
                "Uranus", "Neptune"
        );

        //using while loop to iterate planets List
        while (i < planets.size()){
            System.out.println(planets.get(i)); //print each element of the planets list
            i++; //increment by 1
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
 * Neptune
 */
```

**Note:** Don't forgot to set the step of iteration. Otherwise the loop will never be terminated.



