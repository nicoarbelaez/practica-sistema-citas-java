package arbelaeznicolas.dev;

import java.util.Date;

import arbelaeznicolas.dev.model.Patient;
import arbelaeznicolas.dev.model.Nurse;

public class AppointmentNurse implements ISchedulable {
    private int id;
    private Patient patient;
    private Nurse doctor;
    private Date date;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Nurse getDoctor() {
        return doctor;
    }

    public void setDoctor(Nurse doctor) {
        this.doctor = doctor;
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

    @Override
    public void schedule(Date date, String time) {
        throw new UnsupportedOperationException("Unimplemented method 'schedule'");
    }

}
