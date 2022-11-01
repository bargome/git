package kg.knu.java.learn;

public class FiguresMain {
    public static void main(String[] args){
        AbstractFigure triangle = new Triangle(5,7,8);
        AbstractFigure rectangle = new Rectangle(12 ,8);
        AbstractFigure square = new Square(7);
        AbstractFigure pentagon = new Pentagon(5);
        AbstractFigure hexagon = new Hexagon(5);

        triangle.printSquare();
        rectangle.printSquare();
        square.printSquare();
        pentagon.printSquare();
        hexagon.printSquare();

        double rectangleSquare = rectangle.getSquare();
        System.out.println("You can immediately take the square. Example this is " + rectangle.figure + " and his square = " + rectangleSquare);

    }
}
