package curs4;

public class IncrementDecrement {

	public static void main(String[] args) {
		//numm++  --> post increment
		//++num --> pre increment
		//num+1

		int num = 10;
				System.out.println("Valoarea lui num inainte de increment:" + num);
				System.out.println("Valoarea lui num in post increment:" + num++);
				System.out.println("Valoarea lui num dupa post  increment:" + num);
				
				
				System.out.println("----Pre -----");
				
				int num2 = 10;
				System.out.println("Valoarea lui num2 inainte de increment:" + num2);
				System.out.println("Valoarea lui num2 in pre increment:" + ++num2);
				System.out.println("Valoarea lui num2 dupa pre de increment:" + num2);
				
				//pre increment --> ++num
				//post increment --> num++
				//pre decrement ->> --num
				// post decrement -> num--
	}

}
