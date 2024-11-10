public class Doctor {
    protected String name;
    protected String specialties;

    public Doctor(String name, String specialties) {
        this.name = name;
        this.specialties = specialties;
    }

    public void displayInfo() {
        System.out.println("Dr. " + name);
        System.out.println("Specialties: " + specialties);
        System.out.println();
    }
} 