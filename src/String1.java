interface string{
	 char first(String str);
}
interface A{
	public void evenodd(int d);
}

interface B{
	public void numbers(int e);
}
interface M{
	public void posorneg(int m);
}
public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
      string a=str->str.charAt(0);
      char str1=a.first("Likith");
      System.out.println(str1);
      
      A eod=d->{ 
    	  if(d%2==0)
    	  {
    		  System.out.println("it is even number");
    	  }
    	  else
    		  System.out.println("it is odd number");
      };
      
      eod.evenodd(10);
      
      B print= e->{
    	  for(int i=1;i<11;i++) {
    		  System.out.println(i);
    	  }
      };
      print.numbers(1);
      
      M posneg=m->{
    	  if(m>=0)
    	  {
    		  System.out.println("it is positive number");
    	  }
    	  else
    		  System.out.println("it is negetive number");
    	  
      };
      
      posneg.posorneg(7);
	}

}
