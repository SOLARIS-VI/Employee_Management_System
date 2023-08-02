# Employee Management System

The Employee Management System is a Java project that models an information system for employees in a software development company. The project uses Test-Driven Development (TDD) to ensure the correctness of the classes. It utilises inheritance, abstract classes, and packages to organise the codebase effectively.

## Class Overview

### Employee Class

The `Employee` class is an abstract parent class for all employees. It contains the following properties:

- `name`: The name of the employee.
- `niNumber`: The National Insurance (NI) number of the employee.
- `salary`: The salary of the employee.

The `Employee` class provides the following methods:

- `getName()`: Returns the name of the employee.
- `getNiNumber()`: Returns the NI number of the employee.
- `getSalary()`: Returns the salary of the employee.
- `raiseSalary(double amount)`: Increments the employee's salary by the specified amount.
- `payBonus()`: Calculates and returns 1% of the employee's salary as a bonus.

### Manager Class

The `Manager` class is a subclass of `Employee`. It inherits all the properties and methods from the `Employee` class and adds the following property:

- `deptName`: The department name the manager is associated with.

The `Manager` class provides the following additional method:

- `getDeptName()`: Returns the department name of the manager.

### Developer Class

The `Developer` class is a subclass of `Employee`. Like the `Manager` class, it inherits all the properties and methods from the `Employee` class.

### DatabaseAdmin Class

The `DatabaseAdmin` class is another subclass of `Employee` and inherits the properties and methods from the `Employee` class.

### Director Class

The `Director` class is a subclass of `Manager`. It inherits all the properties and methods from the `Manager` class and adds the following property:

- `budget`: The budget allocated to the director.

The `Director` class provides the following additional method:

- `getBudget()`: Returns the budget allocated to the director.

**Note:** The `payBonus()` method is overridden in the `Director` class to return 2% of the director's salary as a bonus.

## Testing

The project includes separate test classes for each of the main classes. The tests ensure that all the methods in the classes are functioning correctly and produce the expected results. The test suite uses JUnit as the testing framework.

## Usage

To use the Employee Management System, simply instantiate the relevant classes with the required parameters and call the methods to perform various operations on the employee data.
