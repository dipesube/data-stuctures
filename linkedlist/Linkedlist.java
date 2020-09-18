public class Linkedlist{

    Node head = null; //initially head of linkedlist is null
    
    private static class Node {

        private int data;
        private Node next;

        private Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Linkedlist insert(Linkedlist list, int data){
        Node newNode = new Node(data);

        if (list.head == null){
            list.head = newNode; //head points to the new Node
        } else {
            Node last = list.head; 
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }

        return list;
    }

    public static void printList(Linkedlist list){ //print all data in linked list
        Node temp = list.head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        
    }

    public static Linkedlist deleteByKey(Linkedlist list, int key){
        Node currentNode = list.head;
        Node prev = null;

        //first case where the key to be deleted is in head node
        if (currentNode.data == key){
            list.head = list.head.next;
            return list;
        }

        //2nd case where the is somewhere other than head
        while(currentNode != null && currentNode.data != key){
            prev = currentNode;
            currentNode = currentNode.next;
        }
        prev.next = currentNode.next;


        return list;
    }
}
