# ⚙️ try_catch_Problems - Java Exception Handling Examples

This folder contains well-commented and clean Java programs that demonstrate the use of **`try`**, **`catch`**, and **`finally`** blocks for exception handling.   
These examples are created to help beginners understand how Java handles errors like divide-by-zero and invalid code flow using exception mechanisms.  

---  

## 📁 Folder Overview  

This project includes multiple individual class files, each focusing on a specific concept related to exception handling:  
 
### ✅ 1. `TryCatchBasic.java`  
- Demonstrates basic use of `try-catch` to handle divide-by-zero (`ArithmeticException`).  
- Shows that program continues after exception handling.  

### 🔄 2. `TryCatchFlow.java`  
- Explains the **flow of execution** inside a `try` block when an exception occurs.  
- Uses print statements (`1`, `2`, `3`, ...) to visually track the control flow.  

### 🧠 3. `TryCatchWithInfo.java` + `ExceptionInfo.java`  
#### Provides **multiple ways to extract information** from exceptions using:  
  - `printStackTrace()`  
  - `toString()`  
  - `getMessage()`  
#### Separated into two files:  
  - `TryCatchWithInfo.java` throws an exception.  
  - `ExceptionInfo.java` handles and displays detailed information.  

### ⚠️ 4. `TryCatchCombinations.java`  
- Lists **valid and invalid** combinations of `try`, `catch`, and `finally`.  
- Includes **commented code examples** with notes about what is allowed or not allowed in Java.  

### 📈 5. `TryCatchSuccessfulFlow.java`  
- Similar to `TryCatchFlow.java`, but without any exception.  
- Demonstrates smooth program flow when there is **no runtime error**.  

---

## 📚 Topics Covered  
- Runtime exception handling  
- `ArithmeticException` (divide by zero)  
- Exception object methods: `getMessage()`, `toString()`, `printStackTrace()`  
- Legal and illegal try-catch-finally structures  
- Separation of logic and responsibility across classes  

---  

📂 Directory Structure  

try_catch_Problems/  
├── TryCatchBasic.java  
├── TryCatchFlow.java  
├── TryCatchWithInfo.java  
├── ExceptionInfo.java  
├── TryCatchCombinations.java  
└── TryCatchSuccessfulFlow.java  

---  

## 🧑‍💻 How to Run  
Each file has its own `main()` method. Compile and run them one by one:  

javac FileName.java  
java ClassName  
Example:  

javac TryCatchBasic.java  
java TryCatchBasic  

---  

#### 🔖 Notes  
No external libraries required.  
Written using Java SE (Standard Edition).  
Focuses on clean, readable code and educational value.  
---

### 🧠 Tip: Exception handling is a must-know for building robust applications. These examples form a strong foundation for learning advanced error handling in Java.

## 🙋‍♂️ Author: Ikramullah Jamali



