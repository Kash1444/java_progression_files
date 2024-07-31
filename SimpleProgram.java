//simple java program using if, else and switch statements
import java.util.Scanner;

public class SimpleProgram 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 18) 
        {
            System.out.println("You are a minor");
        } 
        else 
        {
            System.out.println("You are an adult.");
        }

        
        if (age >= 18) 
        {
            System.out.print("Enter your favorite color (red, blue, green): ");
            String color = scanner.next();

            switch (color) 
            {
                case "red":
                    System.out.println("You like red.");
                    break;
                    
                case "blue":
                    System.out.println("You like blue.");
                    break;
                
                case "green":
                    System.out.println("You like green.");
                    break;
                
                default:
                    System.out.println("I don't recognize that color.");
            }
        }
    }
}
