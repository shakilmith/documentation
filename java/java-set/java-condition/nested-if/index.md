# Java Nested If Statement

When if statement is present in another if statement is called nested if statement. Such as,

```
public class Main {
    public static void main(String[] args) {
        int weight = 95;
        int age = 35;
        String result = "";

        //using nested if statement
        if(weight > 80){
            if(age <= 50 && age > 30){
                result = "You can participate in this game";
            }
        }
        else {
            System.out.println("Something went wrong.");
        }
        System.out.println(result);
    }
}
/**
 * Output:
 * You can participate in this game
 */
```

Note that, nested if statement can always be replaced with logical && or else if statement. Such as,

```
public class Main {
    public static void main(String[] args) {
        int weight = 95;
        int age = 35;
        String result = "";

        //replace nested if statement
        if(weight > 80 && (age <= 50 && age > 30)){
            result = "You can participate in this game";
        }
        else {
            System.out.println("Something went wrong.");
        }
        System.out.println(result);
    }
}
/**
 * Output:
 * You can participate in this game
 */
```