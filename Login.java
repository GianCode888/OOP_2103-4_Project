import java.util.*;

public class Login {

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

    public static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Hospital Patient Management System");
        System.out.println("Are you a (1) Patient or (2) Doctor/Staff?");
        int userType = scanner.nextInt();
        scanner.nextLine();

        switch (userType) {
            case 1 -> patientLogin(scanner);
            case 2 -> staffLogin(scanner);
            default -> System.out.println("Invalid option. Exiting...");
        }
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
            System.out.println("Welcome, Dr " + username + "!");
            System.out.println("You can now add or view appointments as a doctor.");
            System.out.println("Please Choose an Option");
            System.out.println("1. View All Records. ");
            System.out.println("2. Add A Record.");
            System.out.println("3. Exit.");
            lMenu();
        } else {
            System.out.println("Invalid credentials for doctor/staff login.");
        }

    }

    private static void Retry() {
        System.out.println("Would you like to access a different field? y/n");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        switch (choice) {
            case 'Y', 'y':
                System.out.println("Please Choose an Option");
                System.out.println("1. View All Records. ");
                System.out.println("2. Add A Record.");
                System.out.println("3. Exit.");
                lMenu();
                break;
            case 'N', 'n':
                System.out.println("Returning to Menu.");
                Main.Dmenu();
                break;
            default:
                System.out.println("That is not one of the Options.");
                Retry();
                break;
        }
    }

    private static void lMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have chosen to view ALL of the archived Records.");
                for (int i = 1; i < Records.Records.length; i++) {
                    System.out.println( i + ". " + Records.Records[i]);
                }
                Retry();
                break;

            case 2:
                System.out.println("You have chosen to add a record");

                ArrayList<String> records = new ArrayList<>();

                records.add("""
                        03/14/2024
                        Dr: Dr. JC Nealega (Fam Dr)
                        Betahistine 24mg
                        1 tab 2x a day after breakfast and dinner
                        """);

                for (String Record: records) {
                    System.out.println(Record);
                }
                Retry();
                 break;

            case 3:
                System.out.println("Exiting.");
                Main.Dmenu();
                break;

            case 4:
                System.out.println("That is not one of the Options, Please choose a correct one next time.");
                lMenu();
                break;

        }
        scanner.close();
    }
}