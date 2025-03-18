# CourseGrades Project

## Overview

This project implements a grading system using Java, following object-oriented programming principles. It includes various grading components such as lab activities, pass/fail exams, essays, and final exams. Additionally, it implements the `Analyzable` interface to calculate average scores and determine the highest and lowest grades.

## Folder Structure

```
GRADINGSYS/
    ├── AnalyzableInterface/
    │     ├── GradedActivity.java
    │     ├── PassFailActivity.java
    │     ├── Essay.java
    │     ├── FinalExam.java
    │     ├── CourseGradesB.java
    │     ├── Analyzable.java
    │     ├── CourseGradesDemo.java
    │
    ├── README.md
```

## Classes and Responsibilities

### 1. **GradedActivity**

- Represents a graded activity with a numeric score.
- Provides methods to set and retrieve the score and calculate the letter grade.

### 2. **PassFailActivity (extends GradedActivity)**

- Represents a pass/fail exam with a minimum passing score.
- Determines if a student has passed.

### 3. **Essay (extends GradedActivity)**

- Represents an essay with scores based on grammar, spelling, length, and content.

### 4. **FinalExam (extends GradedActivity)**

- Represents a final exam scored based on the number of correct answers.

### 5. **CourseGradesB (implements Analyzable)**

- Stores grades for different assessments using a `GradedActivity[]` array.
- Implements:
  - `getAverage()` to calculate the average score.
  - `getHighest()` to find the highest grade.
  - `getLowest()` to find the lowest grade.

### 6. **Analyzable (Interface)**

- Defines methods:
  - `getAverage()` - calculates the average score.
  - `getHighest()` - returns the highest score.
  - `getLowest()` - returns the lowest score.
- Provides default implementations for `getHighest()` and `getLowest()`.

### 7. **CourseGradesDemo**

- The main class that demonstrates the grading system.
- Creates and sets grades for different activities.
- Displays grades and statistics.

## Compilation & Execution

### **Step 1: Navigate to the Assignment4 Directory**

```sh
cd C:\Users\oluwa\Desktop\GRADINGSYSTEM
```

### **Step 2: Compile All Classes**

```sh
javac AnalyzableInterface/*.java
```

### **Step 3: Run the Demo Class**

```sh
java AnalyzableInterface.CourseGradesDemo
```

## Common Issues & Fixes

1. **Package Not Found Error**:

   - Ensure all classes inside `AnalyzableInterface` include:
     ```java
     package AnalyzableInterface;
     ```
   - Compile from the GRADINGSYSTEM \*\*.

2. **Cannot Find Symbol Error**:

   - Ensure all class names match exactly (Java is case-sensitive).
   - Check that all `.java` files exist in the correct folder.

3. **ClassNotFoundException When Running**:

   - Ensure you run the program with the package name:
     ```sh
     java AnalyzableInterface.CourseGradesDemo
     ```

## Author

- Name: Oluwatobi Emmanuel Afolabi
- Course: Computer Science
- Course Grades System

## License

This project is for educational purposes only. Feel free to modify and expand upon it.

