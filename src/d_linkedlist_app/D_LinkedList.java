// D_LinkedList.java
// program demonstrating the implementation and use of a doubly linked-list in java
// adapted from Problem Solving with Java by Elliot Koffman and Ursula Woltz
// ADS class

package d_linkedlist_app;

public class D_LinkedList
{
    // Data fields (member variable)
    D_ListNode head;	// pointer to first node in list

    // Methods
    // default constructor - creates an empty list
    public D_LinkedList()
    {
        head = null;
    }
  
    
    // Constructor - creates a list from an array. The array and its size are passed as parameters.
    // Constructor - creates a list from an array. The array and its size are passed as parameters.
    public D_LinkedList(int[] a)
    {
         for (int i = a.length - 1; i >= 0; i--) {
            D_ListNode n = new D_ListNode(a[i], head, null);
            if (head != null) {
                head.prev = n;
            }
            head = n;
        }
    }

    
    
    public boolean isEmpty(){
        if(head == null)
            return true;
        else
            return false;
    }
    
    
    public void printList(){
        D_ListNode c = head;
        while(c != null){
            //print the list
            System.out.println(c.data + " ");
            c = c.next;
        }
        
    }
    //int[] a = {3,7,8,9,5,6,8};
    public void deleteItem(int value){
        D_ListNode c = head;
        //traverse the list until you find the node with the corresponding value
        while(c!= null && c.data!=value){
            c=c.next;
        }
        if(c==null)
               System.out.println("the value was not found");
        else{
            //print the value of c
            System.out.println("c.data is: " +c.data);
            D_ListNode x = c.prev;
            D_ListNode y = c.next;
            x.next = y;
            y.prev = x;
            c.next = null;
            c.prev = null;
        }
    }
    
    //Methods
    
    // Method to check if doubly linked lists is empty
//    public boolean isEmpty()
    {
      // YOUR CODE GOES HERE
    }
    
    
    // postcondition: Adds a node storing obj at front of this list.
    public void addFirst(int obj)
    {
        // YOUR CODE GOES HERE
    }


    // postcondition: Returns int stored at head of this list.
//    public int getFirst()
    {
        // YOUR CODE GOES HERE
    }

    // postcondition: Returns int stored at end of this list.
//    public int getLast()
    {
        // YOUR CODE GOES HERE
    }

// postcondition: retrieves the data stored in node at position index of list.
//    public int getAtPos(int index)
    {
        // YOUR CODE GOES HERE
    }
    
        // postcondition: Adds a node storing obj at end of this list.
    public void addLast(int obj)
    {
        // YOUR CODE GOES HERE
    }
    
    // postcondition: Adds a node storing obj after position index in list.
//    public boolean addAfterPos(int obj, int index)
    {
        // YOUR CODE GOES HERE
    }

        
    
    // postcondition: Returns the length of this list.
//    public int getSize()
    {
        // YOUR CODE GOES HERE
    }

    
    // precondition: The last link node has a null link.
    // postcondition: Returns a string formed by concatenating the 
    //	data fields of all list nodes.
//    @Override
//    public String toString()
    {
        // YOUR CODE GOES HERE
    }
    
    
    // precondition: The last link node has a null link.
    // postcondition: Returns a string formed by concatenating the 
    //	data fields of all list nodes, starting from the last node.
//    public String toString_in_reverse()
    {
        // YOUR CODE GOES HERE
    }

    
    // precondition: list is pointed to by head; last node, if any, points to null
    // postcondition: nth node is deleted if it exists. A 1-based index is used
//    public boolean delete(int n)
    {
        // YOUR CODE GOES HERE
    }// end of delete() method
    
    
    // precondition: list is pointed to by head; last node, if any, points to null
    // postcondition: returns a pointer to node containing a desired value, or null if not found
//    public D_ListNode searchPointer(int n)
    {
        // YOUR CODE GOES HERE
    }// end of method searchPointer()
    
    
    // precondition: list is pointed to by head; last node, if any, points to null
    // postcondition: returns a one-based index to node containing a desired value, or -1 if not found
//    public int searchIndex(int n)
    {
        // YOUR CODE GOES HERE
    }// end of method searchIndex()
    
    
    public String ordinality(int n)
    {
        String pos;
          
        if ((n%10 == 1) && (n != 11))
            pos = "st";
        else if ((n%10 == 2) && (n != 12))
            pos = "nd";
        else if ((n%10 == 3) && (n != 13))
            pos = "rd";
        else
            pos = "th";
        
        return pos;
    }
        
} // end of class D_LinkedList
