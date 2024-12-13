public class viewAppointments {

    public static void viewAppointments() {
        Appointment appointment1 = new Appointment("2024-11-14", "10:00 AM", "Dr. JC Nealega", "PASTOR");
        Appointment appointment2 = new Appointment("2024-11-15", "1:00 PM", "Dr. Kyle Gian Libera", "HERRERA");
        Appointment appointment3 = new Appointment("2024-11-16", "3:00 PM", "Dr. Vincent Dipasupil", "DIMAANO");

        System.out.println("\nAPPOINTMENT DETAILS");
        appointment1.displayAppointmentDetails();
        appointment2.displayAppointmentDetails();
        appointment3.displayAppointmentDetails();
    }
}
