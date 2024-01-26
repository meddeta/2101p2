# AugmentedStack Java Implementation
Overview
The AugmentedStack class is a custom implementation of a stack data structure in Java. It extends the traditional stack functionality by including a method to retrieve the minimum element present in the stack at any given time. This feature makes it particularly useful for applications where frequent retrieval of the minimum element is required, without the need to traverse or sort the entire stack.

Features
Push Operation: Adds an element to the top of the stack.
Pop Operation: Removes and returns the top element of the stack.
Get Minimum: Retrieves the current minimum element in the stack without removing it.
Top Element: Provides access to the top element without removing it.
IsEmpty Check: Determines if the stack is empty.
How It Works
AugmentedStack uses two java.util.Stack objects:

Data Stack: Stores all the elements of the stack.
Minimum Stack: Keeps track of the minimum elements. The top of this stack always contains the current minimum element in the data stack.
Whenever a new element is pushed onto the stack, it is also pushed onto the minimum stack if it is smaller than or equal to the current minimum. When an element is popped from the data stack, it is also popped from the minimum stack if it is equal to the current minimum.

# Coins Java Program
Overview
The Coins Java program is designed to calculate and display all the distinct ways in which a given amount of cents can be made using standard US coins (quarters, dimes, nickels, and pennies). This program is particularly useful for educational purposes, especially in understanding combinations and permutations in basic currency calculations.

Features
Input an Amount: Users can input an amount in cents.
Calculate Combinations: The program calculates all unique combinations of quarters (25 cents), dimes (10 cents), nickels (5 cents), and pennies (1 cent) that sum up to the input amount.
Display Results: Displays each combination distinctly.
How to Run
To run this program, follow these steps:

Ensure Java is Installed: Make sure Java is installed on your computer. If not, download and install it from the official Java website.

Compile the Program: Navigate to the directory containing the Coins.java file. Use the command javac Coins.java to compile the program.

Run the Program: Once compiled, run the program using the command java Coins.

Enter an Amount: When prompted, enter the total amount in cents for which you want to find the coin combinations.
Source Code Description
The Coins class contains the main logic for the program. Key methods include:

main: Initializes the program and takes user input.
w: Wrapper method that initiates the calculation process.
e: Recursive method that calculates the different combinations.
p: Method to print the combinations in a readable format.

#Hypercube Java Implementation
This README document provides an overview of the Hypercube Java program, including its purpose, how to set up and run the program, and a brief explanation of its functionalities.

Overview
The Hypercube program is designed to generate and traverse a hypercube of a given dimension. A hypercube, also known as an n-cube, is a generalization of a 3-dimensional cube to n dimensions. This program particularly focuses on generating all corners (vertices) of the hypercube and performing a recursive walk through these corners.

Features
Dimension Specification: Users can create a hypercube of any specified dimension.
Corner Generation: The program generates all possible corners of the hypercube.
Recursive Walk: Traverses through the hypercube corners recursively.
Prerequisites
To run this program, ensure that you have the following installed:

Java Development Kit (JDK), version 8 or later.
Installation
No specific installation steps are required other than having a Java environment set up. Simply download the Hypercube.java file to your local machine.

Usage
To use the Hypercube program, follow these steps:

Compile the Program: Open a terminal or command prompt and navigate to the directory containing the Hypercube.java file. Compile the program using the following command:

Copy code
javac Hypercube.java
Run the Program: After compiling, run the program with:

Copy code
java Hypercube
Specify Dimension (Optional): The program currently defaults to a 3-dimensional hypercube. To use a different dimension, you can modify the main method in the Hypercube class.

Code Explanation
Hypercube class: Main class that initializes and manages the hypercube.
Corner nested class: Represents a corner of the hypercube.
generatecorners(): Generates all corners of the hypercube.
recrusivecorner(): Recursively walks through the corners, printing their coordinates.
Acknowledgements
This project was developed as part of an academic exercise. Special thanks to the instructors and peers who provided insights and feedback.




