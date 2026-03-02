import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectTime {
    private String startTime;
    private String endTime;
    private float hoursLogged;

    public ProjectTime(String start, String end) {
        this.startTime = start;
        this.endTime = end;
    }

    public void setStartTime(String s) {
        this.startTime = s;

    }

    public void setEndTime(String s) {
        this.endTime = s;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;

    }

    public String getHoursLogged() {
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        try {
            Date start = DATE_FORMAT.parse(getStartTime());
            Date end = DATE_FORMAT.parse(getEndTime());

            long diff = end.getTime() - start.getTime();

            long minutes = diff / (1000 * 60);
            long hours = diff / (1000 * 60 * 60);
            long days = diff / (1000 * 60 * 60 * 24);
            if (diff<0){
                return "-1";
            }
            if (minutes < 120) {
                return minutes + " m";
            } else if (hours < 120) {
                return hours + " h";
            } else if (days < 120) {
                return days + " d";
            } else {
                long months = days / 30;
                return months + " mo";
            }

        } catch (Exception e) {
            return "-1";
        }
    }

    public static void main(String[] args) {

        ProjectTime project = new ProjectTime("2023-05-14 00:00", "2023-05-18 23:59");
        System.out.println("Short Project Total Logged Time: " + project.getHoursLogged());
        project.setEndTime("2023-05-19 00:00");
        System.out.println("Short Project Total Logged Time: " + project.getHoursLogged());

        // ProjectTime overnightProject = new ProjectTime("2023-05-14 20:00", "2023-05-15 08:00");
        // System.out.println("Overnight Project Total Logged Time: " + overnightProject.getHoursLogged());

        // ProjectTime fullDayProject = new ProjectTime("2023-05-14 00:00", "2023-05-15 00:00");
        // System.out.println("Full Day Project Total Logged Time: " + fullDayProject.getHoursLogged());

        // ProjectTime errorProject = new ProjectTime("2023-05-14", "2023-05-15 08:00");
        // System.out.println("Error Project Total Logged Time: " + errorProject.getHoursLogged());
    }
}