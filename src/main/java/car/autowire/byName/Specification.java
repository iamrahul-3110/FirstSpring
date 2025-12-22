package car.autowire.byName;

public class Specification {
    private String make;
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        System.out.println("setter called model");
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        System.out.println("setter called make");
        this.make = make;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
