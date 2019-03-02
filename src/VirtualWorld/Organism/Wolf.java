package VirtualWorld.Organism;

import VirtualWorld.World;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Random;

public class Wolf extends Animal{
    public Wolf(Point point , World world ){
     this.strength = 9;
     this.initiative = 5;
     this.point = point;
     this.world = world;
    }
    @Override
    public void drawMe() {
        System.out.println("I'm WOLF: Position: x: " + this.point.getX()+ " y: " + this.point.getY());
    }

}

