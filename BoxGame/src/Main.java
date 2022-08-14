 public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A",10,120,95, 60.0);
        Fighter f2 = new Fighter("B", 20, 85,90, 50.0);

        Ring ring = new Ring(f1,f2 , 90 ,100);
        ring.run();
  }
}
