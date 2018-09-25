package dataStructure.list;

/**
 * @author Ethanp
 * @version V1.0
 * @Package dataStructure
 * @Description: TODO 节点
 * @date 2018/3/24 19:13
 */
public class Node {
    private Object value;
    private Node next;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void print(Node node) {

        System.out.println(node.value);
        if (node.next == null) {
            return;
        }
        print(node.next);
    }
}
