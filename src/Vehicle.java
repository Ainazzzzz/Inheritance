import java.time.LocalDate;

class Vehicle {
   private String brand;
   private String model;
    private LocalDate year;

    public Vehicle(String brand, String model, LocalDate year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Vehicle() {

    }

    public void gas() {
        System.out.println("Tuut, tuut!");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
