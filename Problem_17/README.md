Exercise 1:

Given a string, write a method `countHi()` to compute recursively (no loops) the number of times lowercase "hi" appears in the string.

`countHi("xxhixx")` is 1

`countHi("xhixhix")` is 2

`countHi("hi")` is 1

Hint: `s.indexOf("hi")` returns the index of first occurrence of "hi" in String s. (It returns -1 if "hi" does not occur in s)

Â 

Exercise 2:

Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

count7(717) is 2

count7(7) is 1

count7(123) is 0

Â 

Exercise 3:

Write a program to produce each of the following recursive patterns. The ratio of the sizes of the squares is 2.2:1. To draw a shaded square, draw a filled gray square, then an unfilled black square.
