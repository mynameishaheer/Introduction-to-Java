## Exercise 1:

Write a program that create array of int from command line and print the number of even ints in the array. Hint:

```

int[] a = new int[args.length];

for(int i=0; i< args.length; i++)

a[i] = Integer.parseInt( args[i] );

```


## Exercise 2:

Write a program isSorted.java that given an array of real numbers prints true if the list is in sorted (non-decreasing) order and false otherwise. For example, if arrays store [16.1, 12.3, 22.2, 14.4] and [1.5, 4.3, 7.0, 19.5, 25.1, 46.2] respectively, your program should print false and true respectively. Assume the array has at least one element. A one-element array is considered to be sorted.
 

## Exercise 3:

Describe and explain what happens when you try to compile a program HugeArray.java with the following statement:

```

int n = 1000;

int[] a = new int[n*n*n*n];

```

## Bonus Exercise:

Write a code fragment that reverses the order of values in a one-dimensional String array. For instance, the following array 
``` 
String[] a = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; 
```
would be transformed to
```
{"nine", "eight", "seven", "six", "five", "four", "three", "two", "one", "zero"}
```

*Do not create another array to hold the result. Hint: Use the code in the text for exchanging two elements.*
