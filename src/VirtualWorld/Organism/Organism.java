package VirtualWorld.Organism;

import java.util.Random;

public abstract class Organism {

    protected int strenght;
    protected int initiative;
    protected int positionX, positionY;
    protected int whichWorld;

    protected void setStatisticAnimal(int strenght, int initiative) {
        this.strenght = strenght;
        this.initiative = initiative;
    }
    protected void setStatisticPlant(int strenght) {
        this.strenght = strenght;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getWhichWorld() {
        return whichWorld;
    }

    public void setWhichWorld(int whichWorld) {
        this.whichWorld = whichWorld;
    }

    public void actionStart() { //poczatkowe położenie organizmu, losowanie x i y
        while(positionX != positionX && positionY != positionY) {
            Random randX = new Random();
            positionX = randX.nextInt(21);
            Random randY = new Random();
            positionY = randY.nextInt(21);
            System.out.println("Połozenie poczatkowe: x: " + positionX + "y: " + positionY);
        }
            }


    public void actionNext() { //każdy kolejny ruch
        Random rand_n = new Random();
        int n = rand_n.nextInt(4);
        if (n == 0)                // ruch w gore
            positionY += 1;
        else if (n == 1)         //ruch w dol
            positionY -= 1;
        else if (n == 2)       //ruch w prawo
            positionX += 1;
        else                   //ruch w lewo
            positionX -= 1;

        System.out.println("Aktualne położenie: x: " + positionX + "y: " + positionY);
    }

    public void collision(){

    }

}

