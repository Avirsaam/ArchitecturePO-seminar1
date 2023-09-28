package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    static public int idCounter = 0;
    int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;


    public Scene(List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = idCounter++;

        if (models.size() == 0){
            throw new Exception("Список моделей пуст");
        } else {
            this.models = models;
        }

        this.flashes = flashes;

        if (cameras.size() == 0){
            throw new Exception("Список камер пуст");
        } else {
            this.cameras = cameras;
        }
    }

    public <T> T method1(T flash){
        T result = flash;
        return result;
    }

    public <T, E> T method2(T flash, E camera){
        T result = flash;
        return result;
    }
}
