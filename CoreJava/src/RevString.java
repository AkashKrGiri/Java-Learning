
import java.io.*;
import java.util.*;
class RevString{
public static void main(String[] args){
  
	String input="";
  System.out.println("Enter the String");
  
  try{
        //Scanner sc = new Scanner(System.in);
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       input= br.readLine();//A K A S H
      char[] cr= input.toCharArray();
      for(int i= cr.length-1;i>=0;i--)
  
        System.out.print(cr[i]);
  }
  catch(IOException e)
  {
	e.printStackTrace();  
  }
 }
}

/*import java.io.*;
import java.util.*;

public class RevString {
    public static void main(String[] args) {
        String input="";
        System.out.println("Enter the input string");
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
            char[] try1= input.toCharArray();
            for (int i=try1.length-1;i>=0;i--)
            System.out.print(try1[i]);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
}}*/