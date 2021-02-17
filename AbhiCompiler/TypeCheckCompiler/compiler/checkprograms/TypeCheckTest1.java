//This program fails since the variable num_aux has been declared twice .
class TypecheckTest1{
    public static void main(String[] a){
	System.out.println(new TestFunc().ComputeFac(10));
    }
}

class TestFunc {

    public int ComputeFac(int num){
	int num_aux ;
    int num_aux;
	if (num < 1)
	    num_aux = 1 ;
	else 
	    num_aux = num * (this.ComputeFac(num-1)) ;
	return num_aux ;
    }

}
