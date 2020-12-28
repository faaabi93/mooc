public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restringHeartRate){
        this.age = age;
        this.restingHeartRate = restringHeartRate;
    }

    public double targetHeartRate(double targetPercentage){
        double maxHeartRate = 206.3 - (0.711 * this.age);
        double targetHeartRate = (maxHeartRate - this.restingHeartRate) * (targetPercentage) + this.restingHeartRate;
        return targetHeartRate;
    }
}
