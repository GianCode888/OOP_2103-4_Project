public class Appointment {
    private String date;
    private String time;
    private String doctor;
    private String patient;

    public Appointment(String date, String time, String doctor, String patient) {
        this.date = date;
        this.time = time;
        this.doctor = doctor;
        this.patient = patient;
    }

    public void displayAppointmentDetails() {
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Doctor: " + doctor);
        System.out.println("Patient: " + patient);
        System.out.println();
    }
}
