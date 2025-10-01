    package classroommanager;

    import java.util.*;

    public class Classroom {
        private String name;
        private List<Student> students;
        private List<Assignment> assignments;
        private Map<String, Set<String>> submissions; // Tracks which students submitted which assignments

        public Classroom(String name) {
            this.name = name;
            this.students = new ArrayList<>();
            this.assignments = new ArrayList<>();
            this.submissions = new HashMap<>();
        }

        public String getName() {
            return name;
        }

        public boolean addStudent(Student student) {
            for (Student s : students) {
                if (s.getId().equals(student.getId())) {
                    return false;
                }
            }
            students.add(student);
            return true;
        }

        public boolean addAssignment(Assignment assignment) {
            assignments.add(assignment);
            submissions.put(assignment.getTitle(), new HashSet<>()); // Initialize empty submission set
            return true;
        }

        public boolean submitAssignment(String studentId, String assignmentTitle) {
            Student student = findStudentById(studentId);
            if (student == null) {
                return false;
            }

            Assignment assignment = findAssignmentByTitle(assignmentTitle);
            if (assignment == null) {
                return false;
            }

            submissions.get(assignmentTitle).add(studentId);
            return true;
        }

        public void viewStudents() {
            if (students.isEmpty()) {
                System.out.println("No students in classroom " + name + ".");
                return;
            }
            System.out.println("Students in " + name + ":");
            for (Student student : students) {
                System.out.println("  - " + student.getId() + ": " + student.getName());
            }
        }

        public void viewAssignments() {
            if (assignments.isEmpty()) {
                System.out.println("No assignments in classroom '" + name + "'.");
                return;
            }
            System.out.println("Assignments in '" + name + "':");
            for (Assignment assignment : assignments) {
                Set<String> submittedStudents = submissions.get(assignment.getTitle());
                int submittedCount = submittedStudents.size();
                int totalStudents = students.size();

                System.out.println("  - " + assignment.getTitle() +
                        " (" + submittedCount + "/" + totalStudents + " students submitted)");

                // Show which specific students submitted
                for (String studentId : submittedStudents) {
                    Student student = findStudentById(studentId);
                    System.out.println("    ✓ " + student.getName() + " (" + studentId + ")");
                }
            }
        }

        private Student findStudentById(String studentId) {
            for (Student student : students) {
                if (student.getId().equals(studentId)) {
                    return student;
                }
            }
            return null;
        }

        private Assignment findAssignmentByTitle(String title) {
            for (Assignment assignment : assignments) {
                if (assignment.getTitle().equals(title)) {
                    return assignment;
                }
            }
            return null;
        }
    }