
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 17) {
            System.out.println("Возраст совершеннолетия еще не наступил и нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }}


        public static void task3 () {
            System.out.println("Задача 3");

        int speed = 70;
        if (speed > 60) {
            System.out.println("Cкорость превышена");
        }

        if (speed <= 60) {
            System.out.println("Превышения скорости нет");
        }
    }
}