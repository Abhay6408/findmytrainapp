package findmytrain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp {
    public static void main(String args[]) {
        Trainsystem system = new Trainsystem();
        Station st1 = new Station("ST01", "BHOPAL");
        Station st2 = new Station("ST02", "INDORE");
        Station st3 = new Station("ST03", "SATNA");
        Station st4 = new Station("ST04", "JABALPUR");
        Station st5 = new Station("ST05", "BANGLORE");
        Station st6 = new Station("ST06", "HYDERABAD");
        Station st7 = new Station("ST07", "KATNI");
        Station st8 = new Station("ST08", "MAIHAR");
        system.addStation(st1);
        system.addStation(st2);
        system.addStation(st3);
        system.addStation(st4);
        system.addStation(st5);
        system.addStation(st6);
        system.addStation(st7);
        system.addStation(st8);

        Train t1 = new Train("12001", "BPL-IND", "Passenger");
        Train t2 = new Train("12002", "INTERCITY", "Express");
        system.addTrain(t1);
        system.addTrain(t2);

        HashMap<String,Station> sta=new HashMap<>();
        sta.put("BHOPAL",st1);
        sta.put("INDORE",st2);
        sta.put("SATNA",st3);
        sta.put("HYDERABAD",st6);
        sta.put("KATNI",st7);
        sta.put("MAIHAR",st8);
        HashMap<String,Station> sta2=new HashMap<>();
        sta2.put("BHOPAL",st1);
        sta2.put("INDORE",st2);
        sta2.put("JABALPUR",st4);
        sta2.put("HYDERABAD",st6);
        t1.setStationlist(sta);
        t2.setStationlist(sta2);
        Platform p1 = new Platform(1);
        Platform p2 = new Platform(2);

        List<Platform> platformList = new ArrayList<>();
        platformList.add(p1);
        platformList.add(p2);
        st1.setPlatform(platformList);
        st2.setPlatform(platformList);

        Schedule s1 = new Schedule(st1, t1, "9:00AM", "9:05AM", p1);
        Schedule s2 = new Schedule(st2, t2, "10:00AM", "10:05AM", p2);
        Schedule s3 = new Schedule(st1, t2, "11:00AM", "11:05AM", p1);
        Schedule s4 = new Schedule(st3, t1, "12:00PM", "12:05PM", p2);
        Schedule s5 = new Schedule(st6, t1, "04:00PM", "04:05PM", p1);



        system.addSchedule(s1);
        system.addSchedule(s2);
        system.addSchedule(s3);
        system.addSchedule(s4);
        system.addSchedule(s5);

        Scanner input=new Scanner(System.in);
        System.out.println("press 0 to search trains between two stations otherwise press 1 to find train schedule");
        int n=input.nextInt();
        if(n==0) {
            System.out.println("Enter Source");
            String source = input.next();
            System.out.println("Enter Destination");
            String destination = input.next();
            List<Train> trainList = system.findmytrain(source, destination);
            for (Train t : trainList) {
                System.out.println(t);
            }
        }
        else if(n==1){
            System.out.println("Enter Station Name");
            String inputstation=input.next();
            List<Schedule> scheduleList=system.findschedule(inputstation);
            for(Schedule schedule:scheduleList){
                System.out.println(schedule);
            }
        }
        else{
            System.out.println("press 0 to search trains between two stations otherwise press 1 to find train schedule");
        }

    }
}
