package VirtualWorld;
import VirtualWorld.Organism.Grass;
import VirtualWorld.Organism.Organism;
import VirtualWorld.Organism.Wolf;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {


    private static int maxSize = 20;
    static List<Organism> organisms = new ArrayList<>();

    public void addOrganism(OrganismType organismType) {
        Point newPoint = this.getNewPoint();
        switch (organismType) {
            case WOLF:
                new Wolf(9, 5, newPoint, this);
                System.out.println(OrganismType.WOLF);
                break;
            case GRASS:
                new Grass(5, 0, newPoint, this);
                break;
            default:
                System.out.println("złe dane!!");
                break;
        }
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

    public Point Move() {
        Point pointPush = new Point();
        Random rand_n = new Random();
        int n = rand_n.nextInt(4);
        if (n == 0)                // ruch w gore
            pointPush.y += 1;
        else if (n == 1)         //ruch w dol
            pointPush.y -= 1;
        else if (n == 2)       //ruch w prawo
            pointPush.x += 1;
        else                   //ruch w lewo
            pointPush.x -= 1;
        return pointPush;
    }

    public void commitOrganism(OrganismType organismType) {

        if ( organismType == organismType)
            addOrganism(organismType);
        else;





    }
}