package VirtualWorld;


import VirtualWorld.Organism.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Wolf wolf = new Wolf();
        wolf.setStatistic(9,5);
        wolf.drawMe();
        Grass grass = new Grass();
        grass.drawMe();
        grass.setStatistic(5,0);
        List<Organism> organisms = new ArrayList<>();
        organisms.add(wolf);
        organisms.add(grass);






    }
}
