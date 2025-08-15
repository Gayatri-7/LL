class Node{
    int data;
    Node next;
    
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
    
}

public class Main
{   static Node createLL(int arr[]){
    Node head=new Node(arr[0]);
    Node mover=head;
    int i = 1;// BE ALERT WRITE FROM 1 AND NOT 0 , OTH PLACE HEAD IS THERE ALREADY FOR US VO BANANE KI JARURAT NAHI
    while(i<arr.length){
        Node temp=new Node(arr[i]);
        mover.next=temp;
        mover=temp;
        i++;
    }
       return head; 
    }

    static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    
    }
    //CODE TO DELETE KTH Element
      static Node deleteKthElement(Node head,int k){
          if(head==null){
              return head;
          }
          if(k==1){
              head=head.next;
              return head;
          }
          Node prev=null;
          int cnt=0;
          Node temp=head;
          while(temp!=null){
              cnt++;
              if(cnt==k){
                  prev.next=prev.next.next;
              }
              prev=temp;
              temp=temp.next;
              
              
          }
          return head;
      }
    
    
	public static void main(String[] args) {
	int arr[]={1,2,3,4,5,6,7,8,9};
	Node head=createLL(arr);
	printLL(head);
	System.out.println();
    head=deleteKthElement(head,5);
	printLL(head);
	
	}
}
