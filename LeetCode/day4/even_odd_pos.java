//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    ArrayList<Long> arrangeOddAndEven(long a[], int n)
    {

     ArrayList<Long> al = new ArrayList<Long>();
     int ind1 = 0;
     int ind2 = 1;
     long data1 = Long.MAX_VALUE;
     
     for(int i = 0;i<a.length;i++){
        al.add(data1);
        al.add(data1);
         if(a[i]%2==0){
             al.set(ind1,a[i]);
             ind1 = ind1 +2;
        }
         else{
             al.set(ind2,a[i]);
             ind2 = ind2+2;
         }
     }
     int ind = al.size()-1;
     while(ind>=0)
     {
         if(al.get(ind)==Long.MAX_VALUE)
            al.remove(ind);
         ind--;
     }
     return al;
    }
}

