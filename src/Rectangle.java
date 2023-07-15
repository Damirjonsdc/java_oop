public class Rectangle {
    private double width;
        private double height;

        public Rectangle() {
            this.width = 0.0;
            this.height = 0.0;
        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double calculateArea() {
            return width * height;
        }

        public double calculatePerimeter() {
            return 2 * (width + height);
        }
    }
    public class Main {
        public static void main(String[] args) {
            Rectangle rectangle1 = new Rectangle(); // Создание прямоугольника с шириной и высотой по умолчанию

            rectangle1.setWidth(5.0);
            rectangle1.setHeight(3.0);

            System.out.println("Площадь прямоугольника: " + rectangle1.calculateArea()); // Выводит: Площадь прямоугольника: 15.0
            System.out.println("Периметр прямоугольника: " + rectangle1.calculatePerimeter()); // Выводит: Периметр прямоугольника: 16.0

            Rectangle rectangle2 = new Rectangle(4.0, 6.0); // Создание прямоугольника с заданными значениями ширины и высоты

            System.out.println("Площадь прямоугольника: " + rectangle2.calculateArea()); // Выводит: Площадь прямоугольника: 24.0
            System.out.println("Периметр прямоугольника: " + rectangle2.calculatePerimeter()); // Выводит: Периметр прямоугольника: 20.0
        }
    }


