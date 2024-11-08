package findmytrain;

import java.util.*;

public class Trainsystem {
    private Map<String,Station> stations=new HashMap<>();
    private Map<String,Train> trains=new HashMap<>();
    private List<Schedule> schedules=new ArrayList<>();

    public void addStation(Station station){
        stations.put(station.getStationID(),station);
    }
    public void addTrain(Train train){
        trains.put(train.getTrainID(),train);
    }
    public  void addSchedule(Schedule schedule){
        schedules.add(schedule);
    }

    public List<Train> findmytrain(String source,String destination){
        List<Train> result=new ArrayList<>();
        for(Map.Entry<String,Train> entry:trains.entrySet()){
            HashMap<String,Station> stl=new HashMap<>(entry.getValue().getStationlist());
           // System.out.println(entry.getValue().getStationlist());
            if(stl.containsKey(source)&&stl.containsKey(destination)){
                result.add(entry.getValue());
            }
        }
        return result;
    }
    public List<Schedule> findschedule(String inputstation){
        List<Schedule> res=new ArrayList<>();
        for(Schedule schedule:schedules){
            if(schedule.getStation().getStationName().equals((inputstation))){
                res.add(schedule);
            }
        }
        return res;
    }
}
