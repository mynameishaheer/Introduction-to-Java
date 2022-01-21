## Exercise 1:
Write a program named `Palindrome.java` that prints true if and only if the input string is palindrome 

_(A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as "madam" or "racecar" or "10201".)_

## Exercise 2:

A anagram is a word or a phrase that can be created by rearranging the letters of another given word or phrase. We ignore white spaces and letter case. The all letters of "Desperation" can be rearranged to the phrase "A Rope Ends It".

Implement a `Anagram.java` that checks two given strings whether one is an anagram of the other.

_Hint: For every character c in the first string, find c in the the second string and remove._

**String Operations:**

`s.length()` returns length of string s.

`s.charAt(i)` return char at index i.

String s can be converted to lower case with `s = s.toLowerCase();`

You can check if char c is whitespace by `character.isWhitespace(c);`

`s.contains(b)` returns true if s contains String b

A char c can be converted to String using `character.toString(c)`

`s = s.replaceFirst(c, "");` will replace first occurence of c in s with "" _(thus remove it)_

`s = s.replace(" ", "");` will remove all space characters from s 
