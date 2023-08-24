
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
}

    public static void task1() {
        System.out.println("Задача 1");
        int age = 18;
        if (age >=0 && age <=17) {
            System.out.println("Возраст совершеннолетия еще не наступил и нужно немного подождать");
        }else{ System.out.println("Возраст совершеннолетия наступил ");
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
        }
    }


    public static void task3() {
        System.out.println("Задача 3");

        int speed = 70;
        if (speed > 60) {
            System.out.println("Cкорость превышена");
        }

        if (speed <= 60) {
            System.out.println("Превышения скорости нет");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 2;
        if (age <= 2) {
            System.out.println("Тебе пора спать");
        }
        int age2 = 2;
        if (age2 == 2 || age2 <= 6) ;
        {
            System.out.println("Тебе пора в садик");
        }

        int age3 = 10;
        if (age3 == 7 || age3 <= 18) {
            System.out.println("Тебе надо ходить в школу");
        }



        int age4 = 20;
        if (age4 > 18 && age4 <= 24) {
            System.out.println("Твоё место в университете");
        }
// после университета не выводит данные в консоль, но не выдаёт ошибки
        int age5 = 25;
        if (age5 <= 24) {
            System.out.println("Тебе пора ходить на работу");
        }

        int age6 = 76;
        if (age6 <= 60) {
            System.out.println("Ты можешь отдохнуть");
        }}



    public static void task5() {
        System.out.println("Задача 5");
        int age = 6;
        if (age <= 5) {
            System.out.println("Ты не можешь кататься на аттракционе");
        } else {
            System.out.println("Ты можешь кататься на аттракционе");
        }
        int age2 = 4;
        if (age2 >= 5 && age2 <= 14) {
            System.out.println("Ты можешь кататься в сопровождении взрослого");
        } else {
            System.out.println("Тебе нельзя кататься");
        }
        System.out.println("Если взрослого нет, то кататься нельзя");

        int age3 = 15;
        if (age3 >14) {
            System.out.println("Ты можешь кататься без сопровождения");
        } else {
            System.out.println("Кататья только с сопровождением");
        }
    }
    public static void task6(){
        System.out.println("Задача 6");
        int oneCar=102;
        int sedentary=60;
        int standing=oneCar-sedentary;
        System.out.println(standing);System.out.println("Стоячих мест");
       {

        int  peopleInCar = 50;
        boolean enoughSpace= peopleInCar >standing || peopleInCar >sedentary;
        if (enoughSpace) {
            System.out.println("Места в вагоне не хватает");
        }else { System.out.println("Места в вагоне есть");

    }}}
    public static void task7() {
        System.out.println("Задача 7");
        int one=1;
        int two=2;
        int three=3;
        boolean aLargerNumber= one < 2 || two < 3 || three > 1;
        if (aLargerNumber) {
            System.out.println("Большее число");
        }else{ System.out.println("Меньшее число");
        }
    }}













