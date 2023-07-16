package sem2;
import java.util.ArrayList;
import java.util.List;
public class Homeworktask2 {
    interface QueueBehaviour {
        void enqueue(String person);
        String dequeue();
    }

    interface MarketBehaviour {
        void addPersonToQueue(String person);
        void removePersonFromQueue(String person);
        void update();
    }

    class Market implements QueueBehaviour, MarketBehaviour {
        private List<String> queue; // очередь людей

        public Market() {
            queue = new ArrayList<>();
        }

        // Методы из интерфейса QueueBehaviour

        @Override
        public void enqueue(String person) {
            queue.add(person);
            System.out.println(person + " added to the queue");
        }

        @Override
        public String dequeue() {
            if (queue.isEmpty()) {
                System.out.println("Queue is empty");
                return null;
            }

            String person = queue.remove(0);
            System.out.println(person + " removed from the queue");
            return person;
        }

        // Методы из интерфейса MarketBehaviour

        @Override
        public void addPersonToQueue(String person) {
            enqueue(person);
        }

        @Override
        public void removePersonFromQueue(String person) {
            queue.remove(person);
            System.out.println(person + " removed from the queue");
        }

        @Override
        public void update() {
            System.out.println("Market updated");
            // Дополнительный код для обновления состояния магазина путем принятия и отдачи заказов
        }
    }

    public class Main {
        public static void main(String[] args) {
            Market market = new Market();
            market.addPersonToQueue("John");
            market.addPersonToQueue("Linda");

            market.dequeue(); // John removed from the queue

            market.removePersonFromQueue("Linda");

            market.update(); // Market updated
        }
    }
}
