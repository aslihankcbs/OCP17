# Writing a main() Method

The main() method is often called an entry point into the program, because it is the starting point that the JVM looks for when it begins
running a new program.

The main() method lets the JVM call our code. The simplest possible class with a main()
method looks like this:
```
public class Zoo {
  public static void main(String[] args) {
       System.out.println("Hello World");
  }
}
```

To compile Java code with the `javac` command, the file must have the extension `.java`.
The name of the file must match the name of the public class. The result is a file of bytecode
with the same name but with a `.class` filename extension. Remember that bytecode consists
of instructions that the JVM knows how to execute. Notice that we must omit the .class
extension to run Zoo.class.
```
javac Zoo.java
java Zoo
```
To keep things simple for now, we follow this subset of the rules for what a Java file contains:
- Each file can contain only one public class. 
- The filename must match the class name, including case, and have a `.java` extension. 
- If the Java class is an entry point for the program, it must contain a valid `main()` method.


The keyword static binds a method to its class, so it can be called by just the class name,
as in, for example, Zoo.main().

**_main() method's parameter list_**

You can use any valid variable name along with any of these three formats:
- String[] args
- String options[]
- String... friends


**_Optional Modifiers in main() Methods_**

`public final static void main(final String[] args) {}`
In this example, both final modifiers are optional, and the main() method is a valid
entry point with or without them.

`public static void main(String[] args) {}` -> standard