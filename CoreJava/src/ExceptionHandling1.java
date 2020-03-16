
public class ExceptionHandling1 {
	public static void main(String[] args){
		try{
			int a = Integer.parseInt(args[0]);
			System.out.println("a:-"+a);
			
			/*try{
				int[]x= new int[a];
				System.out.println("Array size:-" +x.length);
			}
			catch(NullPointerException npe){
			System.out.println("NPEis raised");
			}
			
			int b = a+20;
			System.out.println("b:-"+b);
			
		  }
		catch(ArrayIndexOutOfBoundsException aioobe){
			System.out.println("Pass one int value");
		   }*/
		}
		catch(NumberFormatException nfe){
			System.out.println("Pass only int value");
		}
		
		catch(NegativeArraySizeException nase){
			int [] x = new int[3];
			System.out.println("In outer try arry size:-" +x.length);
			
			
		}
		System.out.println("After outre try/catch");
	}
	

}
