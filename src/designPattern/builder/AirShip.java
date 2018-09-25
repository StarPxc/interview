package designPattern.builder;

/**
 * @author 浦希成
 * 2018/9/25 10:11
 * 宇宙飞船
 */
public class AirShip {

    /**
     * 轨道舱
     */
    private OrbitalModule orbitalModule;
    /**
     * 发动机
     */
    private Engine engine;
    /**
     * 逃逸层
     */
    private EscapeTower escapeTower;
    public void launch(){
        System.out.println("飞船发射！");
    }
    @Override
    public String toString() {
        return "AirShip{" +
                "orbitalModule=" + orbitalModule +
                ", engine=" + engine +
                ", escapeTower=" + escapeTower +
                '}';
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}
class OrbitalModule{
    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Engine{
    private String name;
    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class EscapeTower{
    private String name;
    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

