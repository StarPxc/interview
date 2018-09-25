package dataStructure.linkedlist;

/**
 * @author 浦希成
 * 2018/9/25 17:01
 */
public class Link {
    int count = 0;
    private Node root;

    public void add(String data) {
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count++;

    }
    public boolean contains(String data){
        if (data==null||this.root==null){
            return false;
        }else {
            return this.root.containsNode(data);
        }
    }

    public String get(int index){
        if (index>this.count){
            return null;
        }
        //从根节点开始找
        return this.root.getNode(index,0);
    }
    public void set(int index,String data){
        if (index>this.count){
            return;
        }
        this.root.setNode(index,data,0);
    }
    public void remove(String data){
        if (this.contains(data)){
            if (data.equals(this.root.data)){
                this.root=this.root.next;
            }else {
                root.next.removeNode(root,data);
            }
        }
        this.count--;
    }
    public int size() {
        return this.count;
    }

    public void print() {
        if (this.root != null) {
            this.root.printNode();
        }
    }
}
