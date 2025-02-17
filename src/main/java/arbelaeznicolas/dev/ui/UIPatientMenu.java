package arbelaeznicolas.dev.ui;

import java.util.ArrayList;
import java.util.Scanner;

import arbelaeznicolas.dev.model.Doctor;

public class UIPatientMenu {
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public static void showPatientMenu() {
        int response = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome " + UIMenu.patientLogged.getName());
            System.out.println("1. Book an Appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Logout");

            response = sc.nextInt();
            switch (response) {
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        } while (response != 0);
        sc.close();
    }

    private static void showBookAppointmentMenu() {
        int response = 0;
        do {
            System.out.println("::Book an Appointment");
            System.out.println("::Select date: ");
        } while (response != 0);
    }
}
