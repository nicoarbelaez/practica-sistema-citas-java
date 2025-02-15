package arbelaeznicolas.dev;

import static arbelaeznicolas.dev.ui.UIMenu.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatría");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment aAppointment : myDoctor.getAvailableAppointments()) {
            System.out.println(aAppointment.getDate() + " " + aAppointment.getTime());
        }

        // System.out.println("\n");
        // Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        // Patient patient2 = new Patient("Anahi", "anahi@mail.com");

        // System.out.println(patient.getName());
        // System.out.println(patient2.getName());
        // patient2 = patient;

        // System.out.println(patient.getName());
        // System.out.println(patient2.getName());

        // patient.setName("Manuel");
        // System.out.println(patient.getName());
        // System.out.println(patient2.getName());
    }
}