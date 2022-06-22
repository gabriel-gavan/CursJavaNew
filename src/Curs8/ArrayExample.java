package Curs8;

public class ArrayExample {

	public static void main(String[] args) {
		String [] testArray = new String [5];
		String  testArray2[] = new String [4];
		//String[] testArray  = {null, null,null,null,null}
		testArray[0] = "This ";
		//String[] testArray  = {"This", null,null,null,null}
	//System.out.println(testArray[0]);
	testArray[1] = "is ";
	//String[] testArray  = {"This", "is",null,null,null}
	
	testArray[2] = "an ";
	//String[] testArray  = {"This", "is","an",null,null}
	testArray[3] = "array ";
	//String[] testArray  = {"This", "is","an","array",null}
	
	testArray[4] = "!";
	//String[] testArray  = {"This", "is","an","array","!"}
	for (String element: testArray) {
		System.out.print(element);
	}
	
	}

}
