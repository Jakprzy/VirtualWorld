package VirtualWorld.Organism;

public abstract  class Animal extends Organism {
    public Animal(int positionX, int positionY, int whichWorld){
        this.actionStart();
        this.actionNext();
    }
}
