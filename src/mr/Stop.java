package mr;


import java.util.ArrayList;
import java.util.List;

public class Stop extends Subway {
    private String name;
    private String anotherName;
    private int id = (int) (Math.random() *  9999);
    private Line line;
    private boolean mainStop;
    private boolean transferStation;
    private Stop nearbyStation;

    public Line getLine() {
        return line;
    }

    public Boolean isTransferStation() {
        return transferStation;
    }

    public Stop(String name, Line line) {
        this.name = name;
        this.line = line;
        this.setLine(line);
    }

    public Stop(String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAnotherName() {
        return anotherName;
    }

    public int getId() {
        return id;
    }

    public Boolean getMainStop() {
        return mainStop;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnotherName(String anotherName) {
        this.anotherName = anotherName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLine(Line line) {
        line.setStops(this);
    }

    public void setMainStop(Boolean mainStop) {
        this.mainStop = mainStop;
    }

    public void setTransferStation(Boolean transferStation) {
        this.transferStation = transferStation;
    }

    public Stop getNearbyStation() {
        return nearbyStation;
    }

    public void setNearbyStation(Stop nearbyStation) {
        this.nearbyStation = nearbyStation;
        if (nearbyStation.getNearbyStation() == null) nearbyStation.setNearbyStation(this);
        this.transferStation = true;

    }
}
