package LinkedList;

import java.util.Scanner;

public class DeletionLL {

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
    Scanner sc= new Scanner(System.in);

    public void Creation(){
     
        int n;

        do{
            System.out.println("Enter Data");
            int data = sc.nextInt();
            Node new_node = new Node(data);

            if(head==null){
                head=new_node;
            }
            else{

            
            new_node.next=head;
            head=new_node;
        }
        
        System.out.println("ENter 1 if CONTINUE");
        n= sc.nextInt();
            }while(n==1);
    }

    public void deletion(){
        System.out.println("Enter 1 to delete 1st Node");
        System.out.println("Enter 2 to delete last Node");
        System.out.println("Enter Position to delete Node");
        int m=sc.nextInt();
        switch(m){
            case 1:
            Node temp=head;
            temp=temp.next;
            head=temp;
            break;

            case 2:
            Node temp1=head;
            Node ptr=temp1.next;
            while(ptr.next!=null)
            {
                temp1=ptr;
                ptr=ptr.next;
            }
            temp1.next=null;
            break;

            case 3:
             Node temp2=head;
             Node ptr2=temp2.next;
             System.out.println("Enter the position");
             int p=sc.nextInt();
             for(int i=0;i<(p-1);i++)
             {
                 temp2=ptr2;
                 ptr2=ptr2.next;
             }
             temp2.next=ptr2.next;
             break;
            
        }

    }

    public void Traverser(){
        Node temp=head;
        if(head==null){
            System.out.println("LL is EMpty");
        }
        else{
            while(temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
            }

        }
    }

    public static void main(String[] args) {
        DeletionLL LL = new DeletionLL();
        LL.Creation();
        LL.deletion();
        LL.Traverser();
    }
}
