public class CarAge{
    public static void main(String[]args){

    Car mazda = new Car(2007, 200_000, "Mazda", "Cx-9", false);
    Car mazdaSportsCar = new Car(2023, 50_000, "Mazda", "MX-5 Miata", true);
    Car bmwCar = new Car(2023, 10_000, "BMW", "m8 Gran Coupe", true);
    Car fordCar = new Car(2024,00, "Ford", "Mustang");
    Car subaruCar = new Car(2012, 100, "Subaru", "BRZ");

    ReturningCalculator calc = new ReturningCalculator();

    int thisYear = 2023;

    // x = 2023 which os the current year and Y equals the year of the car im choosing 

    System.out.println(calc.integerSubtractor(thisYear, mazda.year));
    System.out.println(calc.integerSubtractor(thisYear, mazdaSportsCar.year));
    System.out.println(calc.integerSubtractor(thisYear, bmwCar.year));
    System.out.println(calc.integerSubtractor(thisYear, fordCar.year));
    System.out.println(calc.integerSubtractor(thisYear, subaruCar.year));
}
}