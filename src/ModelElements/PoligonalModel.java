package ModelElements;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> poligons;
    public List<Texture> textures;

    PoligonalModel(List<Texture> textures){
        this.textures = textures;

        poligons = new LinkedList<>();
        poligons.add(new Poligon());
    }
}
