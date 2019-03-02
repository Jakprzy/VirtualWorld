package VirtualWorld;

import VirtualWorld.Organism.Organism;
import VirtualWorld.Organism.Wolf;

public class Main {
    public static void main(String[] args){

    World world = new World();
    world.addOrganism(OrganismType.WOLF);
    world.addOrganism(OrganismType.WOLF);
    world.addOrganism(OrganismType.WOLF);
    world.addOrganism(OrganismType.WOLF);
    world.addOrganism(OrganismType.GRASS);
    world.addOrganism(OrganismType.GRASS);
        world.drawTheWorld();

        for(int i = 0; i < 10; i++){
            System.out.println("Next day in world");
            world.makeRound();
            world.drawTheWorld();
        }
    }
}
