package arbelaeznicolas.dev;

import static arbelaeznicolas.dev.ui.UIMenu.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Anahí Salgado", "anahi@mail.com", "Pediatría");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment aAppointment : myDoctor.getAvailableAppointments()) {
            System.out.println(aAppointment.getDate() + " " + aAppointment.getTime());
        }

        System.out.println("\n");
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient);
    }
}