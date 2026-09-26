To-Do List App (Java)
A simple command-line To-Do List application built in Java. It lets users add, view, and remove tasks through a menu-driven console interface.

Features
Add Task – Add a new task to the list.
View Tasks – Display all current tasks with numbering.
Remove Task – Remove a task by its number or by typing its exact name.
Input Validation – Handles invalid menu choices and non-numeric input gracefully.
Exit – Cleanly exits the application.
Tech Stack
Java (JDK 17+, uses switch expressions)
ArrayList for in-memory task storage
Scanner for console input
How It Works
The app runs in a loop, displaying a menu with four options: Add Task, View Tasks, Remove Task, and Exit. Tasks are stored in memory using an ArrayList<String> for the duration of the program's run.

How to Run
Make sure you have Java (JDK 17 or later) installed.
Compile the program:
   javac ToDoListApp.java
   Run it:
   java ToDoListApp
Follow the on-screen menu to add, view, or remove tasks.
Example
==== TO-DO LIST MENU ====
1. Add Task
2. View Tasks
3. Remove Task
4. Exit
Enter your choice: 1
Enter the task: Finish resume
Task added.
Possible Future Improvements
Persist tasks to a file or database so they aren't lost on exit.
Add task editing and due dates.
Build a GUI (JavaFX or Swing) or REST API version.
