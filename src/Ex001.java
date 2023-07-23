import java.util.ArrayList;
import java.util.List;
public class Ex001 {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

    class VendingMachine {
        private List<Product> products;

        public VendingMachine() {
            this.products = new ArrayList<>();
        }

        public void initProducts(List<Product> products) {
            this.products.addAll(products);
        }

        public Product getProduct(String name) {
            for (Product product : products) {
                if (product.getName().equals(name)) {
                    return product;
                }
            }
            return null;
        }
    }
    public class Main {
        public static void main(String[] args) {
            // Создание объектов товаров
            Product coke = new Product("Coke", 1.5);
            Product chips = new Product("Chips", 2.0);
            Product candy = new Product("Candy", 0.75);

            // Создание объекта торгового автомата
            VendingMachine vendingMachine = new VendingMachine();

            // Инициализация списка товаров в торговом автомате
            List<Product> products = new ArrayList<>();
            products.add(coke);
            products.add(chips);
            products.add(candy);
            vendingMachine.initProducts(products);

            // Получение товара из торгового автомата по его названию
            String productName = "Chips";
            Product product = vendingMachine.getProduct(productName);

            if (product != null) {
                System.out.println("Найден товар с названием '" + productName + "'");
                System.out.println("Цена товара: " + product.getPrice());
            } else {
                System.out.println("Товар с названием '" + productName + "' не найден");
            }
        }
    }

