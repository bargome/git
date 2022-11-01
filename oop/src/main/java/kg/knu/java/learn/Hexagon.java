package kg.knu.java.learn;

public class Hexagon extends AbstractFigure{
    public Hexagon(double a){
        this.square = a*a * (3*Math.sqrt(3)) / 2;
        this.figure = "hexagon";
    }
    @Override
    public Double getSquare() {
        return this.square;
    }
}
