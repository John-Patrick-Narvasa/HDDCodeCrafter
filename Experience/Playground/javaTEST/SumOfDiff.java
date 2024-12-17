public class SumOfDiff {
    public static void main(String[] args) {
        int n = 3;
        int d = 3;
        int a = 2;
        int sum = calculateSum(n, d, a);
        System.out.println(displaySequence(n, d, a) + " = " + sum);
    }

    public static String displaySequence(int n, int d, int a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a + d * i);
            if (i < n - 1) {
                sb.append(" + ");
            }
        }
        return sb.toString();
    }

    public static int calculateSum(int n, int d, int a) {
        return (n / 2 * (2 * a + (n - 1) * d));
    }
}