import java.time.LocalDate;

public class Bus extends Vehicle{

    public Bus(String brand, String model, LocalDate year) {
        super(brand, model, year);
    }

    @Override
    public void gas() {
        System.out.println("Bus goes");
        System.out.println("Tuut, tuut!");
        System.out.println("Tuut, tuut!");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
