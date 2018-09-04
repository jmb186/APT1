
public class Totality {
     public int sum(int[] a, String stype) {
    	 int oddsum=0;
    	 int evensum=0;
         for(int k=0;k<a.length;k++)
        	 if (k%2==0)
        		 evensum += a[k];
        	 else
        		 oddsum += a[k];
         if(stype.equals("odd"))
        	 return oddsum;
         else if(stype.equals("even"))
        	 return evensum;
        	 else
        		 return oddsum + evensum;	         
     }
 }