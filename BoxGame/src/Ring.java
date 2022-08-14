public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    public boolean isWin(){
        if (f1.health ==0){
            System.out.println("Winner : " + f2.name);
            return true;
        }
        else if(f2.health == 0 ){
            System.out.println("Winner : "  + f1.name);
            return  true;
        }
        return  false;
    }

    public void printScore(){
        System.out.println("**************");
        System.out.println(f1.name + "Health : " + f1.health);
        System.out.println(f2.name + "Health : " + f2.health);
    }


    public void run(){
        if(isCheck()){
            while((this.f1.health > 0) && (this.f2.health > 0)){
                System.out.println("******** NEW RAUND *********");
                this.f2.health = this.f1.hit(this.f2);
                System.out.println(this.f2.health);
                if(isWin())
                    break;
                this.f1.health = this.f2.hit(this.f1);
                System.out.println(this.f1.health);
                if (isWin())
                    break;
                System.out.println(this.f1.health + " Health : " + this.f1.health);
                System.out.println(this.f2.health + " Health : " + this.f2.health);
            }
        }
        else {
            System.out.println("Weights are not suitable");
        }
    }


}
