public class AddNumbers {
    public static void main(String[] args) {
        int[][] pairs = { {1, 2}, {3, 4}, {5, 6}, {10, 20} };
        for (int i = 0; i < pairs.length; i++) {
            int a = pairs[i][0];
            int b = pairs[i][1];
            int sum = a + b;
            System.out.println(a + " + " + b + " = " + sum);
        }
    }
}
