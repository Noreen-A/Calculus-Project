# MathProject: Reduction Formula Application

## Overview
This project demonstrates the application of **Reduction Formulas** in Calculus using Java. The implementation includes various functions for reducing integrals of trigonometric functions such as cosine and tangent.

## Features
- Computes reduction formulas for trigonometric integrals.
- Includes definite integration calculations.
- Command-line interface for running and testing the formulas.

## Installation
### Prerequisites
- Java Development Kit (JDK) installed (preferably JDK 8+).
- Any Java IDE (such as IntelliJ IDEA) or a terminal with `javac` and `java` commands.

### Compilation
1. Navigate to the `src/` directory:
   ```sh
   cd MathProject/src
   ```
2. Compile all Java files:
   ```sh
   javac *.java
   ```
3. Run the main program:
   ```sh
   java Main
   ```

## Project Structure
```
MathProject/
│-- src/
│   │-- Main.java            # Entry point of the program
│   │-- Reduction.java       # Base class for reduction formulas
│   │-- CosReduction.java    # Implementation for cosine reduction
│   │-- TanReduction.java    # Implementation for tangent reduction
│   │-- definite.java        # Handles definite integrals
│-- out/                     # Compiled .class files (after running javac)
│-- .idea/                   # IntelliJ IDEA configuration files
│-- MathProjict.iml           # IntelliJ project file
```

## Usage
- The program calculates integral reductions based on user input.
- It supports cosine and tangent reduction.
- Example:
  ```sh
  java Main
  ```
  The program will prompt for input and display results accordingly.

## Author
This project was created as part of a first-year college Calculus application on Reduction Formulas.

## License
This project is for educational purposes. Feel free to modify and expand upon it!

