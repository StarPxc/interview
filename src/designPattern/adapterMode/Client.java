package designPattern.adapterMode;


/**
 * @author 浦希成
 * 2018/9/25 9:51
 * 客户端类，相当于笔记本，只有USB接口
 */
public class Client {
    public void test1(Target t){
        t.handleRequest();//笔记本使用usb接口发送打字请求
    }

    public static void main(String[] args) {
        Client c=new Client();
        Adaptee adpatee=new Adaptee();
        Target t=new Adapter();
        //最后调的是被适配对象的方法
        c.test1(t);
    }
}
