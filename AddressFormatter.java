
import java.util.Scanner;


public class AddressFormatter {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
        String street;
        int houseNum;
        String city;
        int zipCode;
        String province;
        
        System.out.print("Enter your street name: ");
        street = input.nextLine();
        System.out.print("Enter the house or apartment number: ");
        houseNum = input.nextInt();
        input.nextLine();
        System.out.print("Enter the city: ");
        city = input.nextLine();
        System.out.print("Enter the zip code: ");
        zipCode = input.nextInt();
        input.nextLine();
        System.out.print("Enter the Province: ");
        province = input.nextLine();
        
        System.out.println("\n" + houseNum + " " + street + ","
                + " " + city + ", " + province + " " + zipCode);
        
        input.close(); // Close the Scanner object to release resources 
    }
}
