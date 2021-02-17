//This program fails since the right side of arithmetic expression is not an int literal or identifier.
class TypeCheckTest3{
    public static void main(String[] a){
	System.out.println(new Testfunc2().ComputeFac(10));
    }
}
//This program fails since the right side of arithmetic expression is not an int literal or identifier.
class Testfunc2 {

    public int ComputeFac(boolean num){
	int num_aux ;
	if (num < 1)
	    num_aux = 1 ;
	else 
	{
	    num_aux = 1*num;
	
	}return num_aux ;
    }

}
