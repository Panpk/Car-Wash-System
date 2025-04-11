package gr.uop;

public class VehicleInfo {

    private String licensePlateString;
    private String costString;
    private String currentTimeString;

    public VehicleInfo(String licensePlateString, String costString, String currentTimeString) {
        this.licensePlateString = licensePlateString;
        this.costString = costString;
        this.currentTimeString = currentTimeString;
    }

    public String getPlate() {
        return licensePlateString;
    }

    public String getCost() {
        return costString;
    }

    public String getTime() {
        return currentTimeString;
    }


}
