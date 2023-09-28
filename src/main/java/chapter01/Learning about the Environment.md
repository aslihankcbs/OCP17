# Learning about the Environment

## Major Components of Java

The Java Development Kit (JDK) contains the minimum software you need to do Java development. Key commands include:

- javac: Converts `.java` source files into `.class` bytecode
- java: Executes the program
- jar: Packages files together 
- javadoc: Generates documentation

The javac program generates instructions in a special format called `bytecode` that the java command can run. 
Then java launches the Java Virtual Machine (JVM) before running the code. 
The JVM knows how to run bytecode on the actual machine it is on. 
You can think of the JVM as a special magic box on your machine that knows how to run your
`.class` file within your particular operating system and hardware.

### Where Did the JRE Go?

In Java 8 and earlier, you could download a Java Runtime Environment (JRE) instead of the
full JDK. The JRE was a subset of the JDK that was used for running a program but could
not compile one. Now, people can use the full JDK when running a Java program.

### Check Your Version of Java
- `javac -version`
- `java -version`