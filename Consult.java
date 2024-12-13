public class Consult {
    private String serviceName;
    private String specialistName;
    private String designation;

    public Consult(String serviceName, String specialistName, String designation) {
        this.serviceName = serviceName;
        this.specialistName = specialistName;
        this.designation = designation;
    }

    public void info() {
        System.out.println("Service: " + serviceName);
        System.out.println("Specialist: " + specialistName);
        System.out.println("Designation: " + designation);
        System.out.println();
    }
}

