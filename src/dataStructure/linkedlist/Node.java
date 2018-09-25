package dataStructure.linkedlist;

/**
 * @author 浦希成
 * 2018/9/25 16:59
 */
public class Node {
     String data;
     Node next;


    public Node(String data) {
        this.data = data;
    }
    //第一次是由root调用的
    public void addNode(Node newNode) {
        //当前节点的下一个节点为空
        if (this.next == null) {
            this.next = newNode;
        } else {
            this.next.addNode(newNode);
        }
    }

    public void printNode() {
        System.out.println(this.data);
        if (this.next != null) {
            this.next.printNode();
        }
    }

    public boolean containsNode(String data) {
        if (data.equals(this.data)) {
            return true;
        } else {
            if (this.next == null) {
                return false;
            } else {
                return this.next.containsNode(data);
            }

        }
    }

    public String getNode(int index,int foot) {
        if (foot++==index){
            return this.data;
        }else {
            return this.next.getNode(index,foot);
        }
    }

    public void setNode(int index, String data, int foot) {
        if (foot++==index){
            this.data=data;
        }else {
            this.next.setNode(index,data,foot);
        }
    }
    public void removeNode(Node pre,String data){
        if (data.equals(this.data)){
            pre.next=this.next;
        }else {
            this.next.removeNode(this,data);
        }
    }

}
