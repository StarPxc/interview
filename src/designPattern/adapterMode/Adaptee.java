package designPattern.adapterMode;

/**
 * @author 浦希成
 * 2018/9/25 9:46
 * 被适配的类
 */
public class Adaptee {
    public void request(){
        System.out.println("可以完成客户请求所需要的功能！");
    }
}
