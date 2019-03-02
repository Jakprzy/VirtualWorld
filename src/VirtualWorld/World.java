package VirtualWorld;
import VirtualWorld.Organism.Grass;
import VirtualWorld.Organism.Organism;
import VirtualWorld.Organism.Wolf;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class World {


    private int maxSize = 20;

    public List<Organism> getOrganisms() {
        return organisms;
    }

    public void setOrganisms(List<Organism> organisms) {
        this.organisms = organisms;
    }

    private List<Organism> organisms = new ArrayList<>();

    public void addOrganism(OrganismType organismType) {

        Organism organism = null;
        Point newPoint = this.getNewPoint();
        switch (organismType) {
            case WOLF:
                organism = new Wolf(newPoint, this);
                break;
            case GRASS:
                organism = new Grass(newPoint, this);
                break;
            default:
                System.out.println("złe dane!!");
                break;
        }
        this.organisms.add(organism);

    }

    public Point getNewPoint() {  // otrzymanie nowego punktu wraz ze sprawedzeniem czy nie ma juz takiego punktu
        Point newPoint = new Point();
        Random rand = new Random();
        while (true) {
            newPoint.x = rand.nextInt(maxSize);
            newPoint.y = rand.nextInt(maxSize);
            if (getOrganismByPoint() == null)
                break; //sprawdzenie czy znajduje sie jakis organism na tym punkcie jezeli nie to przerwij pętle
        }
        return newPoint;
    }

    public Organism getOrganismByPoint() { //Metoda zwraca Organism za pomocą podanego punktu
        Organism returnOrganism = null;
        Point newPoint = new Point();

        for (Organism organism : organisms) {
            if (organism.getPoint().equals(newPoint)) {
                returnOrganism = organism;
                break;
            } else
                System.out.println(organisms);
        }
        return returnOrganism;
    }

    public void drawTheWorld() {
        for (Organism organism : organisms) {
            organism.drawMe();
        }
    }
    public void makeRound() {
        for (Organism organism : organisms){
                organism.doAction();
        }

    }
}
