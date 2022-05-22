package LinkedList;

import java.util.Scanner;

public class CreationLL{
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;

        }
        
    }
    Node head=null;

    public void Creation() {
        int n=0;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Enter Data");
        int data = sc.nextInt();
        Node new_node = new Node(data);
       
        if(head==null)
        {
            head=new_node;
        }
        else
        {
            new_node.next=head;
            head=new_node;
        }
        System.out.println("DO you want to enter new node, if yes press1");
        n=sc.nextInt();
    }while(n==1);
    }

    public void traverser(){
        Node temp=head;
        if(head==null)
        {
            System.out.println("LL is Empyt");
        }
        else
        {
            while(temp!=null)
            {
                System.out.println("");

                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        CreationLL LL = new CreationLL();
        LL.Creation();
        LL.traverser();
    }


}
