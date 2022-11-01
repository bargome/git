package kg.knu.java.learn;

public class Triangle extends AbstractFigure{
    public Triangle(double a, double b, double c){
        double p = (a+b+c)/2;
        if (Math.max(Math.max(a,b),c) >= p){
            this.square = 0.;
            this.figure = "no such triangle exists";
        }else {
            this.square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            this.figure = "triangle";
        }
    }
    @Override
    public Double getSquare() {
        return this.square;
    }
}
