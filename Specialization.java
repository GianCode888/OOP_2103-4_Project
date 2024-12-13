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






