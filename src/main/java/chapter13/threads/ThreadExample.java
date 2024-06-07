package chapter13.threads;

public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("Hello Thread!");
        System.out.println(Thread.currentThread());
        // When the main method runs in Java, a new thread is created. Its name is main
    }
}
