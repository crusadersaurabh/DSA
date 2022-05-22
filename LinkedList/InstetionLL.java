package LinkedList;

import java.util.Scanner;

public class InstetionLL {

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
        public void Creation(){
            int n=0;
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Enter Data");
                int data = sc.nextInt();
                Node new_node = new Node(data);

                if(head==null)
                head=new_node;
                else
                {
                    System.out.println("Enter 1 if u want to insert First");
                    System.out.println("Enter 2 if u want to insert Last");
                    System.out.println("Enter Position No if u want to insert Position");
                    int m= sc.nextInt();
                    switch(m){
                        case 1:
                        new_node.next=head;
                        head=new_node;
                        break;
                        case 2:
                            Node temp=head;

                            while(temp.next!=null){
                                temp = temp.next;
                            }
                            temp.next=new_node;
                            break;

                        
                        case 3:
                        System.out.println("ENter the position to Enter");
                        int p = sc.nextInt();
                        Node temp1=head;
                        for(int i=0;i<(p-1);i++){
                            temp1=temp1.next;
                        }                 
                        new_node.next=temp1.next;
                        temp1.next=new_node;
                        break;
                    }


                }
                System.out.println("Do u want to continue press1");
                n =sc.nextInt();

            }
            while(n==1);
        }

        public void traverse(){
            Node temp=head;
            if(head==null)
            System.out.println("LL is empty");
            else
            {
                while(temp!=null)
                {
                    System.out.println(temp.data);
                    temp=temp.next;
                }
            }
        }

    
    


    public static void main(String[] args) {
        InstetionLL LL = new InstetionLL();
        LL.Creation();
        LL.traverse();

    }

}

   

