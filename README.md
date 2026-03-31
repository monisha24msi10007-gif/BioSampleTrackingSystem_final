# 🧬 Bio Sample Tracking System

## 📌 Project Overview

The Bio Sample Tracking System is a Java-based application designed to manage and track biological samples such as blood, tissue, and other lab specimens. This system helps in organizing sample data efficiently and reduces manual record-keeping errors.

---

## 🚀 Features

* Add new biological samples
* View all stored samples
* Update sample status
* Delete sample records
* Database integration using JDBC

---

## 🛠️ Technologies Used

* Java
* MySQL
* JDBC (Java Database Connectivity)
* OOP Concepts

---

## 📂 Project Structure

```
BioSampleTracking/
│── src/
│   ├── model/          # Sample class
│   ├── service/        # Business logic
│   ├── database/       # DB connection
│   └── main/           # Main execution file
```

---

## ⚙️ Setup Instructions

### 1. Install Requirements

* Java (JDK 8 or above)
* MySQL Server
* IDE (Eclipse / IntelliJ / VS Code)

---

### 2. Database Setup

Run the following SQL:

```sql
CREATE DATABASE biosample_db;

USE biosample_db;

CREATE TABLE samples (
    sampleId INT PRIMARY KEY,
    sampleType VARCHAR(50),
    collectionDate VARCHAR(20),
    storageLocation VARCHAR(50),
    status VARCHAR(20)
);
```

---

### 3. Configure Database Connection

Edit `DBConnection.java`:

```java
private static final String USER = "root";
private static final String PASSWORD = "your_password";
```

---

### 4. Run the Project

* Compile all Java files
* Run `Main.java`

---

## ▶️ Usage

1. Choose an option from the menu
2. Enter required details
3. Perform operations like add, update, delete, view

---

## 📸 Sample Output

```
--- Bio Sample Tracking System ---
1. Add Sample
2. View Samples
3. Update Status
4. Delete Sample
5. Exit
```

---

## 🎯 Future Enhancements

* GUI using JavaFX/Swing
* File export (I/O Streams)
* Multithreading for auto-save
* User authentication system

---

## 👩‍💻 Author

Name: Monisha
Course: Programming in Java (CSE2006)
Institution: VIT Bhopal

---

## 📚 Learning Outcomes

* Applied OOP concepts
* Implemented JDBC for database operations
* Built a real-world problem-solving system
* Improved debugging and exception handling skills
