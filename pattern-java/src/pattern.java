public class pattern {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {1,2,3},
                {1,2,3},
                {1,2,3},
        };

        int n = matrix.length;
        System.out.println(n);
    }

    /*
        * * * * *
        *       *
        *       *
        *       *
        * * * * *
    */
    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n){
                    System.out.print("* ");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
         * * * * *
         * # # # *
         * # # # *
         * # # # *
         * * * * *
     */
    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n){
                    System.out.print("* ");
                } else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    /*
            *
            *
        * * * * *
            *
            *
    */
    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 3 || j == 3){ // you can use i == n/2 + 1
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /*
        o o * o o
        o o * o o
        * * * * *
        o o * o o
        o o * o o
    */
    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 3 || j == 3){ // you can use n / 2 + 1
                    System.out.print("* ");
                } else{
                    System.out.print("o ");
                }
            }
            System.out.println();
        }
    }

    /*
        * o o o o
        o * o o o
        o o * o o
        o o o * o
        o o o o *
    */

    public static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j){
                    System.out.print("* ");
                } else{
                    System.out.print("o ");
                }
            }
            System.out.println();
        }
    }


    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == n +1 || i == j){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
