public class Cat {
    private String name;
        private int age;
        private Owner owner;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Owner getOwner() {
            return owner;
        }

        public void setOwner(Owner owner) {
            this.owner = owner;
        }

        public void greet() {
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет).");

            if (owner != null) {
                System.out.println("Мой владелец - " + owner.getName() + ".");
            }
        }
    }

    public class Owner {
        private String name;

        public Owner(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 5);
        Owner owner = new Owner("Иван");
        cat.setOwner(owner);

        cat.greet(); // Выводит: Мяу! Меня зовут Мурзик. Мне 5 года(лет). Мой владелец - Иван.
    }
}
