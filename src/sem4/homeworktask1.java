package sem4;

public class homeworktask1 {
        public static &lt;T&gt; void printElement(T element) {
            System.out.println(element);
        }

        public static void main(String[] args) {
            Integer number = 10;
            String text = "Hello, world!";
            Double decimal = 3.14;

            printElement(number);   // Выводит: 10
            printElement(text);     // Выводит: Hello, world!
            printElement(decimal);  // Выводит: 3.14
        }
    }
