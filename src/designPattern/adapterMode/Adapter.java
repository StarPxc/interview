package designPattern.adapterMode;

/**
 * @author 浦希成
 * 2018/9/25 9:53
 * 适配器本身，相当于usb和ps/2的转接器
 */
public class Adapter extends Adaptee implements Target{
  ;
    @Override
    public void handleRequest() {
        super.request();
    }
}
