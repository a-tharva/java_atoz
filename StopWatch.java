import java.util.Scanner;

public class StopWatch {
    
    public static long startTime = 0;
    public static long stopTime = 0;
    public static long elapsedTime;
    
    public static void start() {
        startTime = System.currentTimeMillis();
        System.out.println("Stop Time: "+startTime+" milliseconds");
    }
    
    public static void stop() {
        stopTime = System.currentTimeMillis();
        System.out.println("Stop Time: "+stopTime+" milliseconds");
    }
    
    public static long elapsed() {
        elapsedTime = stopTime - startTime;
        return elapsedTime;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Press 1 to start: ");
        int a = scan.nextInt();
        if (a==1) {
            start();
        }
        
        System.out.print("Press 2 to stop: ");
        int b = scan.nextInt();
        if (b==2) {
            stop();
        }
        
        long time = elapsed();
        System.out.println("Elapsed Time: "+time/1000+" secs");
    }
}