class ReverseLinkedList{
    int data;
    ReverseLinkedList next;

    ReverseLinkedList(int data){
        this.data=data;
        this.next=null;
    }
}

class Reverse{
    
    public ReverseLinkedList reverse(ReverseLinkedList head){
        ReverseLinkedList prev=null;
        ReverseLinkedList curr=head;

       while( curr != null){
        ReverseLinkedList next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
       }
       return prev;
    }


    public void print(ReverseLinkedList head){
        ReverseLinkedList temp=head;
       if( temp == null) return;

       while( temp !=null){
        System.out.print(temp.data +" ");
        temp=temp.next;
       }
       System.out.print("null");

    

    }


public static void main(String[] args){
    ReverseLinkedList head=new ReverseLinkedList(1);
    head.next=new ReverseLinkedList(2);
    head.next.next=new ReverseLinkedList(3);
    head.next.next.next=new ReverseLinkedList(4);
    Reverse rev=new Reverse();
    rev.print(head);
    head= rev.reverse(head);
    System.out.println();
    System.out.println("After Reverse the Node");
    rev.print(head);
    


}

}