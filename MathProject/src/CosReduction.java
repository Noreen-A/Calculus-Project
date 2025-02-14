public class CosReduction {
    int n ;

    public CosReduction(int n) {
        int temp = n;
        if (n == 0) {
            System.out.println("x + c");
        } else if (n == 1) {
            System.out.println("sinx + c");
        } else if (n % 2 == 0) {
            System.out.print("(cosx^" + (n - 1) + ".sinx)/" + n + "+(" + (n - 1) + "/" + n + ")[");
            n -= 2;
            for (int i = 1; i < n; n -= 2) {
                System.out.print("(cosx^" + (n - 1) + ".sinx)/" + n + "+(" + (n - 1) + "/" + n + ")[");
            }
            System.out.print("x");
            for (int i = 1; i <= (temp / 2); i++) {
                System.out.print("]");
            }
            System.out.print("+c");
        } else if (n % 2 != 0) {
            System.out.print("(cosx^" + (n - 1) + ".sinx)/" + n + "+(" + (n - 1) + "/" + n + ")[");
            n -= 2;
            for (int i = 1; i < n; n -= 2) {
                System.out.print("(cosx^" + (n - 1) + ".sinx)/" + n + "+(" + (n - 1) + "/" + n + ")[");
            }
            System.out.println("sinx");
            for (int i = 1; i <= (temp / 2); i++) {
                System.out.print("]");
            }
            System.out.print("+c");
        }
    }
}
