# ✅ Checked Exception Example in Java 

This folder contains an example of a **custom checked exception** in Java using a real-life scenario of voting eligibility based on age. 

---

## 📄 File: `CheckedUnderAgeException.java` 

This Java program checks if a person is eligible to vote. If the person is under 18, a custom **checked exception** (`UnderAgeException`) is thrown and caught using a `try-catch` block. 

--- 

## 🔧 Key Features 

| Feature                 | Description                                                |
|-------------------------|------------------------------------------------------------|
| ✅ Custom Exception     | `UnderAgeException` extends `Exception` (Checked Exception)|
| 💡 Real-World Scenario   | Validates age for voting eligibility                      |
| 🧪 Exception Throwing   | Uses `throw` to raise the custom exception                 |
| 🛠️ Exception Handling   | Uses `try-catch` and `printStackTrace()` for debugging     |

--- 

## 🔍 Sample Output (if age < 18) 

java.lang.UnderAgeException: you are not eligible to vote. 
at CheckedUnderAgeException.main(CheckedUnderAgeException.java:14) 

--- 
 
## 📘 Concept Explanation 

### ✅ What is a Checked Exception? 
- Checked exceptions are **verified at compile-time**. 
- They **must** be either caught using `try-catch` or declared using `throws`. 

### 💡 Why Use Checked Exceptions? 
- Enforces developers to handle important conditions that might otherwise be overlooked. 
- Promotes safer and more predictable code. 

--- 

## 👨‍💻 Author : Ikramullah Jamali
