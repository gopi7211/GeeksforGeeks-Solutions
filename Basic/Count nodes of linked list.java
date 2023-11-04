/*
Given a singly linked list. The task is to find the length of the linked list, where length is defined as the number of nodes in the linked list.
*/

//{ Driver Code Starts
import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int a){
        data = a;
        next = null;
    }
    
}

// } Driver Code Ends
/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        //Code
      int count = 0;
      Node curr = head;
      while(curr!=null){
          curr = curr.next;
          count++;
      }
      
      return count;
    }
}
    
