package org.example.oop.motobike;

public class Ural extends Motorbike {

    boolean firstAidKit;

    public Ural() {
    }

    public Ural(String name, String model, double volume, int number, int maxSpeed, boolean firstAidKit) {
        super(name, model, volume, number, maxSpeed);
        this.firstAidKit = firstAidKit;
    }
   public void showInfp () {
        if (firstAidKit) {
            System.out.println("Мы взяли аптечку!");
        }
        else {
            System.out.println("Срочно назад, мы забыли аптечку");
        }
   }

}
