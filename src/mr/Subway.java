package mr;


import java.util.ArrayList;
import java.util.List;

public class Subway {


    private static Journey oneWayTrip (Stop start , Stop end , Line line){
        Line theLine = line;
        int indexStart = theLine.getStopsNames().indexOf(start.getName());
        int indexEnd = theLine.getStopsNames().indexOf(end.getName());
        Journey ref = new Journey();
        ref.journey = "";
        if ( indexStart < indexEnd){
            ref.total = indexEnd - indexStart;
            for (int i = indexStart ; i <= indexEnd ; i++){
                ref.journey += theLine.getStopsNames().get(i) + " , ";
            }
        }else {
            ref.total =  indexStart - indexEnd;

            for (int i = indexStart ; i >= indexEnd ; i--){
                ref.journey += theLine.getStopsNames().get(i) + " , ";
            }
        }
        return ref;
    }


    public static String multiTrip(Stop start , Stop end){
        if (start.getLine() == end.getLine()){
           return oneWayTrip(start , end , start.getLine()).journey;
        }else {
            Line theLine1 = start.getLine();
            Line theLine2 = end.getLine();
            int total = 0;
            var ref = new Journey();
            ref.journey = "";
            ref.total = 0;
            theLine1.getStops().stream().forEach(ele -> {
                if (ele.isTransferStation() == true){
                    List<Stop> filter=   theLine1.getStops().stream().filter(ele2 -> ele2.getNearbyStation() != null && ele2.getNearbyStation().getLine().equals(theLine2)).toList();
                    if(filter.size() == 0){
                        ConnectBetweenStops(ele , ref , start , end , theLine2);
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

    private  static void ConnectBetweenStops(Stop ele, Journey ref, Stop start, Stop end, Line theLine2)   {
//        while ()
        try{

            Stop stop = ele.getNearbyStation().getLine().getStops().stream().filter(ele2 -> ele2.isTransferStation() && ele2.getNearbyStation().getLine().equals(theLine2)).toList().get(0);
            System.out.println(stop);
            int totalCompaier = 0;
            totalCompaier +=  oneWayTrip(start , ele , start.getLine()).total;
            totalCompaier +=  oneWayTrip(ele.getNearbyStation(), stop , ele.getNearbyStation().getLine()).total;
            totalCompaier +=  oneWayTrip(stop.getNearbyStation(), end , stop.getNearbyStation().getLine()).total;
            if (ref.total ==  0 || totalCompaier < ref.total){
                ref.total = totalCompaier;
                ref.journey = "";
                ref.journey +=  oneWayTrip(start , ele , start.getLine()).journey;
                ref.journey +=  oneWayTrip(ele.getNearbyStation(), stop , ele.getNearbyStation().getLine()).journey;
                ref.journey +=  oneWayTrip(stop.getNearbyStation(), end , stop.getNearbyStation().getLine()).journey;
            }
        } catch (Exception e ){
            System.out.println(e.getMessage());
        }
    }
}
 class Journey{
    String journey ;
    int total ;
}
//
//
//                        while (filter.size() == 0) {
//                                try{
//                                Stop stop = ele.getNearbyStation().getLine().getStops().stream().filter(ele2 -> ele2.isTransferStation() && ele2.getNearbyStation().getLine().equals(theLine2)).toList().get(0);
//                                System.out.println(stop.getName());
//                                } catch (Exception e ){
//                                System.out.println(e.getMessage());
//                                break;
//                                }
//                                }
