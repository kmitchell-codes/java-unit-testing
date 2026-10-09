# Java Contact Service and Unit Testing

**SNHU CS 320 | Software Testing, Automation, and Quality Assurance**

A Java contact management service that stores records in memory and validates contact information. JUnit 5 tests cover common operations and invalid input scenarios.

## Technologies and features

- Java, JUnit 5, object-oriented programming, input validation
- Add, retrieve, delete, and update contacts
- Enforce field-length and phone-number constraints
- Reject duplicate contact IDs and invalid values
- Test normal behavior and exception handling

## Files and current limitations

The [ContactService folder](ContactService/) contains the contact model, service, and JUnit tests.

**Known test issue:** Three update assertions in `ContactServiceTest.java` expect different values from those passed into the corresponding update calls. The tests have not been verified as passing. No Java code has been changed as part of this documentation update.

## Development process and lessons learned

### Making software functional and secure

I work to keep software functional and secure by following coding best practices, writing clean and maintainable code, and thoroughly testing both valid and invalid inputs. Testing helps confirm the program behaves correctly by allowing me to verify that each requirement is working as expected and preventing bad data from being stored or used. I also keep security in mind throughout development by validating inputs, handling errors safely, and building with the assumption that real-world systems will be used in unpredictable ways.

### Interpreting user needs

I interpret user needs by clarifying expectations early and turning them into a clear list of requirements and constraints. I focus on understanding scope, what the user wants the system to do, and what rules must be enforced. Starting with clear requirements makes implementation easier because I can trace each feature back to a requirement, test against it, and avoid scope creep or costly changes later.

### Designing software

I approach software design by starting with the requirements and breaking them into smaller, manageable parts. I plan how the system should behave, what data it needs to store, and what validations must be enforced. From there, I design classes and services with clear responsibilities to keep the structure organized and maintainable. I also design with testing in mind by keeping methods small, predictable, and easy to validate through unit tests.
