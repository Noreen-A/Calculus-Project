public class Reduction {
    int n ;

    public Reduction(){

    }
    public static void SinReduction(int n){
        int temp = n;
        if (n==0){
            System.out.println("x + c");
        }else if (n==1){
            System.out.println("-cosx + c");
        }else if(n%2==0) {
            System.out.print("(-sinx^"+(n-1)+".cosx)/" +n+ "+(" +(n-1)+ "/" +n+ ")[");
            n-=2;
            for (int i = 1; i<n; n-=2){
                System.out.print("(-sinx^"+(n-1)+".cosx)/" +n+ "+(" +(n-1)+ "/" +n+ ")[");
            }
            System.out.print("x");
            for (int i = 1; i <=(temp/2); i++){
                System.out.print("]");
            }
            System.out.print("+c");
        }else if (n%2!=0){
            System.out.print("(-sinx^"+(n-1)+".cosx)/" +n+ "+(" +(n-1)+ "/" +n+ ")[");
            n-=2;
            for (int i = 1; i<n; n-=2){
                System.out.print("(-sinx^"+(n-1)+".cosx)/" +n+ "+(" +(n-1)+ "/" +n+ ")[");
            }
            System.out.println("-cosx");
            for (int i = 1; i <=(temp/2); i++){
                System.out.print("]");
            }
            System.out.print("+c");
        }
    }
    public static void CosReduction(int n){
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

    public static void TanReduction(int n){
        if (n==0){
            System.out.println("X+c");
        }else if (n==1){
            System.out.println("Ln|secx|+c");
        }else if (n%2==0){
            System.out.print("(tan^"+(n-1)+")/"+(n-1)+" - ");
            n-=2;
            for (int i = 1; i<n; n-=2){
                if (n!=2) {
                    System.out.print("(tan^" + (n - 1) + ")/" + (n - 1) + " - ");
                }else {
                    System.out.print("tanx - ");
                }
            }
            System.out.println("X + c");
        }else if (n%2!=0){
            System.out.print("(tan^"+(n-1)+")/"+(n-1)+" - ");
            n-=2;
            for (int i = 1; i<n; n-=2){
                 System.out.print("(tan^" + (n - 1) + ")/" + (n - 1) + " - ");
            }
            System.out.println("Ln|secx| + c");
        }
    }

    public static void SecReduction(int n){
        int temp = n;
        if (n==0){
            System.out.println("X+c");
        }else if (n==1){
            System.out.println("Ln|secx+tanx|");
        }else if (n%2==0){
            System.out.print("[(secx^"+(n-2)+"tanx)/"+(n-1)+" + ("+(n-2)+"/"+(n-1)+")[");
            n-=2;
            for (int i = 1; i<n; n-=2){
                if (n!=2){
                    System.out.print("(secx^"+(n-2)+"tanx)/"+(n-1)+" + ("+(n-2)+"/"+(n-1)+")[");
                }else {
                    System.out.print("tanx + ");
                }
            }
            System.out.print("X");
            for (int i = 1; i <= (temp / 2); i++) {
                System.out.print("]");
            }
            System.out.print("+c");
        }else if (n%2!=0){
            System.out.print("(secx^"+(n-2)+"tanx)/"+(n-1)+" + ("+(n-2)+"/"+(n-1)+")[");
            n-=2;
            for (int i = 1; i<n; n-=2){
                if (n!=3){
                    System.out.print("(secx^"+(n-2)+"tanx)/"+(n-1)+" + ("+(n-2)+"/"+(n-1)+")[");
                }else {
                    System.out.print("(secxtanx)/2 + 1/2[");
                }
            }
            System.out.print("Ln(secx + tanx)");
            for (int i = 1; i <= (temp / 2); i++) {
                System.out.print("]");
            }
            System.out.print("+c");
        }
    }

    public static void DefSinAndCos(int n){
        if (n==0){
            System.out.println("infinit");
        }else if (n==1){
            System.out.println("zero");
        }else{
            double num = (n-1);
            double den = n;
            double result;
            System.out.print("("+(n-1)+"/"+n+")");
            for (int i = 3; i<n; i+=2){
                if ((n-i)!=0 || (n-i)!=1) {
                    num *= (n-i);
                    den *= (n-i+1);
                    System.out.print("("+(n-i)+"/"+(n-i+1)+")");
                }
            }
            if (n%2!=0){
                result = (num/den);
                System.out.print(" = "+result);
            }if (n%2==0){
                result = (num/den)*(Math.PI/2);
                System.out.print("*(PI/2) = "+result);
            }
        }
    }

//    public static void DifTan(int n){
//        int result;
//        if (n==0){
//            System.out.println("PI/2");
//        }if (n==1){
//
//        }else{
//            result = Math.pow(Math.tan(Math.PI/4),(n-1));
//            for (int i = 2; i<n; i++){
//               result -= Math.pow(Math.tan(Math.PI/4),(n-i));
//               result
//            }
//
//
//        }

}
