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
