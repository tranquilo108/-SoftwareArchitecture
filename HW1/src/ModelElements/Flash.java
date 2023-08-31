package ModelElements;

import ModelElements.Utils.Angle3D;
import ModelElements.Utils.Color;
import ModelElements.Utils.Point3D;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public Float power;

    public Flash(Point3D location, Angle3D angle, Color color, Float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public Flash(Point3D location, Angle3D angle, Color color) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = 0f;
    }

    public void rotate(Angle3D angle){

    }
    public void move(Point3D point){

    }
}
