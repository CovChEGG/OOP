/*
Разработать программу, позволяющую получить информацию о совокупности
цветных геометрических фигур и определить фигуру с максимальной площадью.
Родительский класс Shape
Circle для представления окружности;
Square для представления квадрата;
Triangle для представления треугольника
Для указания цвета фигур Color.
Для представления точек с координатами (x,y) Point.

По мере работы фантазии можно добавить и другие фигуры
*/

public class Main {

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 5);
        Point c = new Point(7, 0);
        Shapes c1 = new Circle(Color.white, b, 5 );
        Shapes c2 = new Circle(Color.black, c, 3 );
    }
}
