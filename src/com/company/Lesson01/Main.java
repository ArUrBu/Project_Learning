package com.company.Lesson01;

//Делаем вычисления
class Auto {
    //Объявляем общие переменные и запускаем ввод данных по киллометражу на клавиатуре
    int passengers;
    int fuel_volume;
    int fuel_rate;
    int price;
    //Scanner input = new Scanner(System.in);
    //int distance = input.nextInt();

    //Вычисляем максимальную дальность езды
    int  range() {
        return fuel_volume / fuel_rate * 100;
    }

    // Расчет количества топлива, необходимого транспортному
// средству для преодоления заданного расстояния
    double fuelneeded(int km) {
        return (double) fuel_rate / 100 *  km;
    }
    //вычисляем стоимость поездки
    void cost() {
        int cost = fuel_volume * price;
        System.out.println("стоимость поездки составит - " + cost + " руб.");
    }
}

//Прописываем данные и выдача результата
class AddMeth {
    public static void main(String[] args) {

        Auto Teana = new Auto();
        Auto Vaz21124 = new Auto();
        double litres;
        int dist = 252;

        //Указание данных
        Teana.passengers = 5;   //Кол-во пассажиров
        Teana.fuel_volume = 70;   //Объём топлива в баке
        Teana.fuel_rate = 15;   //Расход топлива
        Teana.price = 51;   //Стоимость топлива

        Vaz21124.passengers = 3;   //Кол-во пассажиров
        Vaz21124.fuel_volume = 50;   //Объём топлива в баке
        Vaz21124.fuel_rate = 12;   //Расход топлива
        Vaz21124.price = 25;   //Стоимость топлива

        //Результат по расчётам кол-ва перевезённых пассажиров на определённое расстояние
        System.out.print("В Teana можно перевезти " + Teana.passengers + " пассажиров на " + Teana.range() + " км.\n");
        System.out.print("В ВАЗ21124 можно перевезти " + Vaz21124.passengers + " пассажиров на " + Vaz21124.range() + " км.\n");
        System.out.println();

        //Результат расчёта стоимости поездки (расчёт производится в методе cost()
        System.out.print("Для Teana: ");
        Teana.cost();
        System.out.print("Для ВАЗ 21124: ");
        Vaz21124.cost();
        System.out.println();

        //Результат расчёта расхода топлива
        litres = Teana.fuelneeded(dist) ;
        System.out.println("Для преодоления " + dist + " км. Teana требуется " + litres + " литров топлива");
        litres = Vaz21124.fuelneeded(dist);
        System.out.println("Для преодоления " + dist + " км. ВАЗ 21124 требуется " + litres + " литров топлива");
        System.out.println();
    }
}