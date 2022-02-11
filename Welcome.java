import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("DON'T FORGET TO RUN CONTAINER IN INTERACTIVE ENVIRONMENT TO GET USER INPUTt");
        System.out.println("Enter your name: ");
        String name = in.next();
        System.out.println("Hello " + name + "! Welcome to my first docker container");

    }
}