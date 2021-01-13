package vehicles;

public abstract class VehicleType {
    private int price;
    private String make;
    private String model;
    private String colour;

    private Engine engine;
    private Tires tires;

    public VehicleType(int price, String make, String model, String colour, Engine engine, Tires tires){
        this.price = price;
        this.make = make;
        this.model = model;
        this.colour = colour;
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

    public Engine getEngine() {
        return engine;
    }

    public Tires getTires() {
        return tires;
    }
}

