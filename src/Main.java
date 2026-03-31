package main;

import model.*;
import service.*;
import util.FileHandler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService studentService = new StudentService();
        LabService labService = new LabService();
        HealthService healthService = new HealthService();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Add Lab Record");
            System.out.println("3. Add Health Record");
            System.out.println("4. View Students");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Dept: ");
                    String dept = sc.nextLine();

                    Student s = new Student(id, name, dept);
                    studentService.addStudent(s);

                    FileHandler.writeToFile("Added Student: " + name);
                    break;

                case 2:
                    System.out.print("Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Experiment: ");
                    String exp = sc.nextLine();

                    System.out.print("Result: ");
                    String res = sc.nextLine();

                    LabRecord lr = new LabRecord(sid, exp, res);
                    labService.addRecord(lr);

                    break;

                case 3:
                    System.out.print("Student ID: ");
                    int hid = sc.nextInt();

                    System.out.print("Temperature: ");
                    double temp = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Symptoms: ");
                    String sym = sc.nextLine();

                    HealthRecord hr = new HealthRecord(hid, temp, sym);
                    healthService.addHealthRecord(hr);

                    break;

                case 4:
                    studentService.viewStudents();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}