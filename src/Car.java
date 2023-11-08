import java.time.LocalDate;

public class Car extends Vehicle{
    private boolean small;
    private boolean sport;
    private boolean electric;

    public Car(String brand, String model, LocalDate year, boolean small, boolean sport, boolean electric) {
        super(brand, model, year);
        this.small = small;
        this.sport = sport;
        this.electric = electric;
    }



    public boolean isSmall() {
        return small;
    }

    public void setSmall(boolean small) {
        this.small = small;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" +
                "small=" + small +
                ", sport=" + sport +
                ", electric=" + electric +
                '}';
    }
}
