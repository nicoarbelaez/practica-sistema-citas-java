package arbelaeznicolas.dev;

public class Doctor {
    static int id;
    String name;
    String speciality;

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
}
