package mr;


import java.util.ArrayList;
import java.util.List;

public class Subway {



    public static String oneWayTrip (Stop start , Stop end , Line line){
        Line theLine = line;
        int indexStart = theLine.getStopsNames().indexOf(start.getName());
        int indexEnd = theLine.getStopsNames().indexOf(end.getName());
        String journey = "";
        if ( indexStart < indexEnd){
            for (int i = indexStart ; i <= indexEnd ; i++){
                journey += theLine.getStopsNames().get(i) + " , ";
            }
        }else {
            for (int i = indexStart ; i >= indexEnd ; i--){
                journey += theLine.getStopsNames().get(i) + " , ";
            }
        }
        return journey;
    }

    public static String multiTrip(Stop start , Stop end){
        if (start.getLine() == end.getLine()){
           return oneWayTrip(start , end , start.getLine());
        }else {
            Line theLine1 = start.getLine();
            Line theLine2 = end.getLine();
            var ref = new Object() {String journey = "";};
            theLine1.getStops().stream().forEach(ele -> {
                if (ele.isTransferStation() == true){
                    List<Stop> filter=   theLine1.getStops().stream().filter(ele2 -> ele2.getNearbyStation() != null && ele2.getNearbyStation().getLine().equals(theLine2)).toList();
                    if(filter.size() == 0){
                    }
                   else if (ele.getNearbyStation().getLine().equals(theLine2) ){
                        ref.journey += oneWayTrip(start , ele , theLine1);
                        ref.journey += "\nthen change to from : " + ele.getName() +" to line " + theLine2.getName() + " for station : " + ele.getNearbyStation().getName() + "\n";
                        ref.journey += oneWayTrip(ele.getNearbyStation() , end , theLine2);

                    }else {

                    }
                }
            });
        return ref.journey;
        }
    }


}
