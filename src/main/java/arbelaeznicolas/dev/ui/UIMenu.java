package arbelaeznicolas.dev.ui;

import java.util.ArrayList;
import java.util.Scanner;

import arbelaeznicolas.dev.model.Doctor;
import arbelaeznicolas.dev.model.Patient;

public class UIMenu {

    public static final String[] MONTHS = { "January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December" };
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu() {
        Scanner sc = new Scanner(System.in);
        int response = 0;

        System.out.println("Welcome to My Appointments");
        System.out.println("Select the desired option");

        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for your visit");
                    break;
                default:
                    System.out.println("Please select a correct option");
            }
        } while (response != 0);
        sc.close();
    }

    private static void authUser(int userType) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martínez", "alejandro@mail.com", "Cardiología"));
        doctors.add(new Doctor("Karen Sosa", "karen@mail.com", "Pediatría"));
        doctors.add(new Doctor("Rocío Gómez", "rocio@mail.com", "Oftalmología"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Nicolas Arbelaez", "nicolas@mail.com"));
        patients.add(new Patient("Roberto Rodríguez", "roberto@mail.com"));
        patients.add(new Patient("Carlos Sánchez", "carlos@mail.com"));

        boolean emailCorrect = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Insert your email: [a@a.com]");
            String email = sc.next();

            if (userType == 1) {
                for (Doctor d : doctors) {
                    if (d.getEmail().equals(email)) {
                        emailCorrect = true;
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }
            if (userType == 2) {
                for (Patient p : patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
        } while (!emailCorrect);
        sc.close();
    }
    
    public static void showPatientMenu() {
        Scanner sc = new Scanner(System.in);
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + 1 + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }

        } while (response != 0);
        sc.close();
    }
}
