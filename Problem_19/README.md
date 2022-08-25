## Exercise 1:

Use recursion) Given a string, create a new string with all the consecutive duplicates removed. Ex: ABBCCCCCBBAB -> ABCBAB.


## Exercise 2:

Write a recursive function printTwos that accepts an integer parameter n and that prints an expression composed of a single odd number multiplied by twos that is equal to n. The twos should surround the odd number with an equal number of twos on either side if possible. Several calls and their output are shown below.

Call | Output
<br /> `printTwos(80)` |	2 * 2 * 5 * 2 * 2
<br /> `printTwos(68)` |	2 * 17 * 2
<br /> `printTwos(96)` |	2 * 2 * 2 * 3 * 2 * 2
<br /> `printTwos(32)` |	2 * 2 * 2 * 1 * 2 * 2
<br /> `printTwos(1)` |	1
<br /> `printTwos(2)` | 2 * 1

If the expression has an odd number of twos, then the "extra" two should appear at the front of the expression, as shown in the output from passing 96 and 32. If the number is odd to begin with, it should simply be printed. It is possible that the odd number to print will be 1, as shown in the output from passing 32, 1, and 2 above.

Assume that your method is always passed a value greater than equal to 1.


## Exercise 3:

https://www.hackerrank.com/challenges/camelcase/problem
