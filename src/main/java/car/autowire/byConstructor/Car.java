package car.autowire.byConstructor;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    // we don't need constructor
    public void displeyDetails() {
        System.out.println("Car Specs Details " + specification.toString());
    }
}
