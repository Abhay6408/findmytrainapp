package findmytrain;
import java.util.ArrayList;
import java.util.List;

public class Station {
    private String stationID;
    private String stationName;
    private List<Platform> platform;

    public Station(String stationID, String stationName) {
        this.stationID = stationID;
        this.stationName = stationName;
        this.platform=new ArrayList<>();
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public List<Platform> getPlatform() {
        return platform;
    }

    public void setPlatform(List<Platform> platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationID='" + stationID + '\'' +
                ", stationName='" + stationName + '\'' +
                ", platform=" + platform +
                '}';
    }
}
