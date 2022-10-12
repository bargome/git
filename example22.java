public class example22 {
    private static final double EPSILON = 0.0000000000001;
    public static void main(String[] args) {

        double x = 15;
        // sin(x)
        int znak = 0, n = 1;
        double pow = 1, factorial = 1, result = 0, compute = 1;

        while (compute > EPSILON){
            factorial *= n;
            pow *= x;
            if (n % 2 == 0){
                n++;
                continue;
            }
            if (znak == 1){
                compute = (pow)/(factorial);
                result -= compute;
                znak = 0;
            }else {
                compute = (pow)/(factorial);
                result += compute;
                znak = 1;
            }
            n++;
        }
        System.out.println("sin(" + x + ") =  " + result);
        System.out.println("Math(" + x + ") = "  + Math.sin(x));

        // cos(x)
        znak = 1; n = 1;
        pow = 1; factorial = 1; result = 1; compute = 1;

        while (compute > EPSILON){
            factorial *= n;
            pow *= x;
            if (n % 2 == 1){
                n++;
                continue;
            }
            if (znak == 1){
                compute = (pow)/(factorial);
                result -= compute;
                znak = 0;
            }else {
                compute = (pow)/(factorial);
                result += compute;
                znak = 1;
            }
            n++;
        }
        System.out.println("cos(" + x + ") =  " + result);
        System.out.println("Math(" + x + ") = "  + Math.cos(x));

    }
}