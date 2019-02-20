package VirtualWorld.Organism;

import java.awt.geom.Point2D;
import java.util.Random;

public class Grass extends Organism {

    @Override
    public void drawMe() {

        Random randX = new Random();
        this.point.x = randX.nextInt(21);
        Random randY = new Random();
        this.point.y = randY.nextInt(21);
        System.out.println("Position: x: " + this.point.x + " y: " + this.point.y);

    }

    @Override
    public void setStatistic(int strength, int initiative) {
        this.strength = strength;
        this.initiative = initiative;
        System.out.println("I'm Grass, statistics: S :" + this.strength + ", I: " + this.initiative);
    }

}


