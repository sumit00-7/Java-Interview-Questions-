# Java Interview Questions & Answers

This README provides answers to common Java interview questions, which can help in understanding core Java concepts.

---

## 1. What are the differences between JDK, JRE, and JVM?

- **JDK (Java Development Kit):** Contains tools for developing Java programs, including the JRE and compilers.
- **JRE (Java Runtime Environment):** Provides the libraries and resources necessary to run Java applications.
- **JVM (Java Virtual Machine):** Executes Java bytecode on any platform, providing platform independence.

---

## 2. Explain the concept of inheritance in Java.

Inheritance is an Object-Oriented Programming (OOP) concept where a class can inherit properties (fields) and behaviors (methods) from another class. It promotes code reusability. A subclass can inherit from a superclass, extending or overriding its functionality.

---

## 3. What is polymorphism in Java?

Polymorphism allows objects to be treated as instances of their parent class. There are two types:
- **Compile-time polymorphism:** Achieved through method overloading.
- **Runtime polymorphism:** Achieved through method overriding.

---

## 4. What is abstraction? How is it implemented in Java?

Abstraction is hiding the implementation details and showing only the essential features of an object. It is implemented using:
- **Abstract classes**: A class that cannot be instantiated and may contain abstract methods.
- **Interfaces**: A contract for classes to implement certain methods.

---

## 5. What is the difference between an abstract class and an interface?

- **Abstract Class:** Can have both abstract (unimplemented) and concrete (implemented) methods, fields, and constructors.
- **Interface:** Can only have abstract methods (before Java 8). A class implements an interface to provide the actual behavior.

---

## 6. What are Java Collections?

Java Collections is a framework that provides a set of interfaces and classes (like List, Set, Map, etc.) to handle and manipulate groups of objects.

---

## 7. What is the difference between ArrayList and LinkedList in Java?

- **ArrayList:** Implements a dynamic array. It offers fast random access but slower insertions and deletions.
- **LinkedList:** Implements a doubly linked list. It provides fast insertions and deletions but slower access compared to ArrayList.

---

## 8. What is the final keyword in Java?

- **final variable:** Its value cannot be changed once initialized.
- **final method:** It cannot be overridden by subclasses.
- **final class:** It cannot be subclassed.

---

## 9. What is exception handling in Java?

Exception handling in Java is done using `try`, `catch`, `finally`, `throw`, and `throws` blocks. It helps in handling runtime errors gracefully.

---

## 10. What is the difference between throws and throw?

- **throw:** Used to explicitly throw an exception from a method or block of code.
- **throws:** Used in method declarations to specify that the method can throw exceptions.

---

## 11. What is the difference between `==` and `equals()` in Java?

- **`==`** checks if two references point to the same object in memory.
- **`equals()`** checks if the content of two objects is the same.

---

## 12. What is a singleton class in Java?

A singleton class allows only one instance of the class to be created, ensuring a global point of access. It is typically used for resource management (e.g., database connections).

---

## 13. What is the purpose of the `hashCode()` and `equals()` methods in Java?

- **`hashCode()`** returns a unique integer representation of an object.
- **`equals()`** compares objects for logical equality.
These methods are crucial for the correct behavior of collections like `HashMap`.

---

## 14. What is multithreading in Java?

Multithreading allows multiple threads to run concurrently, improving the efficiency and performance of a program by utilizing multiple processors or cores.

---

## 15. What are the key differences between Thread and Runnable in Java?

- **Thread:** A class that represents a thread of execution.
- **Runnable:** An interface that represents a task to be executed by a thread. `Runnable` can be implemented by any class, offering more flexibility than extending the `Thread` class.

---

## 16. Explain the synchronized keyword in Java.

The `synchronized` keyword is used to control access to a block of code or method by multiple threads, ensuring that only one thread executes it at a time.

---

## 17. What is the difference between String, StringBuilder, and StringBuffer?

- **String:** Immutable, meaning its value cannot be changed after creation.
- **StringBuilder:** Mutable and optimized for single-threaded use.
- **StringBuffer:** Mutable and synchronized, making it suitable for multi-threaded environments.

---

## 18. What is the significance of the main method in Java?

The `main()` method is the entry point for any Java application. It is always `static` and takes a `String[]` argument, which allows passing command-line arguments.

---

## 19. What is the difference between ArrayList and Vector?

- **ArrayList:** Not synchronized, faster but less thread-safe.
- **Vector:** Synchronized, making it thread-safe but slower.

---

## 20. What is the Java memory model and how does garbage collection work?

The Java memory model defines how variables are stored and accessed in memory. The garbage collector automatically reclaims memory occupied by objects that are no longer referenced.

---

## 21. What is a try-with-resources statement in Java?

Introduced in Java 7, the try-with-resources statement automatically closes resources (like files or network connections) when they are no longer needed.

---

## 22. What are the different types of access modifiers in Java?

- **public:** Accessible from anywhere.
- **protected:** Accessible within the same package and by subclasses.
- **default (no modifier):** Accessible within the same package.
- **private:** Accessible only within the same class.

---

## 23. What is the volatile keyword in Java?

The `volatile` keyword is used to indicate that a variable’s value may be changed by multiple threads and ensures that updates to the variable are visible to all threads.

---

## 24. Explain the difference between checked and unchecked exceptions.

- **Checked exceptions:** Must be explicitly handled with a try-catch block or declared with `throws` (e.g., `IOException`).
- **Unchecked exceptions:** Subclasses of `RuntimeException`, which do not require explicit handling (e.g., `NullPointerException`).

---

## 25. What is Selenium WebDriver and how is it used in Java?

Selenium WebDriver is a tool for automating web application testing. It allows you to write test scripts in Java (or other languages) to simulate user interactions with web browsers for functional and regression testing.

---
