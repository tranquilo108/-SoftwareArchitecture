package InMemoryModel;

import ModelElements.*;
import ModelElements.Utils.*;

public class ModelStore implements iModelChangedObserver, iModelChanger{
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    private iModelChangedObserver changedObserver;

    public ModelStore(iModelChangedObserver changedObserver) {
        this.changedObserver = changedObserver;
        this.models = new PoligonalModel(new Poligon(new Point3D()));
        this.scenes = new Scene(this.cameras, this.flashes, this.models);
        this.flashes = new Flash(new Point3D(), new Angle3D(), new Color());
        this.cameras = new Camera(new Point3D(), new Angle3D());
    }

    public Scene getScena(int id) {
        return scenes;
    }

    @Override
    public void applyUpdateModel() {

    }

    @Override
    public void NotifyChange(iModelChanger sender) {

    }
}
