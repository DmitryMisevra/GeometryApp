public class Main {
    public static void main(String[] args) {

        // Работа с двухмерными фигурами
        Circle circle = new Circle(5);
        System.out.println("Круг:");
        System.out.println("Радиус: " + circle.getRadius());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Периметр: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("\nПрямоугольник:");
        System.out.println("Ширина: " + rectangle.getWidth());
        System.out.println("Высота: " + rectangle.getHeight());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("\nТреугольник:");
        System.out.println("Сторона A: " + triangle.getSideA());
        System.out.println("Сторона B: " + triangle.getSideB());
        System.out.println("Сторона C: " + triangle.getSideC());
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());

        // Использование GeometryUtils для преобразования единиц
        double circleAreaCm = GeometryUtils.metersToCentimeters(circle.getArea());
        System.out.println("\nПлощадь круга в сантиметрах: " + circleAreaCm);

        // Сравнение площадей фигур
        int comparison = GeometryUtils.compareAreas(rectangle.getArea(), triangle.getArea());
        if (comparison > 0) {
            System.out.println("\nПрямоугольник имеет большую площадь, чем треугольник.");
        } else if (comparison < 0) {
            System.out.println("\nТреугольник имеет большую площадь, чем прямоугольник.");
        } else {
            System.out.println("\nПрямоугольник и треугольник имеют одинаковую площадь.");
        }

        // Работа с трехмерными фигурами
        Cube cube = new Cube(2);
        System.out.println("\nКуб:");
        System.out.println("Сторона: " + cube.getSide());
        System.out.println("Объем: " + cube.getVolume());
        System.out.println("Площадь поверхности: " + cube.getSurfaceArea());

        Sphere sphere = new Sphere(3);
        System.out.println("\nСфера:");
        System.out.println("Радиус: " + sphere.getRadius());
        System.out.println("Объем: " + sphere.getVolume());
        System.out.println("Площадь поверхности: " + sphere.getSurfaceArea());
    }
}
