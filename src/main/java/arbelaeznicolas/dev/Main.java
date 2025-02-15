package arbelaeznicolas.dev;

import static arbelaeznicolas.dev.ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodríguez";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.showId();

        showMenu();
    }
}