package LeetCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 根据 给点数组 创建完全二叉树
 *
 */


public class CreateTwoTree {

    public List<TreeNode> createTree(int[] a) {
        List<TreeNode> treeList = new ArrayList<>();
        int i = 0, len = a.length;
        TreeNode tnRoot = new TreeNode();
        tnRoot.setNum(a[i]); //  初始化根节点
        treeList.add(tnRoot);
        while (i < len) {
            tnRoot = treeList.get(i); // 取第i个节点
            if (i * 2 + 2 < len) { // 若该节点有 子节点
                TreeNode leftRoot = new TreeNode(); //新建左节点
                leftRoot.setNum(a[i * 2 + 1]); //初始化左节点
                tnRoot.setLeftTree(leftRoot); // 给第i个节点设置左节点
                TreeNode rightRoot = new TreeNode();//新建右节点
                rightRoot.setNum(a[i * 2 + 2]);//初始化左节点
                tnRoot.setRightTree(rightRoot);// 给第i个节点设置右节点
                treeList.add(tnRoot.getLeftTree()); //把新的左右节点加入列表
                treeList.add(tnRoot.getRightTree());
            }
            i++;
        }
        return treeList;
    }

    public TreeNode invertTree(TreeNode root) { //从根节点开始
        if (root == null) { //若节点为空说明是 叶节点不用进行 左右子树的交换 故直接返回该节点
            return root;
        }
        // 进行左右节点的交换
        TreeNode temp = root.getLeftTree();  // 把root的左节点临时存储
        root.setLeftTree(invertTree(root.getRightTree())); //root的左节点指向反转后的右子树
        root.setRightTree(invertTree(temp)); // root的右节点指向反转后的左子树

        return root;
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 7, 1, 3, 6, 9, 32, 45, 65, 31, 47, 78, 97, 69};
        CreateTwoTree ctt = new CreateTwoTree();
        List<TreeNode> treeList = ctt.createTree(a);
        System.out.println(treeList);


        ctt.invertTree(treeList.get(0));

    }


}
