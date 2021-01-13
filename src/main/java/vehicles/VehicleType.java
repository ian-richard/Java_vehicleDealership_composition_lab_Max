package vehicles;

public abstract class VehicleType {
    private int price;
    private String make;
    private String model;
    private String colour;
    private String engineSize;
    private String engine;
    private String tires;

    public VehicleType(int Price, String make, String model, String colour, String engineSize, String engine, String tires){
        this.price = price;
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.engineSize = engineSize;
        this.engine = engine;
        this.tires = tires;

    }

    public int getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public String getEngine() {
        return engine;
    }

    public String getTires() {
        return tires;
    }
}

