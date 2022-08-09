public class Car {
    //qualifications
    String type ;
    String model ;
    String color ;
    int speed ;
    int maxSpeed;

    void increaseSpeed( int increment){
        if ((this.speed + increment) <= 180 ){
            this.speed += increment;
        }
    }
    Car(String model, int speed, String color){
        this.color = color;
        this.model = model;
        this.speed = speed;
        this.type = "Sedan";
        this.maxSpeed = 180;
    }
    Car(){

    }
    void decreaseSpeed(int decrement){
        if ((this.speed - decrement) > 0 ){
            this.speed -= decrement;
        }
    }

    void carFeatures(){
        System.out.println("**********************");
        System.out.println("Model  : " + this.model);
        System.out.println("Color  : " + this.color);
        System.out.println("Type  : " + this.type);
        System.out.println("Speed  : " + this.speed);

    }
}
