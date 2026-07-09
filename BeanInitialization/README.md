# Bean Initialization in Spring

This project is a core Spring Framework application demonstrating how the Spring IoC (Inversion of Control) container instantiates, configures, and initializes beans using annotation-based configuration and component scanning.

---

## Technical Details

- **Java Version**: 23
- **Spring Framework**: 7.0.7
- **Build Tool**: Maven

---

## Key Components

The project consists of the following components under the package `live.aayush`:

1. **[AppConfig](file:///d:/Programming/Spring%20Boot%20Projects/BeanInitialization/src/main/java/live/aayush/AppConfig.java)**
   - Configured with `@Configuration` to define the class as a source of bean definitions.
   - Configured with `@ComponentScan` to automatically discover and register Spring beans within the package.

2. **[Main](file:///d:/Programming/Spring%20Boot%20Projects/BeanInitialization/src/main/java/live/aayush/Main.java)**
   - Bootstraps the application using `AnnotationConfigApplicationContext(AppConfig.class)`.
   - Triggers the creation and initialization of the Spring Application Context.

3. **[OrderService](file:///d:/Programming/Spring%20Boot%20Projects/BeanInitialization/src/main/java/live/aayush/OrderService.java)**
   - Annotated with `@Component` to mark it as a managed bean.
   - Demonstrates instantiation logging and manual creation of `PaymentService`.

4. **[PaymentService](file:///d:/Programming/Spring%20Boot%20Projects/BeanInitialization/src/main/java/live/aayush/PaymentService.java)**
   - Annotated with `@Component` and `@Lazy` to demonstrate lazy bean initialization.
   - It will not be initialized eagerly by the Spring container upon startup, unless requested or manually instantiated.

---

## How It Works

When the `Main` class runs, the Spring IoC container:
1. Scans the package for classes annotated with `@Component`.
2. Resolves dependencies.
3. Instantiates eager singleton beans (e.g. `OrderService`).
4. Since `PaymentService` is annotated with `@Lazy`, the container defers its creation. However, `OrderService` explicitly calls `new PaymentService()` inside its constructor.

### Expected Console Output
```text
PaymentService created
OrderService created
```

---

## How to Run

Navigate to this project directory:
```bash
cd BeanInitialization
```

Build and run the project using Maven:
```bash
mvn clean compile
mvn exec:java "-Dexec.mainClass=live.aayush.Main"
```
