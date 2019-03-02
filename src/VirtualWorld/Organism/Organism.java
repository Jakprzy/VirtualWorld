package VirtualWorld.Organism;
import java.awt.*;


public abstract class Organism{

    protected Point point;
    protected int strength;
    protected int initiative;

    abstract void drawMe();
    public Point getPoint(){
        return point;
    }
}

