# DSA_SESSIONS
This repository will contain various DSA questions solved by me and my partner during our live sessions. 

Our first task was to select a dsa pattern of our choice, we started with the most basic,i.e., sorting

Our First DSA pattern is insertion sort
Insertion Sort is a simple sorting technique that builds the final sorted array one element at a time. It takes each element from the unsorted part and inserts it into its correct position in the sorted part.Out 
Step-by-Step Explanation:
Start with the second element (the first element is already considered sorted).
Pick the current element (called key) and compare it with elements in the sorted part on its left.
Shift elements that are greater than the key one position to the right.
Insert the key into the correct position in the sorted part.

This repository contains the solution to our second DSA question.
Although the Two Sum problem is considered a basic problem, it requires proper handling of logic and exceptions, especially when dealing with user input and edge cases.
The goal of the problem is to find two distinct elements in an array such that their sum is equal to a given target value.
This problem was solved collaboratively by me and my partner.
We implemented the solution using two different approaches to better understand time–space tradeoffs.
🛠️ Approaches Used
1️⃣ Brute Force Method
Uses two nested loops
Checks all possible pairs
Simple and easy to understand
Time Complexity: O(n²)
Space Complexity: O(1)
✔ Best for learning basics
❌ Not efficient for large inputs

2️⃣ HashMap Method
Uses a HashMap to store elements and their indices
Checks if the required complement exists
Efficient and commonly used in interviews
Time Complexity: O(n)
Space Complexity: O(n)
✔ Fast and optimized
✔ Demonstrates use of data structures

Third problem we did was for the Left Rotate Array by One Place problem, a fundamental concept in Data Structures and Algorithms. The task involves shifting all elements of an array one position to the left and moving the first element to the end.
👥 Team Contribution
Java Implementation: Done by me
C++ Implementation: Done by my partner
Both implementations follow the same logic but are written in different programming languages to demonstrate cross-language understanding.
⚙️ Approach Used
The first element of the array is stored in a temporary variable.
All remaining elements are shifted one position to the left.
The stored element is placed at the end of the array.
This approach performs the rotation in-place, without using any extra array.
⏱️ Time and Space Complexity
Time Complexity: O(n) — each element is shifted once
Space Complexity: O(1) — only one extra variable is used
