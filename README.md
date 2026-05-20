# pertamuan11

Simple Spring Boot project for pertemuan11.

Prerequisites
- Java 17+ (project configured for Java 17)
- Git (for cloning/pushing)

Build
On Windows (from project root):

```powershell
.\mvnw.cmd -DskipTests package
```

Run

Using Maven wrapper:

```powershell
.\mvnw.cmd spring-boot:run
```

Or run the packaged jar:

```powershell
java -jar target\pertamuan11-0.0.1-SNAPSHOT.jar
```

Notes
- Security: login page is `/login`, successful login redirects to `/home`.
- If you use an IDE, enable Lombok support to avoid editor errors.

