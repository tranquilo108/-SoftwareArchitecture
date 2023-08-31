package ModelElements;

public class PoligonalModel {
    public Poligon poligons;
    public Texture textures;

    public PoligonalModel(Poligon poligon) {
        this.poligons = poligon;
    }

    public PoligonalModel(Poligon poligons, Texture textures) {
        this.poligons = poligons;
        this.textures = textures;
    }
}
