package Model;

public class TripController {
    NetController netController;
    IGPS sensor;
    ITripHistory triphistory;

    public TripController(NetController netController) {
        this.netController = netController;
        sensor = (IGPS) new GPS();
        triphistory = new TripHistory();
    }
}
