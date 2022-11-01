package kg.knu.java.learn;

public class Square extends AbstractFigure{
    public Square(double a){
        this.square = a*a;
        this.figure = "square";
    }
    @Override
    public Double getSquare() {
        return this.square;
    }
}
