package LinkedList;

import java.util.Scanner;

public class CircularLLCreation {

    public class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    Node head=null;
    Node tail=null;

    public void Creation(){
        Scanner sc = new Scanner(System.in);
        int n=0;
        do{
            System.out.println("Enter Data");
            int data=sc.nextInt();
            Node new_node = new Node(data);
            if(head==null)
            {
                head=new_node;
                tail=new_node;
                new_node.next=head;

            }
            else{
                new_node.next=head;
                head=new_node;

                tail.next=head;
            }
            System.out.println("Enter 1 to continue");
            n = sc.nextInt();
        }while(n==1);
    }


    public void traverser(){
        Node temp=head;
        if(head==null)
        {
            System.out.println("LL is empty");
        }
        else{
            do            
            {
                System.out.println(temp.data);
                temp = temp.next;
            }while(temp!=head);

        }
    }

    public static void main(String[] args) {
        CircularLLCreation LL = new CircularLLCreation();
        LL.Creation();
        LL.traverser();
    }
    
}
