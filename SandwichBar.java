
public class SandwichBar
   {
      public int whichOrder(String[] available, String[] orders){
         String salad = " " + String.join(" ",available) + " ";
         for (int k=0;k<orders.length;k++) {
        	 String[] ingredients = orders[k].split(" ");
        	 int m = 0;
        	 for(int p=0;p<ingredients.length;p++) {
        		 if (salad.matches("(.*) " + ingredients[p] + " (.*)"))
        		     m += 1;       		 
        	 }
        	 if (m == ingredients.length)
        		 return k;
         }	
         return -1;
      }        	
	}
   