# LibraryManagementSystem

## Overview

The Library Management System is a console-based, Java-written application simulating core library operations. It follows key OOP concepts such as **Inheritance, Encapsulation, and Polymorphism** through a practical multi-level class structure. The user can manage books, perform issue and return operations, and view records using an intuitive text-based menu.

## Features

* **Book Addition:** Enter details such as Book ID, Title, Author, Genre, and Availability.
* **Book Information Display:** The ability to display all stored information about books.
* **Issue & Return:** Perform book issue and return operations with proper validation.
* **Availability Check:** Check whether a book is available or already issued.
* **Record Management:** Maintain updated records of all books in the system.

## Technologies Used

* **Programming Language:** Java
* **Concepts:** Multilevel Inheritance, OOP, Scanner Class for I/O
* **Tools:** Any Java IDE: Eclipse, IntelliJ IDEA, VS Code, or command line with JDK installed

## Installation & Run Instructions

### Prerequisites

* Java Development Kit (JDK) 8 or higher installed
* A terminal or command prompt

### Steps to Run

1. **Clone the Repository:**

```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

2. **Compile the Java File:**

```bash
javac LibraryManagementSystem.java
```

3. **Run the Application:**

```bash
java LibraryManagementSystem
```

4. **Follow the on-screen menu:** This will guide the user through adding books, issuing, returning, and viewing records.

## Directions for Testing

1. **Book Addition:** Fill in all book details correctly. Ensure the data is stored and displayed properly.

2. **Issue Book:**

* Issue available book → Success
* Issue same book again → "Book not available"

3. **Return Book:**

* Return issued book → Success
* Return non-issued book → Error

4. **Invalid Inputs:**

* Wrong Book ID → Error
* Invalid menu option → Retry

5. **Menu Navigation:** Test all menu options and exit option.
