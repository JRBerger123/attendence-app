/**
 * Represents student attendance for various classes
 * <p>
 * This class is used in {@code Tester.java} and models student attendance
 * with a seat number, student name, 
 * </p>
 *
 * @author Brandon Berger, 
 * @version 0.1
 * @since 2025-02-24
 * @see <a href="https://github.com/JRBerger123/attendance-app">GitHub Repository</a>
 * @see <a href="https://github.com/JRBerger123">Brandon Berger's GitHub</a>
 */
public class Student {
    private int seat;
    private String name;
    private int onTime;
    private int late;
    private int excused;
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

    public void setSeat() {

    }

    public void setName() {

    }

    public void updateAttendance() {

    }

    public void displayAttendance() {

    }

    public boolean equals() {

        return true;
    }

    @Override
    public String toString() {
        return String.format("", seat, name);
    }
}
