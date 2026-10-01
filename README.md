# Java Integer Utility Class

An early Java object-oriented programming project developed as part of my university Software Development coursework.

The project implements a custom `MyInteger` class that encapsulates an integer value and provides methods for analysing, comparing and parsing integer data.

## Project Overview

`MyInteger` stores an integer as object state and provides functionality for determining whether values are:

- Even
- Odd
- Prime

The project explores several ways of exposing the same functionality, including instance methods, static methods operating on primitive integers, and static methods accepting `MyInteger` objects.

It also implements value comparison and conversion from textual representations into integers.

## Technologies

- Java
- Java Standard Library
- Object-Oriented Programming

## Project Structure

```text
original/
├── MyInteger.java
└── Test.java
```

## Class Design

The `MyInteger` class encapsulates an integer value:

```java
private int value;
```

and provides default and parameterised constructors.

Conceptually:

```text
MyInteger
│
├── value
│
├── getValue()
│
├── isEven()
├── isOdd()
├── isPrime()
│
├── equals(int)
├── equals(MyInteger)
│
└── parseInt(...)
```

## Instance Methods

An instantiated `MyInteger` object can analyse its own stored value:

```java
MyInteger number = new MyInteger(5);

number.isEven();
number.isOdd();
number.isPrime();
```

This demonstrates associating behaviour directly with an object's internal state.

## Static Methods

The class also provides static methods capable of evaluating values without first creating a `MyInteger` instance.

For example:

```java
MyInteger.isEven(10);
MyInteger.isOdd(45);
MyInteger.isPrime(17);
```

Overloaded versions additionally accept `MyInteger` objects.

## Method Overloading

The project demonstrates method overloading by providing multiple methods with the same name but different parameter types.

For example, equality can be evaluated against either a primitive integer or another `MyInteger` object:

```java
equals(int value)
equals(MyInteger value)
```

Similar overloads are provided for the even, odd and prime checks.

## Integer Parsing

The class provides methods for converting both character arrays and strings into integer values:

```java
parseInt(char[] characters)
parseInt(String value)
```

These methods make use of Java's standard `Integer.parseInt()` functionality.

## Testing

`Test.java` creates multiple `MyInteger` objects and exercises functionality including:

- Even-number detection
- Odd-number detection
- Prime-number detection
- Static utility methods
- Object/value comparison
- Character-array parsing
- String parsing

## Concepts Demonstrated

This project introduced and reinforced:

- Encapsulation
- Constructors
- Instance methods
- Static methods
- Method overloading
- Object interaction
- Primitive and object parameters
- Modulo arithmetic
- Iterative algorithms
- Equality comparison
- Character arrays
- String-to-integer conversion

## Original Source Code

The original university implementation is preserved in the `original/` directory.

The source has intentionally been retained in its original form to demonstrate my development progression rather than being rewritten to reflect my current programming practices.

## Retrospective

This project represents a progression from basic class construction toward designing classes with multiple interfaces for related behaviour.

Reviewing the implementation with my current software-development experience highlights several areas that could be improved.

### Prime Number Validation

The original prime-number algorithm tests potential divisors up to half of the supplied value.

A more efficient implementation only needs to test divisors up to the square root of the number.

Additional validation would also be required for values below `2`, which are not prime.

### Boolean Expressions

Methods such as `isEven()` explicitly return `true` or `false` from an `if` statement.

For example, this logic could now be expressed more concisely as:

```java
return value % 2 == 0;
```

### Equality

The project overloads `equals()` for `int` and `MyInteger`, but does not override Java's standard:

```java
equals(Object obj)
```

A production implementation would follow Java's equality contract and normally implement a corresponding `hashCode()` method.

### Input Validation

The parsing methods rely directly on `Integer.parseInt()`. Invalid numeric strings therefore result in a `NumberFormatException`.

Depending on the application, this could be validated or handled explicitly.

### Testing

The original `Test` class validates behaviour by printing results to the console.

Today I would implement automated unit tests using a framework such as JUnit, including boundary cases for:

- Zero
- One
- Negative numbers
- Prime numbers
- Composite numbers
- Invalid parsing input
- Object equality

## Portfolio Context

This project demonstrates my early progression in object-oriented Java development.

Compared with my previous class-based work, it introduces a broader class interface, static and instance behaviour, overloaded methods, object comparison, parsing and a simple numerical algorithm.
