package arbelaeznicolas.dev;

import static arbelaeznicolas.dev.ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatría");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        int i = 0;
        int b = 2;
        b = i;
        System.out.println(b);
        System.out.println(i);
        i = 3;
        System.out.println(b);
        System.out.println(i);
        
        String name = "Ann";

        System.out.println("\n");
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        Patient patient2 = new Patient("Anahi", "anahi@mail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        // patient.setWeight(54.6);
        // System.out.println(patient.getWeight());

        // patient.setPhoneNumber("12345678");
        // System.out.println(patient.getPhoneNumber());
    }
}