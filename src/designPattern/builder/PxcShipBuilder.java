package designPattern.builder;

/**
 * @author 浦希成
 * 2018/9/25 10:18
 * pxc的飞船
 */
public class PxcShipBuilder implements AirShipBuilder{

    @Override
    public Engine builderEngine() {
        System.out.println("构建pxc发动机");
        return new Engine("pxc发动机");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建pxc航道舱");
        return new OrbitalModule("pxc航道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建pxc逃逸层");
        return new EscapeTower("pxc逃逸层");
    }
}
