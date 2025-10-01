package classroommanager;

public class Factory {
    public static Classroom createClassroom(String name) {
        return new Classroom(name);
    }

    public static Student createStudent(String id, String name) {
        return new Student(id, name);
    }

    public static Assignment createAssignment(String title) {
        return new Assignment(title);
    }
}