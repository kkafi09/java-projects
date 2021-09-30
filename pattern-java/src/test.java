public class test {
    public static void main(String[] args) {
        recursive(7);
    }

    public static void recursive(int n) {
        System.out.println(n);
        while (n > 0) {
            if (n % 2 == 1) {
                n = n * 3 + 1;
                System.out.println(n);
            } else {
                n /= 2;
                System.out.println(n);
            }
        }
    }

}
