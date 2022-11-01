public class Main {
    private static final double EPSILON = 0.000000001;
    public static double mySin(double x){
        int n = 1;
        double pow = x, factorial = 1, result = x, compute = 1, sqX = x*x;
        while (compute > EPSILON){
            factorial *= (n++ *2) * (n*2 - 1);
            pow *= sqX;
            compute = pow / factorial;
            result += (n%2==0) ? -compute : compute;
        }
        return result;
    }
    public static double myCos(double x){
        int n = 1;
        double pow = 1, factorial = 1, result = 1, compute = 1, sqX = x*x;
        while (compute > EPSILON){
            factorial *= (n*2 - 1) * (n++ *2);
            pow *= sqX;
            compute = (pow) / (factorial);
            result += (n%2==0) ? -compute : compute;
        }
        return result;
    }
    public static void main(String[] args) {
        double x = 11;

        double sin = mySin(x);
        System.out.println("mySin  (" + x + ") = " + sin);
        System.out.println("mathSin(" + x + ") = "  + Math.sin(x));

        double cos = myCos(x);
        System.out.println("myCos  (" + x + ") = " + cos);
        System.out.println("mathCos(" + x + ") = "  + Math.cos(x));
    }
}