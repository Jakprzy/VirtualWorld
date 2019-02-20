package VirtualWorld.Organism;

import java.awt.geom.Point2D;

public abstract class Organism{


    protected Point2D.Double point;


    protected int strength;
    protected int initiative;
    public abstract void drawMe();
    public abstract void setStatistic(int strength , int initiative);

    public void setPoint(double point) {
        this.point.x = point;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setIniciative(int initiative) {
        this.initiative = initiative;
    }

}

