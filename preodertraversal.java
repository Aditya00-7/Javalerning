public class preodertraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left =null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx =-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }
    }
    public static int preorder(Node root){
        if(root == null){
            return -1;
        }
        System.out.println(root.data+"");
        preorder(root.left);
        preorder(root.right);
        return 0;
    }
    public static int countofNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countofNodes(root.left);
        int rightNodes=countofNodes(root.right);
        return leftNodes+rightNodes+1;
    }


    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree.BinaryTree tree= new Binarytree.BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);
      //  preorder(root);
        System.out.println(countofNodes(root));
    }
}
