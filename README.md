EXERCISE 1 

**BEHAVIOURAL DESIGN PATTERN**

**1. Weather Station Notification System - Observer Pattern**

**Use Case**

This console-based application allows users to update and monitor weather conditions. It notifies all registered observers whenever weather measurements are updated, ensuring that all interested parties receive the latest weather information in real-time.

**Design Pattern**

The application uses the Observer Design Pattern. This pattern establishes a one-to-many relationship between a subject and its observers. When the subject's state changes, all registered observers are notified and updated automatically.

**How it Relates to the Use Case**

**Subject**: WeatherStation class which maintains weather measurements (temperature, humidity, pressure)

**Observers**: Any class implementing the WeatherObserver interface, such as PhoneDisplay and TVDisplay, which will be notified of weather updates

**Classes**

**WeatherStation**: Manages the list of observers and notifies them when weather measurements are updated

**WeatherObserver**: Interface for all observers that need to be notified of weather changes

**PhoneDisplay**: An implementation of the WeatherObserver interface that displays weather updates on a phone

**TVDisplay**: An implementation of the WeatherObserver interface that displays weather updates on a TV

**Main**: Main class that runs the application and provides functionality for updating weather measurements

**2. Travel Route Planner - Strategy Pattern**

**Use Case**

This application demonstrates a flexible travel route planning system that supports different route calculation strategies. Users can select different routing strategies (Shortest Time, Shortest Distance, Scenic Route) based on their travel preferences.

**Design Pattern**

The Strategy Pattern is used to encapsulate different route calculation algorithms and make them interchangeable. This allows users to switch between routing strategies at runtime without changing the core route planning logic.

**How it Relates to the Use Case**

**RouteStrategy**: Interface defining the route calculation contract

**Concrete strategies**: ShortestTimeStrategy, ShortestDistanceStrategy, ScenicRouteStrategy

**RoutePlanner**: Uses the selected strategy to calculate optimal routes

**Classes**

**RouteStrategy**: Interface defining the strategy for route calculation

**ShortestTimeStrategy**: Concrete strategy that calculates the fastest route

**ShortestDistanceStrategy**: Concrete strategy that calculates the shortest distance route

**ScenicRouteStrategy**: Concrete strategy that calculates the most scenic route

**RoutePlanner**: Main class that utilizes the selected routing strategy

**Main**: Client class that interacts with users to plan routes using different strategies

**CREATIONAL DESIGN PATTERN**

**1. Database Connection Manager - Singleton Pattern**

**Use Case**

The Database Connection Manager application ensures that only one instance of database connection manager exists throughout the application lifecycle. It provides centralized control over database connections, managing connection pooling and ensuring thread-safe operations.

**Design Pattern**

Ensures a class has only one instance and provides a global point of access to it

**How it Relates to the Use Case**

Prevents multiple database connection instances that could lead to connection conflicts and resource wastage

**Classes**

**DatabaseConnectionManager**: Singleton class that manages database connections,Provides methods for connecting, disconnecting, and executing queries, Maintains connection count and state management

**Main**: Demonstrates the singleton behavior by showing multiple references point to the same instance

**2. Notification System - Factory Pattern**

**Use Case**

This console-based Notification System allows users to send different types of notifications (Email, SMS, Push) through a unified interface. The system creates appropriate notification objects based on user input without exposing the instantiation logic.

**Design Pattern**

The Factory Pattern is utilized to create notification objects based on user input. This pattern defines an interface for creating objects but lets the factory class decide which object to instantiate.

**How it Relates to the Use Case**

**NotificationFactory**: Factory class that handles creation of EmailNotification, SMSNotification, and PushNotification objects, Centralizes object creation logic and makes the system extensible for new notification types

**Classes**

**Notification**: Interface defining common notification operations

**EmailNotification**: Concrete class for email notifications with email-specific formatting

**SMSNotification**: Concrete class for SMS notifications with character limit considerations

**PushNotification**: Concrete class for push notifications with mobile-specific features

**NotificationFactory**: Factory class responsible for creating appropriate notification instances

**Main**: Application entry point that uses factory to create and send notifications

**STRUCTURAL DESIGN PATTERN**

**1. Payment Gateway Integration - Adapter Pattern**

**Use Case**

The Payment Gateway Integration system demonstrates how to make incompatible payment systems work together. It adapts a legacy payment system to work with modern payment gateway interfaces, allowing seamless integration without modifying existing legacy code.

**Design Pattern**

The Adapter Pattern is used to convert the interface of a class into another interface clients expect. This allows classes with incompatible interfaces to work together.

**How it Relates to the Use Case**

The Adapter Pattern bridges the gap between modern payment systems and legacy payment infrastructure, allowing new applications to process payments through outdated but reliable legacy systems without rewriting existing code.

**Classes**

**ModernPaymentGateway**: Interface defining modern payment processing methods

**LegacyPaymentSystem**: Existing class with incompatible payment processing methods

**PaymentGatewayAdapter**: Adapter class that makes LegacyPaymentSystem compatible with ModernPaymentGateway

**Main**: Client class that demonstrates the adapter pattern in action

**2. ATM Security System - Proxy Pattern**

**Use Case**

This application models a secure ATM system where access to real ATM operations is controlled through a proxy. The proxy provides security features like authentication, access control, and logging before allowing operations on the real ATM.

**Design Pattern**

The Proxy pattern provides a surrogate or placeholder for another object to control access to it

**How it Relates to the Use Case**

**Subject**: ATM interface defining ATM operations

**Real Subject**: RealATM class that performs actual ATM operations

**Proxy**: ATMSecurityProxy that controls access to RealATM

**Classes**

**ATM**: Interface defining common ATM operations (withdraw, checkBalance, changePIN)

**RealATM**: Real implementation that performs actual banking operations

**ATMSecurityProxy**: Proxy that adds security layer (authentication, access control)

**Main**: Application class that demonstrates secure ATM access through proxy

