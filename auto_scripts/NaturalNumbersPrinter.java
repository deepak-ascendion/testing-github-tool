public class NaturalNumbersPrinter {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("First " + n + " natural numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}