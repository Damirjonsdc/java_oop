public class VendingMachine {
    private String name;
        private int price;
        private int quantity;

        public VendingMachine(String name, int price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        // Logic for Vending Machine
        public void insertCoin(int amount) {
            if (amount < price) {
                System.out.println("Insufficient coins. Please insert more.");
            } else if (quantity == 0) {
                System.out.println("Out of stock. Please choose another item.");
            } else {
                int change = amount - price;
                System.out.println("Enjoy your " + name + "! Don't forget your change: " + change);
                quantity--;
            }
        }
    }
    public class Main {
        public static void main(String[] args) {
            VendingMachine cola = new VendingMachine("Cola", 25, 10);

            cola.insertCoin(10); // Insufficient coins. Please insert more.
            cola.insertCoin(30); // Enjoy your Cola! Don't forget your change: 5
            cola.insertCoin(30); // Enjoy your Cola! Don't forget your change: 5
            cola.insertCoin(30); // Enjoy your Cola! Don't forget your change: 5
            cola.insertCoin(30); // Enjoy your Cola! Don't forget your change: 5
            cola.insertCoin(30); // Enjoy your Cola! Don't forget your change: 5
            cola.insertCoin(30); // Enjoy your Cola! Don't forget your change: 5
            cola.insertCoin(30); // Enjoy your Cola! Don't forget your change: 5
            cola.insertCoin(30); // Enjoy your Cola! Don't forget your change: 5
            cola.insertCoin(30); // Enjoy your Cola! Don't forget your change: 5
            cola.insertCoin(30); // Out of stock. Please choose another item.
        }
    }

