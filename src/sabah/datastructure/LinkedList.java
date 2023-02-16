package sabah.datastructure;



public class LinkedList {

    // Node class created
    class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head, tail;
    int size=0;

    public LinkedList(int data){
       head = new Node(data);
       tail= head;
       size++;
    }

    public String insert(int data){

        Node node = new Node(data);
        Node temp = tail;
        temp.next = node;
        node.next = null;
        size++;
        return "Data Inserted";
    }

    public void traverse() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }


    }
}
