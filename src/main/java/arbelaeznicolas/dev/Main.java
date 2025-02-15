package arbelaeznicolas.dev;

import static arbelaeznicolas.dev.ui.UIMenu.*;

import java.util.Date;

import arbelaeznicolas.dev.model.Doctor;
import arbelaeznicolas.dev.model.Patient;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Anahí Salgado", "anahi@mail.com", "Pediatría");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        
        System.out.println(myDoctor);
        // for (Doctor.AvailableAppointment aAppointment : myDoctor.getAvailableAppointments()) {
        //     System.out.println(aAppointment.getDate() + " " + aAppointment.getTime());
        // }

        System.out.println("\n");
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient);
    }
}