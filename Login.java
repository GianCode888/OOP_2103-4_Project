import java.util.HashMap;
import java.util.Scanner;

public class Login {
    // Hardcoded patient data
    static final String PATIENT_USERNAME = "Niel";
    static final String PATIENT_PASSWORD = "lala1234";
    static final String PATIENT_INFO = """
            Name: Niel Ashley Capili
            Address: Brgy. Tibig, Lipa City, Batangas
            Age: 22
            Birthdate: 03/18/2002
            Sex: Male
            Phone Number: 0966 378 1933
            Email: nielajcapili@gmail.com
            """;

    // Hardcoded doctor and staff data
    static final String DOCTOR_STAFF_PASSWORD = "lala1234";
    static final HashMap<String, String> DOCTORS_AND_STAFF = new HashMap<>();

    static {
        DOCTORS_AND_STAFF.put("Kyla", DOCTOR_STAFF_PASSWORD);
        DOCTORS_AND_STAFF.put("Iris", DOCTOR_STAFF_PASSWORD);
        DOCTORS_AND_STAFF.put("Joshua", DOCTOR_STAFF_PASSWORD);
        DOCTORS_AND_STAFF.put("Nole", DOCTOR_STAFF_PASSWORD);
        DOCTORS_AND_STAFF.put("JC", DOCTOR_STAFF_PASSWORD);
        DOCTORS_AND_STAFF.put("Kyle", DOCTOR_STAFF_PASSWORD);
        DOCTORS_AND_STAFF.put("Vincent", DOCTOR_STAFF_PASSWORD);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Hospital Patient Management System");
        System.out.println("Are you a (1) Patient or (2) Doctor/Staff?");
        int userType = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (userType) {
            case 1 -> patientLogin(scanner);
            case 2 -> staffLogin(scanner);
            default -> System.out.println("Invalid option. Exiting...");
        }

        scanner.close();
    }

    private static void patientLogin(Scanner scanner) {
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        if (PATIENT_USERNAME.equals(username) && PATIENT_PASSWORD.equals(password)) {
            System.out.println("Login successful!");
            System.out.println("Patient Information:");
            System.out.println(PATIENT_INFO);
        } else {
            System.out.println("Invalid credentials for patient login.");
        }
    }

    private static void staffLogin(Scanner scanner) {
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        if (DOCTORS_AND_STAFF.containsKey(username) && DOCTOR_STAFF_PASSWORD.equals(password)) {
            System.out.println("Login successful!");
            System.out.println("Welcome, " + username + "!");
            System.out.println("You can now update, edit, add, or delete appointments and manage time in/out records.");
        } else {
            System.out.println("Invalid credentials for doctor/staff login.");
        }
    }
}
