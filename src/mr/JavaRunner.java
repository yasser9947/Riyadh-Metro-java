package mr;

import java.util.ArrayList;
import java.util.List;

public class JavaRunner {

    public static void  main(String ...arg){

        Line blue   = new Line("blue");
        Line red    = new Line("red");
        Line orange = new Line("orange");
        Line yellow = new Line("yellow");
        Line green  = new Line("green");
        Line purple = new Line("Line6");

//        System.out.println(blue.getName());

//        Stop a1ba = new Stop("a1b1" ,new ArrayList<Line>( List.of(blue , line2)));

//        System.out.println(a1ba.getLines());
//        27 stops
//        System.out.println(blue.getStopsNames());
        Stop s1Y1 = new Stop("1Y1" , blue );
        Stop s1Z1 = new Stop("1Z1" , blue );
        Stop s1A1 = new Stop("1A1" , blue );
        Stop s1A2 = new Stop("1A2" , blue );
        Stop s1B1 = new Stop("1B1" , blue );
        Stop s1B2 = new Stop("1B2" , blue );
        Stop s1B3 = new Stop("1B3" , blue );
        Stop s1B4 = new Stop("1B4" , blue );
        Stop s1C1 = new Stop("1C1" , blue );
        Stop s1C2 = new Stop("1C2" , blue );
        Stop s1C3 = new Stop("1C3" , blue );
        Stop s1C4 = new Stop("1C4" , blue );
        Stop s1D2 = new Stop("1D2" , blue );
        Stop s1D5 = new Stop("1D5" , blue );
        Stop s1E2 = new Stop("1E2" , blue );
        Stop s1F2 = new Stop("1F2" , blue );
        Stop s1F4 = new Stop("1F4" , blue );
        Stop s1F5 = new Stop("1F5" , blue );
        Stop s1F7 = new Stop("1F7" , blue );
        Stop s1F8 = new Stop("1F8" , blue );
        Stop s1F9 = new Stop("1F9" , blue );
        Stop s1G1 = new Stop("1G1" , blue );
        Stop s1G2 = new Stop("1G2" , blue );
        Stop s1H2 = new Stop("1H2" , blue );
        Stop s1J1 = new Stop("1J1" , blue );
        Stop s1J2 = new Stop("1J2" , blue );
//        System.out.println(blue.getStopsNames());
        // red
        Stop s2A1 = new Stop("2A1" , red );
        Stop s2A2 = new Stop("2A2" , red );
        Stop s2A3 = new Stop("2A3" , red );
        Stop s2B1 = new Stop("1B1" , red );
        Stop s2B2 = new Stop("1B2" , red );
        Stop s2B4 = new Stop("1B4" , red );
        Stop s2C1 = new Stop("2C1 " , red );
        Stop s2C2 = new Stop("2C2 " , red );
        Stop s2C2a = new Stop("2C2a " , red );
        Stop s2C3 = new Stop("2C3 " , red );
        Stop s2D2 = new Stop("2D2 " , red );
        Stop s2E1 = new Stop("2E1 " , red );
        Stop s2E2 = new Stop("2E2 " , red );
        Stop s2F1 = new Stop("2F1  " , red );
        Stop s2G1 = new Stop("2G1 " , red );
//        System.out.println(red.getStopsNames());
        // orange
        Stop s3A1 = new Stop("3A1" , orange );
        Stop s3A2 = new Stop("3A2" , orange );
        Stop s3B1 = new Stop("3B1" , orange );
        Stop s3B2 = new Stop("3B2" , orange );
        Stop s3C2 = new Stop("3C2" , orange );
        Stop s3D3 = new Stop("3D3" , orange );
        Stop s3D1 = new Stop("3D1" , orange );
        Stop s3D2 = new Stop("3D2" , orange );
        Stop s3E1 = new Stop("3E1" , orange );
        Stop s3E2 = new Stop("3E2" , orange );
        Stop s3E3 = new Stop("3E3" , orange );
        Stop s3E4 = new Stop("3E4" , orange );
        Stop s3E5 = new Stop("3E5" , orange );
        Stop s3E6 = new Stop("3E6" , orange );
        Stop s3F1 = new Stop("3F1" , orange );
        Stop s3F2 = new Stop("3F2" , orange );
        Stop s3G1 = new Stop("3G1" , orange );
        Stop s3G2 = new Stop("3G2" , orange );
        Stop s3H1 = new Stop("3H1" , orange );
        Stop s3J1 = new Stop("3J1" , orange );
        Stop s3J2 = new Stop("3J2" , orange );
        Stop s3K1 = new Stop("3K1" , orange );
//        System.out.println(orange.getStopsNames());
        // yellow
        Stop s4A1 = new Stop("4A1" , yellow );
        Stop s4B1 = new Stop("4B1" , yellow );
        Stop s4C1 = new Stop("4C1" , yellow );
        Stop s4C2 = new Stop("4C2" , yellow );
        Stop s4D1 = new Stop("4D1" , yellow );
        Stop s4E1 = new Stop("4E1" , yellow );
        Stop s4E2 = new Stop("4E2" , yellow );
        Stop s4G1= new Stop("4G1" , yellow );
        Stop s4G2= new Stop("4G2" , yellow );
        Stop s4G3= new Stop("4G3" , yellow );
//        System.out.println(yellow.getStopsNames());
        // green
        Stop s5A1 = new Stop("5A1" , green );
        Stop s5A6 = new Stop("5A6" , green );
        Stop s5A2 = new Stop("5A2" , green );
        Stop s5A5 = new Stop("5A5" , green );
        Stop s5A3 = new Stop("5A3" , green );
        Stop s5B1 = new Stop("5B1" , green );
        Stop s5B2 = new Stop("5B2" , green );
        Stop s5B3 = new Stop("5B3" , green );
        Stop s5B4 = new Stop("5B4" , green );
        Stop s5C1 = new Stop("5C1" , green );
        Stop s5C2 = new Stop("5C2" , green );
        Stop s5C4 = new Stop("5C4" , green );
//        System.out.println(green.getStopsNames());
        // purple
        Stop s6D1 = new Stop("6D1" , purple );
        Stop s6D2 = new Stop("6D2" , purple );
        Stop s6E1 = new Stop("6E1" , purple );
        Stop s6F1 = new Stop("6F1" , purple );
        Stop s6G1 = new Stop("6G1" , purple );
        Stop s6G2 = new Stop("6G2" , purple );
        Stop s6H1 = new Stop("6H1" , purple );
        Stop s6H2 = new Stop("6H2" , purple );
//        System.out.println(purple.getStopsNames());

//        connect Stations
        s4A1.setNearbyStation(s1A1);
        s4C2.setNearbyStation(s6D1);
        s6F1.setNearbyStation(s2E1);
        s5C4.setNearbyStation(s2C2);
        s1B3.setNearbyStation(s2B2);
        s1F4.setNearbyStation(s5A1);
        s1F7.setNearbyStation(s3E2);
        s6H2.setNearbyStation(s3J1);


//        System.out.println(Subway.multiTrip(s1A1 , s1D5 ));
//        System.out.println(Subway.multiTrip(s1Y1 , s3F2 ));
        System.out.println(Subway.multiTrip(s4E2 , s2F1));
        System.out.println(Subway.multiTrip(s4E2 , s5C2));
    }

}
