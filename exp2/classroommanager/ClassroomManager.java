package classroommanager;

import java.util.HashMap;
import java.util.Map;

public class ClassroomManager {
    private static ClassroomManager instance;
    private Map<String, Classroom> classrooms;

    private ClassroomManager() {
        classrooms = new HashMap<>();
    }

    public static ClassroomManager getInstance() {
        if (instance == null) {
            instance = new ClassroomManager();
        }
        return instance;
    }

    public boolean addClassroom(String name) {
        if (classrooms.containsKey(name)) {
            return false;
        }
        Classroom classroom = Factory.createClassroom(name);
        classrooms.put(name, classroom);
        return true;
    }

    public boolean removeClassroom(String name) {
        if (classrooms.containsKey(name)) {
            classrooms.remove(name);
            return true;
        }
        return false;
    }

    public boolean addStudent(String studentId, String studentName, String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            return false;
        }
        Student student = Factory.createStudent(studentId, studentName);
        return classroom.addStudent(student);
    }

    public boolean scheduleAssignment(String className, String title) {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            return false;
        }
        Assignment assignment = Factory.createAssignment(title);
        return classroom.addAssignment(assignment);
    }

    public boolean submitAssignment(String studentId, String className, String assignmentTitle) {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            return false;
        }
        return classroom.submitAssignment(studentId, assignmentTitle);
    }

    public void viewAllClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
            return;
        }
        System.out.println("Available Classrooms:");
        for (String name : classrooms.keySet()) {
            System.out.println("  - " + name);
        }
    }

    public void viewAllStudentsInAllClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
            return;
        }

        for (String className : classrooms.keySet()) {
            Classroom classroom = classrooms.get(className);
            System.out.println("\nClassroom: " + className);
            classroom.viewStudents(); // This will show students for this classroom
        }
    }

    public void viewAssignmentsInClassroom(String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            System.out.println("Classroom '" + className + "' not found.");
            return;
        }
        classroom.viewAssignments();
    }
}