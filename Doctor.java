public class Doctor {
    private String name, department, contact;
    private int age;

    public Doctor(String name, String department, String contact, int age) {
        this.name = name;
        this.department = department;
        this.contact = contact;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void doctorInfo() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Contact: " + contact);
        System.out.println("Age: " + age);
    }
}