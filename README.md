# 📚 S1.07 - Java Annotations

Repository for exercises from module S1.07 focused on Java annotations: `@Override`, `@Deprecated`, and `@SuppressWarnings`.

---

## 📄 Description - Exercise Statement

### Exercise 1

Create a class hierarchy as follows:

- Base class `Worker` with attributes: `name`, `surname`, `hourlyRate`, and a method `calculateSalary(int hours)`.
- Subclasses:
    - `PresentialWorker`: calculates salary by adding a static value `petrol`.
    - `OnlineWorker`: calculates salary by adding a class constant `INTERNET_FLAT_RATE`.
- Use the `@Override` annotation in the `calculateSalary(...)` methods of the subclasses.
- Instantiate the classes in `main()` and demonstrate functionality.

### Exercise 2

- Add obsolete methods to the child classes using the `@Deprecated` annotation.
- Call these deprecated methods from an external class.
- Use the `@SuppressWarnings("deprecation")` annotation to suppress compiler warnings.

---

## 💻 Technologies Used

- Java 17+
- IntelliJ IDEA / Eclipse (optional)
- Git & GitHub

---

## 📋 Requirements

- Java Development Kit (JDK) 17 or higher
- Git (for cloning the repository)
- Java IDE (recommended)

---

## 🛠️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/anaberod/S1.07_Annotations_LV1.git
   ```
2. Open the project in your preferred Java IDE.
3. Ensure your JDK version is correctly set in the project settings.

---

## ▶️ Execution

1. Compile the Java classes.
2. Run the `Main` class.
3. Output will display:
    - Salary calculations
    - Deprecated method usage (simulated legacy features)

---

## 🌐 Deployment

This is an educational project. No production deployment is required.

---

## 🤝 Contributions

Contributions are welcome for educational purposes. To contribute:

- Fork the repository.
- Create a new branch (`git checkout -b feature-name`).
- Commit your changes (`git commit -am 'Add feature'`).
- Push to the branch (`git push origin feature-name`).
- Open a Pull Request.

---
