class LinkedLists{
    int data;
    LinkedLists next;

    LinkedLists(int data){
        this.data=data;
        this.next=null;
    }
}

class ListBasics{
    LinkedLists head;

    public  void insert(int data){
        LinkedLists node=new LinkedLists(data);
        if(head==null){
            head=node;
            return;
        }

        LinkedLists temp=head;
        while(temp.next !=null){
            temp=temp.next;
        }

        temp.next=node;
    }


    public void delete(int key){
        if(head.data ==key){
            head=head.next;
            return;
        }
        LinkedLists temp=head;
        while(temp.next !=null && temp.next.data !=key){
            temp=temp.next;
        }

        if(temp.next !=null){
            temp.next=temp.next.next;
        }
    }


    public  void print(){
        LinkedLists temp=head;
        if(temp ==null) return;
            
        while(temp !=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        ListBasics list=new ListBasics();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.print();
    }
}