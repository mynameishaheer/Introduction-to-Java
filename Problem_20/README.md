Exercise 1:
Given a DNA string, find all genes it contains.

Background: Biologists use a simple model to represent the building blocks of life, in which the letters A, C, G, and T represent the four bases in the DNA of living organisms. A gene is a substring that represents a functional unit of critical importance in understanding life processes.

A gene has following properties:

- It begins with the start codon ATG.
- Its length is a multiple of 3.
- It ends with one of the stop codons TAG, TAA, or TGA.
- It has no intervening stop codons.

Example: `if String DNA = "ATAGATGCATAGCGCATAGCTAGATGTGCTGAC"`

Then ATGCATAGCGCATAG and ATGTGCTGA are two genes inside DNA.



## Exercise 2:

Write a program `Rotation.java` that takes two command-line arguments (the name of an image file and a real number r and rotates the image r degrees counterclockwise. To rotate, copy the color of each pixel (si,sj) in the source image to a target pixel (ti,tj) whose coordinates are given by the following formulas:

**ti = (si - ci) cos r - (sj -cj) sin r + ci

**tj = (si - ci) sin r + (sj -cj) cos r + cj

where (ci, cj) is the center of the image.
![image](https://user-images.githubusercontent.com/94866222/186717259-95734311-c371-4e9e-9dd3-ef580d179216.png)  ![image](https://user-images.githubusercontent.com/94866222/186717311-9fe6188e-78c6-4199-a651-4ce7924cd5e6.png)


## Exercise 3:

Creating a swirl effect is similar to rotation, except that the angle r changes as a function of distance to the center of the image. Use the same formulas as in the previous exercise, but compute r as a function of (si,sj), specifically Pi/256 times the distance to the center.

![image](https://user-images.githubusercontent.com/94866222/186717415-f29adc8f-03c0-44e0-9b0e-92fafd0268dc.png)  ![image](https://user-images.githubusercontent.com/94866222/186717442-ef74aeed-7833-4177-848c-ab49722df815.png)

