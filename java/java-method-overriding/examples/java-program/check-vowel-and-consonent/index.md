# Java Program To Check Vowel and Consonant

Let's write simple java program, where we are going to check a certain character is vowel or consonant.

```
public class CheckVCExample {
    public static void main(String[] args) {
        
        char letter = 'e';
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println(letter + " is a vowel");
        } else {
            System.out.println(letter + " is a consonant");
        }
    }
}
```

If we run the above example, we will see the following output that, the above letter is vowel.

```
e is a vowel
```

If you set a char value other than a, e, i, o, u (including capital of them), the above program consider they are consonant.

Therefore, in order to make A and a both are same, we have to do the following:

```
public class CheckVCExample {
    public static void main(String[] args) {

        char letter = 'E';
        if ((letter == 'a' || letter == 'A') || (letter == 'e' || letter == 'E') || (letter == 'i' || letter == 'I') || (letter == 'o' || letter == 'O') || (letter == 'u' || letter == 'U')){
            System.out.println(letter + " is a vowel");
        } else {
            System.out.println(letter + " is a consonant");
        }
    }
}
```

Now, a and A or e and E treat same as vowels.

```
E is a vowel
```

But instead of a, e, i, o, u if you set the value of letter variable m/M, then the output would be:

```
is a consonant
```

**Using Switch/Case**

The above program can be written using switch statement. Such as,

```
public class CheckVCExample2 {
    public static void main(String[] args) {
        //declare an initialize
        char letter = 'i'; //check I too
        switch (letter) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println(letter+ " is vowel");
                break;
            default:
                System.out.println(letter + " is consonant");
        }
    }
}
/**
 * i is vowel
 */
```

**Note:** In case, you can't logical OR (||) and logical NOT (&&) operator, but can use multiple case block at a time and they treat like logical OR operator.