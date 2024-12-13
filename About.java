public class About {

    private String hospitalName;
    private String slogan;
    private String groupName;
    private String[] members;

    public  About() {
        this.hospitalName = "LaLa Hospital Patient Management System";
        this.slogan = "Lasting Care, Lasting Wellness at LaLa";
        this.groupName = "Group 4";
        this.members = new String[] {
                "Niel Ashley Capili",
                "Vincent Dipasupil",
                "Kyle Gian Libera",
                "Joshua Magbanua",
                "Jan Nole Matres",
                "Iris Napoles",
                "JC Jade Nealega",
                "Kyla Tomoc"
        };
    }

    public void displayInfo() {
        System.out.println(hospitalName);
        System.out.println();
        System.out.println(slogan);
        System.out.println();
        System.out.println(groupName);
        System.out.println();
        System.out.println("Members:");
        for (String member : members) {
            System.out.println("- " + member);
        }
    }

    public static void main(String[] args) {
        About about = new About();
        about.displayInfo();
    }
}
