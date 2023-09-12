package Model;

import View.GUI;
import View.IGUI;
import View.IUX;
import View.UXControls;

public class AppController {
    MapController mapController;
    IGUI gui;
    IUX ux;

    public AppController(MapController mapController) {
        this.mapController = mapController;
        gui = (IGUI) new GUI();
        ux = (IUX) new UXControls();
    }
}
