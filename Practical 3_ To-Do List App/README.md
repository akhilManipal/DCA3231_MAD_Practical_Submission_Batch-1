# Practical 3: To-Do List App

[Submission Link](https://github.com/akhilManipal/To-DoListApp)    

## Exercise Objective:
Build a simple Android To-Do List app that allows users to add and remove tasks.

## Problem Statement:
Create an app with an input field to enter a task and an "Add" button to add the task to the list. Include a "Delete" button next to each task to allow removal from the list.

## Instructions:
- Ensure your code is well-commented to enhance readability.
- Adhere to proper naming conventions for variables and other elements in your code.
- Your code should compile without any errors, warnings, or deprecations.
- Minimize the use of unnecessary whitespaces including newlines, spaces, and tabs.
- Thoroughly test your code before submission to ensure it functions as expected.

## Expected Output:
The app dynamically updates the list as tasks are added or removed.

## Blackbox Test Cases:

|S. No |	Sample Input  | Sample Output |
|------|------|------|
|1 |	Add: "Buy milk" |	List: "Buy milk" |
|2 |	Add: "Read book" |	List: "Buy milk", "Read book" |
|3 |	Delete: "Buy milk" |	List: "Read book" |
|4 |	Add: "Workout" |	List: "Read book", "Workout" |
|5 |	Add: "Call mom" |	List: "Read book", "Workout", "Call mom" |
|6 |	Delete: "Read book" |	List: "Workout", "Call mom" |
|7 |	Delete: "Workout" |	List: "Call mom" |
|8 |	Add: "Grocery shopping" |	List: "Call mom", "Grocery shopping" |
|9 |	Add: "Pay bills" |	List: "Call mom", "Grocery shopping", "Pay bills" |
|10 |	Delete: "Call mom" |	List: "Grocery shopping", "Pay bills" |
