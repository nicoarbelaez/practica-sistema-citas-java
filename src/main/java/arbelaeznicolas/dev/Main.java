package arbelaeznicolas.dev;

import static arbelaeznicolas.dev.ui.UIMenu.*;

import java.util.Date;

import arbelaeznicolas.dev.model.Doctor;
import arbelaeznicolas.dev.model.Patient;
import arbelaeznicolas.dev.model.User;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Anahí Salgado", "anahi@mail.com", "Pediatría");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        User user = new Doctor("Anahí", "anahi@mail.com", "Pediatría");
        user.showDataUser();

        User userPa = new Patient("Anahí", "anahi@mail.com");
        userPa.showDataUser();

        User user1 = new User("Anahí", "anahi@mail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatría");
            }

        };
        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        // for (Doctor.AvailableAppointment aAppointment :
        // myDoctor.getAvailableAppointments()) {
        // System.out.println(aAppointment.getDate() + " " + aAppointment.getTime());
        // }

        // System.out.println("\n");
        // Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        // System.out.println(patient);
    }
}