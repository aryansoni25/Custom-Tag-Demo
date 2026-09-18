# Custom Tag JSP – Product Details

A simple JSP Custom Tag implementation that demonstrates how to create and use a custom JSP tag named `<product>` to display product information.

## About the Project

This project implements a custom JSP tag called `<product>`. The tag accepts four attributes:

- `prodId` – Product ID
- `name` – Product name
- `category` – Product category
- `price` – Product price

The custom tag is implemented using Java's `SimpleTagSupport` class and is registered through a Tag Library Descriptor (TLD) file.

## Technologies Used

- Java 17
- JSP
- Jakarta Servlet API
- Jakarta JSP API
- Apache Tomcat 11
- Maven
- IntelliJ IDEA

## Project Structure

```text
CustomTagDemo/
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── telusko/
│                   └── ProductTag.java
│
├── WebContent/
│   ├── index.jsp
│   └── WEB-INF/
│       └── product.tld
│
├── pom.xml
└── README.md
```

## How It Works

The JSP page uses the custom tag:

```jsp
<p:product
    prodId="101"
    name="Laptop"
    category="Electronics"
    price="55000" />
```

The `product.tld` file maps the `product` tag to:

```text
com.telusko.ProductTag
```

The `ProductTag` class extends:

```java
SimpleTagSupport
```

The tag attributes are received through setter methods:

```java
setProdId()
setName()
setCategory()
setPrice()
```

The `doTag()` method generates an HTML table containing the product details.

## Execution Flow

```text
index.jsp
    │
    │ <p:product ... />
    ↓
product.tld
    │
    │ maps tag to
    ↓
ProductTag.java
    │
    │ doTag()
    ↓
HTML Product Table
```

## Example

Input:

```jsp
<p:product
    prodId="101"
    name="Laptop"
    category="Electronics"
    price="55000" />
```

Output:

| Product ID | Name | Category | Price |
|---|---|---|---:|
| 101 | Laptop | Electronics | 55000.0 |

## How to Run

### 1. Build the project

```bash
mvn clean package
```

This generates:

```text
target/CustomTagDemo-1.0-SNAPSHOT.war
```

### 2. Deploy to Tomcat 11

Copy the generated WAR file into:

```text
apache-tomcat-11/webapps/
```

### 3. Start Tomcat

On Windows:

```text
apache-tomcat-11/bin/startup.bat
```

### 4. Open in Browser

```text
http://localhost:8080/CustomTagDemo-1.0-SNAPSHOT/index.jsp
```

## Maven Dependencies

The project uses Jakarta APIs compatible with Tomcat 11:

```xml
<dependency>
    <groupId>jakarta.servlet</groupId>
    <artifactId>jakarta.servlet-api</artifactId>
    <version>6.1.0</version>
    <scope>provided</scope>
</dependency>

<dependency>
    <groupId>jakarta.servlet.jsp</groupId>
    <artifactId>jakarta.servlet.jsp-api</artifactId>
    <version>4.0.0</version>
    <scope>provided</scope>
</dependency>
```

## Learning Objectives

This experiment demonstrates:

- Creating JSP custom tags
- Creating a custom tag handler class
- Using `SimpleTagSupport`
- Creating a `.tld` file
- Passing attributes to custom tags
- Using JSP Tag Libraries
- Integrating Java with JSP
- Deploying a JSP application on Apache Tomcat
- Using Maven for Java web applications

