package sem4;

public class homeworktask3 {
        public static &lt;T extends Comparable&lt;T&gt;&gt; T getMax(T a, T b) {
            if (a.compareTo(b) &gt;= 0) {
                return a;
            } else {
                return b;
            }
        }

        public static void main(String[] args) {
            Integer number1 = 10;
            Integer number2 = 20;
            Double decimal1 = 3.14;
            Double decimal2 = 2.71;
            String text1 = "Hello";
            String text2 = "World";

            Integer maxInteger = getMax(number1, number2);
            Double maxDouble = getMax(decimal1, decimal2);
            String maxString = getMax(text1, text2);

            System.out.println("Max Integer: " + maxInteger);  // Выводит: Max Integer: 20
            System.out.println("Max Double: " + maxDouble);    // Выводит: Max Double: 3.14
            System.out.println("Max String: " + maxString);    // Выводит: Max String: World
        }
    }
