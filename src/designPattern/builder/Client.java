package designPattern.builder;

/**
 * @author 浦希成
 * 2018/9/25 10:24
 */
public class Client {
    public static void main(String[] args) {
        AirShipDirector director=new PxcAirShipDirector(new PxcShipBuilder());
        AirShip airShip=director.directorAirShip();
        airShip.launch();
        System.out.println(airShip);
    }
}
