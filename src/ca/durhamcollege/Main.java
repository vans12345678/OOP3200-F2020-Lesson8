package ca.durhamcollege;
import java.util.Scanner;

public class Main {

    public Main()
    {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter String:");
//        String input = in.nextLine();
//        System.out.println(in);

        Person person = new Person("Andre", 40);
        person.saysHello();


    }


    public static void main(String[] args) {
	new Main();
    }
}
