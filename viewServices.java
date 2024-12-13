public class viewServices {

    public static void viewServices() {
        Services generalService = new Services("---------------------------------------------SERVICES AVAILABLE---------------------------------------------");
        Consult labService = new Consult("         Laboratory Tests      |", "Jan Nole Matres     |", "Medical Technologist");
        Consult sexEdService = new Consult("   Sexual Health and Wellbeing |", "JC Nealega          |", "Health Education Specialist");
        Consult counsellingService = new Consult("          Counselling          |", "Kyle Gian Libera    |", "Psychologist");
        Consult healthyLungsService = new Consult("Healthy Lungs, Healthy Living  |", "Vincent Dipasupil   |", "Pulmonologist");

        System.out.println("\n" + generalService.serviceName);
        labService.info();
        sexEdService.info();
        counsellingService.info();
        healthyLungsService.info();
    }
}
