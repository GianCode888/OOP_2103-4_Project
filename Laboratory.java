public class Laboratory {

    private Laboratoryservice[] services;
    private int serviceCount;

    public Laboratory(int maxServices) {
        services = new Laboratoryservice[maxServices];
        serviceCount = 0;
    }

    public void addService(Laboratoryservice service) {
        if (serviceCount < services.length) {
            services[serviceCount] = service;
            serviceCount++;
        } else {
            System.out.println("Cannot add more services. Maximum capacity reached.");
        }
    }

    public void displayAllServices() {
        for (int i = 0; i < serviceCount; i++) {
            services[i].displayServiceDetails();
            System.out.println();
        }
    }
}
