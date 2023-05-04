import java.util.*;
public class LL {
    private int size;
    LL(){
        this.size =0;
    }
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next= null;
            size++;
        }
    }
    //add first ,last
    public void addfirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head =newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }
    //addlast
    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next !=null){
            currNode =currNode.next;
        }
        currNode.next= newNode;
    }
    //print
    public void printlist() {
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data +"->");
            currNode = currNode.next;
        }
        System.out.println(" NULL");
    }

    //delete first
    public void deletefirst(){
      if (head == null){
          System.out.println("The list is empty");
          return;
      }
      size--;
      head =head.next;
    }
    //delete last
    public void deletelast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next ==null) {
           head= null;
           return;
        }
        Node secondlast =head;
        Node lastNode =head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next= null;
    }
    public int getSize(){
     return size;
    }

    public static void main(String args[]){
        LL list = new LL();
        list.addfirst("a");
        list.addfirst("is");
        list.printlist();
        list.addlast("list");
        list.printlist();
        list.addfirst("this");
        list.printlist();
        list.deletefirst();
        list.printlist();
        list.deletelast();
        list.printlist();
        list.getSize();
        System.out.println(list.getSize());
        list.addfirst("this");
        list.printlist();
        System.out.println(list.getSize());
    }

}
