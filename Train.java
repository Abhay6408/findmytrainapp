package findmytrain;


import java.util.HashMap;


public class Train {

    private String trainID;
    private String trainName;
    private String trainType;
    private HashMap<String,Station> stationlist;

    public Train(String trainID, String trainName, String trainType) {
        this.trainID = trainID;
        this.trainName = trainName;
        this.trainType = trainType;
        this.stationlist=new HashMap<>();
    }

    public HashMap<String,Station> getStationlist() {
        return stationlist;
    }

    public void setStationlist(HashMap<String,Station> stationlist) {
        this.stationlist = stationlist;
    }

    public String getTrainID() {
        return trainID;
    }

    public void setTrainID(String trainID) {
        this.trainID = trainID;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    @Override
    public String toString() {
        return "train{" +
                "trainID='" + trainID + '\'' +
                ", trainName='" + trainName + '\'' +
                ", trainType='" + trainType + '\'' +
                '}';

    }
}
