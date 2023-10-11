public class SweetGarage{

    public static void main(String[] args){
        // car one 
        Car mazda = new Car(2007, 200_000, "Mazda", "Cx-9", false);
        // default for turbo is false, so i dont need to write false i can leave it alone but whatever
        System.out.println("My car was made in " + mazda.year + " and its manufcaturer is " + mazda.manufacturerName + " and its model is a  " + mazda.modelName );
        mazda.revEngine();
        mazda.engageTurbo();

        // System.out.println(myCar.year);
       // System.out.println(myCar.milesDriven);
       // System.out.println(myCar.manufacturerName);
       // System.out.println(myCar.modelName);

       
        Car mazdaSportsCar = new Car(2023, 50_000, "Mazda", "MX-5 Miata", true);
        System.out.println("My second car was made in " + mazdaSportsCar.year + " and its manufcaturer is " + mazdaSportsCar.manufacturerName + " and its model is a  " + mazdaSportsCar.modelName );
        mazdaSportsCar.revEngine();
        mazdaSportsCar.engageTurbo();
    

        Car bmwCar = new Car(2023, 10_000, "BMW", "m8 Gran Coupe", true);
        System.out.println("My third car was made in " + bmwCar.year + " and its manufcaturer is " + bmwCar.manufacturerName + " and its model is a " + bmwCar.modelName );
        bmwCar.revEngine();
        bmwCar.engageTurbo();

        Car fordCar = new Car(2024,00, "Ford", "Mustang");
        System.out.println("My third car was made in " + fordCar.year + " and its manufcaturer is " + fordCar.manufacturerName + " and its model is a " + fordCar.modelName );
        fordCar.revEngine();
        fordCar.engageTurbo();
    
        
        Car subaruCar = new Car(2034, 100, "Subaru", "BRZ");
        System.out.println("My third car was made in " + subaruCar.year + " and its manufcaturer is " + subaruCar.manufacturerName + " and its model is a " + subaruCar.modelName );
        subaruCar.revEngine();
        subaruCar.engageTurbo();
        
    }
}