interface code{
	public void execute(int a,int b);
	
}
interface uppercase{
	public String toupper(String str1); 
}
public class lambdaFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       code c=(a,b)-> System.out.println(a+b);
       c.execute(10,20);
       
       uppercase str=str1-> str1.toUpperCase();
       String str2=str.toupper("likith");
       System.out.println(str2);
	}

}
