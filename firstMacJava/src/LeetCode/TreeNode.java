package LeetCode;

/*
 * 二叉树的节点
 *
 */
public class TreeNode {

    private int num; // 节点存储的数值
    private TreeNode leftTree = null; // 节点的左子树
    private TreeNode rightTree = null; // 节点的右子树

    public TreeNode() {
        super();
    }

    public TreeNode(int num, TreeNode leftTree, TreeNode rightTree) {
        super();
        this.num = num;
        this.leftTree = leftTree;
        this.rightTree = rightTree;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public TreeNode getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(TreeNode leftTree) {
        this.leftTree = leftTree;
    }

    public TreeNode getRightTree() {
        return rightTree;
    }

    public void setRightTree(TreeNode rightTree) {
        this.rightTree = rightTree;
    }

}
