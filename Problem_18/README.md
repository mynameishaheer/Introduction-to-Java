## Exercise 1:

Write a method named `rotateLeft` that accepts an array of integers as a parameter and rotates the values in the array to the left (i.e., backward in position) by one. Each element moves left by one, except the first element, which moves to the last position. For example, if a variable named list refers to an array containing the values `{3, 8, 19, 7}`, the call of `rotateLeft(list)` should modify it to store `{8, 19, 7, 3}`. A subsequent call of `rotateLeft(list)` would leave the array as follows: `{19, 7, 3, 8}`


## Exercise 2:

Write a recursive method `sumTo` that accepts an integer parameter n and returns the sum of the first n reciprocals.<br /> 
In other words: `sumTo(n)` returns: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n

Assume that your method is always passed a value greater than equal to 0.


## Exercise 3:

Write a recursive method `writeChars` that accepts an integer parameter n and that prints out n characters as follows. The middle character of the output should always be an asterisk ("*"). If you are asked to write out an even number of characters, then there will be two asterisks in the middle ("**"). Before the asterisk(s) you should write out less-than characters ("<"). After the asterisk(s) you should write out greater-than characters (">"). For example, the following calls produce the following output:

##### Call | Output
<br /> writeChars(1) |	*
<br /> writeChars(2) |	* *
<br /> writeChars(3) |	< * >
<br /> writeChars(4) |	< * * >
<br /> writeChars(5) |	< < * > >
<br /> writeChars(6) |	< < * * > >
<br /> writeChars(7) |	< < < * > > >
<br /> writeChars(8) |	< < < * * > > >

Assume that your method is always passed a value greater than equal to 1.
