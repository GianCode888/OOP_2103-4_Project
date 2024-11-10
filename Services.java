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
