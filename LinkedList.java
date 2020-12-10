import java.util.Random;

public class LinkedList {

    Node head;
    Node tail;


    public void insertAtFront(int amount, String name){

        Node tempNode = new Node();
        tempNode.setAmount(amount);
        tempNode.setName(name);
        if (head == null){
            head = tempNode;
            tail = tempNode;
            tempNode.nextNode = head;
        }else{
            //Store data into temporary node
            Node temp = head;
            //New node will point to temp as next node
            tempNode.nextNode = temp;
            //New node will be the head node
            head = tempNode;
            //Since, it is circular linked list tail will point to head.
            tail.nextNode = head;

        }


    }

    public void Spin() {
        Random rand = new Random();
        Node temp = head;
        int i = 0;
        int rand_int2 = rand.nextInt(50) + 50;
        while (temp != null && i <= rand_int2){
            if (i ==rand_int2){
                System.out.println("you landed on :" + temp.getAmount() + " " + temp.getName());
            }else{
                System.out.println(temp.getAmount() + " " + temp.getName());
            }
            temp = temp.nextNode;
            i++;
        }
    }
};
