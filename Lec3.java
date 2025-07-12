import java.util.Scanner;


public class Lec3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name below: ");
        String name = scanner.nextLine();//next is used to exclude spaces and nextline is used to include spaces

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();//nextint is used to get integer input

        System.out.print("What is your height in foot :");
        double height = scanner.nextDouble();//similarly nextBoolean

        System.out.println("Hello " + name);
        System.out.println("Your age is:" + age);
        System.out.println("Your height is:" + height);

        //common issue:
        //if you take a string output after an integer the next line will be considerd as a character so add scanner.nextLine(); after the integer
        
        scanner.close();
    }
}
