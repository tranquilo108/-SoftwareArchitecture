public class Main {
    public static void main(String[] args) {
        GeometryFigure figureBox = new GeometryFigure();
        Circle circle1 = new Circle(10);
        Rectangle rectangle1 = new Rectangle(2,3);
        Triangle triangle1 = new Triangle(2, 3, 4);
        figureBox.add(rectangle1);
        figureBox.add(circle1);
        figureBox.add(triangle1);
        figureBox.getInfo(0);
        System.out.println(figureBox.size());
        figureBox.remove(rectangle1);
        System.out.println(figureBox.size());
        Circle circle2 = new Circle(1);
        Circle circle3 = new Circle(2);
        Circle circle4 = new Circle(3);
        Circle circle5 = new Circle(4);
        Circle circle6 = new Circle(5);
        Circle circle7 = new Circle(6);
        Circle circle8 = new Circle(7);
        Circle circle9 = new Circle(8);
        Circle circle10 = new Circle(9);
        figureBox.add(circle2);
        figureBox.add(circle3);
        figureBox.add(circle4);
        figureBox.add(circle5);
        figureBox.add(circle6);
        figureBox.add(circle7);
        figureBox.add(circle8);
        figureBox.add(circle9);
        figureBox.add(circle10);
        System.out.println(figureBox.size());
        System.out.println(figureBox.get(figureBox.size() - 1));
        figureBox.remove(figureBox.size() - 1);
        System.out.println(figureBox.get(figureBox.size() - 1));
    }
}