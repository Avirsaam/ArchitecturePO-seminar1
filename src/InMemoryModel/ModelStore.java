package InMemoryModel;

import InMemoryModel.interfaces.IModelChangeObserver;
import InMemoryModel.interfaces.IModelChanger;
import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangeObserver> changeObservers;

    public ModelStore(List<PoligonalModel> models, List<Scene> scenes, List<Flash> flashes, List<Camera> cameras) throws Exception {
        if (models.size() == 0){
            throw new Exception("Список моделей не может быть пустым");
        } else {
            this.models = models;
        }

        if (scenes.size() == 0){
            throw new Exception("Список сцен не может быть пустым");
        } else {
            this.scenes = scenes;
        }

        if (flashes.size() == 0) {
            throw new Exception("Список источников света не может быть пустым");
        }else {
            this.flashes = flashes;
        }

        if (cameras.size() == 0){
            throw new Exception("Список камер не может быть пустым");
        }else {
            this.cameras = cameras;
        }

        changeObservers = new ArrayList<>();
    }

    public Scene getScene(int sceneId){
        return null;
    }

    @Override
    public void notifyChange(IModelChanger sender) {
        for (int i = 0; i < changeObservers.size(); i++) {
            changeObservers.get(i).applyUpdateModel();
        }
    }
}
