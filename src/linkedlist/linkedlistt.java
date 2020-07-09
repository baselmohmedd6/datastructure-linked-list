/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Inkall
 */
public class linkedlistt {
    Node head;
    int elementscount;
    public linkedlistt()
    {
        head=null;
        elementscount=0;
    }
    boolean isempty()
    {
        return elementscount==0;
    }
    void insertfirst (int data)
    {
        Node mynode=new Node(data);
        if(isempty())
        {
            head=mynode;
            
        }
        else 
        {
            mynode.next=head;
            head=mynode;
            
        }
        elementscount++;
    }
      void insertlast (int data)
    {
        Node mynode=new Node(data);
        if(isempty())
        {
            head=mynode;
            
        }
        else
        {
            Node temp;
            temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=mynode;
        }
        
        elementscount++;
    }
      int removefirst()
      {
          int val;
          if(head.next==null)
          {
             val =head.data;
             head=null;
          }
          
         else
          {
              val=head.data;
              head=head.next;
          }
          elementscount--;
        return val;
          
      }
      int removelast()
      {
          int val;
          if(head.next==null)
          {
             val =head.data;
             head=null;
          }
          
         else
          {
             Node temp;
             temp=head;
             while(temp.next.next!=null)
             {
                 temp=temp.next;
             }
             val=temp.next.data;
             temp.next=null;
             
             
          }
          elementscount--;
          return val;
      }
      int count()
      {
          return elementscount;
      }
      void printlinkedlist()
      {
          Node temp;
          temp=head;
          while(temp.next!=null)
          {
              System.out.println(temp.data);
              temp=temp.next;
          }
      }
       void insertAt (int index , int data)
        {
            Node mynode = new Node(data);
            
            if(index==0)
            {
                if(isempty())
                {
                    head=mynode;
                }
                else
                {
                    mynode.next=head;
                    head=mynode;
                }
            }
           
       else
            {
               Node temp=head;
               for(int i=0; i<index-1;i++)
               {
                   temp=temp.next;
               }
                
                mynode.next=temp.next;
                temp.next=mynode;
                
                
            }
            
            
             elementscount++;            
            
        }
          int deleteAt (int index)
        {
            int val ;
            if(index==0)
            {
                if(head.next==null)
                {
                 val=head.data;
                 head=null;
                }
                else
                {
                  val=head.data;
                  head=head.next;  
                }
            }
             else
            {   Node temp=head;
                //Node tobedeleted;
                for(int i=0; i<index-1;i++)
               {
                   temp=temp.next;
               }
                val=temp.next.data;
                temp.next=temp.next.next;
                
            }
            elementscount--;  
            return val;
        }
      
}
