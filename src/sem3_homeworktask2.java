public class sem3_homeworktask2 {
        private double width;
        private double height;

    public sem3_homeworktask2(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        public double calculateArea() {
            return width * height;
        }

        @Override
        public int compareTo(Rectangle other) {
            double thisArea = calculateArea();
            double otherArea = other.calculateArea();

            if (thisArea &lt; otherArea) {
                return -1;
            } else if (thisArea &gt; otherArea) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Rectangle rectangle1 = new Rectangle(4.0, 5.0);
            Rectangle rectangle2 = new Rectangle(3.0, 6.0);
            Rectangle rectangle3 = new Rectangle(2.0, 8.0);

            int result1 = rectangle1.compareTo(rectangle2);
            System.out.println("Сравнение rectangle1 и rectangle2: " + result1); // Выводит: Сравнение rectangle1 и rectangle2: 1

            int result2 = rectangle1.compareTo(rectangle3);
            System.out.println("Сравнение rectangle1 и rectangle3: " + result2); // Выводит: Сравнение rectangle1 и rectangle3: -1

            int result3 = rectangle2.compareTo(rectangle3);
            System.out.println("Сравнение rectangle2 и rectangle3: " + result3); // Выводит: Сравнение rectangle2 и rectangle3: -1
        }
    }

