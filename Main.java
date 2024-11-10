public class Main {
    public static void main(String[] args) {
        System.out.println("DOCTORS DIRECTORY");
        System.out.println("----------------");

        Doctor[] doctors = {
            new Doctor("JC Nealega", "Resident Family Doctor, Internal Medicine, OB-GYNE Specialist"),
            new Doctor("Kyle Gian Libera", "Internal Medicine, Endocrinology Specialist"),
            new Doctor("Vincent Dipasupil", "Internal Medicine, Pulmonology Specialist")
        };

        for (Doctor doctor : doctors) {
            doctor.displayInfo();
        }
    }
}