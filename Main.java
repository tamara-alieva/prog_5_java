import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String buffer;
        System.out.println("ТЕСТЫ:");
        System.out.println("1) Возникновение исключений");

        Car car = new Car();
        try {
            car.output();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Driver driver = new Driver();
        try {
            driver.output();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Passenger passenger = new Passenger();
        try {
            passenger.output();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Person person = new Person();
        try {
            person.output();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("2) Исключение не возникает");
        person.setName("Ivan");
        person.setBalance(7000);
        try {
            person.output();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("3) Одномерный массив объектов");
        buffer = "Toyota";
        Car[] car_array = new Car[3];
        car_array[0] = new Car("Kia Rio");
        car_array[1] = new Car(buffer);
        car_array[2] = new Car("Volvo", true);
        for (int i = 0; i < 3; i++)
            car_array[i].output();
        System.out.println();

    }
}
