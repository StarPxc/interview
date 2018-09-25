package dataStructure.tree;

/**
 * @author 浦希成
 * 2018/9/23 17:17
 */
public class NodeTree {
    /**
     * 根节点数据
     */
    int data;
    /**
     * 左子树
     */

    NodeTree left;
    /**
     * 右子树
     */
    NodeTree right;

    public NodeTree() {
        super();
    }
    //实例化二叉树
    public NodeTree(int data) {
        super();
        this.data = data;
        left = null;
        right = null;
    }

    public void insert(NodeTree root, int data) {
        //如果插入的节点大于跟节点
        if (data > root.data) {
            //如果右子树为空，就插入
            if (root.right == null) {
                //就把插入的节点放在右边
                root.right = new NodeTree(data);
            } else {
                this.insert(root.right, data);
            }
        }  //如果插入的节点小于根节点
        else {
            //如果左子树为空，就插入
            if (root.left == null) {
                //就把插入的节点放在左边
                root.left = new NodeTree(data);
            } else {

                this.insert(root.left, data);
            }
        }
    }
}

