package Model;


import Data.*;

public class NetController {
    IRoadRepository roadRepository;
    ICurrentTrafficRepository currentTrafficRepository;
    ICamerasRepository camerasRepository;

    public NetController() {
        roadRepository = new RoadRepository();
        camerasRepository = new CamerasRepository();
        currentTrafficRepository = new CurrentTrafficRepository();
    }
}
