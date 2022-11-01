package kg.knu.java.learn;

abstract public class AbstractFigure {
    public static final double PI = 3.1415926535;
    protected Double square;
    protected String figure;
    public void printSquare(){
        System.out.println("This is " + this.figure + " and square equals " + this.square);
    }
    abstract Double getSquare();
}
