package sem2;

public class Homeworktsk1 {
    interface Interface1 {
        void method1();

        default void method2() {
            System.out.println("Значение по умолчанию для метода2");
        }
    }

    interface Interface2 {
        void method3();

        default void method4() {
            System.out.println("Значение по умолчанию для метода4");
        }
    }

    interface Interface3 {
        String Constant = "Значение константы";

        void method5();
    }

    interface Interface4 {
        void method6();
    }

    interface Interface5 extends Interface2, Interface3 {
        void method7();
    }

    class Class1 implements Interface1, Interface2 {
        public void method1() {
            System.out.println("Метод1 из Класс1");
        }

        public void method3() {
            System.out.println("Метод3 из Класс1");
        }
    }

    class Class2 implements Interface5 {
        public void method3() {
            System.out.println("Метод3 из Класс2");
        }

        public void method5() {
            System.out.println("Метод5 из Класс2");
        }

        public void method7() {
            System.out.println("Метод7 из Класс2");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Interface1 interface1 = new Class1();
            interface1.method1();
            interface1.method2();

            Interface2 interface2 = new Class1();
            interface2.method3();
            interface2.method4();

            Interface5 interface5 = new Class2();
            interface5.method3();
            interface5.method4();
            interface5.method5();
            interface5.method7();

            System.out.println(Interface3.Constant);
        }
    }
}
