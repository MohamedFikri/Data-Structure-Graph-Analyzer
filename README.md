# Data Structure and Graph Performance Analyzer

**Course:** CIT300 – Data Structures and Algorithms  
**Project Type:** Java Console-Based Application  
**Development Tools:** Java, Visual Studio Code, Git and GitHub

## 1. Project Description

The **Data Structure and Graph Performance Analyzer** is a Java-based console application developed to demonstrate fundamental data structures, searching algorithms, graph traversal techniques, and algorithm performance.

The application provides an interactive, menu-driven interface that allows users to perform insertion, deletion, searching, and traversal operations.

The project also includes a performance comparison feature to demonstrate the differences between Linear Search and Binary Search.

This project was developed collaboratively by four team members using Java and GitHub.

## 2. Team Members

| Member | Student Name | Student ID | Role |
|---|---|---|---|
| 1 | Mohamed Fikri | 23DA2-0681 | Team Leader |
| 2 | Ammar | 23DA2-0990 | Team Member |
| 3 | Asheem | 23DA2-1089 | Team Member |
| 4 | M. N. Nuzail Ahamed | 23DA2-1022 | Team Member |

## 3. Assigned Responsibilities and Individual Contributions

### Member 1 – Mohamed Fikri (Team Leader)

**Student ID:** 23DA2-0681

**Assigned Responsibilities:**
- Array Operations
- Linear Search and Binary Search
- Performance Comparison
- Main Menu Integration
- Final Testing and Project Coordination

**Individual Contributions:**
- Developed the Array Operations module with insertion, deletion, searching, and display functions.
- Implemented Linear Search and Binary Search algorithms.
- Developed the Performance Comparison module to compare searching algorithms.
- Implemented the main menu and integrated different data structure modules.
- Performed system integration, debugging, and final testing.
- Prepared the README documentation and coordinated project collaboration.

**Java Files:**
- `ArrayOperations.java`
- `SearchingOperations.java`
- `PerformanceAnalyzer.java`
- `Main.java`

### Member 2 – Ammar

**Student ID:** 23DA2-0990

**Assigned Responsibilities:**
- Stack Operations
- Queue Operations
- Testing and Error Handling

**Individual Contributions:**
- Developed the Stack Operations module using Java.
- Implemented Push, Pop, Peek, and Display operations.
- Developed the Queue Operations module using Java.
- Implemented Enqueue, Dequeue, Peek, and Display operations.
- Handled empty Stack and Queue conditions.
- Tested both modules using the Member2Test class.

**Java Files:**
- `StackOperations.java`
- `QueueOperations.java`
- `Member2Test.java`

### Member 3 – Asheem

**Student ID:** 23DA2-1089

**Assigned Responsibilities:**
- Linked List Operations
- Linked List Testing

**Individual Contributions:**
- Developed the Linked List module.
- Implemented insertion at the beginning, end, and specific positions.
- Developed deletion by value and position.
- Implemented searching and displaying Linked List elements.
- Handled empty Linked List conditions.
- Tested the module using the Member3Test class.

**Java Files:**
- `LinkedListOperations.java`
- `Member3Test.java`

### Member 4 – M. N. Nuzail Ahamed

**Student ID:** 23DA2-1022

**Assigned Responsibilities:**
- Graph Operations
- BFS and DFS Traversal

**Individual Contributions:**
- Developed the Campus Graph module.
- Implemented Add Vertex and Add Edge operations.
- Implemented graph display functionality.
- Developed Breadth-First Search (BFS).
- Developed Depth-First Search (DFS).
- Implemented graph representation using an adjacency list.
- Contributed to graph functionality testing.

**Java File:**
- `CampusGraph.java`

## 4. Technologies Used

| Technology | Purpose |
|---|---|
| Java | Application development |
| Visual Studio Code | Code development and debugging |
| JDK | Compilation and execution |
| Git | Version control |
| GitHub | Team collaboration and source code management |
| PowerShell / Terminal | Running and testing the application |

## 5. Main System Features

### 5.1 Array Operations
- Insert elements
- Delete elements
- Search elements
- Display elements

### 5.2 Stack Operations
- Push
- Pop
- Peek
- Display
- Empty stack handling

The Stack follows the **Last In, First Out (LIFO)** principle.

### 5.3 Queue Operations
- Enqueue
- Dequeue
- Peek
- Display
- Empty queue handling

The Queue follows the **First In, First Out (FIFO)** principle.

### 5.4 Linked List Operations
- Insert at beginning
- Insert at end
- Insert at a specific position
- Delete by value
- Delete by position
- Search elements
- Display elements

### 5.5 Searching Operations
- Linear Search
- Binary Search

### 5.6 Graph Operations
- Add Vertex
- Add Edge
- Remove Vertex
- Remove Edge
- Display Graph
- BFS Traversal
- DFS Traversal

The Graph module represents an undirected campus road network using an adjacency list.

### 5.7 Performance Comparison

The system compares Linear Search and Binary Search based on:

- Search results
- Number of steps
- Execution time in nanoseconds
- Time complexity

**Time Complexity:**
- Linear Search: O(n)
- Binary Search: O(log n)

### 5.8 Display All Results

Displays the current contents of:
- Array
- Stack
- Queue
- Linked List
- Campus Graph

## 6. Project Structure

```text
Data-Structure-Graph-Analyzer/
│
├── src/
│   ├── Main.java
│   ├── ArrayOperations.java
│   ├── SearchingOperations.java
│   ├── StackOperations.java
│   ├── QueueOperations.java
│   ├── LinkedListOperations.java
│   ├── CampusGraph.java
│   ├── PerformanceAnalyzer.java
│   ├── Member2Test.java
│   └── Member3Test.java
│
└── README.md
```

## 7. Instructions for Running the Program

### Prerequisites

Install the Java Development Kit (JDK) and ensure Java is available in the terminal.

### Step 1 – Clone the Repository

```bash
git clone https://github.com/MohamedFikri/Data-Structure-Graph-Analyzer.git
```

### Step 2 – Open the Project Directory

```bash
cd Data-Structure-Graph-Analyzer
```

### Step 3 – Compile the Java Files

```bash
javac -d build src/*.java
```

### Step 4 – Run the Application

```bash
java -cp build Main
```

### Step 5 – Select an Operation

After running the program, the following main menu will appear:

```text
=============================================
 DATA STRUCTURE & GRAPH ANALYZER
=============================================
1. Array Operations
2. Stack Operations
3. Queue Operations
4. Linked List Operations
5. Searching Operations
6. Graph Operations
7. Performance Comparison
8. Display All Results
9. Exit
```

Enter the corresponding option number and follow the instructions shown in the console.

## 8. GitHub Collaboration

The project was developed collaboratively using Git and GitHub.

Each team member was assigned specific responsibilities and worked on their respective modules.

GitHub branches, commits, and pull requests were used to organize contributions and integrate the completed modules.

**Repository:**

https://github.com/MohamedFikri/Data-Structure-Graph-Analyzer

## 9. Testing

The application was tested through the Java console interface.

Testing activities included:
- Checking insertion and deletion operations.
- Testing Stack and Queue functionality.
- Testing Linked List operations.
- Checking searching algorithms.
- Testing graph connections and traversals.
- Checking performance comparison results.
- Verifying the integrated main menu.

Separate test classes include `Member2Test.java` and `Member3Test.java`.

## 10. Conclusion

The Data Structure and Graph Performance Analyzer demonstrates the practical implementation of fundamental data structures and algorithms using Java.

The project improved our understanding of data structures, searching techniques, graph traversal, algorithm performance, debugging, testing, and collaborative software development.

The application provides a simple and interactive way to understand how different data structures and algorithms work.