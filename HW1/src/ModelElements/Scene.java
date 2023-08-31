package ModelElements;

import java.lang.reflect.Type;

public class Scene {
    public Camera camera;
    public static int id;
    {
        id = 0;
    }
    public PoligonalModel models;
    public Flash flashes;

    public Scene(Camera cameras, Flash flashes, PoligonalModel models) {
        this.camera = cameras;
        this.flashes = flashes;
        this.models = models;
        id++;
    }

    public Scene(Camera camera, PoligonalModel models) {
        this.camera = camera;
        this.models = models;
        id++;
    }

    public Type method1(Type type){
        return new Type() {
            @Override
            public String getTypeName() {
                return Type.super.getTypeName();
            }
        };
    }
    public Type method2(Type type1, Type type2){
        if(type1.getTypeName().equals(type2.getTypeName())){
            return type2;
        }
        return type1;
    }
}
