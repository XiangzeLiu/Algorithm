package 从上到下打印二叉树1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left =new TreeNode(5);
        Main main = new Main();
        ArrayList<Integer> resultlist =main.BFSTreeNode(treeNode);
        for (int num:resultlist){
            System.out.println(num);
        }
    }
    public ArrayList<Integer> BFSTreeNode(TreeNode root){
        ArrayList<Integer> resultlist = new ArrayList<>();
        if (root.left ==null &&root.right==null){
            resultlist.add(root.value);
        }
        else if (root.right!=null){
            resultlist.add(root.value);
            ArrayList<Integer> rightlist = BFSTreeNode(root.right);
            for (int num:rightlist){
                resultlist.add(num);
            }
        }
        else if (root.left!=null){
            resultlist.add(root.value);
            ArrayList<Integer> leftlist = BFSTreeNode(root.left);
            for (int num:leftlist){
                resultlist.add(num);
            }
        }
        return resultlist;
    }
}
