# Ex1 - Fundamentals of Functional Programming and Testing

## Objective of the assignment
This is the README for the Ex1 assignment, which is part of the **Introduction to Computing** course at Ariel University.
The goal of this assignment is to introduce the basics of functional programming and testing,
while working with strings, arrays, and numerical calculations.
In this assignment, we built a **Number Format Converter** and a **Calculator**,
which will operate on numbers represented as strings in different numerical bases (2-16), 
including basic arithmetic operations (addition, multiplication).
And find the maximum number in a list of numbers, while appropriately handling invalid inputs.
All this while updating the code on GitHub.

### Example Usage
Below is an example of how the program should behave when executed:
1.Ex1 class solution:
Enter a string as number#1 (or "quit" to end the program):
4b5
num1= 4b5 is number: True , value: 4
Enter a string as number#2 (or "quit" to end the program):
8
num2= 8 is number: True , value: 8
Enter a base for output: (a number [2,16]
10
4b5 + 8 = 12
4b5 * 8 = 32
Max number over [4b5, 8, 12, 32] is: 32

2. Ex1 class solution:
Enter a string as number#1 (or "quit" to end the program):
4Ab8
num1= 4Ab8 is number: False , value: -1
ERR: num1 is in the wrong format! (4Ab8)

Ex1 class solution:
Enter a string as number#1 (or "quit" to end the program):
4AbG
num1= 4AbG is number: True , value: 74
Enter a string as number#2 (or "quit" to end the program):
5b9
num2= 5b9 is number: True , value: 5
Enter a base for output: (a number [2,16]
11
4AbG + 5b9 = 72bB
4AbG * 5b9 = 307bB
Max number over [4AbG, 5b9, 72bB, 307bB] is: 307bB