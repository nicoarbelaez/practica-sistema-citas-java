package arbelaeznicolas.dev.ui;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

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
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("::Book an Appointment");
            System.out.println("::Select date: ");
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();

            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments
                        .get(i)
                        .getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(j, UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(k, doctorAppointments);
                }
            }

            int responseDateSelected = sc.nextInt();
        } while (response != 0);
    }
}
