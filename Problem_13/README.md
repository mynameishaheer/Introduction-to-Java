## Exercise 1:
Write a Java program `AddMatrix.java` to add two matrices a,b of the same size and print the result.

Sample matrices can be initialized as follows.

`int[][] a = { {2, 5, 7}, {1, 3, 6}, {5, 4, 1} };`

`int[][] b = { {1, 9, 5}, {7, 1, 5}, {3, 4, 2} };`

## Exercise 2:
Given a 2d-array a[][] and an index j, write a program `SumCol.java` that compute sum of elements in column j of a[][].

## Exercise 3:
Given a 9-by-9 array of integers between 1 and 9, write `SudokuCheck.java` to check if it is a valid solution to a Sudoku puzzle: each row, column, and block should contain the 9 integers exactly once.
```
 5 3 4 | 6 7 8 | 9 1 2 
 6 7 2 | 1 9 5 | 3 4 8 
 1 9 8 | 3 4 2 | 5 6 7
-------+-------+------ 
 8 5 9 | 7 6 1 | 4 2 3 
 4 2 6 | 8 5 3 | 7 9 1 
 7 1 3 | 9 2 4 | 8 5 6 
-------+-------+------ 
 9 6 1 | 5 3 7 | 2 8 4 
 2 8 7 | 4 1 9 | 6 3 5 
 3 4 5 | 2 8 6 | 1 7 9
```
The above Sudoku board can be stored in 2d array as follows:
```
int[][] a = {

{5, 3, 4, 6, 7, 8, 9, 1, 2},

{6, 7, 2, 1, 9, 5, 3, 4, 8},

{1, 9, 8, 3, 4, 2, 5, 6, 7},

{8, 5, 9, 7, 6, 1, 4, 2, 3},

{4, 2, 6, 8, 5, 3, 7, 9, 1},

{7, 1, 3, 9, 2, 4, 8, 5, 6},

{9, 6, 1, 5, 3, 7, 2, 8, 4},

{2, 8, 7, 4, 1, 9, 6, 3, 5},

{3, 4, 5, 2, 8, 6, 1, 7, 9} };
```
