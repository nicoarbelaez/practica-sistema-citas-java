package arbelaeznicolas.dev.ui;

import java.util.ArrayList;
import java.util.Scanner;

import arbelaeznicolas.dev.model.Doctor;

public class UIDoctorMenu {
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu() {
        int response = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Scheduled Appointments");
            System.out.println("0. Logout");

            response = sc.nextInt();

            switch (response) {
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    showAvailableAppointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        } while (response != 0);
        sc.close();
    }

    private static void showAddAvailableAppointmentsMenu() {
        int response = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("::Add Available Appointment");
            System.out.println("::Select a Month");

            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            response = sc.nextInt();

            if (response > 0 && response < 4) {
                int monthSelected = response;
                System.out.println(monthSelected + ". " + UIMenu.MONTHS[monthSelected - 1]);

                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = sc.next();

                System.out.println("Your date is: " + date + "\n1. Correct \n2. Change Date");
                int responseDate = sc.nextInt();

                if (responseDate == 2)
                    continue;

                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("Insert the time available for date: " + date + " [hh:mm]");
                    time = sc.next();
                    System.out.println("Your time is: " + time + "\n1. Correct \n2. Change Time");
                    responseTime = sc.nextInt();
                } while (responseTime == 2);

                UIMenu.doctorLogged.addAvailableAppointment(date, time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);
            } else if (response == 0) {
                showDoctorMenu();
            }
        } while (response != 0);
        sc.close();
    }

    private static void showAvailableAppointments() {
        System.out.println();
        System.out.println("::My Scheduled Appointments");
        if (UIMenu.doctorLogged.getAvailableAppointments().size() == 0) {
            System.out.println("Don't have appointments");
            return;
        }

        for (int i = 0; i < UIMenu.doctorLogged.getAvailableAppointments().size(); i++) {
            int j = i + 1;
            System.out.println(j + ". " + "Date: " + UIMenu.doctorLogged.getAvailableAppointments().get(i).getDate()
                    + " Time: " + UIMenu.doctorLogged.getAvailableAppointments().get(i).getTime());
        }
    }

    private static void checkDoctorAvailableAppointments(Doctor doctor) {
        if (doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointments.contains(doctor)) {
            doctorsAvailableAppointments.add(doctor);
        }
    }
}
