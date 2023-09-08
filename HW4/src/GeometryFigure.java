

public class GeometryFigure{
    static private LinkedList<IShape> toolbox;

    public GeometryFigure() {
        toolbox = new LinkedList<>();
    }

    // Метод для добавления новой фигуры
    public void add(IShape figure) {
        toolbox.addLast(figure);
    }

    // Метод для удаления фигуры
    public void remove(int index) {
        toolbox.remove(index);
    }
    public void remove(IShape shape){
        toolbox.remove(shape);
    }

    // Метод для получения размера списка
    public int size() {
        return toolbox.size();
    }

    // Метод для получения фигуры по индексу
    public IShape get(int index) {
        return toolbox.get(index);
    }
    public void getInfo(int num) {
        if (num <= toolbox.size() && num >= 0) {
            IShape figure = toolbox.get(num);
            System.out.printf("Площадь фигуры %s под номером %s равна: %s, периметр равен: %s\n",
                    figure.getClass().getName(), num,
                    figure.getArea(),
                    figure.getPerimeter());
        }
    }
}
