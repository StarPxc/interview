package dataStructure.list;

/**
 * @author Ethanp
 * @version V1.0
 * @Package dataStructure
 * @Description: TODO
 * @date 2018/3/24 19:14
 */
public class MyList {
    private Node firstNode;
    private int size = 0;

    /**
     * 增加元素
     *
     * @param n
     * @return
     */
    public boolean add(Object n) {
        Node newNode = new Node();
        newNode.setValue(n);
        if (n == null) {
            return false;
        }
        if (firstNode == null) {
            firstNode = newNode;
        } else {
            add(newNode, firstNode);
        }
        size++;
        return true;
    }

    private boolean add(Node newNode, Node before) {
        if (before.getNext() == null) {
            before.setNext(newNode);
            return true;
        }
        return add(newNode, before.getNext());

    }

    /**
     * 获取链表的大小
     *
     * @return
     */
    public int size() {
        return this.size;
    }

    /**
     * 根据索引获取值
     *
     * @param i
     * @return
     */
    public Object get(int i) throws Exception {
        if (i >= size) {
            throw new Exception("parameter is bigger than size");
        }
        if (i == 0) {
            return firstNode.getValue();
        }
        return get(i - 1, firstNode.getNext());
    }

    private Object get(int i, Node node) {
        if (i == 0) {
            return node.getValue();
        }
        return get(i - 1, node.getNext());
    }

    /**
     * 根据索引删除元素
     *
     * @param i
     * @return
     */
    public Object remove(int i) throws Exception {
        if (i >= size) {
            throw new Exception("The value you give is bigger than list size");
        }
        if (i == 0) {
            size--;
            Object value = firstNode.getNext().getValue();
            firstNode = firstNode.getNext();
            return value;
        } else {
            size--;
            return remove(i - 1, firstNode, firstNode.getNext());
        }

    }

    private Object remove(int i, Node node, Node next) {
        if (i == 0) {
            Object value = next.getValue();
            node.setNext(next.getNext());
            return value;
        } else {
            return remove(i - 1, node, node.getNext());
        }
    }

    /**
     * 根据对象删除元素
     *
     * @param value
     * @return
     * @throws Exception
     */
    public boolean remove(Object value) throws Exception {
        if (value == null) {
            return false;
        }
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (value.equals(get(i))) {
                index = i;
            }
        }
        if (index == -1) {
            throw new Exception("not found");
        }
        remove(index);
        size--;
        return true;
    }

    /**
     * 清除所有元素
     *
     * @return
     */
    public boolean clear() {
        firstNode = null;
        size = 0;
        return true;
    }
}
