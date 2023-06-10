import com.sun.source.tree.Tree;

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
    //approch 1
    public static int  diameter(Node root){
        if (root ==null){
            return 0;
        }
        int diam1 =diameter(root.left);
        int diam2 =diameter(root.right);
        int diam3 =heightoftree(root.left)+heightoftree(root.right)+1;
        return  Math.max(diam3,Math.max(diam1,diam2));
    }
    //Approch 2
     static class TreeInfo{
        int ht;
        int diam;
    TreeInfo(int ht, int diam){
        this.ht = ht;
        this.diam =diam;
    }
    }
    public static TreeInfo diameter2(Node root){
        if (root == null){
        return new TreeInfo(0,0);
        }

        TreeInfo left =diameter2(root.left);
        TreeInfo right =diameter2(root.right);
        int myHeight = Math.max(left.ht,right.ht) +1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht+ right.ht+1;

        int mydiam =Math.max(Math.max(diam1,diam2),diam3);
        TreeInfo myInfo = new TreeInfo(myHeight,mydiam);
        return myInfo;
    }


    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree.BinaryTree tree= new Binarytree.BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);
      //  preorder(root);
       // System.out.println(countofNodes(root));
       // System.out.println(sumofnode(root));
       // System.out.println(heightoftree(root));
        // approach 1 to calculate diameter
        //System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
    }
}
