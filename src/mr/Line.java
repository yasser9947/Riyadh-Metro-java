package mr;

import java.util.ArrayList;
import java.util.List;

public class Line extends Subway {
    private String name;
    private ArrayList<Stop> stops = new ArrayList<>();

    public Line(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getStopsNames() {
        return stops.stream().map(ele  -> ele.getName()).toList();
    }

    public ArrayList<Stop> getStops() {
        return stops;
    }

    public void setStops(Stop stop) {
        stops.add(stop);
    }
}
