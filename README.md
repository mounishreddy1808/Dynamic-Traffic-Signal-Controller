# Smart Traffic Management System 🚦

## Overview

The Smart Traffic Management System is a Java-based simulation project that dynamically controls traffic signals based on real-time traffic density and emergency vehicle priority.

Unlike traditional fixed-timer traffic signals, this system allocates green signal durations according to the number of vehicles waiting on each road. Emergency vehicles such as ambulances and fire trucks receive the highest priority, ensuring faster passage through intersections.

This project demonstrates the practical application of:

* Data Structures (Priority Queue / Max Heap)
* Object-Oriented Programming (OOP)
* Dynamic Scheduling Algorithms
* Traffic Flow Management Concepts
* Java Programming Fundamentals

---

## Features

### Dynamic Green Signal Timing

Signal duration is automatically adjusted based on vehicle count.

| Vehicle Count | Green Time |
| ------------- | ---------- |
| 0 - 10        | 10 seconds |
| 11 - 20       | 20 seconds |
| 21 - 30       | 30 seconds |
| 31+           | 40 seconds |

---

### Emergency Vehicle Priority

Roads containing emergency vehicles are immediately prioritized over normal traffic.

Examples:

* Ambulance
* Fire Truck
* Police Vehicle

---

### Priority Queue Scheduling

The project uses Java's `PriorityQueue` to efficiently determine which road should receive the next green signal.

Priority Rules:

1. Emergency vehicles first
2. Higher vehicle count next
3. Lower priority roads later

---

### Traffic Statistics

The system generates useful traffic analytics including:

* Total cycles completed
* Total vehicles processed
* Average vehicles per road

---

## Technologies Used

* Java
* Object-Oriented Programming
* Priority Queue (Max Heap)
* Collections Framework
* Scanner Class

---

## Project Structure

```text
SmartTrafficManagement/
│
├── Main.java
└── README.md
```

---

## How It Works

### Step 1

The user enters the number of traffic cycles.

### Step 2

For each cycle:

* Vehicle count is entered for each road.
* Emergency vehicle status is provided.

### Step 3

All roads are inserted into a Priority Queue.

### Step 4

The system automatically selects the highest-priority road.

### Step 5

A green signal is allocated with an appropriate duration.

### Step 6

Statistics are generated after all cycles are completed.

---

## Sample Input

```text
2

15
false

30
true

8
false

22
false
```

---

## Sample Output

```text
========== CYCLE 1 ==========

Green Signal -> Road 2
EMERGENCY VEHICLE DETECTED
Vehicles Waiting : 30
Green Time : 30 seconds

Green Signal -> Road 4
Vehicles Waiting : 22
Green Time : 30 seconds

Green Signal -> Road 1
Vehicles Waiting : 15
Green Time : 20 seconds

Green Signal -> Road 3
Vehicles Waiting : 8
Green Time : 10 seconds
```

---

## Time Complexity

### Insertion into Priority Queue

```text
O(log n)
```

### Removing Highest Priority Road

```text
O(log n)
```

### Overall Complexity

```text
O(n log n)
```

Where:

* n = number of roads

---

## Future Enhancements

* Graphical User Interface (Java Swing / JavaFX)
* Real-Time Sensor Integration
* Traffic Camera Support
* AI-Based Traffic Prediction
* Peak-Hour Optimization
* Cloud-Based Monitoring Dashboard
* IoT Traffic Signal Integration
* Multi-Junction Traffic Coordination

---

## Learning Outcomes

Through this project, students can gain practical experience in:

* Java Programming
* Object-Oriented Design
* Data Structures
* Priority Queue Implementation
* Real-World Traffic Management Systems
* Simulation-Based Development

---

## Author

Developed as a Smart Traffic Management System mini-project using Java.
