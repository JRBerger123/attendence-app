import java.util.ArrayList;

/**
 * Represents Course Stats for an organization.
 * <p>
 * This class is used in {@code AttendanceApp.java} and models course stats.
 * Each course consists of a course name and list of students in the course. 
 * </p>
 *
 * @author Brandon Berger, Jonathan Sosa
 * @version 0.3
 * @since 2025-02-26
 * @see <a href="https://github.com/JRBerger123/attendance-app">GitHub Repository</a>
 * @see <a href="https://github.com/JRBerger123">Brandon Berger's GitHub</a>
 */
public class Course {
    /**
<<<<<<< Updated upstream
     * The Courses's name
     */
    private String name;
    /**
     * The students in the course
     */
    private ArrayList<Student> allStudents;

    /**Sets the student's names to "Unknown" and asigns them to a ArrayList*/
=======
     * Represents the course's name.
     */
    private String name;

    /**
     * Is an dynamic array of each student in the course.
     */
    private ArrayList<Student> allStudents;
    
    /**
     * The default constructor sets the course name to unknown and creates an empty allStudents ArrayList.
     */
>>>>>>> Stashed changes
    public Course() {
        name = "unknown";
        allStudents = new ArrayList<>();
    }
<<<<<<< Updated upstream
    /**
     * Gets the course's name
     * @return The course's name
=======

    /**
     * 
>>>>>>> Stashed changes
     */
    public String getName() {

        return name;
    }

<<<<<<< Updated upstream


    /**
     * Set's the course's name
     * @param name the course's name
     * @throws Exception if the course's name is blank <br>
=======
    /**
     * 
>>>>>>> Stashed changes
     */
    public void setName(String name) {
        name = name.trim(); // remove leading and trailing whitespace

        //isBlank checks for both empty or whitespace
        if (name == null || name == "") {
            throw new RuntimeException("Student name can not be blank.");
        }

        this.name = name;
    }

    /**
<<<<<<< Updated upstream
     * Get a Student by using their seat number using the ArrayList method
     * If the indexOf mtehod returns -1 then this method returns empty otherwise,
     * it returns the Student object associated with the seat number
     * @param seat The Student's seat
     * @return If a Student is found, it will return the Student object otherwise a empty value
     * @throws Exception Creating a student with a invalid seat could throw a error
=======
     * 
>>>>>>> Stashed changes
     */
    public Student getStudent(int seat) {
        for (Student s : allStudents) {
            if (s.getSeat() == seat) {
                return s;
            }
        }
        return null;
    }

    /**
<<<<<<< Updated upstream
     * Add a student to the course, by using the overload constructor that allows setting their name and seat too.
     * This method will verify that the seat is not already used by another student.
     * If it is already in use then it will throw an exception back to the calling method
     * @param seat The student's seat
     * @param name The course's name
     * @throws Exception Student with seat already exists
     */
    public void addStudent(int seat, String name) throws Exception{
=======
     * 
     */
    public void addStudent(int seat, String name) {
>>>>>>> Stashed changes
        if (getStudent(seat) != null) {
            System.out.println("Student with seat " + seat + " already exists.");
            return;
        }
        Student newStudent = new Student(seat, name);
        allStudents.add(newStudent);
    }

    /**
<<<<<<< Updated upstream
     * Displays the Courses summary stats
=======
     * 
>>>>>>> Stashed changes
     */
    public void displaySummaryReport() {

    }

    /**
<<<<<<< Updated upstream
     * Displays each Student's detailed stats for the entire course
=======
     * 
>>>>>>> Stashed changes
     */
    public void displayDetailReport() {
        Student student;

        displaySummaryReport();

        System.out.println("Seat   Name            OnTime Late Excused Unexcused");
        System.out.println("====== =============== ====== ==== ======= =========");

        for (Student value : allStudents) {

            student = value;

            System.out.printf("%6d %-15s %5d %3d %3d %3d %5d\n",
                    student.getName(),
                    student.getOnTime(),
                    student.getLate(),
                    student.getExcused(),
                    student.getUnexcused(),
                    student.getSeat());
        }
        System.out.println();
    }

    /**
<<<<<<< Updated upstream
     * Returns the course's name
     * @return Course Name
=======
     * 
>>>>>>> Stashed changes
     */
    @Override
    public String toString() {
        return name;
    }
}

