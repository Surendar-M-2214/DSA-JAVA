package src.LinkedLst;

public class Linkdlst {


    private Node Head;
    private Node Tail;
    private  int size;
  public Linkdlst(){
        this.size=0;
    }

    public void add(int val){
      Node n=new Node(val);
      n.next=Head;
      Head=n;
      size+=1;
    }
    public void display(){
      Node temp=Head;
      while (temp!=null){
          System.out.println(temp.value +",");
          temp=temp.next;

      }


    }

  private  class Node{
      private int value;
      private  Node next;
      public  Node(int value){
            this.value=value;
        }
       public  Node(int value,Node next){
            this.value=value;
           this.next=next;
        }
    }


}
