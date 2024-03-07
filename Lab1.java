
import java.util.Scanner;


public class Lab1 {
    public static void main(String[] args)
    {
         String name;
        int age;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a person's name:");
        name = input.nextLine();
        
        System.out.println("Please enter the person's age:");
        age = input.nextInt();
        
        if (age < 1) {
            System.out.println(name + " is an infant");
        } else if (age >= 1 && age <= 3) {
            System.out.println(name + " is a toddler");
        } else if (age >= 4 && age <= 5) {
            System.out.println(name + " is a preschooler");
        } else if (age >= 6 && age <= 12) {
            System.out.println(name + " is a grade schooler");
        } else if (age >= 13 && age <= 18) {
            System.out.println(name + " is a teenager");
        } else if (age >= 19 && age <= 21) {
            System.out.println(name + " is a young adult");
        } else {
            System.out.println(name + " is an adult");
        }
        
        input.close(); // Closing the scanner object
    }
}
