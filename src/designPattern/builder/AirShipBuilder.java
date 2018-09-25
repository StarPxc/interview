package designPattern.builder;

/**
 * @author 浦希成
 * 2018/9/25 10:16
 */
public interface AirShipBuilder {
    Engine builderEngine();
    OrbitalModule builderOrbitalModule();
    EscapeTower builderEscapeTower();
}
