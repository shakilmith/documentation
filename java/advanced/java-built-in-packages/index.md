# Java Built in Packages

In Java, packages have special functionality and each package have special role to run your java applications. Actually, codes or java's core features are stored in packages/APIs and you have to import them in order to use them, when they are required in your applications. 

**However, what are stored in packages?** In packages, there are special class, methods, interfaces, special variables and many code completions logic or java's core features are stored and when you need one of them for your application, you can import and use them for free of cost. 

Such as, if you want to work on date and time in your application, you can simply import java's date-time API, which have core classes, interfaces and methods for handling complex data, time time operations. 

If you want to build a networking application, you can simply import java's net APIs, and use one of it's core classes or interfaces - like Socket (Handling Low-level Network Communication) or HttpClient (Handling Web Communication). In order to file handling, you can import io packages.


Hence, in java there are minimum hundreds of regular and sub regular APIs/packages including their core classes, interfaces and methods available to work on range of applications domain including networking applications, web applications, GUI applications, desktop applications, building enterprise level applications, low level applications etc. you can simply build through java's core built in packages or via third party packages.

**Note:** ***java.lang*** and ***java.math*** contains fundamental classes those are required to compile java code in your platform, thus these are implicitly added, do not need to import them, but if you want you can.

So, let's get started to see few important and most required Java built in packages and of course their uses briefly.


1. **java.lang** - it contains classes and interfaces that are fundamentals and considered the building blocks of the java programs. It is imported by default.

2. **java.util** - it contains classes and interfaces regarding java collection frameworks and utility methods.

3. **java.io** - it contains classes and interfaces that are responsible basically I/O operations(such as file handling).

4. **java.awt** - it offers some building block classes, interfaces or methods to create graphical user interfaces. Nowadays, developers use **[JavaFX](https://openjfx.io/)** to build user interfaces than awt.

5. **java.applet** (deprecated) - it contains functionality to render java into web pages. According to the oracle doc, this package is deprecated in favour of javaScript.

6. **java.beans** - it organizes javaBeans API and helpful for creating own beans by java developers.

7. **java.math** - it provides classes and methods to perform mathematical tasks.

8. **java.net** - contains classes and interfaces to build networking applications, like handling request/response via HTTPS or Sockets.

9. **java.nio/java.io** - it is used to handle input and output operations such file handling in java. Here, java.nio is updated version or java.io.

**Note:** nio package was introduced in Java 1.4 and updated in Java 1.7

10. **java.security** - it contains classes and interfaces that are used to work with security framework or in order to maintain secure communication in java.

11. **java.sql** - contains classes and interfaces to connect java application with relational database.

**Note:** Usually nowadays, developers use progressive framework like JPA or hibernate to handle database operations.

12. **java.text** - it is used to work with text, date, numbers etc.

13. **java.time** - it provides a lot of classes to work with data, time in a natural calendric manner more sophisticated way.

14. **javax.swing** - it provides special classes, methods to build basic desktop GUI applications. Now usually, developers use JavaFX framework which is more powerful and robust than swing.

15. **javax.persistence** - mapping Java objects to database tables (JPA 2.0), managing entity lifecycle. Now it renamed by **jakarta.persistence**.

17. javax.crypto - it has various classes, interfaces and methods to work for cryptographic encryption and decryption algorithms.

18. **javax.servlet** - Handle http requests and response in a web application. Specially building dynamic database driven web applications, this package provides various classes and methods. Note, now it renamed with **jakarta.servlet** API.

In conclusion, Java's built-in packages are an essential part of its rich ecosystem, providing everything from basic data structures to advanced utilities for networking, input/output, and user interfaces. Mastering these packages will enable developers to write more efficient, maintainable, and robust code. As you continue to explore Java, take the time to familiarize yourself with the wide variety of packages available in the standard library—they are powerful tools that can help you solve almost any programming challenge. I do not say, you need to learn every built in packages, rather I would say, you can get familiar with them as much as you can. Such as, a java developer do not need to learn javaFX or get familiar with Swing API (which are used for building GUI applications).

