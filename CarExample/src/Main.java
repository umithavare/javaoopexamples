public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi",10,"Red");
        audi.increaseSpeed(20);
        audi.carFeatures();
        //constructor method used.

        Car bmw = new Car();
        bmw.model = "Bmw" ;
        bmw.speed = 20;
        bmw.color = "White";
        bmw.type = "SUV" ;
        bmw.increaseSpeed(20);
        bmw.increaseSpeed(5);
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.carFeatures();
        //overriding

        Car mercedes = new Car();
        mercedes.model = "mercedes" ;
        mercedes.speed = 40;
        mercedes.color = "Black" ;
        mercedes.type = "Sedan";
        mercedes.increaseSpeed(20);
        mercedes.carFeatures();

    }
}
