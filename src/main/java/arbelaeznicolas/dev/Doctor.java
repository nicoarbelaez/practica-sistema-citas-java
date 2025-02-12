package arbelaeznicolas.dev;

public class Doctor {
    static int globalId = 0;
    int id;
    String name;
    String speciality;

    Doctor() {
        this.id = ++globalId;
        System.out.println("Construyendo el objeto Doctor");
    }
    
    Doctor(String name) {
        this.id = ++globalId;
        System.out.println("El nombre del doctor asignado es: " + name);
    }

    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("El id del doctor es: " + id);
    }
}
