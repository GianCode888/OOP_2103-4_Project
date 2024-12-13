public class viewDoctorsDirectory{

    public static void viewDoctorsDirectory() {
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
}


