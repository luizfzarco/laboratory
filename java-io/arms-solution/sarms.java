import java.util.Scanner;
public class sarms {
  public static void main(String args[]) {
      // Come�a contar tempo
      long startTime = System.currentTimeMillis();

      Scanner in = new Scanner(System.in);
      long Sum=0, num=in.nextLong();
      String n; int T; boolean f=false;
      while(num!=0) {
    	n=num+"";
        T = n.length();
        if  (T >= 2 && T <= 9)
	        for(int i=0;i<T;i++) {
		    	Sum+=Math.pow(Integer.parseInt(n.charAt(i)+""),T);
		        if (Sum==num) {
		        	System.out.println(T);
		            f=true;
		            Sum=0;
		            break;
		        }
	        }
        if(!f) System.out.println("N");
        Sum=0; 
        f=false;
        num=in.nextLong();
      }
      
      // Termina de contar tempo
      long stopTime = System.currentTimeMillis();
      long elapsedTime = stopTime - startTime;
      System.out.println(elapsedTime);
   } 
} 