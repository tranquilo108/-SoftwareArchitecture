package Model;

import Data.CityObjectRepository;

public class MapController {
    TripController tripController;
    CityObjectRepository cityObjectRepository;

    public MapController(TripController tripController) {
        this.tripController = tripController;
        cityObjectRepository = new CityObjectRepository();
    }
}
