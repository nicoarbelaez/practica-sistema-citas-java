package arbelaeznicolas.dev;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Anahí Salgado");
        myDoctor.name = "Alejandro Rodríguez";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctor2 = new Doctor();
        myDoctor2.name = "Anahí Salgado";
        myDoctor2.showName();
        myDoctor2.showId();
    }
}