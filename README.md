**EXERCISE 1 **

**BEHAVIOURAL DESIGN PATTERN**

**1. Weather Station Notification System - Observer Pattern**

**Use Case**

This console-based application allows users to update and monitor weather conditions. It notifies all registered observers whenever weather measurements are updated, ensuring that all interested parties receive the latest weather information in real-time.

**Design Pattern**

The application uses the Observer Design Pattern. This pattern establishes a one-to-many relationship between a subject and its observers. When the subject's state changes, all registered observers are notified and updated automatically.

**How it Relates to the Use Case**

•	**Subject**: WeatherStation class which maintains weather measurements (temperature, humidity, pressure)

•	**Observers**: Any class implementing the WeatherObserver interface, such as PhoneDisplay and TVDisplay, which will be notified of weather updates

**Classes**

•	**WeatherStation**: Manages the list of observers and notifies them when weather measurements are updated

•	**WeatherObserver**: Interface for all observers that need to be notified of weather changes

•	**PhoneDisplay**: An implementation of the WeatherObserver interface that displays weather updates on a phone

•	**TVDisplay**: An implementation of the WeatherObserver interface that displays weather updates on a TV

•	**Main**: Main class that runs the application and provides functionality for updating weather measurements

**2. Travel Route Planner - Strategy Pattern**

**Use Case**

This application demonstrates a flexible travel route planning system that supports different route calculation strategies. Users can select different routing strategies (Shortest Time, Shortest Distance, Scenic Route) based on their travel preferences.

**Design Pattern**

The Strategy Pattern is used to encapsulate different route calculation algorithms and make them interchangeable. This allows users to switch between routing strategies at runtime without changing the core route planning logic.

**How it Relates to the Use Case**

•	**RouteStrategy**: Interface defining the route calculation contract

•	**Concrete strategies**: ShortestTimeStrategy, ShortestDistanceStrategy, ScenicRouteStrategy

•	**RoutePlanner**: Uses the selected strategy to calculate optimal routes

**Classes**

•	**RouteStrategy**: Interface defining the strategy for route calculation

•	**ShortestTimeStrategy**: Concrete strategy that calculates the fastest route

•	**ShortestDistanceStrategy**: Concrete strategy that calculates the shortest distance route

•	**ScenicRouteStrategy**: Concrete strategy that calculates the most scenic route

•	**RoutePlanner**: Main class that utilizes the selected routing strategy

•	**Main**: Client class that interacts with users to plan routes using different strategies

**CREATIONAL DESIGN PATTERN**

**1. Database Connection Manager - Singleton Pattern**

**Use Case**

The Database Connection Manager application ensures that only one instance of database connection manager exists throughout the application lifecycle. It provides centralized control over database connections, managing connection pooling and ensuring thread-safe operations.

**Design Pattern**

Ensures a class has only one instance and provides a global point of access to it

**How it Relates to the Use Case**

Prevents multiple database connection instances that could lead to connection conflicts and resource wastage

**Classes**

•	**DatabaseConnectionManager**: Singleton class that manages database connections,Provides methods for connecting, disconnecting, and executing queries, Maintains connection count and state management

•	**Main**: Demonstrates the singleton behavior by showing multiple references point to the same instance

**2. Notification System - Factory Pattern**

**Use Case**

This console-based Notification System allows users to send different types of notifications (Email, SMS, Push) through a unified interface. The system creates appropriate notification objects based on user input without exposing the instantiation logic.

**Design Pattern**

The Factory Pattern is utilized to create notification objects based on user input. This pattern defines an interface for creating objects but lets the factory class decide which object to instantiate.

**How it Relates to the Use Case**

•	**NotificationFactory**: Factory class that handles creation of EmailNotification, SMSNotification, and PushNotification objects, Centralizes object creation logic and makes the system extensible for new notification types

**Classes**

•	**Notification**: Interface defining common notification operations

•	**EmailNotification**: Concrete class for email notifications with email-specific formatting

•	**SMSNotification**: Concrete class for SMS notifications with character limit considerations

•	**PushNotification**: Concrete class for push notifications with mobile-specific features

•	**NotificationFactory**: Factory class responsible for creating appropriate notification instances

•	**Main**: Application entry point that uses factory to create and send notifications

**STRUCTURAL DESIGN PATTERN**

**1. Payment Gateway Integration - Adapter Pattern**

**Use Case**

The Payment Gateway Integration system demonstrates how to make incompatible payment systems work together. It adapts a legacy payment system to work with modern payment gateway interfaces, allowing seamless integration without modifying existing legacy code.

**Design Pattern**

The Adapter Pattern is used to convert the interface of a class into another interface clients expect. This allows classes with incompatible interfaces to work together.

**How it Relates to the Use Case**

The Adapter Pattern bridges the gap between modern payment systems and legacy payment infrastructure, allowing new applications to process payments through outdated but reliable legacy systems without rewriting existing code.

**Classes**

•	**ModernPaymentGateway**: Interface defining modern payment processing methods

•	**LegacyPaymentSystem**: Existing class with incompatible payment processing methods

•	**PaymentGatewayAdapter**: Adapter class that makes LegacyPaymentSystem compatible with ModernPaymentGateway

•	**Main**: Client class that demonstrates the adapter pattern in action

**2. ATM Security System - Proxy Pattern**

**Use Case**

This application models a secure ATM system where access to real ATM operations is controlled through a proxy. The proxy provides security features like authentication, access control, and logging before allowing operations on the real ATM.

**Design Pattern**

The Proxy pattern provides a surrogate or placeholder for another object to control access to it

**How it Relates to the Use Case**

•	**Subject**: ATM interface defining ATM operations

•	**Real Subject**: RealATM class that performs actual ATM operations

•	**Proxy**: ATMSecurityProxy that controls access to RealATM

**Classes**

•	**ATM**: Interface defining common ATM operations (withdraw, checkBalance, changePIN)

•	**RealATM**: Real implementation that performs actual banking operations

•	**ATMSecurityProxy**: Proxy that adds security layer (authentication, access control)

•	**Main**: Application class that demonstrates secure ATM access through proxy

**EXERCISE 2 **

**🏫 Virtual Classroom Manager**

**Use Case Overview**

The Virtual Classroom Manager is a console-based application designed to manage digital educational environments efficiently. It enables educators to create virtual classrooms, manage students, schedule assignments, track submissions, and monitor academic performance through a centralized system.

**Functionalities**

•	**Classroom Management**: Create, list, and remove virtual classrooms

•	**Student Management**: Enroll students, track classroom assignments, manage student profiles

•	**Assignment System**: Schedule assignments, track submission status, manage deadlines

•	**Submission Tracking**: Monitor student submissions with detailed reporting

•	**Classroom Analytics**: View student distribution and assignment statistics across all classrooms

**🧩 Design Patterns Used**

**1. Singleton Pattern**

**Purpose**: To ensure only one instance of ClassroomManager exists throughout the application, providing centralized control over all classroom operations and maintaining consistent state management.

**Relation to Use Case**: The classroom manager coordinates all operations across multiple classrooms, requiring a single point of control to prevent data inconsistencies and manage shared resources efficiently.

**Classes Involved**:

•	**ClassroomManager**: Singleton class managing all classroom operations, student enrollments, and assignment tracking

**2. Factory Pattern**

**Purpose**: To create different types of classroom entities (classrooms, students, assignments) without specifying their concrete classes, providing flexibility in object creation and maintaining consistent initialization.

**Relation to Use Case**: Facilitates dynamic creation of various educational components based on user input while encapsulating the object creation logic.

**Classes Involved**:

•	**Factory**: Factory class creating classrooms, students, and assignments with proper initialization

•	**Classroom, Student, Assignment**: Products created by the factory with standardized properties

**3. Composite Pattern**

**Purpose**: To manage hierarchical relationships between classrooms, students, and assignments, allowing unified operations across the educational structure.

**Relation to Use Case**: Enables treating classrooms as containers for students and assignments, providing a natural hierarchy for educational management.

**Classes Involved**:

•	**Classroom**: Acts as composite containing students and assignments

•	**Student and Assignment**: Act as leaf nodes in the classroom structure

**🗂️ Classes and Their Responsibilities**

•	**Classroom.java**: Represents a virtual classroom with students and assignments, manages classroom operations

•	**Student.java**: Manages student information, enrollment, and academic tracking

•	**Assignment.java**: Represents learning assignments with tracking for submissions and deadlines

•	**ClassroomManager.java**: Singleton class coordinating all classroom management operations

•	**Factory.java**: Factory class for creating classroom, student, and assignment instances with consistent initialization

•	**Main.java**: Entry point of the application handling user interaction and menu navigation

**🛠️ Tech Stack**

**Programming Language**

•	**Java**: The primary language used for implementing the Virtual Classroom Manager. Java's object-oriented principles and robust ecosystem support the design patterns and architecture used in this project.

**JDK Version**

•	**JDK 17/20**: The project is compatible with both JDK 17 (LTS) and JDK 20. While JDK 17 is recommended for long-term support and stability, JDK 20 works perfectly for this educational project with no functional differences.

**Build and Execution**

•	**Java Compiler (javac)**: Used to compile the Java source code into bytecode

•	**Java Runtime (java)**: Executes the compiled Java bytecode to run the application

•	**IntelliJ IDEA**: Recommended IDE for development with built-in JDK management

**Version Control**

•	**Git**: Used for version control, allowing tracking of changes, collaboration, and management of the codebase

📞 Contact Information

    Gmail: dinaamirthaa@gmail.com
    GitHub: Dina-P-18


