public class Tester {
    public static void main(String[] args) {
        try {
            Student x1 = new Student(1, "Tony");
            Student x2 = new Student(2, "Bob");
            System.out.println(x1);
            x1.displayAttendance();
            System.out.println(x1.equals(x2));
        } catch (Exception e) {
            System.out.println((e.getMessage()));
        }
    }
}
