package designPattern.builder;

/**
 * @author 浦希成
 * 2018/9/25 10:21
 */
public class PxcAirShipDirector implements AirShipDirector {
    private AirShipBuilder builder;

    public PxcAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directorAirShip() {
        Engine engine=builder.builderEngine();
        OrbitalModule orbitalModule=builder.builderOrbitalModule();
        EscapeTower escapeTower=builder.builderEscapeTower();
        AirShip airShip=new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrbitalModule(orbitalModule);
        return airShip;
    }
}
