public class EvenNumbers {
    public static void main(String[] args) {
        int limit = 20; // Change this to set the limit of even numbers
        System.out.println("Even numbers up to " + limit + ":");
        for (int i = 0; i <= limit; i += 2) {
            System.out.print(i + " ");
        }
    }
}
