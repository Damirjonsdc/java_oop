public class Hootsoda {
    interface ТорговыйАвтомат {
        void getProduct(int name);
        void getProduct(int name, int volume);
        void getProduct(int name, int volume, int temperature);
    }

    class ГорячийНапиток {
        private String название;
        private int объем;

        public ГорячийНапиток(String название, int объем) {
            this.название = название;
            this.объем = объем;
        }

        public String getНазвание() {
            return название;
        }

        public int getОбъем() {
            return объем;
        }
    }

    class ГорячийНапитокСТемпературой extends ГорячийНапиток {
        private int температура;

        public ГорячийНапитокСТемпературой(String название, int объем, int температура) {
            super(название, объем);
            this.температура = температура;
        }

        public int getТемпература() {
            return температура;
        }
    }

    class ГорячихНапитковАвтомат implements ТорговыйАвтомат {
        private List<ГорячийНапиток> списокНапитков;

        public ГорячихНапитковАвтомат() {
            списокНапитков = new ArrayList<>();
            // Добавить напитки в автомат
            списокНапитков.add(new ГорячийНапиток("Чай", 200));
            списокНапитков.add(new ГорячийНапитокСТемпературой("Кофе", 150, 60));
            списокНапитков.add(new ГорячийНапитокСТемпературой("Какао", 250, 80));
        }

        public void getProduct(int name) {
            for (ГорячийНапиток напиток : списокНапитков) {
                if (напиток.getНазвание().equals(name)) {
                    System.out.println("Выдаем напиток: " + напиток.getНазвание() + ", объем: " + напиток.getОбъем() + " мл");
                    return;
                }
            }
            System.out.println("Напиток с таким именем не найден.");
        }

        public void getProduct(int name, int volume) {
            for (ГорячийНапиток напиток : списокНапитков) {
                if (напиток.getНазвание().equals(name) && напиток.getОбъем() >= volume) {
                    System.out.println("Выдаем напиток: " + напиток.getНазвание() + ", объем: " + volume + " мл");
                    return;
                }
            }
            System.out.println("Напиток с таким именем и объемом не найден.");
        }

        public void getProduct(int name, int volume, int temperature) {
            for (ГорячийНапиток напиток : списокНапитков) {
                if (напиток instanceof ГорячийНапитокСТемпературой && напиток.getНазвание().equals(name) && напиток.getОбъем() >= volume && ((ГорячийНапитокСТемпературой) напиток).getТемпература() >= temperature) {
                    System.out.println("Выдаем напиток: " + напиток.getНазвание() + ", объем: " + volume + " мл, температура: " + temperature + " градусов");
                    return;
                }
            }
            System.out.println("Напиток с такими параметрами не найден.");
        }
    }

    public class Main {
        public static void main(String[] args) {
            ГорячийНапиток чай = new ГорячийНапиток("Чай", 200);
            ГорячийНапитокСТемпературой кофе = new ГорячийНапитокСТемпературой("Кофе", 150, 60);
            ГорячийНапитокСТемпературой какао = new ГорячийНапитокСТемпературой("Какао", 250, 80);

            ГорячихНапитковАвтомат автомат = new ГорячихНапитковАвтомат();

            автомат.getProduct("Чай");
            автомат.getProduct("Кофе", 150);
            автомат.getProduct("Какао", 250, 80);

            автомат.getProduct("Чай", 300); // Напиток с таким именем и объемом не найден.
            автомат.getProduct("Кофе", 200, 70); // Напиток с такими параметрами не найден.
        }
    }
}
