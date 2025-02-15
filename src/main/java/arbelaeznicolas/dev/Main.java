package arbelaeznicolas.dev;

import static arbelaeznicolas.dev.ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatría");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
    }
}