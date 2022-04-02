package linkedList;
import java.util.*;

class Friends{
        Node head;
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
            }
        }



    public  void append(int data){
        Node temp=head;
        Node new_node=new Node(data);
        if(temp==null){
             head=new_node;
              return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        new_node.next=null;
        temp.next=new_node;
    
    }


    public  void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public void remove(){
        Node curr=head;
        Node prev=null;Node ahead=null;
        int min = head.data;
        while(curr!=null && curr.next!=null){
            ahead=curr.next;
            if(min < ahead.data){
                if(prev==null){
                    head=ahead;
                    curr.next=null;
                    return;
                }
                else{
                    prev.next=ahead;
                    curr.next=null;
                    curr=ahead;
                    return;
                }
            }
            prev=curr;
         }
 }

   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Friends fr=new Friends();
        int T=sc.nextInt();
       
        for(int i=0;i<T;i++){
             int n=sc.nextInt();
             int k=sc.nextInt();
             for(int j=0;j<n;j++){
                 int f=sc.nextInt();
                 fr.append(f);

             }
            
            
             for(int j=0;j<k;j++){
                fr. remove();
             }
            fr.printlist();
             System.out.println();

        }
    }
}