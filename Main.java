public class Main {
    public static void main(String[] args) {

        Services generalService = new Services("---------------------------------------------SERVICES AVAILABLE---------------------------------------------");
        generalService.info();

        Consult labService = new Consult("         Laboratory Tests      |","Jan Nole Matres     |","Medical Technologist");
        labService.info();

        Consult sexEdService = new Consult("   Sexual Health and Wellbeing |","JC Nealega          |","Health Education Specialist");
        sexEdService.info();

        Consult counsellingService = new Consult("          Counselling          |","Kyle Gian Libera    |","Psychologist");
        counsellingService.info();

        Consult healthyLungsService = new Consult("Healthy Lungs, Healthy Living  |","Vincent Dipasupil   |","Pulmonologist");
        healthyLungsService.info();
    }
}
