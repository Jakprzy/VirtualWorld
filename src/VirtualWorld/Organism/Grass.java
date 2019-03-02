package VirtualWorld.Organism;

import VirtualWorld.OrganismType;
import VirtualWorld.World;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Random;

public class Grass extends Organism {
    public Grass(Point point , World world ){
        this.strength = 5;
        this.initiative = 0;
        this.point = point;
        this.world = world;
    }
    @Override
    public void doAction(){
        Random rand_G = new Random();
        int pG = rand_G.nextInt(4);
        if(pG == 1)
            world.addOrganism(OrganismType.GRASS);
    }
    @Override
    public void drawMe() {
        System.out.println("I'm Grass: Position: x: " + this.point.getX() + " y: " + this.point.getY());
    }
}


