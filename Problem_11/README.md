## Exercise 1:
Write a program `MaxMin.java` that first asks user the number of integers n they want to enter. Read in n integers from standard-input and prints out the maximum and minimum values.

_Note: The smallest and largest int in java are available as `Integer.MIN_VALUE` and `Integer.MAX_VALUE` respectively._

## Exercise 2:
Write a program `LongestRun.java` that reads in a sequence of integers and prints out both the integer that appears in a longest consecutive run and the length of the run. For example, if the input is 1 2 2 1 5 1 1 7 7 7 7 1 1, then your program should print Longest run: 4 consecutive 7s.

### Scanner Class
We need to import scanner class first. Write `import javal.util.Scanner;` as first line of your program.
Create Scanner object as follows: `Scanner sc = new Scanner(System.in);`
`sc.nextLine()` reads complete line and returns as String.
`sc.next()` reads a word and returns as String.
`sc.nextInt()` reads an integer and returns as int.
