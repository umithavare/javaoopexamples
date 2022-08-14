public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    public Fighter(String name, int damage, int health,int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        }
        else {
            this.dodge = 0;
        }
    }
     public int hit(Fighter foe ){
        System.out.println(this.name + " =>> " +foe.name + " " + this.damage + " damaged");
        if (foe.isDodge()){
            System.out.println(foe.name + " dodged to damage !!!!!!!!!!!!!!!!!!!!!!!");
            return foe.health;
        }
        if(foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage ;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100; // 0 ile 100 arasında random sayı uretıyor
        return randomNumber <= this.dodge;
    }

}
