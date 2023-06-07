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
    public static int sumofnode(Node root){
        if (root == null){
            return 0;
        }
        int leftsum =sumofnode(root.left);
        int rightsum = sumofnode(root.right);
        return leftsum+ rightsum+ root.data;
    }
    public static int heightoftree(Node root){
        if (root == null){
            return 0;
        }
        int leftheight = heightoftree(root.left);
        int righthright= heightoftree(root.right);

        int myheight = Math.max(leftheight,righthright)+1;
        return myheight;
    }


    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree.BinaryTree tree= new Binarytree.BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);
      //  preorder(root);
       // System.out.println(countofNodes(root));
       // System.out.println(sumofnode(root));
        System.out.println(heightoftree(root));
    }
}
