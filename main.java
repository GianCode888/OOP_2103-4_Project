import java.util.*;


    public class main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("\nHOSPITAL MANAGEMENT SYSTEM");
                System.out.println("1. View Doctors Directory");
                System.out.println("2. View Appointment Details");
                System.out.println("3. Time In/Out Personnel");
                System.out.println("4. View Staff List");
                System.out.println("5. View Available Services");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        viewDoctorsDirectory();
                        break;
                    case 2:
                        viewAppointments();
                        break;
                    case 3:
                        timeInOutPersonnel();
                        break;
                    case 4:
                        viewStaffList();
                        break;
                    case 5:
                        viewServices();
                        break;
                    case 6:
                        exit = true;
                        System.out.println("Exiting system. Thank you!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
            scanner.close();
        }

        private static void viewDoctorsDirectory() {
            Specialization d1 = new Specialization("Dr. JC Nealega",
                    "Family Medicine\n\t\t\tInternal Medicine\n\t\t\tObstetrics and Gynecology (OB-GYNE)",
                    "09223437111", 35,
                    "General Family Medicine\nGeneral Internal Medicine\nGeneral Obstetrics and Gynecology (OB-GYNE)");
            Specialization d2 = new Specialization("Dr. Kyle Gian Libera",
                    "Internal Medicine",
                    "09668738224", 33,
                    "Endocrinology (Hormones)");
            Specialization d3 = new Specialization("Dr. Vincent Dipasupil",
                    "Internal Medicine",
                    "09912752001", 37,
                    "Pulmonology (Lungs)");

            System.out.println("\nDOCTORS DIRECTORY");
            d1.doctorInfo();
            System.out.println();
            d2.doctorInfo();
            System.out.println();
            d3.doctorInfo();
        }

        private static void viewAppointments() {
            Appointment appointment1 = new Appointment("2024-11-14", "10:00 AM", "Dr. JC Nealega", "PASTOR");
            Appointment appointment2 = new Appointment("2024-11-15", "1:00 PM", "Dr. Kyle Gian Libera", "HERRERA");
            Appointment appointment3 = new Appointment("2024-11-16", "3:00 PM", "Dr. Vincent Dipasupil", "DIMAANO");

            System.out.println("\nAPPOINTMENT DETAILS");
            appointment1.displayAppointmentDetails();
            appointment2.displayAppointmentDetails();
            appointment3.displayAppointmentDetails();
        }

        private static void timeInOutPersonnel() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("\nEnter personnel name: ");
            String name = scanner.nextLine();
            Personnel personnel = new Personnel(name);

            boolean done = false;
            while (!done) {
                System.out.println("\n1. Record Time In");
                System.out.println("2. Record Time Out");
                System.out.println("3. View Personnel Time Log");
                System.out.println("4. Back to Main Menu");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        personnel.recordTimeIn();
                        break;
                    case 2:
                        personnel.recordTimeOut();
                        break;
                    case 3:
                        System.out.println(personnel.getInfo());
                        break;
                    case 4:
                        done = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        private static void viewStaffList() {
            System.out.println("\nSTAFF LIST:");
            System.out.println("1. Doctor");
            System.out.println("2. Nurse");
            System.out.println("3. Med Technician");
            System.out.println("4. Emergency Responder");
            System.out.println("5. Endocrinologist Specialist");
            System.out.println("6. Pulmonologist Specialist");
            System.out.println("7. Ob-Gyne Specialist");
            System.out.println("8. Custodial Engineer");
            System.out.println("9. Cashier");
            System.out.println("10. Sanitary Worker");
            System.out.println("11. Security Officer");
        }

        private static void viewServices() {
            Services generalService = new Services("---------------------------------------------SERVICES AVAILABLE---------------------------------------------");
            Consult labService = new Consult("         Laboratory Tests      |", "Jan Nole Matres     |", "Medical Technologist");
            Consult sexEdService = new Consult("   Sexual Health and Wellbeing |", "JC Nealega          |", "Health Education Specialist");
            Consult counsellingService = new Consult("          Counselling          |", "Kyle Gian Libera    |", "Psychologist");
            Consult healthyLungsService = new Consult("Healthy Lungs, Healthy Living  |", "Vincent Dipasupil   |", "Pulmonologist");

            System.out.println("\n" + generalService.serviceName);
            labService.info();
            sexEdService.info();
            counsellingService.info();
            healthyLungsService.info();
        }
    }







