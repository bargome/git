package kg.knu.java.learn;

public class Pentagon extends AbstractFigure{

    public Pentagon(double a){
        this.square = ((a*a)/4) * Math.sqrt(25 + 10 * Math.sqrt(5));
        this.figure = "pentagon";
    }
    @Override
    public Double getSquare() {
        return this.square;
    }
}
