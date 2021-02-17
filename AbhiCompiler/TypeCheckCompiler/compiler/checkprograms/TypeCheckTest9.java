//This program fails since the right side of arithmetic expression is not an int literal or identifier.
class TypeCheckTest9{
    public static void main(String[] a){
	System.out.println(new TestFunc1().ComputeFac(10));
    }
}

class TestFunc1 {

    public int ComputeFac(boolean num){
	int num_aux ;
	if (num < 1)
	    num_aux = 1 ;
	else // type boolean should be int
	      num_aux= 1+true;
	 
	return num_aux ;
    }

}
