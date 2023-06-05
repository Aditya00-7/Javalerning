public class Binarytree {
    static class Node{
        int data;
        preodertraversal.Node left;
        preodertraversal.Node right;
        Node(int data){
            this.data=data;
            this.left =null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx =-1;
        public static preodertraversal.Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            preodertraversal.Node newNode = new preodertraversal.Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }
    }


    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
       preodertraversal.Node root = tree.buildTree(nodes);
       System.out.println(root.data);
    }
}
