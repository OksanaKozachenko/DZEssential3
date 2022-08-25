package Task3;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();
        System.out.println("Літак: вартість- " + plane.price + " вік- " + plane.year + " швидкість- " + plane.speed + " висота польоту- " + plane.higth +  " кількість пасажирів- " + plane.pass);

        Car car = new Car();
        System.out.println("Авто: вартість- " + car.price + " вік- " + car.year + " швидкість- " + car.speed);

        Ship ship = new Ship();
        System.out.println("Корабль: вартість- " + ship.price + " вік- " + ship.year + " швидкість- " + ship.speed + " порт приписки- " + ship.port +  " кількість пасажирів- " + ship.pass);



    }
}
