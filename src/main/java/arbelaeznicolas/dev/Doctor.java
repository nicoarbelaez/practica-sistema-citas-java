package arbelaeznicolas.dev;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id;
    private String name;
    private String speciality;

    Doctor() {
        System.out.println("Construyendo el objeto Doctor");
    }

    Doctor(String name, String speciality) {
        System.out.println("El nombre del doctor asignado es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public static class AvailableAppointment {
        private int idAvailableAppointments;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getIdAvailableAppointments() {
            return idAvailableAppointments;
        }

        public void setIdAvailableAppointments(int idAvailableAppointments) {
            this.idAvailableAppointments = idAvailableAppointments;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
