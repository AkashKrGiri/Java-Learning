import java.util.Stack;

class StackDeme1{
	public static void main(String[] args)
	{

	Stack s = new Stack();
	s.push("A");
	s.push("k");
	s.push("G");
	System.out.println(s);

	System.out.println(s.search("A"));
    System.out.println(s.search("Z"));
	   }
	}