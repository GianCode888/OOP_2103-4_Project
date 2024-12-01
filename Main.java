import java.util.Scanner;

public class Main {
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

//(3) TimeInTimeOut.java

// Automatic encoding of time in and time out
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Personnel {
    // Private fields for encapsulation
    private String name;
    private LocalDateTime timeIn;
    private LocalDateTime timeOut;
    private static final String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    // Constructor
    public Personnel(String name) {
        this.name = name;
        this.timeIn = null;
        this.timeOut = null;
    }

    // Method to set Time In automatically
    public void recordTimeIn() {
        if (this.timeIn == null) {
            this.timeIn = LocalDateTime.now();
            System.out.println("Time In recorded for " + name + " at " + formatTime(timeIn));
        } else {
            System.out.println("Time In already recorded.");
        }
    }

    // Method to set Time Out automatically
    public void recordTimeOut() {
        if (this.timeIn != null && this.timeOut == null) {
            this.timeOut = LocalDateTime.now();
            System.out.println("Time Out recorded for " + name + " at " + formatTime(timeOut));
        } else {
            System.out.println("Time Out cannot be recorded without Time In.");
        }
    }

    // Getter method for displaying time log
    public String getInfo() {
        return "Name: " + name + "\nTime In: " + formatTime(timeIn) + "\nTime Out: " + formatTime(timeOut);
    }

    // Helper method to format time
    private String formatTime(LocalDateTime time) {
        return time != null ? time.format(DateTimeFormatter.ofPattern(TIME_FORMAT)) : "Not recorded";
    }

    // Getter for name
    public String getName() {
        return name;
    }
}


//(4) Appointment.java

public class Appointment {
    private String doctor;
    private String patient;
    private String date;
    private String time;


    public Appointment(String date, String time, String doctor, String patient) {
        this.date = date;
        this.time = time;
        this.doctor = doctor;
        this.patient = patient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    // Getter and Setter for patient
    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }


    public void displayAppointmentDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Doctor: " + doctor);
        System.out.println("Patient: " + patient);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);

    }
}


//Doctor.java
public class Doctor {
    private String name, department, contact;
    private int age;

    public Doctor(String name, String department, String contact, int age) {
        this.name = name;
        this.department = department;
        this.contact = contact;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void doctorInfo() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Contact: " + contact);
        System.out.println("Age: " + age);
    }
}

class Specialization extends Doctor {
    private String specialties;

    public Specialization(String name, String department, String contact, int age, String specialties) {
        super(name, department, contact, age);
        this.specialties = specialties;
    }

    public String getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String specialties) {
        this.specialties = specialties;
    }

    @Override
    public void doctorInfo() {
        super.doctorInfo();
        System.out.println("Specialization: " + specialties);
    }
}

//Services.java
public class Services {
    protected String serviceName;

    public Services(String serviceName) {
        this.serviceName = serviceName;
    }

    public void info() {
        System.out.println(serviceName);
    }
}

class Consult extends Services {
    private String doctorName;
    private String specialization;

    public Consult(String serviceName, String doctorName, String specialization) {
        super(serviceName);
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    @Override
    public void info() {
        System.out.println(serviceName + "   Dr. " + doctorName + "   Specialization: " + specialization);
        System.out.println();
    }
}

