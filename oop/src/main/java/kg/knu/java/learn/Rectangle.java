package kg.knu.java.learn;

public class Rectangle extends AbstractFigure{
    public Rectangle(double a, double b){
        this.square = a*b;
        this.figure = "rectangle";
    }
    @Override
    public Double getSquare() {
        return this.square;
    }
}
