package VirtualWorld.Organism;

import VirtualWorld.World;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Random;

public class Grass extends Organism {
    public Grass(int strength , int iniciative, Point point , World world ){
        this.strength = 5;
        this.initiative = 0;
    }
    @Override
    public void drawMe() {
        System.out.println("I'm Grass: Position: x: " + this.point.getX()+ " y: " + this.point.getY());
    }

}


