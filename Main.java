import java.util.*;

public class Main {
    public static Laboratory lab;

    public static void main(String[] args) {
        lab = new Laboratory(10 );

        lab.addService(new Laboratoryservice(
                "Pathology", "Blood Test", true, new String[]{"CBC", "Blood Sugar", "Lipid Profile"}
        ));
        lab.addService(new Laboratoryservice(
                "Radiology", "X-Ray", true, new String[]{"Chest X-Ray", "Abdominal X-Ray"}
        ));
        lab.addService(new Laboratoryservice(
                "Cardiology", "ECG", false, new String[]{"ECG Monitoring"}
        ));

        Dmenu();
    }

    public static void Dmenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nWelcome to the Hospital Management System.");
            System.out.println("1. Login as Doctor or Patient.");
            System.out.println("2. Appointment Availability.");
            System.out.println("3. Service Available.");
            System.out.println("4. Laboratory Services.");
            System.out.println("5. Staffs List.");
            System.out.println("6. Doctors List.");
            System.out.println("7. Emergency Hotline Number.");
            System.out.println("8. About Us.");
            System.out.println("0. Exit.");
            System.out.println("\nPlease pick an Option corresponding to your inquiry.");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        Login.login();
                        break;

                    case 2:
                        System.out.println("You have decided to view Appointment Availabilities.");
                        viewAppointments.viewAppointments();
                        break;

                    case 3:
                        System.out.println("You have decided to view Available Services.");
                        viewServices.viewServices();
                        break;

                    case 4:
                        System.out.println("You have decided to view the Laboratory Services.");
                        lab.displayAllServices();
                        break;

                    case 5:
                        System.out.println("You have decided to view the Staffs List.");
                        viewStaffList.viewStaffList();
                        break;

                    case 6:
                        System.out.println("You have decided to view the Doctors List.");
                        viewDoctorsDirectory.viewDoctorsDirectory();
                        break;

                    case 7:
                        System.out.println("You have decided to view the Emergency Hotline Number.");
                        Emergency.displayEmergencyContacts();
                        break;

                    case 8:
                        System.out.println("You have decided to view About Us.");
                        About about = new About();
                        about.displayInfo();
                        break;

                    case 0:
                        System.out.println("Exiting the program. Thank you and See you later!");
                        exit = true;
                        break;

                    default:
                        System.out.println("That is not one of the Options, Please try again.");
                        break;
                }
            }
        }
        scanner.close();
    }

}
