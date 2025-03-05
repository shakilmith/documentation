# Java Switch Statement


Switch statement is a conditional statement that helps us to avoid multiple else if statements. Such as,

```
if (condition){
    //if block
}
else if(condition){
    //else if block (1)
}
else if(condition){
    //else if block (2)
}
else if(condition){
    //else if block (3)
}
else {
    /optional else block
}
```

But with switch statement, we can simply reduce the use of multiple else if statements.

```
switch (expression){
    case 1: //code block
        break;
    case 2: //code block
        break;
    case 3: //code block
        break;
    case 4: //code block
        break;
    default: //default code block
}
```

**Syntax**

```
switch (expression){
    case 1: //code block
        break;
    case 2: //code block
        break;
    case 3: //code
        break;
    default: //default code block
}
```


**Note:** Here, inside parenthesis of switch, we use expression that is our predefined statement and each case block will work upon the expression. If any case block match with the expression (expression can be int, string or object type etc.) then it will print and rest of the case block will not be checked and compiler go to the next task. If none of the case block match with the switch expression, then the default block will eventually executed.
Also note that, the break statement is used inside the switch to terminate a statement sequence. When a break statement is encountered, execution branches to the first line of code that follows the entire switch statement. This has the effect of “jumping out” of the switch.


## Example of Switch Expression Against the Multiple Else If Statements


**While Using Multiple Else If Statements**

```
public class Main {
    public static void main(String[] args) {
        String day = "Monday";
        if(day.equals("Saturday")){
            System.out.println("It is Saturday");
        }
        else if (day.equals("Monday")) {
            System.out.println("It is Monday");
        }
        else if (day.equals("Friday")) {
            System.out.println("It is Friday");
        }
        else {
            System.out.println("Something went wrong");
        }
    }
}
/**
 * Output:
 * Something went wrong.
 */
```

**While Using Switch Statement**

```
public class Main {
    public static void main(String[] args) {
        String day = "Monday";
        //switch statement
        switch (day){
            case "Saturday":
                System.out.println("It is Saturday"); 
                break;
            case "Monday":
                System.out.println("It is Monday"); 
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            default:
                System.out.println("Something went wrong");
        }
    }
}
/**
 * Output:
 * Something went wrong.
 */
```

## Another Example Java Switch Statement

```
public class Main {
    public static void main(String[] args) {
        int num = 10;
        String result;

        switch (num){
            case 3:
                result = "It is an odd and prime number";
                break;
            case 5:
                result = "It is odd and prime too";
                break;
            case 9:
                result = "It is odd but not prime";
                break;
            case 10:
                result = "It is an even number";
                break;
            default:
                result = "Something went wrong";
        }
        System.out.println(result);
    }
}
/**
 * Output:
 * It is an even number
 */
```