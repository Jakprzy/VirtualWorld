package VirtualWorld;

import VirtualWorld.Organism.Animal;
import VirtualWorld.Organism.Organism;
import VirtualWorld.Organism.Wolf;

import java.util.ArrayList;
import java.util.List;

public class World {


    private List<Organism> organismList;

    public static void  drawTheWorld(){
        Wolf wolf = new Wolf();
        System.out.println("Welcome in game. Let's begin");
        World world =new World();
        world.setOrganismListtList(new ArrayList<>());//toworzenie listy
        world.getOrganismList().add(wolf);
    }

    public static void  followTheTur() {

    }
    public List<Organism> getOrganismList() {
        return organismList;
    }
    public void setOrganismListtList(List<Organism> ingredientList) {
        this.organismList = ingredientList;
    }


}
