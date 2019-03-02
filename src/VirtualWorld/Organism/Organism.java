package VirtualWorld.Organism;
import VirtualWorld.World;

import java.awt.*;


public abstract class Organism{

    protected Point point;
    protected int strength;
    protected int initiative;
    protected World world;

    public abstract void doAction();

    public abstract void drawMe();
    public Point getPoint(){//getter aby otrzymac poimt
        return point;
    }
}

