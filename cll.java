//implement user defined circular linkedlist class with all possible implemented operations
public class cll {
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
            Node newNode=new Node(data);
            if(head==null){
                  head=newNode;
                  newNode.next=head;
                  return;
            }
            Node temp=head;
            while(temp.next!=head){
                  temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
            head=newNode;
      }
      public void insertLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                  head=newNode;
                  newNode.next=head;
            }
            else{
                  Node temp=head;
                  while(temp.next!=head){
                        temp=temp.next;
                  }
                  temp.next=newNode;
                  newNode.next=head;
            }
      }
      public void deleteFirst(){
            if(head==null){
                  return;
            }
            if(head.next==head){
                  head=null;
                  return;
            }
            Node temp=head;
            while(temp.next!=head){
                  temp=temp.next;
            }
            temp.next=head.next;
            head=head.next;
      }
      public void deleteLast(){
            if(head==null){
                  return;
            }
            if(head.next==head){
                  head=null;
                  return;
            }
            Node temp=head;
            while(temp.next.next!=head){
                  temp=temp.next;
            }
            temp.next=head;
      }
      public void insertatPosition(int data,int pos){
            Node newNode=new Node(data);
            if(pos==1){
                  insertFirst(data);
                  return;
            }
            Node temp=head;
            for(int i=1;i<pos-1;i++){
                  temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
      }
      public void deleteatPosition(int pos){
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
      public void findSize(){
            int length=1;
            Node temp=head;
            while(temp.next!=head){
                  temp=temp.next;
                  length++;
            }
            System.out.println(length);
      }
      public void display(){
            if(head==null){
                  return;
            }
            Node temp=head;
            do{
                  System.out.print(temp.data+ " ");
                  temp=temp.next;
            }while(temp!=head);
            System.out.println();
      }
      public static void main(String []Args){
            cll list=new cll();
            list.insertFirst(10);
            list.insertFirst(20);
            list.insertLast(30);
            list.insertLast(40);
            list.display();
            list.deleteFirst();
            list.display();
            list.deleteLast();
            list.display();
            list.insertatPosition(50,2);
            list.display();
            list.deleteatPosition(2);
            list.display();
            list.findSize();
      }
}
