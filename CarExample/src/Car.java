public class Car {
    //qualifications
    String type ;
    String model ;
    String color ;
    int speed ;
    int maxSpeed = 180 ;

    void increaseSpeed( int increment){
        if ((speed + increment) <= 180 ){
            speed += increment;
        }
    }

    void decreaseSpeed(int decrement){
        if ((speed - decrement) > 0 ){
            speed -= decrement;
        }
    }

    void carFeatures(){

        System.out.println(model + " Speed : " + speed);
        System.out.println("Color : " + color + " \nType : " + type);

    }
}
