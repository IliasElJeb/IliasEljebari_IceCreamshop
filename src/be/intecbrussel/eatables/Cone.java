package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable {

    private Flavor[] balls;

    public Cone() {

    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    public void eat() {
        System.out.print("Those are the different cone flavors: ");
        for (int i = 0; i <= balls.length; i++) {
            if (i == balls.length - 1) {
                System.out.println(balls[i]);
                return;
            }
            System.out.print(balls[i] + ", ");

        }


    }

}
