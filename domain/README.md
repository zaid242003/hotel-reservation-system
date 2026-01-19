Hotel Reservation System – CCP (Software Construction)

Project Overview
This project is a UML-based Hotel Reservation System developed as a Course Completion Project (CCP) for the Software Construction course. The system is implemented strictly according to the provided UML class diagram. Clean code principles, defensive programming techniques, and JUnit-based unit testing are applied throughout the project.

Implemented UML Design
The following domain classes are implemented exactly as specified in the UML diagram:
HotelChain, Hotel, Room, Guest, Reservation, ReserverPayer, RoomType.
No additional classes were added and no required classes were omitted.
No inheritance is used as there is no is-a relationship in the given domain model.
The association class HowMany is treated as an analysis-level concept and is not implemented as a concrete class.

Clean Code Practices
The code follows clean code principles by using meaningful class, method, and variable names.
Each class has a single responsibility and methods are kept small and focused.
Encapsulation is maintained by using private fields and controlled access through methods.
Duplicate logic and unnecessary complexity are avoided to keep the code readable and maintainable.

Defensive Programming
Defensive programming techniques are applied to prevent illegal object states.
All constructors and critical methods validate input parameters.
Invalid inputs such as null values, invalid room numbers, or invalid reservation dates are rejected using IllegalArgumentException.
This ensures the system remains stable and robust.

Unit Testing
JUnit 5 is used for unit testing.
Each domain class has its own dedicated test class.
All tests follow the AAA (Arrange–Act–Assert) pattern.
Tests cover normal scenarios, boundary conditions, and invalid inputs.
Parameterized tests are used where applicable to reduce duplication and improve test coverage.
Integration-style tests are included to verify interaction between multiple domain classes.

Running the Application
The main program demonstrates the core use cases of the system such as creating hotels, rooms, guests, reservations, and checking guest occupancy.
The program can be run directly from the IDE or using Maven commands.

Running Tests
All unit tests can be executed using Maven or the IDE’s test runner.
Test results are visible in the IDE test panel and confirm correct system behavior.

GitHub Repository
The project is maintained in a GitHub repository.
Development is tracked through multiple meaningful commits made on different dates.
Each commit reflects logical progress such as domain setup, validation, testing, and refactoring.

Academic Integrity
All submitted work is original and created solely for academic purposes.
No plagiarism, code sharing, or unauthorized collaboration has been involved.