
# Data Structure and Graph Performance Analyzer

## Project Overview

The Data Structure and Graph Performance Analyzer is a Java-based console application developed to demonstrate fundamental data structures and algorithms.

The application provides a menu-driven interface that allows users to perform different operations and observe how data structures and algorithms work.

## Project Objectives

- Implement fundamental data structures using Java.
- Demonstrate insertion, deletion, searching, and traversal operations.
- Implement Linear Search and Binary Search algorithms.
- Demonstrate BFS and DFS graph traversal algorithms.
- Compare the performance of searching algorithms.
- Improve teamwork and version control skills using GitHub.

## Technologies Used

- Java
- Visual Studio Code
- Git
- GitHub
- Java Development Kit (JDK)

## Project Features

### 1. Array Operations
- Insert elements
- Delete elements
- Search elements
- Display elements

### 2. Stack Operations
- Push
- Pop
- Peek
- Display

Stack follows the Last In, First Out (LIFO) principle.

### 3. Queue Operations
- Enqueue
- Dequeue
- Peek
- Display

Queue follows the First In, First Out (FIFO) principle.

### 4. Linked List Operations
- Insert at beginning
- Insert at end
- Insert at a specific position
- Delete by value
- Delete by position
- Search
- Display

### 5. Searching Operations
- Linear Search
- Binary Search

### 6. Graph Operations
- Add location
- Add connection
- Remove location
- Remove connection
- Display graph
- Breadth-First Search (BFS)
- Depth-First Search (DFS)

The graph represents an undirected campus road network using an adjacency list.

### 7. Performance Comparison

The application includes a performance comparison feature for searching algorithms.

### 8. Display All Results

Displays the current data stored in the Array, Stack, Queue, Linked List, and Graph modules.

## Project Structure

```text
DataStructureGraphAnalyzer/
|-- src/
|   |-- Main.java
|   |-- ArrayOperations.java
|   |-- StackOperations.java
|   |-- QueueOperations.java
|   |-- LinkedListOperations.java
|   |-- SearchingOperations.java
|   |-- CampusGraph.java
|   |-- PerformanceAnalyzer.java
|   |-- Member2Test.java
|   |-- Member3Test.java
|-- README.md
```

## How to Run the Project

### Step 1: Open the Project

Open the project folder using Visual Studio Code.

### Step 2: Compile Java Files

Run the following command in the terminal:

```powershell
javac -d build src/*.java
```

### Step 3: Run the Application

```powershell
java -cp build Main
```

### Step 4: Select an Operation

Choose a number from the main menu and follow the instructions displayed in the terminal.

## Main Menu

1. Array Operations
2. Stack Operations
3. Queue Operations
4. Linked List Operations
5. Searching Operations
6. Graph Operations
7. Performance Comparison
8. Display All Results
9. Exit

## Team Collaboration

The project was developed collaboratively using Git and GitHub.

Team members contributed to different modules, and the source code was integrated into a single Java console application.

## Testing

The project includes separate test classes for Stack, Queue, and Linked List operations.

- Member2Test.java
- Member3Test.java

All modules should be compiled and tested before the final demonstration.

## Conclusion

This project demonstrates the practical implementation of fundamental data structures and algorithms using Java.

It provides experience in programming, algorithm analysis, debugging, testing, and collaborative software development.
