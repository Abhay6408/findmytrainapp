package findmytrain;

public class Platform {
    private int platformnumber;
    private Train train;

    public Platform(int platformnumber) {
        this.platformnumber = platformnumber;
    }

    public int getPlatformnumber() {
        return platformnumber;
    }

    public void setPlatformnumber(int platformnumber) {
        this.platformnumber = platformnumber;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "platformnumber=" + platformnumber +
                ", train=" + train +
                '}';
    }
}
