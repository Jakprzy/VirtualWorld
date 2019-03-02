package VirtualWorld.Organism;

import java.awt.*;
import java.util.Random;

public abstract  class Animal extends Organism {
    public void doAction(){
        Point pointPush = new Point();
        pointPush = getPoint();//losowanie
        Random rand_n = new Random();
        int n = rand_n.nextInt(4);
        if (n == 0 && point.y < 20)                // ruch w gore
            pointPush.y += 1;
        else if (n == 1 && point.y > 0)         //ruch w dol
            pointPush.y -= 1;
        else if (n == 2 && point.x < 20)       //ruch w prawo
            pointPush.x += 1;
        else if (n == 3 && point.x > 0)                 //ruch w lewo
            pointPush.x -= 1;
    }
}
