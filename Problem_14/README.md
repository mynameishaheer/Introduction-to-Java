## Exercise 1:
Write a static method max3() in `Ex1.java` that takes three int arguments and returns the value of the largest one. Add an overloaded function that does the same thing with three double values.

**_Note: An overloaded function is a set of different functions that happen to have the same name._ **

_E.g., following is an example of overloaded add() function._

```
public static int add(int a, int b) { 
    return a+b; 
}

public static double add(double a, double b) { 
    return a+b;
}
```

Test your overloaded method in main() as follows:

```
public static void main(String[] args) {

    System.out.println( add(1, 3) ); // this will call add() for int

    System.out.println( add(1.5, 3.5) ); // this will call add() for double

}
``` 

## Exercise 2:
Write a static method eq() that takes two int arrays as arguments and returns true if the arrays have the same length and all corresponding pairs of elements are equal, and false otherwise.

## Exercise 3:
Write a function that takes three real arguments, x, y, and s, and plots an equilateral triangle centered on (x, y) with side length s. Call the function a number of times in main to produce an entertaining pattern.

_Hint: Vertices of such equilateral triangles are_

_A = ( x, y+s/sqrt(3) )_

_B = ( x-s/2, y-s/(2*sqrt(3)) )_

_C = ( x+s/2, y-s/(2*sqrt(3)) )_
