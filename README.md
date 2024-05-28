# OOPs in Java

As the name suggests, Object-Oriented Programming or OOPs refers to languages that use objects in programming, they use objects as a primary source to implement what is to happen in the code. Objects are seen by the viewer or user, performing tasks assigned by you. 

Object-oriented programming aims to implement real-world entities like inheritance, hiding, polymorphism etc. in programming. The main aim of OOP is to bind together the data and the functions that operate on them so that no other part of the code can access this data except that function.

## Topics in this Repo 

- **Classes and Objects**
- **Access Modifiers**
- **Basic OOPs Concepts [Inheritance,Abstraction,Encapsulation and Polymorphism]**
- **Interface**
- **'this' Reference Variable**

## Classes

A class in Java is a set of objects which shares common characteristics/ behavior and common properties/ attributes. It is a user-defined blueprint or prototype from which objects are created. For example, Student is a class while a particular student named Ravi is an object.

### Class Properties

- Class is not a real-world entity. It is just a template or blueprint or prototype from which objects are created.
- Class does not occupy memory.
- Class is a group of variables of different data types and a group of methods.
- Classes in JAVA contains Data Member,Methods,Constructors,Nested Classes and Interface.

### Components of a Class

- **Modifier** -> A class can be public or has default access modifier.
- **Class Keyword** -> For creating a class we uses the *class* keyword.
- **Class name** -> The class name is been created by following the same rules we used to follow while creating a variable.
- **SuperClass** -> The name of the parent class is generally consider as *SuperClass* and the one written after extends keyword.
- **Interfaces** -> It is a kind of list of interfaces implemented or initiated by the class, preceded by the *Interface* keyword and most interesting fact here is a single class can implement more than one keyword.
- **Body** ->  The Whole Block of code surrounded or covered by *Curly Braces* **{}**.

#### Syntax for Declaring a Class

```java
public class class_name{
    // data members
    int number;

    // methods
    public void display(){
        System.out.println("Display method of the class");
    }

    // constructors
    class_name(){
        System.out.println("Class Object initiated");
    }
}
```