Sure! Here’s a set of more challenging problems that incorporate recursion and a terminal-based spreadsheet simulation.

---

# FORM

## Topic: Array  
### Specific Coverages: 
- One Dimensional Array
- Two Dimensional Array  
### Difficulty: Hard

### No. of Items: 3

### Test Style: Problem Solving

---

## Problem Title: Recursive Array Sum

### Problem Summary:
Write a recursive function to calculate the sum of all elements in a one-dimensional array. The function should handle edge cases such as an empty array and should return 0 when the array is empty. If the array contains negative numbers, ensure that they are included in the sum.

### Example Input/Output:

**Example 1:**
```
Input array: [1, 2, 3, 4, 5]

Output:
Sum: 15
```

**Example 2:**
```
Input array: [10, -2, 3, -5]

Output:
Sum: 6
```

**Example 3:**
```
Input array: []

Output:
Sum: 0
```

### Constraints:
- The input array can contain up to 100 integers.
- Ensure that the recursion handles large arrays without stack overflow.

---

## Problem Title: Terminal-Based Spreadsheet

### Problem Summary:
Create a terminal-based spreadsheet application that allows users to input and manipulate a 2D array representing a spreadsheet. The program should support the following functionalities:
1. Display the current state of the spreadsheet.
2. Input a value into a specific cell (e.g., `set A1 100`).
3. Calculate and display the sum of values in a specific row or column (e.g., `sum row 1` or `sum column A`).
4. Clear a specific cell or row (e.g., `clear A1` or `clear row 2`).

### Example Input/Output:

**Example 1:**
```
> set A1 100
> set B1 200
> set A2 300
> display

Output:
   A     B
1 100   200
2 300   0

> sum row 1
Output: 300

> clear A1
> display

Output:
   A     B
1 0     200
2 300   0
```

**Example 2:**
```
> set A1 50
> set A2 150
> sum column A
Output: 200

> clear row 1
> display

Output:
   A     B
1 0     0
2 150   0
```

### Constraints:
- The spreadsheet should support a maximum size of 10x10 cells.
- Input should be validated to ensure that it does not exceed the array bounds.
- Handle inputs for clearing cells or summing rows/columns that do not exist gracefully.

---

## Problem Title: Recursive Binary Search

### Problem Summary:
Implement a recursive binary search algorithm that finds the index of a target value in a sorted one-dimensional array. If the target value is not found, return -1. Ensure that the algorithm handles edge cases such as an empty array and searches for values not in the array.

### Example Input/Output:

**Example 1:**
```
Input array: [1, 2, 3, 4, 5]
Search for: 3

Output:
Index of 3 is 2
```

**Example 2:**
```
Input array: [10, 20, 30, 40, 50]
Search for: 25

Output:
25 not found
```

**Example 3:**
```
Input array: []
Search for: 1

Output:
Array is empty
```

### Constraints:
- The input array can contain up to 100 integers.
- The array must be sorted prior to searching.
- Implement the binary search using recursion only.

--- 

*Please take your time to work on these problems. Answers will be provided in 20 minutes.*