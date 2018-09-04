
public class Common {
     public int count (String a, String b) {
        String[] A = a.split("");
        int k = 0;
        for (String x:A) {
        	if (b.matches("(.*)" + x + "(.*)"))
        		k += 1;
        		b = b.replaceFirst(x, "");
        }
        return k;
     }
  }
