# Spring Boot - default error handler

Opinionated default error handling for Spring Boot applications.

## Usage

1. Add jitpack maven repository:

```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

2. And add a dependency:

```
<dependency>
    <groupId>com.github.Aleksa-Smolovic</groupId>
    <artifactId>default-error-handling-spring-boot-starter</artifactId>
    <version>Tag</version>
</dependency>
```

3. Add `@EnableDefaultErrorHandling` annotation

### Classes

Provided classes:
**Exceptions:**
* `BadActionException`
* `EntityMissingException`

## Notes:

Java version: 21
Spring Boot version: 3.3.2

Additional `@ControllerAdvice` can be used in project to handle other exceptions and override existing ones.

