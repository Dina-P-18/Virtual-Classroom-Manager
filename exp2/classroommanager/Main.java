package classroommanager;

import java.util.Scanner;

public class Main {
    private static ClassroomManager manager = ClassroomManager.getInstance();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Virtual Classroom Manager Started!");

        while (true) {
            printMenu();
            String command = scanner.nextLine().trim();

            switch (command.toLowerCase()) {
                case "1":
                    addClassroom();
                    break;
                case "2":
                    addStudent();
                    break;
                case "3":
                    scheduleAssignment();
                    break;
                case "4":
                    submitAssignment();
                    break;
                case "5":
                    viewClassrooms();
                    break;
                case "6":
                    removeClassroom();
                    break;
                case "7":
                    viewAllStudents();
                    break;
                case "8":
                    viewAssignments();
                    break;
                case "9":
                    System.out.println("Exiting Virtual Classroom Manager. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n MAIN MENU:");
        System.out.println("1. Add Classroom");
        System.out.println("2. Add Student to Classroom");
        System.out.println("3. Schedule Assignment");
        System.out.println("4. Submit Assignment");
        System.out.println("5. List All Classrooms");
        System.out.println("6. Remove Classroom");
        System.out.println("7. View Students in Classroom");
        System.out.println("8. View Assignments in Classroom");
        System.out.println("9. Exit");
        System.out.print("Choose an option (1-8): ");
    }

    private static void addClassroom() {
        System.out.print("Enter classroom name: ");
        String name = scanner.nextLine().trim();
        if (manager.addClassroom(name)) {
            System.out.println("Classroom " + name + " has been created");
        } else {
            System.out.println("Classroom " + name + " already exists!");
        }
    }

    private static void removeClassroom() {
        System.out.print("Enter classroom name to remove: ");
        String name = scanner.nextLine().trim();
        if (manager.removeClassroom(name)) {
            System.out.println("Classroom '" + name + "' removed successfully!");
        } else {
            System.out.println("Classroom '" + name + "' not found!");
        }
    }

    private static void addStudent() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine().trim();
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine().trim();
        System.out.print("Enter classroom name: ");
        String className = scanner.nextLine().trim();

        if (manager.addStudent(studentId, studentName, className)) {
            System.out.println("Student " + studentId + " has been enrolled in " + className );
        } else {
            System.out.println("Failed to add student. Classroom might not exist.");
        }
    }

    private static void scheduleAssignment() {
        System.out.print("Enter classroom name: ");
        String className = scanner.nextLine().trim();
        System.out.print("Enter assignment title: ");
        String title = scanner.nextLine().trim();

        if (manager.scheduleAssignment(className, title)) {
            System.out.println("Assignment for '" + className + "' has been scheduled");
        } else {
            System.out.println("Failed to schedule assignment. Classroom might not exist.");
        }
    }

    private static void submitAssignment() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine().trim();
        System.out.print("Enter classroom name: ");
        String className = scanner.nextLine().trim();
        System.out.print("Enter assignment title: ");
        String title = scanner.nextLine().trim();

        if (manager.submitAssignment(studentId, className, title)) {
            System.out.println("Assignment submitted by student " + studentId + " in " + className );
        } else {
            System.out.println("Failed to submit assignment. Check student, classroom, and assignment exist.");
        }
    }

    private static void viewClassrooms() {
        manager.viewAllClassrooms();
    }

    private static void viewAllStudents() {
        manager.viewAllStudentsInAllClassrooms();
    }

    private static void viewAssignments() {
        System.out.print("Enter classroom name: ");
        String className = scanner.nextLine().trim();
        manager.viewAssignmentsInClassroom(className);
    }
}