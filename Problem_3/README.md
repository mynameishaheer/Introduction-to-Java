## Exercise 1:
Write a program AllEqual.java that takes three integer command-line arguments and prints true if all three are equal, and false otherwise.


## Exercise 2:
Write a program SumOfTwoDice.java that prints the sum of two random integers between 1 and 6 _(such as you might get when rolling dice)_. Use `Math.random()`.


## Exercise 3:
The International Standard Book Number _(ISBN)_ is a 10 digit code that uniquely specifies a book. The rightmost digit is a checksum digit which can be uniquely determined from the other 9 digits from the condition that _d1 + 2d2 + 3d3 + ... + 10d10_ must be a multiple of 11 _(here di denotes the ith digit from the right)_. The checksum digit d1 can be any value from 0 to 10: the ISBN convention is to use the value X to denote 10.

**_Example: the checksum digit corresponding to 020131452 is 5 since is the only value of d1 between 0 and and 10 for which d1 + 2*2 + 3*5 + 4*4 + 5*1 + 6*3 + 7*1 + 8*0 + 9*2 + 10*0 is a multiple of 11._**

Write a program ISBN.java that takes a 9-digit integer as a command-line argument, computes the checksum, and prints the 10-digit ISBN number. It's ok if you don't print any leading 0s.

_Hint: if an int variable x contains a 9 digit integer, then you can access its individual digits as follows:
int d2 = x % 10;
int d3 = (x % 100) / 10;
int d4 = (x % 1000) / 100;
and so on._
