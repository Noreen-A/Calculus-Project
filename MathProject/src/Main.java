import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i<5; i--) {
            System.out.println("Enter the number referring to your demand");
            System.out.println("1- Sinx");
            System.out.println("2- Difinite Sinx");
            System.out.println("3- Cosx");
            System.out.println("4- Difinite Cosx");
            System.out.println("5- Tanx");
            System.out.println("6- Secx");
            int choice = sc.nextInt();
            System.out.println("inter the power of the Trigonometric function");
            int n = sc.nextInt();

            switch (choice) {
                case 1:
                    Reduction.SinReduction(n);
                    System.out.println();
                    break;
                case 2:
                    Reduction.DefSinAndCos(n);
                    System.out.println();
                    break;
                case 3:
                    Reduction.CosReduction(n);
                    System.out.println();
                    break;
                case 4:
                    Reduction.DefSinAndCos(n);
                    System.out.println();
                    break;
                case 5:
                    Reduction.TanReduction(n);
                    System.out.println();
                    break;
                case 6:
                    Reduction.SecReduction(n);
                    System.out.println();
                    break;
            }
        }
    }
}