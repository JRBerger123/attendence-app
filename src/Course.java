import java.util.ArrayList;

/**
 * Represents Course Stats for an organization
 * <p>
 * This class is used in {@code StudentApp.java} and models course stats
 * 
 * </p>
 *
 * @author Brandon Berger, Jonathan Sosa
 * @version 0.1
 * @since 2025-02-26
 * @see <a href="https://github.com/JRBerger123/attendance-app">GitHub Repository</a>
 * @see <a href="https://github.com/JRBerger123">Brandon Berger's GitHub</a>
 */
public class Course {
    private String name;
    private ArrayList<Student> allStudents;
    
    public Course() {
        name = "unknown";
        allStudents = new ArrayList<>();
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Student getStudent(int seat) {
        for (Student s : allStudents) {
            if (s.getSeat() == seat) {
                return s;
            }
        }
        return null;
    }

    
    public void addStudent(int seat, String name) {
        if (getStudent(seat) != null) {
            System.out.println("Student with seat " + seat + " already exists.");
            return;
        }
        Student newStudent = new Student(seat, name);
        allStudents.add(newStudent);
    }


    public void displaySummaryReport() {
        System.out.println();
    }


    public void displayDetailReport() {
        System.out.println();
    }

    @Override
    public String toString() {
        return name;
    }
}
