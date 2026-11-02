public class dll {
      class Node{
            int data;
            Node next;
            Node prev;
            Node(int data){
                  this.data=data;
                  this.next=null;
                  this.prev=null;
            }
      }
      Node head=null;
      Node tail=null;
      public void addFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                  head=newNode;
                  tail=newNode;
            }
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
      }
      public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                  head=newNode;
                  tail=newNode;
            }
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
      }
      public void deleteFirst(){
            if(head==null){
                  return;
            }
            head=head.next;
            head.prev=null;
      }
      public void deleteLast(){
            if(head==null){
                  return;
            }
            tail=tail.prev;
            tail.next=null;
      }
      public void insertAtPos(int data,int pos){
            Node newNode=new Node(data);
            if(pos==1){
                  addFirst(data);
                  return;
            }
            Node temp=head;
            for(int i=1;i<pos-1;i++){
                  temp=temp.next;
            }
            newNode.next=temp.next;
            newNode.prev=temp;
            if(temp.next!=null){
                  temp.next.prev=newNode;
            }
            temp.next=newNode;
      }
      public void deleteAtPos(int pos){
            if(pos==1){
                  deleteFirst();
                  return;
            }
            Node temp=head;
            for(int i=1;i<pos-1;i++){
                  temp=temp.next;
            }
            if(temp.next!=null){
                  temp.next=temp.next.next;
                  if(temp.next!=null){
                        temp.next.prev=temp;
                  }
            }
      }
      public void findSize(){
            int size=0;
            Node temp=head;
            while(temp!=null){
                  size++;
                  temp=temp.next;
            }
            System.out.println(size);
      }
      public void display(){
            Node temp=head;
            while(temp!=null){
                  System.out.print(temp.data+" ");
                  temp=temp.next;
            }
            System.out.println();
      }
      public static void main(String args[]){
            dll obj=new dll();
            obj.addFirst(10);
            obj.addFirst(20);
            obj.addLast(30);
            obj.addLast(40);
            obj.display();
            obj.deleteFirst();
            obj.display();
            obj.deleteLast();
            obj.display();
            obj.insertAtPos(50,2);
            obj.display();
            obj.deleteAtPos(2);
            obj.display();
            obj.findSize();
      }
}
