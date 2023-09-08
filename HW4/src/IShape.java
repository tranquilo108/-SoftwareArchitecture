// интерфейс для геомтерических фигур
public interface IShape {
    // Площадь фигуры
    double getArea();

    // Периметр фигуры
    double getPerimeter();
    @Override
    public boolean equals(Object obj);
}
