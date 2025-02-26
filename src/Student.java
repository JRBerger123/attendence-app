/**
 * Represents student attendance for various classes
 * <p>
 * This class is used in {@code StudentApp.java} and models student attendance
 * with a seat number, student name, on time arrivals, late arrivals, number of excused absences, and unexcused absences
 * </p>
 *
 * @author Brandon Berger, Jonathan Sosa
 * @version 0.5
 * @since 2025-02-24
 * @see <a href="https://github.com/JRBerger123/attendance-app">GitHub Repository</a>
 * @see <a href="https://github.com/JRBerger123">Brandon Berger's GitHub</a>
 */
public class Student {
    /*
     * The student's seat.
     */
    private int seat;

    /*
     * The student's name.
     */
    private String name;

    /*
     * The number of on time arrivals the students has had.
     */
    private int onTime;

    /*
     * The number of late arrivals the students has had.
     */
    private int late;

    /*
     * The number of excused absences the student has had.
     */
    private int excused;

    /*
     * The number of unexcused absences the student has had.
     */
    private int unexcused;


    private Student() {
        this.name = "";
        this.seat = -1;
    }

    public Student(int seat) {
        this();
    }

    public Student(int seat, String name) {
        this();
        this.seat = seat;
        this.name = name;
    }

    public int getSeat() {
        return seat;
    }

    public String getName() {
        return name;
    }

    public int getOnTime() {
        return onTime;
    }

    public int getLate() {
        return late;
    }

    public int getExcused() {
        return excused;
    }

    public int getUnexcused() {
        return unexcused;
    }

    public void setSeat(int seat) throws Exception {
        if (seat < 1)
            throw new Exception("Seat cannot be a negative");
        else
            this.seat = seat;
    } // end of setSeat Method

    public void setName(String name) throws Exception {
        name = name.trim();

        if (name == "" || name == null)
            throw new Exception("Student name can not be blank");
        else
            this.name = name;
    } // end of setName method

    public void updateAttendance(int status) throws Exception {
        switch (status) {
            case 0:
                onTime++;
            case 1:
                late++;
                break;
            case 2:
                excused++;
                break;
            case 3:
                unexcused++;
                break;
            default:
                throw new Exception("Invalid Attendance type: " + status);
        }
    }

    public void displayAttendance() {
        System.out.println("Seat # " + seat + " " + name);
        System.out.println("On Time: " + onTime + " Late: " + late + " Excused: " + excused + " Unexcused: " + unexcused);
    }

    @Override
    public boolean equals(Object object) {

        if(!(object instanceof Student))
            return false;

        Student other = (Student)object;

        return this.seat == other.getSeat();
    }

    @Override
    public String toString() {
        return String.format("%s %s", seat, name);
    }
}
