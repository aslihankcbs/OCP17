# Understanding the Class Structure

- In Java programs, classes are the basic building blocks. When defining a class, you describe
  all the parts and characteristics of one of those building blocks.
- An object is a runtime instance of a class in memory. An object is often referred to as an instance since it represents a single representation
  of the class.
- A reference is a variable that points to an object.

## Fields and Methods

Java classes have two primary elements: methods, often called functions or procedures in
other languages, and fields, more generally known as variables. Together these are called the
members of the class. Variables hold the state of the program, and methods operate on that
state.

The simplest Java class you can write looks like this:
```
public class Animal {

}
```
After defining the variable named 'name' and creating the getter-setter methods, the class will look like this:

```
public class Animal {
String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

A method is an operation that can be called.

The method name and parameter types are called the method signature. 
```
public int numberVisitors(int month) {
   return 10;
}
```
In this example the method signature is `numberVisitors(int)`.


## Comments

Because comments aren’t executable code, you can place them in many places. Comments can make your code easier to read.
There are three types of comments in Java. 

- The first is called a single-line comment:

   `// comment until end of line`

- multiple-line comment:
  ```
  /*
  Multiple
  line comment
  */
  ```
- Javadoc comment:
  ```
  /**
  * Javadoc multiple-line comment
  * @author Jeanne and Scott
  */
  ```
  
## Classes and Source Files
Most of the time, each Java class is defined in its own .java file. A _top-level type_ is a data structure that can be defined independently within a source file.
A top-level class is often public, which means any code can call it.

You can even put two types in the same file. When you do so, at most one of the top-level
types in the file is allowed to be public. That means a file containing the following is fine:
```
public class Animal {
  private String name; 
}
class Animal2 {}
```

****If you do have a public type, it needs to match the filename. The declaration
public class Animal2 would not compile in a file named Animal.java.****