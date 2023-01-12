import java.util.ArrayList;
public class ArrayList2
{
	public static void main(String[] args)
	{
	ArrayList <Integer> number1 = new ArrayList <>();
	ArrayList <Integer> number2 = new ArrayList <>();
	ArrayList <Integer> number3 = new ArrayList <>();

	number1.add(10);
	number1.add(20);
	number1.add(30);
	number1.add(40);
	number1.add(50);

	System.out.print("\n\nNumber 1 = "+number1);

	number2.add(60);
	number2.add(70);
	number2.add(80);
	number2.add(90);
	number2.add(100);

	System.out.print("\n\nNumber 2 = "+number2);

//addAll method.
	number3.addAll(number1);
	System.out.print("\n\nNumber 3 = "+number3);

	//Equals method.
	boolean res = number1.equals(number2);
	System.out.print("\n\nNumber 1 == Number 2 : "+res);

	boolean res2 = number1.equals(number3);
	System.out.print("\n\nNumber 1 == Number 3 : "+res2);





	}
}