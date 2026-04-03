public class AddNumbers {

    public int add(int a, int b) {
        return a + b;
    }

    public String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        AddNumbers obj = new AddNumbers();
        System.out.println("Sum: " + obj.add(5, 3));
        System.out.println("Reversed: " + obj.reverseString("Hello"));
    }
}