public class Tester {
    public static void main(String[] args) {
        try {
            Student x1 = new Student(1, "Tony");
            System.out.println(x1);
        } catch (Exception e) {
            System.out.println((e.getMessage()));
        }
        System.out.println("Hi");
    }
}
