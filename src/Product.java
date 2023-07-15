public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}
    public class DiscountProduct extends Ex005.Product {
        private int discount;

        public DiscountProduct(String name, int price, int discount) {
            super(name, price);
            this.discount = discount;
        }

        @Override
        public String toString() {
            return "DiscountProduct{name='" + getName() + "', price=" + getPrice() + ", discount=" + discount + "}";
        }
    }
    public class Main {
        public static void main(String[] args) {
            Ex005.Product product = new Ex005.Product("Apple", 10);
            Ex005.DiscountProduct discountProduct = new Ex005.DiscountProduct("Banana", 5, 20);

            System.out.println(product.toString());
            System.out.println(discountProduct.toString());
        }
    }
}


