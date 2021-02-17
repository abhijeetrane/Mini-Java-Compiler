package visitor;
import java.util.*;

public class ClassSymbolTable{
	public Hashtable classMethodTable;
	public  Hashtable classFieldTable;
	public  String className;


	public ClassSymbolTable(String name){
		classMethodTable = new Hashtable();
		classFieldTable = new Hashtable();
		className = name;
	}
	public boolean addMethod(MethodSymbolTable m){
		//System.out.println(m.getMethodName().intern());
		if(classMethodTable.get(m.getMethodName().intern())==null){
			classMethodTable.put(m.getMethodName().intern(),m);
			return true;
		}
		else{
			return false;
		}
	}
	public  MethodSymbolTable getMethod(String s){
		if((classMethodTable.get(s.intern()) == null)){
			System.out.println("Method is  not declared : " +s);
			//System.exit(1);
		}
		 return(MethodSymbolTable)classMethodTable.get(s.intern());
	}
	public boolean addVar(Variable v){
			if(classFieldTable.get(v.getVariableName().intern())==null){
				classFieldTable.put(v.getVariableName().intern(),v.getVariableName());
				return true;
			}
			else{
				return false;
			}
	}
	public  Variable getVariable(String s){
		if((classFieldTable.get(s.intern()) == null)){
			System.out.println("Identifier not declared : " +s);
			//System.exit(1);
		}
		 return(Variable)classFieldTable.get(s.intern());
	}
	public String getClassName(){
		return className;
	}
}

