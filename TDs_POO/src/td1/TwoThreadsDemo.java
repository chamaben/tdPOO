package td1;

public class TwoThreadsDemo { 
    public static void main (String[] args) {
        new SimpleThread("Jamaica").start();
        new SimpleThread("Fiji").start();
        new SimpleThread("Bora Bora").start(); 
    }
}