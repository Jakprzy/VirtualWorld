package VirtualWorld;

import VirtualWorld.Organism.Organism;
import VirtualWorld.Organism.Wolf;

public class Main {
    public static void main(String[] args){

    World world = new World();
    world.addOrganism(OrganismType.WOLF);
    world.addOrganism(OrganismType.GRASS);

    }
}
