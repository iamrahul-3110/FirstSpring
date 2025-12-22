package car.autowire.byType;

public class Car {
    private Specification specification1; // name can be different in this case but type should be same in been property.

    public void setSpecification(Specification specification) {
        System.out.println("setter called Car Class by Name: ");
        this.specification1 = specification;
    }

    // we don't need constructor
    public void displeyDetails() {
        System.out.println("Car Specs Details " + specification1.toString());
    }
}
