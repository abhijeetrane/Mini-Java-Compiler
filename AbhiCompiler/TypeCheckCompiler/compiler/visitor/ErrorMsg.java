package visitor;
public class ErrorMsg{
	static boolean anyErrors;
	static void complain(String msg){
		anyErrors=true;
		
		System.out.println(msg);
			}
}