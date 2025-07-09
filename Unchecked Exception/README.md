# ⚠️ Unchecked Exception Example in Java

This folder contains a demonstration of how to create and use a **custom unchecked exception** (`RuntimeException`) in Java, using a simple age-based voting eligibility scenario.

---

## 📄 File: `UncheckedUnderAgeException.java`

This program checks if a person is eligible to vote. If the person's age is less than 18, it throws a **custom unchecked exception** named `UnderAgeException`.

---

## 🔧 Key Features

| Feature                 | Description                                                |
|-------------------------|------------------------------------------------------------|
| ✅ Custom Exception     | `UnderAgeException` extends `RuntimeException`             |
| 🧪 Exception Throwing   | Uses `throw` to manually raise an exception                |
| 🔁 Constructor Overload | Two constructors in the custom exception class             |
| 🛠️ Exception Handling   | Uses `try-catch` block and `printStackTrace()` for details |

---

## 🔍 Sample Output

java.lang.UnderAgeException: you are not eligible to vote.
at UncheckedUnderAgeException.main(UncheckedUnderAgeException.java:14)
hello

---

## 📘 Concept Explanation

**Unchecked exceptions** are not checked at compile-time and usually indicate logical errors that can be avoided with proper validation.

### Why Use Unchecked Exception?
- Cleaner code in many cases
- Ideal for rule-breaking scenarios like invalid input, illegal state, etc.

---

## 👨‍💻 Author : Ikramullah Jamali
