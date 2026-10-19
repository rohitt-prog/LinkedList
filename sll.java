public class sll {
      class Node{
            int data;
            Node next;
            Node(int data){
                  this.data=data;
                  this.next=null;
            }
      }
      Node head=null;
      public void insertFirst(int data){
            Node newnode=new Node(data);
            if(head==null){
                  head=newnode;
                  return;
            }
            newnode.next=head;
            head=newnode;
      }
      public void insertLast(int data){
            Node newnode=new Node(data);
            if(head==null){
                  head=newnode;
                  return;
            }
            Node temp=head;
            while(temp.next!=null){
                  temp=temp.next;
            }
            temp.next=newnode;
      }
      public void deleteFirst(){
            if(head==null || head.next==null){
                  head=null;
                  return;
            }
            head=head.next;
      }
      public void deleteLast(){
            if(head==null || head.next==null){
                  head=null;
                  return;
            }
            Node temp=head;
            while(temp.next.next!=null){
                  temp=temp.next;
            }
            temp.next=null;
      }
      public void insertAtpos(int data,int pos){
            Node newnode=new Node(data);
            if(pos==1){
                  insertFirst(data);
                  return;
            }
            Node temp=head;
            for(int i=1;i<pos-1;i++){
                  temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
      }
      public void deleteAtpos(int pos){
            if(pos==1){
                  deleteFirst();
                  return;
            }
            Node temp=head;
            for(int i=1;i<pos-1;i++){
                  temp=temp.next;
            }
            temp.next=temp.next.next;
      }
      public void display(){
            Node temp=head;
            while(temp!=null){
                  System.out.print(temp.data+" ");
                  temp=temp.next;
            }
            System.out.println();
      }
      public void findsize(){
            int length=0;
            Node temp=head;
            while(temp!=null){
                  temp=temp.next;
                  length++;
            }
            System.out.println(length);
      }
      public static void main(String []Args){
            sll list=new sll();
            list.insertFirst(10);
            list.insertFirst(20);
            list.insertLast(30);
            list.insertLast(40);
            list.display();
            list.deleteFirst();
            list.display();
            list.deleteLast();
            list.display();
            list.insertAtpos(50,2);
            list.display();
            list.deleteAtpos(2);
            list.display();
            list.findsize();
      }
}
