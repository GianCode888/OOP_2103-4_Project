import java.util.*;
public class Main {
    public static void main(String[] args) {
        Dmenu();
    }

    public static void Dmenu() {
        System.out.println("Welcome to the Hospital Management System.");
        System.out.println("1. Login as Doctor or Patient.");
        System.out.println("2. Appointment Availability.");
        System.out.println("3. Doctors List.");
        System.out.println("4. Laboratory Services.");
        System.out.println("5. Staffs List.");
        System.out.println("6. Emergency Hotline Number.");
        System.out.println("7. Services Available.");
        System.out.println("8. About Us.");
        System.out.println(" ");
        System.out.println("Please pick an Option corresponding to your inquiry.");

        Scanner scanner = new Scanner(System.in);
        int M_choice = scanner.nextInt();
        switch (M_choice) {
            case 1:
                Login.login();
                break;

            case 2:
                System.out.println("You have decided to view Appointment Availabilities. ");
                break;

            case 3:
                System.out.println("You have decided to view the Doctors List.");
                break;

            case 4:
                System.out.println("You have decided to view the Laboratory Services.");
                break;

            case 5:
                System.out.println("You have decided to view the Staffs List.");
                break;

            case 6:
                System.out.println("You have decided to view the Emergency Hotline Number.");
                break;

            case 7:
                System.out.println("You have decided to view Available Services.");
                break;

            case 8:
                System.out.println("You have decided to view About us.");
                break;

            default:
                System.out.println("That is not one of the Options, Please try again");
                break;
        }
    }
}



