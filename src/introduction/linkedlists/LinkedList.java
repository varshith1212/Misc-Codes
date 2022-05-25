package introduction.linkedlists;

class Node {
    private String data;
    private Node next;

    public Node(String data){
        this.data = data;
    }

    public void setData(String data){
        this.data = data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public String getData(){
        return this.data;
    }

    public Node getNext(){
        return this.next;
    }
}

public class LinkedList{
    private Node head;
    private Node tail;

    public Node getHead(){
        return this.head;
    }

    public Node getTail(){
        return this.tail;
    }

    public void addAtBeginning(String data){
        Node node = new Node(data);

        if(this.head == null){
            this.head = this.tail = node;
        }
        else{
            node.setNext(head);
            head = node;
        }
    }


    public void addAtEnd(String data){
        Node node = new Node(data);

        if(this.head == null){
            this.head = this.tail = node;
        }else{
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public Node find(String data){
        Node temp = head;
        while(temp != null){
            if(temp.getData() == data){
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }
}
