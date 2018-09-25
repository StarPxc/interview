package dataStructure.list;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Ethanp
 * @version V1.0
 * @Package dataStructure
 * @Description: TODO
 * @date 2018/3/24 19:20
 */
public class Main {
    public static void main(String[] args) throws Exception {
        MyList list = new MyList();
        list.add(108);
        list.add(88);
        list.add("pxc");
        list.add("test");
        list.clear();
        list.add("pxc");
        list.add(1);
        System.out.println(list.get(1));
        LinkedList arrayList = new LinkedList();
        arrayList.clear();
        AtomicInteger atomicInteger = new AtomicInteger();
        int a = atomicInteger.incrementAndGet();
        System.out.println(a);


    }
}
