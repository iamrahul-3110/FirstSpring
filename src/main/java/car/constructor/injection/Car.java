package car.constructor.injection;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displeyDetails() {
        System.out.println("Car Specs Details " + specification.toString());
    }
}
