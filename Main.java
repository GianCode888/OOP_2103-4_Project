public class Main {
    public static void main(String[] args) {
        String[] allTests = {
                "Complete Blood Count", "Blood Typing", "Fasting Blood Sugar", "Hemoglobin A1c",
                "Glucose Level Test", "Lipid Panel", "Basic Metabolic Panel", "Comprehensive Metabolic Panel",
                "Liver Function Tests", "Kidney Function Tests", "Uric Acid Test", "Electrolyte Panel",
                "Thyroid Function Tests", "Prothrombin Time (PT) and INR", "Vitamin D Test",
                "Creatine Kinase (CK)", "HIV Test", "Hepatitis B and C Tests", "Drug Test", "Urinalysis", "Coagulation Tests"
        };

        String[] bloodTests = {
                "Complete Blood Count", "Blood Typing", "Fasting Blood Sugar", "Hemoglobin A1c"
        };

        String[] metabolicTests = {
                "Basic Metabolic Panel", "Comprehensive Metabolic Panel", "Lipid Panel", "Kidney Function Tests", "Liver Function Tests"
        };

        String[] sexualHealthTests = {
                "HIV Test", "Hepatitis B and C Tests", "Drug Test", "Urinalysis"
        };

        Laboratoryservice labService1 = new Laboratoryservice("Blood Tests", "Blood and Sugar Tests", true, bloodTests);
        Laboratoryservice labService2 = new Laboratoryservice("Metabolic Tests", "Metabolic Function Tests", true, metabolicTests);
        Laboratoryservice labService3 = new Laboratoryservice("Sexual Health", "Sexual Health Tests", true, sexualHealthTests);

        Laboratory laboratory = new Laboratory(5);
        laboratory.addService(labService1);
        laboratory.addService(labService2);
        laboratory.addService(labService3);

        laboratory.displayAllServices();
    }
}
