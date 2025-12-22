package car.autowire.byName;

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        System.out.println("setter called Car Class by Name: ");
        this.specification = specification;
    }

    // we don't need constructor
    public void displeyDetails() {
        System.out.println("Car Specs Details " + specification.toString());
    }
}
