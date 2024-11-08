package findmytrain;

public class Schedule {
    private Station station;
    private Train train;
    private String arrivaltime;
    private String departuretime;
    private Platform platform;

    public Schedule(Station station, Train train, String arrivaltime, String departuretime, Platform platform) {
        this.station = station;
        this.train = train;
        this.arrivaltime = arrivaltime;
        this.departuretime = departuretime;
        this.platform = platform;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(String departuretime) {
        this.departuretime = departuretime;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "station=" + station.getStationName() +
                ", train=" + train.getTrainName() +
                ", arrivaltime='" + arrivaltime + '\'' +
                ", departuretime='" + departuretime + '\'' +
                ", platform=" + platform.getPlatformnumber() +
                '}';
    }
}
