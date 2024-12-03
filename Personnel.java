public class Personnel {

    private String name;
    private LocalDateTime timeIn;
    private LocalDateTime timeOut;
    private static final String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public Personnel(String name) {
        this.name = name;
        this.timeIn = null;
        this.timeOut = null;
    }

    public void recordTimeIn() {
        if (this.timeIn == null) {
            this.timeIn = LocalDateTime.now();
            System.out.println("Time In recorded for " + name + " at " + formatTime(timeIn));
        } else {
            System.out.println("Time In already recorded.");
        }
    }

    public void recordTimeOut() {
        if (this.timeIn != null && this.timeOut == null) {
            this.timeOut = LocalDateTime.now();
            System.out.println("Time Out recorded for " + name + " at " + formatTime(timeOut));
        } else {
            System.out.println("Time Out cannot be recorded without Time In.");
        }
    }

    public String getInfo() {
        return "Name: " + name + "\nTime In: " + formatTime(timeIn) + "\nTime Out: " + formatTime(timeOut);
    }

    private String formatTime(LocalDateTime time) {
        return time != null ? time.format(DateTimeFormatter.ofPattern(TIME_FORMAT)) : "Not recorded";
    }

    public String getName() {
        return name;
    }
}
