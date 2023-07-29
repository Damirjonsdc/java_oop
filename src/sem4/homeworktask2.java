package sem4;

public class homeworktask2 {
        public static &lt;T&gt; void printArray(T[] array) {
            for (T element : array) {
                System.out.println(element);
            }
        }

        public static void main(String[] args) {
            Integer[] numbers = {1, 2, 3, 4, 5};
            String[] names = {"Alice", "Bob", "Charlie"};

            printArray(numbers);  // Выводит: 1 2 3 4 5
            printArray(names);    // Выводит: Alice Bob Charlie
        }
    }