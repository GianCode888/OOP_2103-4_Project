public class Laboratoryservice {

    private String serviceClass;
    private String serviceName;
    private boolean availability;
    private String[] availableTests;

    public Laboratoryservice(String serviceClass, String serviceName, boolean availability, String[] availableTests) {
        this.serviceClass = serviceClass;
        this.serviceName = serviceName;
        this.availability = availability;
        this.availableTests = availableTests;
    }

    public String getServiceClass() {
        return serviceClass;
    }

    public void setServiceClass(String serviceClass) {
        this.serviceClass = serviceClass;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String[] getAvailableTests() {
        return availableTests;
    }

    public void setAvailableTests(String[] availableTests) {
        this.availableTests = availableTests;
    }

    public void displayServiceDetails() {
        System.out.println("Service Class: " + serviceClass);
        System.out.println("Service Name: " + serviceName);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
        System.out.print("Available Tests: ");
        for (String test : availableTests) {
            System.out.print(test + ", ");
        }
        System.out.println();
    }
}
