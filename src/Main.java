import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Car car = new Car("Toyota", "Corolla", LocalDate.of(2019, 1, 1), false, false, false);
        System.out.println(car);
        Bus bus= new Bus("Mercedes", "Sprinter", LocalDate.of(2019, 1, 1));
        bus.gas();

    }
}