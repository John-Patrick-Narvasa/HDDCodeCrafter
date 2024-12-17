Sure! Here’s another set of problems focused on one-dimensional and two-dimensional arrays.

---

# FORM

## Topic: Array  
### Specific Coverages: 
- One Dimensional Array
- Two Dimensional Array  
### Difficulty: Easy to Medium

### No. of Items: 3

### Test Style: Problem Solving

---

## Problem Title: Odd and Even Number Sorter

### Problem Summary:
Create a program that accepts a list of integers and sorts them into two separate arrays: one for odd numbers and one for even numbers. After sorting, display both arrays. Additionally, handle edge cases such as empty input and input with no odd or even numbers.

### Example Input/Output:

**Example 1:**
```
Input numbers: [10, 15, 20, 25, 30]

Output:
Even numbers: [10, 20, 30]
Odd numbers: [15, 25]
```

**Example 2:**
```
Input numbers: [1, 3, 5, 7, 9]

Output:
Even numbers: []
Odd numbers: [1, 3, 5, 7, 9]
```

**Example 3:**
```
Input numbers: []

Output:
Even numbers: []
Odd numbers: []
```

### Constraints:
- The input array can contain up to 50 integers.
- The program should handle duplicate values.
- Ensure the output maintains the order of the original input.

---

## Problem Title: Attendance Tracker

### Problem Summary:
Design a program that records student attendance for a week. The program should use a two-dimensional array where rows represent days of the week and columns represent students. Users should input '1' for present and '0' for absent. After the input, the program should display the attendance matrix and also calculate the total attendance for each student.

### Example Input/Output:

**Example 1:**
```
Input attendance for 3 students over 5 days:
Day 1: [1, 0, 1]
Day 2: [1, 1, 1]
Day 3: [0, 1, 0]
Day 4: [1, 0, 1]
Day 5: [1, 1, 0]

Output:
Attendance Matrix:
1 0 1
1 1 1
0 1 0
1 0 1
1 1 0

Total attendance per student:
Student 1: 4
Student 2: 3
Student 3: 3
```

**Example 2:**
```
Input attendance for 2 students over 3 days:
Day 1: [0, 0]
Day 2: [0, 0]
Day 3: [0, 0]

Output:
Attendance Matrix:
0 0
0 0
0 0

Total attendance per student:
Student 1: 0
Student 2: 0
```

### Constraints:
- The program should handle attendance for a maximum of 30 students.
- Days of the week should be fixed for 7 days.
- Ensure that invalid inputs (e.g., other than 0 or 1) are not accepted.

---

## Problem Title: Matrix Sum and Average

### Problem Summary:
Write a program that takes a two-dimensional array of integers and calculates the sum and average of all elements in the matrix. Handle edge cases such as empty matrices and matrices containing only zeros.

### Example Input/Output:

**Example 1:**
```
Input matrix:
1 2 3
4 5 6

Output:
Sum: 21
Average: 3.5
```

**Example 2:**
```
Input matrix:
0 0 0
0 0 0

Output:
Sum: 0
Average: 0.0
```

**Example 3:**
```
Input matrix:
(empty)

Output:
Sum: 0
Average: 0.0
```

### Constraints:
- The matrix can have a maximum dimension of 10x10.
- The program should handle both square and rectangular matrices.
- Ensure that the average is displayed with two decimal precision.

--- 

*Please take your time to work on these problems. Answers will be provided in 20 minutes.*